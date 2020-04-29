package com.tieda.alarm.controller.checkRack;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tieda.alarm.entity.checkRack.CheckRack;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.service.checkRack.ICheckRackService;
import com.tieda.alarm.util.IdWorker;
import com.tieda.alarm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 作业主表 前端控制器
 * </p>
 *
 * @author
 * @since 2019-05-20
 */
@RestController
@RequestMapping("/checkRack" )
public class CheckRackController {


    @Autowired
    ICheckRackService iCheckRackService;
    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}" )
    public ResponseData getCheckRackById(@PathVariable("id" ) Long id) {
        ResponseData responseData = null;
        try {
            CheckRack obj = iCheckRackService.getCheckRackById(id);
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
    @GetMapping("/query" )
    public ResponseData getCheckRackList(HttpServletRequest request,@RequestParam Map<String, Object> params) {
        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
        params.put("worker",user.getVcNumber());
        List<CheckRack> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page" );       // 页码
            Object limit = params.get("limit" );     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iCheckRackService.getCheckRackList(params);
            } else {            // 查询分页列表数据
                params.remove("page" );
                params.remove("limit" );
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iCheckRackService.getCheckRackList(params);
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
    @PostMapping("/add" )
    public ResponseData addCheckRack(@RequestBody CheckRack obj, HttpServletRequest request) {
        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
        ResponseData responseData = null;
        try {
            obj.setId(String.valueOf(idWorker.nextId()));
            obj.setWorker(user.getVcNumber());
            iCheckRackService.addCheckRack(obj);
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
    @PostMapping("/addBatch" )
    public ResponseData addBatchCheckRack(@RequestBody List<CheckRack> list) {
        ResponseData responseData = null;
        try {
            iCheckRackService.addBatchCheckRack(list);
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
    @PostMapping("/update" )
    public ResponseData updateCheckRack(@RequestBody CheckRack obj) {
        ResponseData responseData = null;
        try {
            iCheckRackService.updateCheckRack(obj);
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
    @PostMapping("/updateBatch" )
    public ResponseData updateBatchCheckRack(@RequestBody List<CheckRack> list) {
        ResponseData responseData = null;
        try {
            iCheckRackService.updateBatchCheckRack(list);
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
    @PostMapping("/delete/{id}" )
    public ResponseData deleteCheckRackById(@PathVariable("id" ) Long id) {
        ResponseData responseData = null;
        try {
            iCheckRackService.deleteCheckRackById(id);
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
    @PostMapping("/deleteBatch" )
    public ResponseData deleteBatchCheckRack(@RequestBody List<Long> ids) {
        ResponseData responseData = null;
        try {
            iCheckRackService.deleteBatchCheckRack(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


}
