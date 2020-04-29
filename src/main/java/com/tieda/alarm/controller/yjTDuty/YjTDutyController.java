package com.tieda.alarm.controller.yjTDuty;
import com.tieda.alarm.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.entity.yjTDuty.YjTDuty;
import com.tieda.alarm.service.yjTDuty.IYjTDutyService;
import com.tieda.alarm.util.IdWorker;

import java.util.Map;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 值班人员信息表 前端控制器
 * </p>
 *
 * @author
 * @since 2019-06-27
 */
@RestController
@RequestMapping("/yjTDuty" )
public class YjTDutyController {


@Autowired
    IYjTDutyService iYjTDutyService;
@Autowired
    IdWorker idWorker;

/**
 * 根据 id 查询对象
 * @param id    对象 id
 * @return
 */
@GetMapping("/query/{id}" )
public ResponseData getYjTDutyById(@PathVariable("id" ) Long id){
        ResponseData responseData=null;
        try{
    YjTDuty obj= iYjTDutyService.getYjTDutyById(id);
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
public ResponseData getYjTDutyList(@RequestParam Map<String, Object> params){
        List<YjTDuty> objList=null;
        ResponseData responseData=null;
        try{
        Long count=0L;
        Object page=params.get("page" );       // 页码
        Object limit=params.get("limit" );     // 每页显示数量
        if(page==null&&limit==null){    // 查询所有数据
        objList= iYjTDutyService.getYjTDutyList(params);
        }else{            // 查询分页列表数据
        params.remove("page" );
        params.remove("limit" );
        int pageNo=Integer.parseInt(page.toString());
        int pageSize=Integer.parseInt(limit.toString());
        Page pageInfo=PageHelper.startPage(pageNo,pageSize);        // 使用PageHelper进行分页
        objList= iYjTDutyService.getYjTDutyList(params);
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
     * 查询对象列表信息
     * @param params   请求参数
     * @return
     */
    @GetMapping("/queryallPerson" )
    public ResponseData getAllYjTDutyListByCheck(@RequestParam Map<String, Object> params, HttpServletRequest request){
        List<YjTDuty> objList=null;
        ResponseData responseData=null;
        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
        params.put("vcUser",user.getVcNumber());
        try{
            Long count=0L;
            Object page=params.get("page" );       // 页码
            Object limit=params.get("limit" );     // 每页显示数量
            if(page==null&&limit==null){    // 查询所有数据
                objList= iYjTDutyService.getAllYjTDutyListByCheck(params);
            }else{            // 查询分页列表数据
                params.remove("page" );
                params.remove("limit" );
                int pageNo=Integer.parseInt(page.toString());
                int pageSize=Integer.parseInt(limit.toString());
                Page pageInfo=PageHelper.startPage(pageNo,pageSize);        // 使用PageHelper进行分页
                objList= iYjTDutyService.getAllYjTDutyListByCheck(params);
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
public ResponseData addYjTDuty(@RequestBody YjTDuty obj){

        ResponseData responseData=null;
        try{
    iYjTDutyService.addYjTDuty(obj);
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
//public ResponseData addBatchYjTDuty(@RequestBody List<YjTDuty> list){
    public ResponseData addBatchYjTDuty(@RequestBody Map listmap){
        ResponseData responseData=null;
    List<YjTDuty> list = (List<YjTDuty>)listmap.get("data");
        try{
    iYjTDutyService.addBatchYjTDuty(list);
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
public ResponseData updateYjTDuty(@RequestBody YjTDuty obj){
        ResponseData responseData=null;
        try{
    iYjTDutyService.updateYjTDuty(obj);
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
public ResponseData updateBatchYjTDuty(@RequestBody List<YjTDuty> list){
        ResponseData responseData=null;
        try{
    iYjTDutyService.updateBatchYjTDuty(list);
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
public ResponseData deleteYjTDutyById(@PathVariable("id" ) Long id){
        ResponseData responseData=null;
        try{
    iYjTDutyService.deleteYjTDutyById(id);
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
public ResponseData deleteBatchYjTDuty(@RequestParam Map<String, Object> params){
        ResponseData responseData=null;
        try{
    iYjTDutyService.deleteYjTDutyByOrgDate(params);
        responseData=ResponseData.ok();       // 处理成功
        }catch(Exception e){
        e.printStackTrace();
        responseData=ResponseData.error();    // 处理失败
        }
        return responseData;
        }
 }
