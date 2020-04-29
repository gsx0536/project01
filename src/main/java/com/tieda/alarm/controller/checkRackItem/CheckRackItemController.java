package com.tieda.alarm.controller.checkRackItem;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tieda.alarm.entity.checkRackItem.CheckRackItem;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.service.checkRackItem.ICheckRackItemService;
import com.tieda.alarm.util.IdWorker;
import com.tieda.alarm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author
 * @since 2019-05-20
 */
@RestController
@RequestMapping("/checkRackItem")
public class CheckRackItemController {


    @Autowired
    ICheckRackItemService iCheckRackItemService;
    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}")
    public ResponseData getCheckRackItemById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            CheckRackItem obj = iCheckRackItemService.getCheckRackItemById(id);
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
    public ResponseData getCheckRackItemList(HttpServletRequest request,@RequestParam Map<String, Object> params) {
        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
        params.put("worker",user.getVcNumber());
        List<CheckRackItem> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iCheckRackItemService.getCheckRackItemList(params);
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iCheckRackItemService.getCheckRackItemList(params);
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
    public ResponseData addCheckRackItem(@RequestBody CheckRackItem obj) {

        ResponseData responseData = null;
        try {
            obj.setId(String.valueOf(idWorker.nextId()));
            iCheckRackItemService.addCheckRackItem(obj);
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
    public ResponseData addBatchCheckRackItem(@RequestBody List<CheckRackItem> list) {
        ResponseData responseData = null;
        try {
            iCheckRackItemService.addBatchCheckRackItem(list);
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
    public ResponseData updateCheckRackItem(HttpServletRequest request,@RequestBody CheckRackItem obj) {
        ResponseData responseData = null;
        try {
            iCheckRackItemService.updateCheckRackItem(obj);
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
    public ResponseData updateBatchCheckRackItem(@RequestBody List<CheckRackItem> list) {
        ResponseData responseData = null;
        try {
            iCheckRackItemService.updateBatchCheckRackItem(list);
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
    public ResponseData deleteCheckRackItemById(@PathVariable("id") String id) {
        ResponseData responseData = null;
        try {
            iCheckRackItemService.deleteCheckRackItemById(id);
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
    public ResponseData deleteBatchCheckRackItem(@RequestBody List<Long> ids) {
        ResponseData responseData = null;
        try {
            iCheckRackItemService.deleteBatchCheckRackItem(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


}
