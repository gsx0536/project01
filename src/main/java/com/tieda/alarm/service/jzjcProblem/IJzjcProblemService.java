package com.tieda.alarm.service.jzjcProblem;

import com.baomidou.mybatisplus.service.IService;
import com.tieda.alarm.entity.jzjcProblem.JzjcProblem;
import com.tieda.alarm.entity.jzjcProblemHandle.JzjcProblemHandle;
import com.tieda.alarm.entity.user.User;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author
 * @since 2019-11-16
 */
public interface IJzjcProblemService extends IService<JzjcProblem> {

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return JzjcProblem
     */
    JzjcProblem getJzjcProblemById(String id);

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<JzjcProblem>
     */
    List<JzjcProblem> getJzjcProblemList(Map<String, Object> params, User user);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addJzjcProblem(JzjcProblem obj, User user);

    /***
     * 智能分析处纳入问题新增
     * @param obj
     */
    int SystemAddJzjcProblem(JzjcProblem obj);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateJzjcProblem(JzjcProblem obj, User user) throws Exception;

    /**
     * 填写整改情况 - 整改过程
     *
     * @param obj
     * @param user
     */
    void rectProblem(JzjcProblemHandle obj, User user);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deleteJzjcProblemById(String id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchJzjcProblem(List<Long> ids);

    List groupbyLvl(Map<String, Object> params);

    List groupbyType(Map<String, Object> params);

    List groupbyLine(Map<String, Object> params);

    /***
     * 根据调度台 获取车站列表
     * @param params
     * @return
     */
    List getStationByjcpc(Map<String, Object> params);

    /**
     * 获取责任部门
     *
     * @param user
     * @return
     */
    List getOrgDatasByLogin(User user,String findall);

    /***
     * 定时任务 超期未整改
     */
    void scheduleTaskOverdue();

    /***
     * 整改情况列表
     * @param params
     * @return
     */
    List getHandlelist(Map<String, Object> params);

    /***
     * 统计查看明细
     * @param params
     * @return
     */
    List groupDetail(Map<String, Object> params);

    void groupExport(Workbook wb, Sheet sheet, Map<String, Object> params);
}
