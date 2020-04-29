package com.tieda.alarm.controller.sysTRules;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tieda.alarm.entity.sysTRules.SysTRules;
import com.tieda.alarm.entity.sysTRulesblob.SysTRulesblob;
import com.tieda.alarm.service.sysTRules.ISysTRulesService;
import com.tieda.alarm.service.sysTRulesblob.ISysTRulesblobService;
import com.tieda.alarm.util.IdWorker;
import com.tieda.alarm.util.ResponseData;
import oracle.sql.BLOB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 技术规章信息表 前端控制器
 * </p>
 *
 * @author
 * @since 2019-09-03
 */
@RestController
@RequestMapping("/sysTRules")
public class SysTRulesController {
    @Autowired
    ISysTRulesblobService iSysTRulesblobService;
    @Autowired
    ISysTRulesService iSysTRulesService;
    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}")
    public ResponseData getSysTRulesById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            SysTRules obj = iSysTRulesService.getSysTRulesById(id);
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
    public ResponseData getSysTRulesList(@RequestParam Map<String, Object> params) {
        List<SysTRules> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iSysTRulesService.getSysTRulesList(params);
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iSysTRulesService.getSysTRulesList(params);
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
    public ResponseData addSysTRules(@RequestBody SysTRules obj) {

        ResponseData responseData = null;
        try {
            iSysTRulesService.addSysTRules(obj);
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
    public ResponseData addBatchSysTRules(@RequestBody List<SysTRules> list) {
        ResponseData responseData = null;
        try {
            iSysTRulesService.addBatchSysTRules(list);
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
    public ResponseData updateSysTRules(@RequestBody SysTRules obj) {
        ResponseData responseData = null;
        try {
            iSysTRulesService.updateSysTRules(obj);
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
    public ResponseData updateBatchSysTRules(@RequestBody List<SysTRules> list) {
        ResponseData responseData = null;
        try {
            iSysTRulesService.updateBatchSysTRules(list);
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
    public ResponseData deleteSysTRulesById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            iSysTRulesService.deleteSysTRulesById(id);
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
    public ResponseData deleteBatchSysTRules(@RequestBody List<Long> ids) {
        ResponseData responseData = null;
        try {
            iSysTRulesService.deleteBatchSysTRules(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /***
     * 技术规章附件下载逻辑判断
     * @param params
     */
    @GetMapping("/download")
    public void rulesdownload(@RequestParam Map<String, Object> params, HttpServletResponse response) {
        Object nId = params.get("nId");
        Object fileSourcename = params.get("fileSourcename");
        if (nId != null && fileSourcename != null) {
            String fileName = "";
            SysTRulesblob sysTRulesblob =
                    iSysTRulesblobService.getSysTRulesblobById(Long.valueOf(nId.toString()));
            if (fileSourcename.toString().indexOf("_0") > -1) {//电子文档
                fileName = fileSourcename.toString().replace("_0", "");
                writeblob(fileName, sysTRulesblob.getVcElectronicblob(), response);
            } else if (fileSourcename.toString().indexOf("_1") > -1) {//附件1
                fileName = fileSourcename.toString().replace("_1", "");
                writeblob(fileName, sysTRulesblob.getVcAnnexoneblob(), response);
            } else {//附件2
                fileName = fileSourcename.toString().replace("_2", "");
                writeblob(fileName, sysTRulesblob.getVcAnnextwoblob(), response);
            }
        }
    }

    /***
     * 实现输出流下载附件
     * @param filename
     * @param obj
     * @param response
     */
    private void writeblob(String filename, Object obj, HttpServletResponse response) {
        InputStream is = null;
        OutputStream os = null;
        try {
            BLOB blob = (BLOB) obj;
            response.setContentType("application/x-msdownload");
            filename = new String(filename.getBytes("GBK"), "iso-8859-1");
            response.setHeader("Content-Disposition", "attachment;filename=" + filename);
            is = blob.getBinaryStream();
            os = response.getOutputStream();
            if (is != null) {
                int len = (int) blob.length();
                byte[] buffer = new byte[len];
                while ((len = is.read(buffer)) != -1) {
                    os.write(buffer, 0, len);
                }
            }
            os.close();
            is.close();
            response.flushBuffer();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (os != null) os.close();
                if (is != null) is.close();
            } catch (Exception e) {

            }
        }
    }
}
