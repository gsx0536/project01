package com.tieda.alarm.controller.tcdwPlan;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tieda.alarm.entity.tcdwPlan.TcdwPlan;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.service.tcdwPlan.ITcdwPlanService;
import com.tieda.alarm.util.ExcelExpress;
import com.tieda.alarm.util.IdWorker;
import com.tieda.alarm.util.ResponseData;
import org.apache.tomcat.jni.Mmap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 天窗点外维修作业计划审批单 前端控制器
 * </p>
 *
 * @author
 * @since 2019-06-19
 */
@RestController
@RequestMapping("/tcdwPlan")
public class TcdwPlanController {


    @Autowired
    ITcdwPlanService iTcdwPlanService;
    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}")
    public ResponseData getTcdwPlanById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            TcdwPlan obj = iTcdwPlanService.getTcdwPlanById(id);
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
    public ResponseData getTcdwPlanList(@RequestParam Map<String, Object> params) {
        List<TcdwPlan> objList = null;
        ResponseData responseData = null;
        String status= (String)params.get("status");
        if(status!=null&&!"".equals(status)){
            params.put("status",status.split(","));
        }

        String workshopid=(String)params.get("workshopid");
        if(workshopid!=null&&!"".equals(workshopid)){
            List workarealist=iTcdwPlanService.getWorkarea(workshopid);
            if(workarealist.size()>0){
                params.put("workareaids",workarealist.toArray());
            }
        }

        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iTcdwPlanService.getTcdwPlanList(params);
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iTcdwPlanService.getTcdwPlanList(params);
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
    public ResponseData addTcdwPlan(HttpServletRequest request, @RequestBody TcdwPlan obj) {
        ResponseData responseData = null;
        try {
            obj.setId(String.valueOf(idWorker.nextId()));
            iTcdwPlanService.addTcdwPlan(obj);
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
    public ResponseData addBatchTcdwPlan(@RequestBody List<TcdwPlan> list) {
        ResponseData responseData = null;
        try {
            iTcdwPlanService.addBatchTcdwPlan(list);
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
    public ResponseData updateTcdwPlan(@RequestBody TcdwPlan obj,HttpServletRequest request) {
        ResponseData responseData = null;
        try {
            String status=obj.getStatus();
            String code_temp=obj.getCode();
            if(("".equals(code_temp)||code_temp==null)&&"4".equals(status)){
                TcdwPlan tcdwPlan=iTcdwPlanService.getTcdwPlanById(Long.valueOf(obj.getId()));
                String org="";
                if(tcdwPlan.getWorkshop()!=null&&!"".equals(tcdwPlan.getWorkshop())){
                    org=tcdwPlan.getWorkshopid();
                }else{
                    List<Map> list=iTcdwPlanService.getWorkshopByWorkarea(tcdwPlan.getWorkareaid());
                    if(list.size()>0){
                        Map map=list.get(0);
                        org=(String)map.get("VC_PAR$ORG$ID");
                    }

                }
                String shortOrg=iTcdwPlanService.getShortOrg(org);
                String code="昆南电"+shortOrg;

                String maxCode=iTcdwPlanService.getByMaxNo(code);
                Integer no=0;
                if("".equals(maxCode)||maxCode==null){
                    no=1;
                }else {
                    no = Integer.valueOf(maxCode) + 1;
                }
                code+=String.valueOf(no);
                obj.setNo(String.valueOf(no));
                obj.setCode(code+"号");
            }


            iTcdwPlanService.updateTcdwPlan(obj);
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
    public ResponseData updateBatchTcdwPlan(@RequestBody List<TcdwPlan> list) {
        ResponseData responseData = null;
        try {
            iTcdwPlanService.updateBatchTcdwPlan(list);
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
    public ResponseData deleteTcdwPlanById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            iTcdwPlanService.deleteTcdwPlanById(id);
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
    public ResponseData deleteBatchTcdwPlan(@RequestBody List<Long> ids) {
        ResponseData responseData = null;
        try {
            iTcdwPlanService.deleteBatchTcdwPlan(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /***
     * 点外天窗导出派工单 - 调度审批同意后才允许打印派工单
     * @param plan
     * @param response
     * @return
     */
    @RequestMapping("export")
    public void getrwxpgdexport(TcdwPlan plan,HttpServletResponse response){
        try{
            TcdwPlan tcdwPlan = iTcdwPlanService.getTcdwPlanById(Long.valueOf(plan.getId()));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String workdateStr = sdf.format(tcdwPlan.getEnddate());
            String skywintime = tcdwPlan.getBegindate().getHours()+":"+tcdwPlan.getBegindate().getMinutes()+
                    "-"+tcdwPlan.getEnddate().getHours()+":"+tcdwPlan.getEnddate().getMinutes();
            String fileName = "点外作业派工单";
            Map<String,Object>  map = new HashMap();
            map.put("mapdata",tcdwPlan);
            map.put("workdate",workdateStr);
            map.put("skywintime",skywintime);
            new ExcelExpress("UTF-8").setData(map).createWord("tcdwplan.ftl")
                    .write(response, ExcelExpress.formatFileName(fileName));
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
