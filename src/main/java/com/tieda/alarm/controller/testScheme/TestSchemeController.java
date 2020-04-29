package com.tieda.alarm.controller.testScheme;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tieda.alarm.entity.testScheme.TestScheme;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.service.testScheme.ITestSchemeService;
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
 * @since 2019-12-11
 */
@RestController
@RequestMapping("/testScheme")
public class TestSchemeController {


    @Autowired
    ITestSchemeService iTestSchemeService;
    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}")
    public ResponseData getTestSchemeById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            TestScheme obj = iTestSchemeService.getTestSchemeById(id);
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
    public ResponseData getTestSchemeList(HttpServletRequest request, @RequestParam Map<String, Object> params) {
        List<TestScheme> objList = null;
        ResponseData responseData = null;
        User user = (User) request.getSession().getAttribute(User.USER_SESSION_NAME);
        String type = (String) params.get("type");
        if ("1".equals(type)) {//车间编制
            if (!"1".equals(params.get("oper"))) {//编制或车间审核
                params.put("org", user.getVcOrgId());
            }
        }
        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iTestSchemeService.getTestSchemeList(params);
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iTestSchemeService.getTestSchemeList(params);
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
    public ResponseData addTestScheme(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        ResponseData responseData = null;
        try {
            iTestSchemeService.addTestScheme(request, map);
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
    public ResponseData addBatchTestScheme(@RequestBody List<TestScheme> list) {
        ResponseData responseData = null;
        try {
            iTestSchemeService.addBatchTestScheme(list);
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
    public ResponseData updateTestScheme(@RequestBody TestScheme obj) {
        ResponseData responseData = null;
        try {
            iTestSchemeService.updateTestScheme(obj);
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
    public ResponseData updateBatchTestScheme(@RequestBody List<TestScheme> list) {
        ResponseData responseData = null;
        try {
            iTestSchemeService.updateBatchTestScheme(list);
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
    public ResponseData deleteTestSchemeById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            iTestSchemeService.deleteTestSchemeById(id);
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
    public ResponseData deleteBatchTestScheme(@RequestBody List<Long> ids) {
        ResponseData responseData = null;
        try {
            iTestSchemeService.deleteBatchTestScheme(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


}
