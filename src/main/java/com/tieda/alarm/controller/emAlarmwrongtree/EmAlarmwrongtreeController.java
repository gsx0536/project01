package com.tieda.alarm.controller.emAlarmwrongtree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.entity.emAlarmwrongtree.EmAlarmwrongtree;
import com.tieda.alarm.service.emAlarmwrongtree.IEmAlarmwrongtreeService;
import com.tieda.alarm.util.IdWorker;

import java.util.Map;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * <p>
 * 设备故障树对应关系表 前端控制器
 * </p>
 *
 * @author
 * @since 2019-05-18
 */
@RestController
@RequestMapping("/emAlarmwrongtree" )
public class EmAlarmwrongtreeController {


    @Autowired
    IEmAlarmwrongtreeService iEmAlarmwrongtreeService;
    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}" )
    public ResponseData getEmAlarmwrongtreeById(@PathVariable("id" ) Long id) {
        ResponseData responseData = null;
        try {
            EmAlarmwrongtree obj = iEmAlarmwrongtreeService.getEmAlarmwrongtreeById(id);
            responseData = ResponseData.okData(obj);   // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/getwrongtree" )
    public ResponseData getEmAlarmwrongtreeById(String alarmtypeid, String devtypeid) {
        ResponseData responseData = null;
        try {
            List<Map> obj = iEmAlarmwrongtreeService.getWrongTreeIdByAlarmId(alarmtypeid);
            if (!(obj.size() > 0)) {
                obj = iEmAlarmwrongtreeService.getWrongTreeIdByDevId(devtypeid);
            }
            responseData = ResponseData.okData(obj);   // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/getwrongNode" )
    public ResponseData getEmAlarmwrongtreeNodeById(String alarmtypeid) {
        ResponseData responseData = null;
        try {
            List<Map> obj = iEmAlarmwrongtreeService.getNodeIdByAlarmId(alarmtypeid);
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
    public ResponseData getEmAlarmwrongtreeList(@RequestParam Map<String, Object> params) {
        List<EmAlarmwrongtree> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page" );       // 页码
            Object limit = params.get("limit" );     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iEmAlarmwrongtreeService.getEmAlarmwrongtreeList(params);
            } else {            // 查询分页列表数据
                params.remove("page" );
                params.remove("limit" );
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iEmAlarmwrongtreeService.getEmAlarmwrongtreeList(params);
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
    public ResponseData addEmAlarmwrongtree(@RequestBody EmAlarmwrongtree obj) {

        ResponseData responseData = null;
        try {
            obj.setnId(String.valueOf(idWorker.nextId()));
            iEmAlarmwrongtreeService.addEmAlarmwrongtree(obj);
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
    public ResponseData addBatchEmAlarmwrongtree(@RequestBody List<EmAlarmwrongtree> list) {
        ResponseData responseData = null;
        try {
            iEmAlarmwrongtreeService.addBatchEmAlarmwrongtree(list);
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
    public ResponseData updateEmAlarmwrongtree(@RequestBody EmAlarmwrongtree obj) {
        ResponseData responseData = null;
        try {
            iEmAlarmwrongtreeService.updateEmAlarmwrongtree(obj);
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
    public ResponseData updateBatchEmAlarmwrongtree(@RequestBody List<EmAlarmwrongtree> list) {
        ResponseData responseData = null;
        try {
            iEmAlarmwrongtreeService.updateBatchEmAlarmwrongtree(list);
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
    public ResponseData deleteEmAlarmwrongtreeById(@PathVariable("id" ) Long id) {
        ResponseData responseData = null;
        try {
            iEmAlarmwrongtreeService.deleteEmAlarmwrongtreeById(id);
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
    public ResponseData deleteBatchEmAlarmwrongtree(@RequestBody List<Long> ids) {
        ResponseData responseData = null;
        try {
            iEmAlarmwrongtreeService.deleteBatchEmAlarmwrongtree(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


}
