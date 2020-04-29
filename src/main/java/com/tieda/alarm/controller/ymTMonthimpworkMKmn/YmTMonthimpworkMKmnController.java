package com.tieda.alarm.controller.ymTMonthimpworkMKmn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.entity.ymTMonthimpworkMKmn.YmTMonthimpworkMKmn;
import com.tieda.alarm.service.ymTMonthimpworkMKmn.IYmTMonthimpworkMKmnService;
import com.tieda.alarm.util.IdWorker;

import java.util.Map;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
/**
 * <p>
 * 昆明月度重点工作主表 前端控制器
 * </p>
 *
 * @author 
 * @since 2019-06-02
 */
@RestController
@RequestMapping("/ymTMonthimpworkMKmn" )
public class YmTMonthimpworkMKmnController {


@Autowired
    IYmTMonthimpworkMKmnService iYmTMonthimpworkMKmnService;
@Autowired
    IdWorker idWorker;

/**
 * 根据 id 查询对象
 * @param id    对象 id
 * @return
 */
@GetMapping("/query/{id}" )
public ResponseData getYmTMonthimpworkMKmnById(@PathVariable("id" ) Long id){
        ResponseData responseData=null;
        try{
    YmTMonthimpworkMKmn obj= iYmTMonthimpworkMKmnService.getYmTMonthimpworkMKmnById(id);
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
public ResponseData getYmTMonthimpworkMKmnList(@RequestParam Map<String, Object> params){
        List<YmTMonthimpworkMKmn> objList=null;
        ResponseData responseData=null;
        try{
        Long count=0L;
        Object page=params.get("page" );       // 页码
        Object limit=params.get("limit" );     // 每页显示数量
        if(page==null&&limit==null){    // 查询所有数据
        objList= iYmTMonthimpworkMKmnService.getYmTMonthimpworkMKmnList(params);
        }else{            // 查询分页列表数据
        params.remove("page" );
        params.remove("limit" );
        int pageNo=Integer.parseInt(page.toString());
        int pageSize=Integer.parseInt(limit.toString());
        Page pageInfo=PageHelper.startPage(pageNo,pageSize);        // 使用PageHelper进行分页
        objList= iYmTMonthimpworkMKmnService.getYmTMonthimpworkMKmnList(params);
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
public ResponseData addYmTMonthimpworkMKmn(@RequestBody YmTMonthimpworkMKmn obj){

        ResponseData responseData=null;
        try{
        obj.setnId(String.valueOf(idWorker.nextId()));
    iYmTMonthimpworkMKmnService.addYmTMonthimpworkMKmn(obj);
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
public ResponseData addBatchYmTMonthimpworkMKmn(@RequestBody List<YmTMonthimpworkMKmn> list){
        ResponseData responseData=null;
        try{
    iYmTMonthimpworkMKmnService.addBatchYmTMonthimpworkMKmn(list);
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
public ResponseData updateYmTMonthimpworkMKmn(@RequestBody YmTMonthimpworkMKmn obj){
        ResponseData responseData=null;
        try{
    iYmTMonthimpworkMKmnService.updateYmTMonthimpworkMKmn(obj);
//            if(obj.getVcState().equals("2"))
//            {
//                iYmTMonthimpworkMKmnService.insertymTMonthFinishKmn(obj.getnId());
//            }
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
public ResponseData updateBatchYmTMonthimpworkMKmn(@RequestBody List<YmTMonthimpworkMKmn> list){
        ResponseData responseData=null;
        try{
    iYmTMonthimpworkMKmnService.updateBatchYmTMonthimpworkMKmn(list);
//            for (int i=0;i<list.size();i++) {
//                YmTMonthimpworkMKmn ymTMonthimpworkMKmn = (YmTMonthimpworkMKmn)list.get(i);
//                if(ymTMonthimpworkMKmn.getVcState().equals("2"))
//                {
//                    iYmTMonthimpworkMKmnService.insertymTMonthFinishKmn(ymTMonthimpworkMKmn.getnId());
//                }
//            }
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
public ResponseData deleteYmTMonthimpworkMKmnById(@PathVariable("id" ) Long id){
        ResponseData responseData=null;
        try{
    iYmTMonthimpworkMKmnService.deleteYmTMonthimpworkMKmnById(id);
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
public ResponseData deleteBatchYmTMonthimpworkMKmn(@RequestBody List<Long> ids){
        ResponseData responseData=null;
        try{
    iYmTMonthimpworkMKmnService.deleteBatchYmTMonthimpworkMKmn(ids);
        responseData=ResponseData.ok();       // 处理成功
        }catch(Exception e){
        e.printStackTrace();
        responseData=ResponseData.error();    // 处理失败
        }
        return responseData;
        }
}
