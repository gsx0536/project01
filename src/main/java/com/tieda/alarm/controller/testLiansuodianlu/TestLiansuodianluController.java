package com.tieda.alarm.controller.testLiansuodianlu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.entity.testLiansuodianlu.TestLiansuodianlu;
import com.tieda.alarm.service.testLiansuodianlu.ITestLiansuodianluService;
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
 * @since 2019-10-16
 */
@RestController
@RequestMapping("/test_liansuodianlu" )
public class TestLiansuodianluController {


@Autowired
    ITestLiansuodianluService iTestLiansuodianluService;
@Autowired
    IdWorker idWorker;

/**
 * 根据 id 查询对象
 * @param id    对象 id
 * @return
 */
@GetMapping("/query/{id}" )
public ResponseData getTestLiansuodianluById(@PathVariable("id" ) Long id){
        ResponseData responseData=null;
        try{
    TestLiansuodianlu obj= iTestLiansuodianluService.getTestLiansuodianluById(id);
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
public ResponseData getTestLiansuodianluList(@RequestParam Map<String, Object> params){
        List<TestLiansuodianlu> objList=null;
        ResponseData responseData=null;
        try{
        Long count=0L;
        Object page=params.get("page" );       // 页码
        Object limit=params.get("limit" );     // 每页显示数量
        if(page==null&&limit==null){    // 查询所有数据
        objList= iTestLiansuodianluService.getTestLiansuodianluList(params);
        }else{            // 查询分页列表数据
        params.remove("page" );
        params.remove("limit" );
        int pageNo=Integer.parseInt(page.toString());
        int pageSize=Integer.parseInt(limit.toString());
        Page pageInfo=PageHelper.startPage(pageNo,pageSize);        // 使用PageHelper进行分页
        objList= iTestLiansuodianluService.getTestLiansuodianluList(params);
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
public ResponseData addTestLiansuodianlu(@RequestBody TestLiansuodianlu obj){

        ResponseData responseData=null;
        try{
        obj.setId(String.valueOf(idWorker.nextId()));
    iTestLiansuodianluService.addTestLiansuodianlu(obj);
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
public ResponseData addBatchTestLiansuodianlu(@RequestBody List<TestLiansuodianlu> list){
        ResponseData responseData=null;
        try{
    iTestLiansuodianluService.addBatchTestLiansuodianlu(list);
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
public ResponseData updateTestLiansuodianlu(@RequestBody TestLiansuodianlu obj){
        ResponseData responseData=null;
        try{
    iTestLiansuodianluService.updateTestLiansuodianlu(obj);
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
public ResponseData updateBatchTestLiansuodianlu(@RequestBody List<TestLiansuodianlu> list){
        ResponseData responseData=null;
        try{
    iTestLiansuodianluService.updateBatchTestLiansuodianlu(list);
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
public ResponseData deleteTestLiansuodianluById(@PathVariable("id" ) Long id){
        ResponseData responseData=null;
        try{
    iTestLiansuodianluService.deleteTestLiansuodianluById(id);
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
public ResponseData deleteBatchTestLiansuodianlu(@RequestBody List<Long> ids){
        ResponseData responseData=null;
        try{
    iTestLiansuodianluService.deleteBatchTestLiansuodianlu(ids);
        responseData=ResponseData.ok();       // 处理成功
        }catch(Exception e){
        e.printStackTrace();
        responseData=ResponseData.error();    // 处理失败
        }
        return responseData;
        }


        }
