package com.tieda.alarm.controller.ymTTempworkinfo;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.entity.ymTTempworkinfo.YmTTempworkinfo;
import com.tieda.alarm.service.ymTTempworkinfo.IYmTTempworkinfoService;
import com.tieda.alarm.util.IdWorker;
import com.tieda.alarm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 临时上道 前端控制器
 * </p>
 *
 * @author
 * @since 2019-07-19
 */
@RestController
@RequestMapping("/ymTTempworkinfo")
public class YmTTempworkinfoController {


    @Autowired
    IYmTTempworkinfoService iYmTTempworkinfoService;
    @Autowired
    IdWorker idWorker;

    private User user;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}")
    public ResponseData getYmTTempworkinfoById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            YmTTempworkinfo obj = iYmTTempworkinfoService.getYmTTempworkinfoById(id);
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
    public ResponseData getYmTTempworkinfoList(@RequestParam Map<String, Object> params) {
        List<YmTTempworkinfo> objList = null;
        ResponseData responseData = null;
        params.put("nlevel", user.getOrgLevel());
        params.put("orgId", user.getVcOrgId());
        params.put("parOrgId", user.getVcParOrgId());
        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iYmTTempworkinfoService.getYmTTempworkinfoList(params);
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iYmTTempworkinfoService.getYmTTempworkinfoList(params);
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
    public ResponseData addYmTTempworkinfo(@RequestBody YmTTempworkinfo obj) {

        ResponseData responseData = null;
        try {
            if (user.getOrgLevel().equals("50")) {//----调度新增是部门提报状态
                obj.setnId(String.valueOf(idWorker.nextId()));
                if (obj.getVcReqtype() == null || obj.getVcReqtype().equals("0")) {//如果是上道
                    obj.setVcStatus("1");//默认状态是已申请
                }
                iYmTTempworkinfoService.addYmTTempworkinfo(obj);
            } else {
                obj.setnId(String.valueOf(idWorker.nextId()));
                iYmTTempworkinfoService.addYmTTempworkinfo(obj);
            }
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
    public ResponseData addBatchYmTTempworkinfo(@RequestBody List<YmTTempworkinfo> list) {
        ResponseData responseData = null;
        try {
            iYmTTempworkinfoService.addBatchYmTTempworkinfo(list);
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
    public ResponseData updateYmTTempworkinfo(@RequestBody YmTTempworkinfo obj) {
        ResponseData responseData = null;
        try {
            iYmTTempworkinfoService.updateYmTTempworkinfo(obj);
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
    public ResponseData updateBatchYmTTempworkinfo(@RequestBody List<YmTTempworkinfo> list) {
        ResponseData responseData = null;
        try {
            for (int i = 0; i < list.size(); i++) {
                YmTTempworkinfo ymTTempworkinfo = list.get(i);
                if ("2".equals(list.get(i).getVcStatus())) {
                    String zhihuiCenterLeader = iYmTTempworkinfoService.getCenterLeader();
                    if ("1".equals(list.get(i).getVcReqtype())) {//下道--双数
                        String tempcode = iYmTTempworkinfoService.getoutNoadcodenum(String.valueOf(ymTTempworkinfo.getnId()));
                        ymTTempworkinfo.setVcCodenum(tempcode);
                        ymTTempworkinfo.setVcSigner(zhihuiCenterLeader);
                    } else {//上道--单数
                        String tempcode = iYmTTempworkinfoService.getonNoadcodenum(String.valueOf(ymTTempworkinfo.getnId()));
                        ymTTempworkinfo.setVcCodenum(tempcode);
                        ymTTempworkinfo.setVcSigner(zhihuiCenterLeader);
                    }
                }
                iYmTTempworkinfoService.updateBatchYmTTempworkinfo(ymTTempworkinfo);
            }
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 批量、单独驳回（驳回上道申请和下道申请的数据）
     *
     * @param list 对象实体集合
     * @return
     */
    @PostMapping(value = "/rejectAplly")
    public ResponseData rejectAplly(@RequestBody List<String> nId) {
        ResponseData responseData = null;
        try {
            for (int i = 0; i < nId.size(); i++) {
                String nIds = nId.get(i);
                iYmTTempworkinfoService.rejectAplly(nIds);
            }
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
    public ResponseData deleteYmTTempworkinfoById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            iYmTTempworkinfoService.deleteYmTTempworkinfoById(id);
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
    public ResponseData deleteBatchYmTTempworkinfo(@RequestBody List<Long> ids) {
        ResponseData responseData = null;
        try {
            iYmTTempworkinfoService.deleteBatchYmTTempworkinfo(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /***
     * 获取用户信息
     * @param request
     */
    @ModelAttribute
    public void getUserinfo(HttpServletRequest request) {
        this.user = (User) request.getSession().getAttribute(User.USER_SESSION_NAME);
    }


}
