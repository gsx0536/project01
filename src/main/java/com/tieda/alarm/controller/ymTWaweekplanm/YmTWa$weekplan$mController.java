package com.tieda.alarm.controller.ymTWaweekplanm;

import com.tieda.alarm.constants.DataConstants;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.service.weekPlanOperator.IWeekPlanOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.entity.ymTWaweekplanm.YmTWa$weekplan$m;
import com.tieda.alarm.service.ymTWaweekplanm.IYmTWa$weekplan$mService;
import com.tieda.alarm.util.IdWorker;

import java.util.Date;
import java.util.Map;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author
 * @since 2020-01-13
 */
@RestController
@RequestMapping("/ymTWa$weekplan$m")
public class YmTWa$weekplan$mController {


    @Autowired
    IYmTWa$weekplan$mService iYmTWa$weekplan$mService;
    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}")
    public ResponseData getYmTWa$weekplan$mById(@PathVariable("id") String id) {
        ResponseData responseData = null;
        try {
            YmTWa$weekplan$m obj = iYmTWa$weekplan$mService.getYmTWa$weekplan$mById(id);
            responseData = ResponseData.okData(obj);   // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


    /**
     * 查询对象列表信息
     *  编制明细查询
     * @param params 请求参数
     * @return
     */
    @GetMapping("/query")
    public ResponseData getYmTWa$weekplan$mList(HttpServletRequest request, @RequestParam Map<String, Object> params) {
        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);

        String lvl=user.getOrgLevel();
        String orgId=user.getVcOrgId();
        if(DataConstants.XINGZHENG.equals(orgId)){//段领导
            //车间 orgType=2,工区orgType=1
            //params.put("orgType",orgType);
        }else if(DataConstants.JISHUKEID.equals(orgId)){//技术科
            //车间 orgType=2,工区orgType=1 编制 orgType=3
            //params.put("orgType",orgType);
        }else {
            if("10".equals(lvl)){//工区
                params.put("orgType","1");
            }else if("30".equals(lvl)){//车间
                params.put("orgType","2");
            }
            params.put("vcOrg$id",orgId);
        }
        List<YmTWa$weekplan$m> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iYmTWa$weekplan$mService.getYmTWa$weekplan$mList(params);
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iYmTWa$weekplan$mService.getYmTWa$weekplan$mList(params);
                count = pageInfo.getTotal();
            }

            responseData = ResponseData.okData(objList, count);  // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();                    // 处理失败
        }
        return responseData;
    }

    //审批页面列表
    @GetMapping("/shenpi")
    public ResponseData shenpi(HttpServletRequest request, @RequestParam Map<String, Object> params) {
        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
        String orgId=user.getVcOrgId();
        String cj=(String)params.get("cj");
        if(DataConstants.XINGZHENG.equals(orgId)){//段领导
            params.put("vcStatus",DataConstants.WeekPlanStatus.techApprove.getValue());
            params.put("orgType","3");
        }else if(DataConstants.JISHUKEID.equals(orgId)&&DataConstants.ZHIWU_KEZHANG.equals(user.getVcWorkPos())){//技术科科长
            if("1".equals(cj)){//科长审批车间
                params.put("vcStatus",DataConstants.WeekPlanStatus.subimt.getValue());
                params.put("orgType","2");
            }else{//科长审批 技术科，科员提交，领导驳回
                params.put("kz","1");
                //params.put("vcStatus",DataConstants.WeekPlanStatus.subimt.getValue());
                params.put("orgType","3");
            }
        }else if(DataConstants.JISHUKEID.equals(orgId)){//技术科科员
            params.put("vcStatus",DataConstants.WeekPlanStatus.subimt.getValue());
            params.put("orgType","2");
        }else{//车间
            params.put("vcStatus",DataConstants.WeekPlanStatus.subimt.getValue());
            params.put("orgId",orgId);
            params.put("orgType","1");
        }
        List<YmTWa$weekplan$m> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iYmTWa$weekplan$mService.getYmTWa$weekplan$mList(params);
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iYmTWa$weekplan$mService.getYmTWa$weekplan$mList(params);
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
     * 审批通过
     * @param request
     * @param obj
     * @return
     */
    @PostMapping("/pass")
    public ResponseData pass(HttpServletRequest request,@RequestBody YmTWa$weekplan$m obj) {
        ResponseData responseData = null;
        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
        try {

            iYmTWa$weekplan$mService.pass(obj,user);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }
    //审批驳回
    @PostMapping("/reject")
    public ResponseData reject(HttpServletRequest request,@RequestBody YmTWa$weekplan$m obj) {
        ResponseData responseData = null;
        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
        try {
            iYmTWa$weekplan$mService.reject(obj,user);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    //提交
    @PostMapping("/submit")
    public ResponseData submit(HttpServletRequest request,@RequestBody YmTWa$weekplan$m obj) {
        ResponseData responseData = null;
        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
        try {
            obj.setVcStatus(DataConstants.WeekPlanStatus.subimt.getValue());
            iYmTWa$weekplan$mService.submit(obj,user);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
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
    public ResponseData addYmTWa$weekplan$m(HttpServletRequest request,@RequestBody YmTWa$weekplan$m obj) {
        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
        ResponseData responseData = null;
        try {
            obj.setVcStatus("0");
            obj.setVcOrg$id(user.getVcOrgId());
            obj.setVcOrgName(user.getVcOrgName());
            obj.setVcUser$id(user.getVcNumber());
            obj.setDtSysdate(new Date());
            obj.setVcServer(DataConstants.VC_SERVER);
            obj.setnId(String.valueOf(idWorker.nextId()));
            iYmTWa$weekplan$mService.addYmTWa$weekplan$m(obj);
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
    public ResponseData deleteYmTWa$weekplan$mById(@PathVariable("id") String id) {
        ResponseData responseData = null;
        try {
            iYmTWa$weekplan$mService.deleteYmTWa$weekplan$mById(id);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


    /**
     * 批量删除对象实体
     * @param ids 对象实体ID集合
     * @return
     */

    @PostMapping("/deleteBatch" )
    public ResponseData deleteBatchYmTWa$weekplan$m(@RequestBody List<String> ids){
        ResponseData responseData=null;
        try{
            iYmTWa$weekplan$mService.deleteBatchYmTWa$weekplan$m(ids);
            responseData=ResponseData.ok();       // 处理成功
        }catch(Exception e){
            e.printStackTrace();
            responseData=ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    //周计划重置
    @PostMapping("/reset" )
    public ResponseData reset(HttpServletRequest request,@RequestBody Map params){
        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
        String orgid=user.getVcOrgId();
        params.put("orgid",orgid);
        ResponseData responseData=null;
        try{
            iYmTWa$weekplan$mService.reset(params);
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
 *//*

@PostMapping("/addBatch" )
public ResponseData addBatchYmTWa$weekplan$m(@RequestBody List<YmTWa$weekplan$m> list){
        ResponseData responseData=null;
        try{
    iYmTWa$weekplan$mService.addBatchYmTWa$weekplan$m(list);
        responseData=ResponseData.ok();       // 处理成功
        }catch(Exception e){
        e.printStackTrace();
        responseData=ResponseData.error();    // 处理失败
        }
        return responseData;
        }

*/
/**
 * 更新对象实体
 * @param obj  对象实体
 * @return
 */


/**
 * 批量更新对象实体
 * @param list  对象实体集合
 * @return
 *//*

@PostMapping("/updateBatch" )
public ResponseData updateBatchYmTWa$weekplan$m(@RequestBody List<YmTWa$weekplan$m> list){
        ResponseData responseData=null;
        try{
    iYmTWa$weekplan$mService.updateBatchYmTWa$weekplan$m(list);
        responseData=ResponseData.ok();       // 处理成功
        }catch(Exception e){
        e.printStackTrace();
        responseData=ResponseData.error();    // 处理失败
        }
        return responseData;
        }

*/





}
