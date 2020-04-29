package com.tieda.alarm.controller.dicRackItem;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tieda.alarm.entity.dicRackItem.DicRackItem;
import com.tieda.alarm.service.dicRackItem.IDicRackItemService;
import com.tieda.alarm.util.IdWorker;
import com.tieda.alarm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author
 * @since 2019-05-11
 */
@RestController
@RequestMapping("/dicRackItem")
public class DicRackItemController {


    @Autowired
    IDicRackItemService iDicRackItemService;
    @Autowired
    IdWorker idWorker;


    @GetMapping("/queryByRackId/{id}")
    public ResponseData queryByRackId(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            List<DicRackItem> objList = iDicRackItemService.queryByRackId(id);
            responseData = ResponseData.okData(objList);   // 处理成功
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
    @GetMapping("/query/{id}")
    public String getDicRackItemById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        String result = "";
        try {
            DicRackItem obj = iDicRackItemService.getDicRackItemById(id);
            responseData = ResponseData.okData(obj);
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }finally {
            result = JSON.toJSONString(responseData);
            return result;
        }

    }


    /**
     * 查询对象列表信息
     *
     * @param params 请求参数
     * @return
     */
    @GetMapping("/query")
    public ResponseData getDicRackItemList(@RequestParam Map<String, Object> params) {
        List<DicRackItem> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iDicRackItemService.getDicRackItemList(params);
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iDicRackItemService.getDicRackItemList(params);
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
    public ResponseData addDicRackItem(@RequestBody DicRackItem obj) {

        ResponseData responseData = null;
        try {
            obj.setId(String.valueOf(idWorker.nextId()));
            iDicRackItemService.addDicRackItem(obj);
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
    public ResponseData addBatchDicRackItem(@RequestBody List<DicRackItem> list) {
        ResponseData responseData = null;
        try {
            iDicRackItemService.addBatchDicRackItem(list);
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
    public ResponseData updateDicRackItem(@RequestBody DicRackItem obj) {
        ResponseData responseData = null;
        try {
            iDicRackItemService.updateDicRackItem(obj);
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
    public ResponseData updateBatchDicRackItem(@RequestBody List<DicRackItem> list) {
        ResponseData responseData = null;
        try {
            iDicRackItemService.updateBatchDicRackItem(list);
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
    public ResponseData deleteDicRackItemById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            iDicRackItemService.deleteDicRackItemById(id);
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
    public ResponseData deleteBatchDicRackItem(@RequestBody List<Long> ids) {
        ResponseData responseData = null;
        try {
            iDicRackItemService.deleteBatchDicRackItem(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


}
