package com.tieda.alarm.controller.pubTDictionary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.entity.pubTDictionary.PubTDictionary;
import com.tieda.alarm.service.pubTDictionary.IPubTDictionaryService;
import com.tieda.alarm.util.IdWorker;

import java.util.Map;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author
 * @since 2019-09-04
 */
@RestController
@RequestMapping("/pubTDictionary")
public class PubTDictionaryController {


    @Autowired
    IPubTDictionaryService iPubTDictionaryService;
    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}")
    public ResponseData getPubTDictionaryById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            PubTDictionary obj = iPubTDictionaryService.getPubTDictionaryById(id);
            responseData = ResponseData.okData(obj);   // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 根据父节点查询子节点集合
     *
     * @param mId 对象 mId
     * @return
     */
    @GetMapping("/getChilds")
    public ResponseData getChilds(String mId) {
        ResponseData responseData = null;
        try {
            List<PubTDictionary> obj = iPubTDictionaryService.getChilds(mId);
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
    public ResponseData getPubTDictionaryList(@RequestParam Map<String, Object> params) {
        List<PubTDictionary> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iPubTDictionaryService.getPubTDictionaryList(params);
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iPubTDictionaryService.getPubTDictionaryList(params);
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
    public ResponseData addPubTDictionary(@RequestBody PubTDictionary obj) {

        ResponseData responseData = null;
        try {
//            obj.setnId(String.valueOf(idWorker.nextId()));
            iPubTDictionaryService.addPubTDictionary(obj);
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
    public ResponseData addBatchPubTDictionary(@RequestBody List<PubTDictionary> list) {
        ResponseData responseData = null;
        try {
            iPubTDictionaryService.addBatchPubTDictionary(list);
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
    public ResponseData updatePubTDictionary(@RequestBody PubTDictionary obj) {
        ResponseData responseData = null;
        try {
            iPubTDictionaryService.updatePubTDictionary(obj);
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
    public ResponseData updateBatchPubTDictionary(@RequestBody List<PubTDictionary> list) {
        ResponseData responseData = null;
        try {
            iPubTDictionaryService.updateBatchPubTDictionary(list);
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
    public ResponseData deletePubTDictionaryById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            iPubTDictionaryService.deletePubTDictionaryById(id);
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
    public ResponseData deleteBatchPubTDictionary(@RequestBody List<Long> ids) {
        ResponseData responseData = null;
        try {
            iPubTDictionaryService.deleteBatchPubTDictionary(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


}
