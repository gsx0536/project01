package com.tieda.alarm.controller.emPersoninfo;

import com.tieda.alarm.mapper.station.StationMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.entity.emPersoninfo.EmPersoninfo;
import com.tieda.alarm.service.emPersoninfo.IEmPersoninfoService;
import com.tieda.alarm.util.IdWorker;

import java.util.Map;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * <p>
 * 应急抢修队伍 前端控制器
 * </p>
 *
 * @author
 * @since 2019-05-28
 */
@RestController
@RequestMapping("/emPersoninfo")
public class EmPersoninfoController {


    @Autowired
    IEmPersoninfoService iEmPersoninfoService;
    @Autowired
    IdWorker idWorker;

    @Autowired
    StationMapper stationMapper;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}")
    public ResponseData getEmPersoninfoById(@PathVariable("id") String id) {
        ResponseData responseData = null;
        try {
            EmPersoninfo obj = iEmPersoninfoService.getEmPersoninfoById(id);
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
    public ResponseData getEmPersoninfoList(@RequestParam Map<String, Object> params) {
        List<EmPersoninfo> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iEmPersoninfoService.getEmPersoninfoList(params);
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                Object staId = params.get("staId");
                Object vcDevid = params.get("vcDevid");
                Object vcPersonname = params.get("vcPersonname");
                if (StringUtils.isNotEmpty((String)staId)
                        && StringUtils.isEmpty((String)vcDevid)
                        && StringUtils.isEmpty((String)vcPersonname)) {
                    List<String> orgIds = stationMapper.getOrgIdByStaId((String)staId);
                    if (orgIds.size()>0) {
                        params.put("vcDevid",orgIds.get(0));
                    }
                }
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iEmPersoninfoService.getEmPersoninfoList(params);
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
    public ResponseData addEmPersoninfo(@RequestBody EmPersoninfo obj) {

        ResponseData responseData = null;
        try {
            obj.setnId(String.valueOf(idWorker.nextId()));
            iEmPersoninfoService.addEmPersoninfo(obj);
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
    public ResponseData addBatchEmPersoninfo(@RequestBody List<EmPersoninfo> list) {
        ResponseData responseData = null;
        try {
            iEmPersoninfoService.addBatchEmPersoninfo(list);
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
    public ResponseData updateEmPersoninfo(@RequestBody EmPersoninfo obj) {
        ResponseData responseData = null;
        try {
            iEmPersoninfoService.updateEmPersoninfo(obj);
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
    public ResponseData updateBatchEmPersoninfo(@RequestBody List<EmPersoninfo> list) {
        ResponseData responseData = null;
        try {
            iEmPersoninfoService.updateBatchEmPersoninfo(list);
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
    public ResponseData deleteEmPersoninfoById(@PathVariable("id") String id) {
        ResponseData responseData = null;
        try {
            iEmPersoninfoService.deleteEmPersoninfoById(id);
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
    public ResponseData deleteBatchEmPersoninfo(@RequestBody List<String> ids) {
        ResponseData responseData = null;
        try {
            iEmPersoninfoService.deleteBatchEmPersoninfo(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


}
