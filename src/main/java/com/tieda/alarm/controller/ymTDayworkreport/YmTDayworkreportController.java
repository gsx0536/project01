package com.tieda.alarm.controller.ymTDayworkreport;

import com.tieda.alarm.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.entity.ymTDayworkreport.YmTDayworkreport;
import com.tieda.alarm.service.ymTDayworkreport.IYmTDayworkreportService;
import com.tieda.alarm.util.IdWorker;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author
 * @since 2019-06-24
 */
@RestController
@RequestMapping("/ymTDayworkreport")
public class YmTDayworkreportController {


    @Autowired
    IYmTDayworkreportService iYmTDayworkreportService;
    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}")
    public ResponseData getYmTDayworkreportById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            YmTDayworkreport obj = iYmTDayworkreportService.getYmTDayworkreportById(id);
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
    public ResponseData getYmTDayworkreportList(@RequestParam Map<String, Object> params) {
        List<YmTDayworkreport> objList = null;
        ResponseData responseData = null;
        try {

            String vcStatus = (String) params.get("vcStatus");
            if (vcStatus != null && !"".equals(vcStatus)) {
                params.put("vcStatus", vcStatus.split(","));
            }
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iYmTDayworkreportService.getYmTDayworkreportList(params);
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iYmTDayworkreportService.getYmTDayworkreportList(params);
                count = pageInfo.getTotal();
            }

            responseData = ResponseData.okData(objList, count);  // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();                    // 处理失败
        }
        return responseData;
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     * @return
     */
    @PostMapping("/add")
    public ResponseData addYmTDayworkreport(@RequestBody YmTDayworkreport obj) {

        ResponseData responseData = null;
        try {
            obj.setnId(String.valueOf(idWorker.nextId()));
            iYmTDayworkreportService.addYmTDayworkreport(obj);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;

    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     * @return
     */
    @PostMapping("/addBatch")
    public ResponseData addBatchYmTDayworkreport(@RequestBody List<YmTDayworkreport> list) {
        ResponseData responseData = null;
        try {
            iYmTDayworkreportService.addBatchYmTDayworkreport(list);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     * @return
     */
    @PostMapping("/update")
    public ResponseData updateYmTDayworkreport(@RequestBody YmTDayworkreport obj) {
        ResponseData responseData = null;
        try {
            iYmTDayworkreportService.updateYmTDayworkreport(obj);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     * @return
     */
    @PostMapping("/updateBatch")
    public ResponseData updateBatchYmTDayworkreport(@RequestBody List<YmTDayworkreport> list) {
        ResponseData responseData = null;
        try {
            iYmTDayworkreportService.updateBatchYmTDayworkreport(list);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     * @return
     */
    @PostMapping("/delete/{id}")
    public ResponseData deleteYmTDayworkreportById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            iYmTDayworkreportService.deleteYmTDayworkreportById(id);
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
    public ResponseData deleteBatchYmTDayworkreport(@RequestBody List<Long> ids) {
        ResponseData responseData = null;
        try {
            iYmTDayworkreportService.deleteBatchYmTDayworkreport(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 目录查询
     *
     * @param
     * @return
     */
    @GetMapping("/getCatalog")
    public ResponseData getCatalog(@RequestParam Map<String, Object> params,HttpServletRequest request) {
        List<YmTDayworkreport> objList = null;
        ResponseData responseData = null;

        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
        try {
            params.put("orgId",user.getVcOrgId());
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                if(user.getOrgLevel().equals("50")) {
                    objList = iYmTDayworkreportService.segGetCatalog(params);
                }
                else if(user.getOrgLevel().equals("30")) {
                    objList = iYmTDayworkreportService.wsGetCatalog(params);
                }
                else if(user.getOrgLevel().equals("10")) {
                    objList = iYmTDayworkreportService.waGetCatalog(params);
                }
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                if(user.getOrgLevel().equals("50")) {
                    objList = iYmTDayworkreportService.segGetCatalog(params);
                }
                else if(user.getOrgLevel().equals("30")) {
                    objList = iYmTDayworkreportService.wsGetCatalog(params);
                }
                else if(user.getOrgLevel().equals("10")) {
                    objList = iYmTDayworkreportService.waGetCatalog(params);
                }
                count = pageInfo.getTotal();
            }

            responseData = ResponseData.okData(objList, count);  // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();                    // 处理失败
        }
        return responseData;
    }



    /**
     * 目录查询
     *
     * @param
     * @return
     */
    @GetMapping("/getReportList")
    public ResponseData getReportList(@RequestParam Map<String, Object> params,HttpServletRequest request) {
        List<YmTDayworkreport> objList = null;
        ResponseData responseData = null;

        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
        try {
//            params.put("orgId",user.getVcOrgId());
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                if(user.getOrgLevel().equals("50")) {
                    objList = iYmTDayworkreportService.wsGetList(params);
                }
                else if(user.getOrgLevel().equals("30")) {
                    objList = iYmTDayworkreportService.wsGetList(params);
                }
                else if(user.getOrgLevel().equals("10")) {
                    objList = iYmTDayworkreportService.waGetList(params);
                }
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                if(user.getOrgLevel().equals("50")) {
                    objList = iYmTDayworkreportService.wsGetList(params);
                }
                else if(user.getOrgLevel().equals("30")) {
                    objList = iYmTDayworkreportService.wsGetList(params);
                }
                else if(user.getOrgLevel().equals("10")) {
                    objList = iYmTDayworkreportService.waGetList(params);
                }
                count = pageInfo.getTotal();
            }

            responseData = ResponseData.okData(objList, count);  // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();                    // 处理失败
        }
        return responseData;
    }


    /**
     * 目录查询
     *
     * @param
     * @return
     */
    @PostMapping("/updateStatus")
    public ResponseData updateStatus(@RequestParam Map<String, Object> params,HttpServletRequest request) {
        ResponseData responseData = null;
        try {
            iYmTDayworkreportService.updateStatus(params);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


    /**
     * 目录查询
     *
     * @param
     * @return
     */
    @PostMapping("/createDayWork")
    public ResponseData createDayWork(@RequestParam Map<String, Object> params,HttpServletRequest request) {
        ResponseData responseData = null;
        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
        try {
            params.put("orgid",user.getVcOrgId());
            params.put("writer",user.getVcNumber());
            iYmTDayworkreportService.createdayreport(params);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }
}
