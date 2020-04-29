package com.tieda.alarm.controller.ymVMonthimpworkFinishKmn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.entity.ymVMonthimpworkFinishKmn.YmVMonthimpworkFinishKmn;
import com.tieda.alarm.service.ymVMonthimpworkFinishKmn.IYmVMonthimpworkFinishKmnService;
import com.tieda.alarm.util.IdWorker;

import java.util.Map;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2019-06-11
 */
@RestController
@RequestMapping("/ymVMonthimpworkFinishKmn" )
public class YmVMonthimpworkFinishKmnController {


@Autowired
    IYmVMonthimpworkFinishKmnService iYmVMonthimpworkFinishKmnService;
@Autowired
    IdWorker idWorker;

/**
 * 根据 id 查询对象
 * @param id    对象 id
 * @return
 */
@GetMapping("/query/{id}" )
public ResponseData getYmVMonthimpworkFinishKmnById(@PathVariable("id" ) Long id){
        ResponseData responseData=null;
        try{
    YmVMonthimpworkFinishKmn obj= iYmVMonthimpworkFinishKmnService.getYmVMonthimpworkFinishKmnById(id);
        responseData=ResponseData.okData(obj);   // 处理成功
        }catch(Exception e){
        e.printStackTrace();
        responseData=ResponseData.error();    // 处理失败
        }
        return responseData;
        }


/**
 * 查询对象列表信息
 * @param params   请求参数
 * @return
 */
@GetMapping("/query" )
public ResponseData getYmVMonthimpworkFinishKmnList(@RequestParam Map<String, Object> params){
        List<YmVMonthimpworkFinishKmn> objList=null;
        ResponseData responseData=null;
        try{
        Long count=0L;
        Object page=params.get("page" );       // 页码
        Object limit=params.get("limit" );     // 每页显示数量
        if(page==null&&limit==null){    // 查询所有数据
        objList= iYmVMonthimpworkFinishKmnService.getYmVMonthimpworkFinishKmnList(params);
        }else{            // 查询分页列表数据
        params.remove("page" );
        params.remove("limit" );
        int pageNo=Integer.parseInt(page.toString());
        int pageSize=Integer.parseInt(limit.toString());
        Page pageInfo=PageHelper.startPage(pageNo,pageSize);        // 使用PageHelper进行分页
        objList= iYmVMonthimpworkFinishKmnService.getYmVMonthimpworkFinishKmnList(params);
        count=pageInfo.getTotal();
        }

        responseData=ResponseData.okData(objList,count);  // 处理成功
        }catch(Exception e){
        e.printStackTrace();
        responseData=ResponseData.error();                    // 处理失败
        }
        return responseData;
        }

/**
 * 添加对象实体
 * @param obj  对象实体
 * @return
 */
@PostMapping("/add" )
public ResponseData addYmVMonthimpworkFinishKmn(@RequestBody YmVMonthimpworkFinishKmn obj){

        ResponseData responseData=null;
        try{
        obj.setnId(String.valueOf(idWorker.nextId()));
    iYmVMonthimpworkFinishKmnService.addYmVMonthimpworkFinishKmn(obj);
        responseData=ResponseData.ok();       // 处理成功
        }catch(Exception e){
        e.printStackTrace();
        responseData=ResponseData.error();    // 处理失败
        }
        return responseData;

        }

/**
 * 批量添加对象实体
 * @param list   对象实体集合
 * @return
 */
@PostMapping("/addBatch" )
public ResponseData addBatchYmVMonthimpworkFinishKmn(@RequestBody List<YmVMonthimpworkFinishKmn> list){
        ResponseData responseData=null;
        try{
    iYmVMonthimpworkFinishKmnService.addBatchYmVMonthimpworkFinishKmn(list);
        responseData=ResponseData.ok();       // 处理成功
        }catch(Exception e){
        e.printStackTrace();
        responseData=ResponseData.error();    // 处理失败
        }
        return responseData;
        }

/**
 * 更新对象实体
 * @param obj  对象实体
 * @return
 */
@PostMapping("/update" )
public ResponseData updateYmVMonthimpworkFinishKmn(@RequestBody YmVMonthimpworkFinishKmn obj){
        ResponseData responseData=null;
        try{
    iYmVMonthimpworkFinishKmnService.updateYmVMonthimpworkFinishKmn(obj);
        responseData=ResponseData.ok();       // 处理成功
        }catch(Exception e){
        e.printStackTrace();
        responseData=ResponseData.error();    // 处理失败
        }
        return responseData;
        }

/**
 * 批量更新对象实体
 * @param list  对象实体集合
 * @return
 */
@PostMapping("/updateBatch" )
public ResponseData updateBatchYmVMonthimpworkFinishKmn(@RequestBody List<YmVMonthimpworkFinishKmn> list){
        ResponseData responseData=null;
        try{
    iYmVMonthimpworkFinishKmnService.updateBatchYmVMonthimpworkFinishKmn(list);
        responseData=ResponseData.ok();       // 处理成功
        }catch(Exception e){
        e.printStackTrace();
        responseData=ResponseData.error();    // 处理失败
        }
        return responseData;
        }

/**
 * 根据ID删除对象实体
 * @param id 对象ID
 * @return
 */
@PostMapping("/delete/{id}" )
public ResponseData deleteYmVMonthimpworkFinishKmnById(@PathVariable("id" ) Long id){
        ResponseData responseData=null;
        try{
    iYmVMonthimpworkFinishKmnService.deleteYmVMonthimpworkFinishKmnById(id);
        responseData=ResponseData.ok();       // 处理成功
        }catch(Exception e){
        e.printStackTrace();
        responseData=ResponseData.error();    // 处理失败
        }
        return responseData;
        }

/**
 * 批量删除对象实体
 * @param ids 对象实体ID集合
 * @return
 */
@PostMapping("/deleteBatch" )
public ResponseData deleteBatchYmVMonthimpworkFinishKmn(@RequestBody List<Long> ids){
        ResponseData responseData=null;
        try{
    iYmVMonthimpworkFinishKmnService.deleteBatchYmVMonthimpworkFinishKmn(ids);
        responseData=ResponseData.ok();       // 处理成功
        }catch(Exception e){
        e.printStackTrace();
        responseData=ResponseData.error();    // 处理失败
        }
        return responseData;
        }


        }
