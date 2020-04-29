package com.tieda.alarm.controller.ymTMonthimpfinishKmn;
import io.jsonwebtoken.lang.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.entity.ymTMonthimpfinishKmn.YmTMonthimpfinishKmn;
import com.tieda.alarm.service.ymTMonthimpfinishKmn.IYmTMonthimpfinishKmnService;
import com.tieda.alarm.util.IdWorker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
/**
 * <p>
 * 月度重点工作完成情况 前端控制器
 * </p>
 *
 * @author 
 * @since 2019-06-05
 */
@RestController
@RequestMapping("/ymTMonthimpfinishKmn" )
public class YmTMonthimpfinishKmnController {


@Autowired
    IYmTMonthimpfinishKmnService iYmTMonthimpfinishKmnService;
@Autowired
    IdWorker idWorker;

/**
 * 根据 id 查询对象
 * @param id    对象 id
 * @return
 */
@GetMapping("/query/{id}" )
public ResponseData getYmTMonthimpfinishKmnById(@PathVariable("id" ) Long id){
        ResponseData responseData=null;
        try{
    YmTMonthimpfinishKmn obj= iYmTMonthimpfinishKmnService.getYmTMonthimpfinishKmnById(id);
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
public ResponseData getYmTMonthimpfinishKmnList(@RequestParam Map<String, Object> params){
        List<YmTMonthimpfinishKmn> objList=null;
        ResponseData responseData=null;
        try{
        Long count=0L;
        Object page=params.get("page" );       // 页码
        Object limit=params.get("limit" );     // 每页显示数量
        if(page==null&&limit==null){    // 查询所有数据
        objList= iYmTMonthimpfinishKmnService.getYmTMonthimpfinishKmnList(params);
        }else{            // 查询分页列表数据
        params.remove("page" );
        params.remove("limit" );
        int pageNo=Integer.parseInt(page.toString());
        int pageSize=Integer.parseInt(limit.toString());
        Page pageInfo=PageHelper.startPage(pageNo,pageSize);        // 使用PageHelper进行分页
        objList= iYmTMonthimpfinishKmnService.getYmTMonthimpfinishKmnList(params);
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
public ResponseData addYmTMonthimpfinishKmn(@RequestBody YmTMonthimpfinishKmn obj){

        ResponseData responseData=null;
        try{
        obj.setnId(String.valueOf(idWorker.nextId()));
    iYmTMonthimpfinishKmnService.addYmTMonthimpfinishKmn(obj);
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
public ResponseData addBatchYmTMonthimpfinishKmn(@RequestBody List<YmTMonthimpfinishKmn> list){
        ResponseData responseData=null;
        try{
    iYmTMonthimpfinishKmnService.addBatchYmTMonthimpfinishKmn(list);
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
public ResponseData updateYmTMonthimpfinishKmn(@RequestBody YmTMonthimpfinishKmn obj){
        ResponseData responseData=null;
        try{
            //累加反馈
            if ("7".equals(obj.getVcStatus())) {
                String vcFinishinfo = obj.getVcFinishinfo();
                Assert.hasText(vcFinishinfo,"完成情况不能为空！");
                String date = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
                vcFinishinfo = vcFinishinfo + " " + date + "<br/>";
                obj.setVcFinishinfo(vcFinishinfo);
            }
            iYmTMonthimpfinishKmnService.updateYmTMonthimpfinishKmn(obj);
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
public ResponseData updateBatchYmTMonthimpfinishKmn(@RequestBody List<YmTMonthimpfinishKmn> list){
        ResponseData responseData=null;
        try{
    iYmTMonthimpfinishKmnService.updateBatchYmTMonthimpfinishKmn(list);
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
public ResponseData deleteYmTMonthimpfinishKmnById(@PathVariable("id" ) Long id){
        ResponseData responseData=null;
        try{
    iYmTMonthimpfinishKmnService.deleteYmTMonthimpfinishKmnById(id);
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
public ResponseData deleteBatchYmTMonthimpfinishKmn(@RequestBody List<Long> ids){
        ResponseData responseData=null;
        try{
    iYmTMonthimpfinishKmnService.deleteBatchYmTMonthimpfinishKmn(ids);
        responseData=ResponseData.ok();       // 处理成功
        }catch(Exception e){
        e.printStackTrace();
        responseData=ResponseData.error();    // 处理失败
        }
        return responseData;
        }


        }
