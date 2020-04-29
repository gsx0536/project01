package com.tieda.alarm.controller.emAlarmelect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.entity.emAlarmelect.EmAlarmelect;
import com.tieda.alarm.service.emAlarmelect.IEmAlarmelectService;
import com.tieda.alarm.util.IdWorker;

import java.util.Map;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * <p>
 * 报警电路图对应表 前端控制器
 * </p>
 *
 * @author
 * @since 2019-05-18
 */
@RestController
@RequestMapping("/emAlarmelect" )
public class EmAlarmelectController {


    @Autowired
    IEmAlarmelectService iEmAlarmelectService;
    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}" )
    public ResponseData getEmAlarmelectById(@PathVariable("id" ) Long id) {
        ResponseData responseData = null;
        try {
            EmAlarmelect obj = iEmAlarmelectService.getEmAlarmelectById(id);
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
    public ResponseData getEmAlarmelectList(@RequestParam Map<String, Object> params) {
        List<EmAlarmelect> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page" );       // 页码
            Object limit = params.get("limit" );     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iEmAlarmelectService.getEmAlarmelectList(params);
            } else {            // 查询分页列表数据
                params.remove("page" );
                params.remove("limit" );
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iEmAlarmelectService.getEmAlarmelectList(params);
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
    public ResponseData addEmAlarmelect(@RequestBody EmAlarmelect obj) {

        ResponseData responseData = null;
        try {
            obj.setnId(String.valueOf(idWorker.nextId()));
            iEmAlarmelectService.addEmAlarmelect(obj);
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
    public ResponseData addBatchEmAlarmelect(@RequestBody List<EmAlarmelect> list) {
        ResponseData responseData = null;
        try {
            iEmAlarmelectService.addBatchEmAlarmelect(list);
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
    public ResponseData updateEmAlarmelect(@RequestBody EmAlarmelect obj) {
        ResponseData responseData = null;
        try {
            iEmAlarmelectService.updateEmAlarmelect(obj);
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
    public ResponseData updateBatchEmAlarmelect(@RequestBody List<EmAlarmelect> list) {
        ResponseData responseData = null;
        try {
            iEmAlarmelectService.updateBatchEmAlarmelect(list);
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
    public ResponseData deleteEmAlarmelectById(@PathVariable("id" ) Long id) {
        ResponseData responseData = null;
        try {
            iEmAlarmelectService.deleteEmAlarmelectById(id);
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
    public ResponseData deleteBatchEmAlarmelect(@RequestBody List<Long> ids) {
        ResponseData responseData = null;
        try {
            iEmAlarmelectService.deleteBatchEmAlarmelect(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


}
