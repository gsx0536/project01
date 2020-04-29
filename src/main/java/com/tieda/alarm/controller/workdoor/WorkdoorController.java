package com.tieda.alarm.controller.workdoor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.entity.workdoor.Workdoor;
import com.tieda.alarm.service.workdoor.IWorkdoorService;
import com.tieda.alarm.util.IdWorker;
import java.util.Map;
import java.util.List;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
/**
 * <p>
 * 作业门信息 前端控制器
 * </p>
 *
 * @author 
 * @since 2019-05-22
 */
@RestController
@RequestMapping("/workdoor")
public class WorkdoorController {


    @Autowired
    IWorkdoorService iWorkdoorService;
    @Autowired
    IdWorker idWorker;

/**
 * 根据 id 查询对象
 * @param id    对象 id
 * @return
 */
@GetMapping("/query/{id}")
public ResponseData getWorkdoorById(@PathVariable("id") Long id){
        ResponseData responseData=null;
        try{
    Workdoor obj= iWorkdoorService.getWorkdoorById(id);
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
@GetMapping("/query")
public ResponseData getWorkdoorList(@RequestParam Map<String, Object> params){
        List<Workdoor> objList=null;
        ResponseData responseData=null;
        try{
        Long count = 0L;
        Object page=params.get("page");       // 页码
        Object limit=params.get("limit");     // 每页显示数量
        if(page==null&&limit==null){    // 查询所有数据
        objList= iWorkdoorService.getWorkdoorList(params);
        }else{            // 查询分页列表数据
        params.remove("page");
        params.remove("limit");
        int pageNo=Integer.parseInt(page.toString());
        int pageSize=Integer.parseInt(limit.toString());
        Page pageInfo=PageHelper.startPage(pageNo,pageSize);        // 使用PageHelper进行分页
        objList= iWorkdoorService.getWorkdoorList(params);
        count = pageInfo.getTotal();
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
@PostMapping("/add")
public ResponseData addWorkdoor(@RequestBody Workdoor obj){

        ResponseData responseData=null;
        try{
        obj.setnId(String.valueOf(idWorker.nextId()));
    iWorkdoorService.addWorkdoor(obj);
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
@PostMapping("/addBatch")
public ResponseData addBatchWorkdoor(@RequestBody List<Workdoor> list){
        ResponseData responseData=null;
        try{
    iWorkdoorService.addBatchWorkdoor(list);
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
@PostMapping("/update")
public ResponseData updateWorkdoor(@RequestBody Workdoor obj){
        ResponseData responseData=null;
        try{
    iWorkdoorService.updateWorkdoor(obj);
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
@PostMapping("/updateBatch")
public ResponseData updateBatchWorkdoor(@RequestBody List<Workdoor> list){
        ResponseData responseData=null;
        try{
    iWorkdoorService.updateBatchWorkdoor(list);
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
@PostMapping("/delete/{id}")
public ResponseData deleteWorkdoorById(@PathVariable("id") Long id){
        ResponseData responseData=null;
        try{
    iWorkdoorService.deleteWorkdoorById(id);
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
@PostMapping("/deleteBatch")
public ResponseData deleteBatchWorkdoor(@RequestBody List<Long> ids){
        ResponseData responseData=null;
        try{
    iWorkdoorService.deleteBatchWorkdoor(ids);
        responseData=ResponseData.ok();       // 处理成功
        }catch(Exception e){
        e.printStackTrace();
        responseData=ResponseData.error();    // 处理失败
        }
        return responseData;
}

    /**
     * 获取交通图二维码
     * @param staId
     * @param devName
     * @param devType
     * @return
     */
    @GetMapping("getTrafficImage")
    public ResponseData getTrafficImage(String staId, String devName) {
        ResponseData responseData = null;
        try {
            String imageUrl = iWorkdoorService.getTrafficImage(staId, devName);
            if(imageUrl != null){
                imageUrl = imageUrl.substring(0,imageUrl.length()-1);
            }
            responseData = ResponseData.okData("imageUrl",imageUrl);       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error(e.getMessage());    // 处理失败
        }
        return responseData;
    }

}
