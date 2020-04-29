package com.tieda.alarm.controller.ymTWeekPlan;

import com.tieda.alarm.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.entity.ymTWeekPlan.YmTWeekPlan;
import com.tieda.alarm.service.ymTWeekPlan.IYmTWeekPlanService;
import com.tieda.alarm.util.IdWorker;

import java.util.Date;
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
 * @since 2020-01-14
 */
@RestController
@RequestMapping("/ymTWeekPlan")
public class YmTWeekPlanController {


    @Autowired
    IYmTWeekPlanService iYmTWeekPlanService;
    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}")
    public ResponseData getYmTWeekPlanById(@PathVariable("id") String id) {
        ResponseData responseData = null;
        try {
            YmTWeekPlan obj = iYmTWeekPlanService.getYmTWeekPlanById(id);
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
    public ResponseData getYmTWeekPlanList(@RequestParam Map<String, Object> params) {
        List<YmTWeekPlan> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iYmTWeekPlanService.getYmTWeekPlanList(params);
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iYmTWeekPlanService.getYmTWeekPlanList(params);
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
    public ResponseData addYmTWeekPlan(HttpServletRequest request, @RequestBody YmTWeekPlan obj) {
        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
        ResponseData responseData = null;
        try {
            obj.setUserid(user.getVcNumber());
            obj.setCreatedate(new Date());
            obj.setSource("4");
            String plandate = obj.getPlandate();
            String dates[] = plandate.split(",");
            //obj.setId(String.valueOf(idWorker.nextId()));
            iYmTWeekPlanService.addYmTWeekPlan(obj, dates);
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
    public ResponseData addBatchYmTWeekPlan(@RequestBody List<YmTWeekPlan> list) {
        ResponseData responseData = null;
        try {
            iYmTWeekPlanService.addBatchYmTWeekPlan(list);
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
    public ResponseData updateYmTWeekPlan(@RequestBody YmTWeekPlan obj) {
        ResponseData responseData = null;
        try {
            String plandate = obj.getPlandate();
            String dates[] = plandate.split(",");
            iYmTWeekPlanService.updateYmTWeekPlan(obj, dates);
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
    public ResponseData updateBatchYmTWeekPlan(@RequestBody List<YmTWeekPlan> list) {
        ResponseData responseData = null;
        try {
            iYmTWeekPlanService.updateBatchYmTWeekPlan(list);
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
    public ResponseData deleteYmTWeekPlanById(@PathVariable("id") String id) {
        ResponseData responseData = null;
        try {
            iYmTWeekPlanService.deleteYmTWeekPlanById(id);
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
    public ResponseData deleteBatchYmTWeekPlan(@RequestBody List<String> ids) {
        ResponseData responseData = null;
        try {
            iYmTWeekPlanService.deleteBatchYmTWeekPlan(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


}
