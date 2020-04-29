package com.tieda.alarm.controller.jzjcProblem;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tieda.alarm.entity.jzjcProblem.JzjcProblem;
import com.tieda.alarm.entity.jzjcProblemHandle.JzjcProblemHandle;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.service.jzjcProblem.IJzjcProblemService;
import com.tieda.alarm.util.IdWorker;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.util.excel.ExcelUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author
 * @since 2019-11-16
 */
@RestController
@RequestMapping("/jzjcProblem")
public class JzjcProblemController {
    @Autowired
    IJzjcProblemService iJzjcProblemService;

    @Autowired
    IdWorker idWorker;

    private User user;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}")
    public ResponseData getJzjcProblemById(@PathVariable("id") String id) {
        ResponseData responseData = null;
        try {
            JzjcProblem obj = iJzjcProblemService.getJzjcProblemById(id);
            responseData = ResponseData.okData(obj);   // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


    /**
     * 查询对象列表信息
     *
     * @param params 请求参数
     * @return
     */
    @GetMapping("/query")
    public ResponseData getJzjcProblemList(HttpServletRequest request, @RequestParam Map<String, Object> params) {
        List<JzjcProblem> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iJzjcProblemService.getJzjcProblemList(params, user);
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iJzjcProblemService.getJzjcProblemList(params, user);
                count = pageInfo.getTotal();
            }
            responseData = ResponseData.okData(objList, count);  // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();                    // 处理失败
        }
        return responseData;
    }

    @GetMapping(value = "dataExcel")
    public void dataExcel(HttpServletResponse response, @RequestParam Map<String, Object> params) throws IOException {
        try {
            String excelTitle = "集中监测分析问题";
            List<JzjcProblem> objList = iJzjcProblemService.getJzjcProblemList(params, user);
            ExcelUtil.dataExcelTools(excelTitle, objList, JzjcProblem.class, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     * @return
     */
    @PostMapping("/add")
    public ResponseData addJzjcProblem(HttpServletRequest request, @RequestBody JzjcProblem obj) {
        ResponseData responseData = null;
        try {
            obj.setCreatedate(new Date());
            obj.setCreator(user.getVcName());
            if (obj.getStatus() == null || obj.getStatus() == "") {
                obj.setStatus("0");
            }
            obj.setCancle("0");
            obj.setId(String.valueOf(idWorker.nextId()));
            iJzjcProblemService.addJzjcProblem(obj, user);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 系统手动推送监测报警问题
     *
     * @param obj 对象实体
     * @return
     */
    @PostMapping("/SystemAdd")
    public ResponseData SystemAddJzjcProblem(HttpServletRequest request, @RequestBody JzjcProblem obj) {
        ResponseData responseData = null;
        try {
            obj.setCancle("0");
            obj.setStatus("0");
            obj.setCreatedate(new Date());
            obj.setCreator("系统推送");
            int result = iJzjcProblemService.SystemAddJzjcProblem(obj);
            if (result == -1) {
                responseData = ResponseData.error("已经纳入监测问题库，不能重复纳入！");
            } else {
                responseData = ResponseData.ok();       // 处理成功
            }
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 更新对象实体 - 所有流转在此方法操作
     * 问题跟踪：0未处理、1已下发、2已签收、3上报调度、4申请延期、5延期同意、6延期驳回、7申请销号、8销号同意、9销号驳回、10逾期销号
     *
     * @param obj 对象实体
     * @return
     */
    @PostMapping("/update")
    public ResponseData updateJzjcProblem(@RequestBody JzjcProblem obj) {
        ResponseData responseData = null;
        try {
            iJzjcProblemService.updateJzjcProblem(obj, user);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /***
     * 整改问题（填写整改情况）
     * @param obj
     * @param user
     * @return
     */
    @PostMapping("/rectProblem")
    public ResponseData rectProblem(@RequestBody JzjcProblemHandle obj) {
        ResponseData responseData = null;
        try {
            iJzjcProblemService.rectProblem(obj, user);
            responseData = ResponseData.ok();       //处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    //处理失败
        }
        return responseData;
    }

    /***
     * 根据分析台编码获取车站列表
     * @param params
     * @return
     */
    @GetMapping("/getStationByjcpc")
    public ResponseData getStationByjcpc(@RequestParam Map<String, Object> params) {
        ResponseData responseData = null;
        List list = iJzjcProblemService.getStationByjcpc(params);
        responseData = ResponseData.okData(list);
        return responseData;
    }

    /***
     * 责任部门树
     * @param params
     * @return
     */
    @GetMapping("/getOrgDatasByLogin")
    public ResponseData getOrgDatasByLogin(@RequestParam(value = "findall", required = false) String findall) {
        ResponseData responseData = null;
        List list = iJzjcProblemService.getOrgDatasByLogin(user,findall);
        responseData = ResponseData.okData(list);
        return responseData;
    }

    /***
     * 整改情况历史列表
     * @param params
     * @return
     */
    @GetMapping("/getHandlelist")
    public ResponseData getHandlelist(@RequestParam Map<String, Object> params) {
        ResponseData responseData = null;
        List list = iJzjcProblemService.getHandlelist(params);
        responseData = ResponseData.okData(list);
        return responseData;
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     * @return
     */
    @PostMapping("/delete/{id}")
    public ResponseData deleteJzjcProblemById(@PathVariable("id") String id) {
        ResponseData responseData = null;
        try {
            iJzjcProblemService.deleteJzjcProblemById(id);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @PostMapping("/deleteBatch")
    public ResponseData deleteBatchJzjcProblem(@RequestBody List<Long> ids) {
        ResponseData responseData = null;
        try {
            iJzjcProblemService.deleteBatchJzjcProblem(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


    /***
     * 报警问题等级统计
     */
    @GetMapping("/groupbyLvl")
    public ResponseData groupbyLvl(@RequestParam Map<String, Object> params) {
        ResponseData responseData = null;
        List list = iJzjcProblemService.groupbyLvl(params);
        responseData = ResponseData.okData(list);
        return responseData;
    }

    /***
     * 报警类型统计
     */
    @GetMapping("/groupbyType")
    public ResponseData groupbyType(@RequestParam Map<String, Object> params) {
        ResponseData responseData = null;
        List list = iJzjcProblemService.groupbyType(params);
        responseData = ResponseData.okData(list);
        return responseData;
    }

    /***
     * 报警线别统计
     */
    @GetMapping("/groupbyLine")
    public ResponseData groupbyLine(@RequestParam Map<String, Object> params) {
        ResponseData responseData = null;
        List list = iJzjcProblemService.groupbyLine(params);
        responseData = ResponseData.okData(list);
        return responseData;
    }

    /***
     * 统计明细查询
     * orgid 线路编号、车间编号、科室编号
     * enddate 截止日期
     * begindate 开始日期
     * nodetype 统计分支（问题分级、问题类型）
     */
    @GetMapping("/groupDetail")
    public ResponseData groupDetail(@RequestParam Map<String, Object> params) {
        ResponseData responseData = null;
        List list = iJzjcProblemService.groupDetail(params);
        responseData = ResponseData.okData(list);
        return responseData;
    }

    /***
     * 统计导出
     * @param params
     *  1、exporttype 1车间问题级别、2车间问题类型、3线路
     *  2、enddate 截止日期
     *  3、begindate 起始日期
     * @param response
     * @return
     */
    @PostMapping("/groupExport")
    public void groupExport(@RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        Workbook wb = (Workbook) new HSSFWorkbook();
        Sheet sheet = wb.createSheet("集中监测问题统计");
        iJzjcProblemService.groupExport(wb, sheet, params);
        wb.write(os);
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("集中监测问题统计.xls", "utf-8"));
        ServletOutputStream out = response.getOutputStream();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (final IOException e) {
            throw e;
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
    }

    /***
     *初始化登录人员信息
     * @param request
     */
    @ModelAttribute
    private void setDefualtUser(HttpServletRequest request) {
        this.user = (User) request.getSession().getAttribute(User.USER_SESSION_NAME);
    }
}
