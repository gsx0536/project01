package com.tieda.alarm.controller.sparepartsStatistics;

import com.tieda.alarm.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.entity.sparepartsStatistics.SparepartsStatistics;
import com.tieda.alarm.service.sparepartsStatistics.ISparepartsStatisticsService;
import com.tieda.alarm.util.IdWorker;

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
 * @since 2019-05-26
 */
@RestController
@RequestMapping("/sparepartsStatistics")
public class SparepartsStatisticsController {


    @Autowired
    ISparepartsStatisticsService iSparepartsStatisticsService;
    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}")
    public ResponseData getSparepartsStatisticsById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            SparepartsStatistics obj = iSparepartsStatisticsService.getSparepartsStatisticsById(id);
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
    public ResponseData getSparepartsStatisticsList(HttpServletRequest request, @RequestParam Map<String, Object> params) {
        User user = (User) request.getSession().getAttribute(User.USER_SESSION_NAME);
        String lvl=user.getOrgLevel();
        String org=user.getVcOrgId();
        String par=user.getVcParOrgId();
        params.put("lvl",lvl);
        params.put("org",org);
        if("KMBUR_KMNSEG_ORG_48".equals(org)||"KMBUR_KMNSEG_ORG_48".equals(par)||"50".equals(lvl)){//电子车间,段领导 查询全部
            params.put("lvl",50);
        }


        List<SparepartsStatistics> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iSparepartsStatisticsService.getSparepartsStatisticsList(params);
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iSparepartsStatisticsService.getSparepartsStatisticsList(params);
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
    public ResponseData addSparepartsStatistics(@RequestBody SparepartsStatistics obj) {
        obj.setId(String.valueOf(idWorker.nextId()));
        ResponseData responseData = null;
        try {
            iSparepartsStatisticsService.addSparepartsStatistics(obj);
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
    public ResponseData addBatchSparepartsStatistics(@RequestBody List<SparepartsStatistics> list) {
        ResponseData responseData = null;
        try {
            iSparepartsStatisticsService.addBatchSparepartsStatistics(list);
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
    public ResponseData updateSparepartsStatistics(@RequestBody SparepartsStatistics obj) {
        ResponseData responseData = null;
        try {
            iSparepartsStatisticsService.updateSparepartsStatistics(obj);
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
    public ResponseData updateBatchSparepartsStatistics(@RequestBody List<SparepartsStatistics> list) {
        ResponseData responseData = null;
        try {
            iSparepartsStatisticsService.updateBatchSparepartsStatistics(list);
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
    public ResponseData deleteSparepartsStatisticsById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            iSparepartsStatisticsService.deleteSparepartsStatisticsById(id);
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
    public ResponseData deleteBatchSparepartsStatistics(@RequestBody List<Long> ids) {
        ResponseData responseData = null;
        try {
            iSparepartsStatisticsService.deleteBatchSparepartsStatistics(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


}
