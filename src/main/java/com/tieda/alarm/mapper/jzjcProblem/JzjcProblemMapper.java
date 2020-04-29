package com.tieda.alarm.mapper.jzjcProblem;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tieda.alarm.entity.jzjcProblem.JzjcProblem;
import com.tieda.alarm.entity.jzjcProblem.TreeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author
 * @since 2019-11-16
 */
@Repository
@Mapper
public interface JzjcProblemMapper extends BaseMapper<JzjcProblem> {

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
    List<JzjcProblem> getJzjcProblemList(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    int addJzjcProblem(JzjcProblem obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchJzjcProblem(List<JzjcProblem> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateJzjcProblem(JzjcProblem obj);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchJzjcProblem(List<JzjcProblem> list);

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

    /***
     * 监测问题车间、级别统计
     * @param params
     * @return
     */
    List groupbyLvl(Map<String, Object> params);

    List groupbyLvl2(Map<String, Object> params);

    /***
     * 监测问题车间、问题类型统计
     * @param params
     * @return
     */
    List groupbyType(Map<String, Object> params);

    List groupbyType2(Map<String, Object> params);

    /***
     * 监测问题线别统计
     * @param params
     * @return
     */
    List groupbyLine(Map<String, Object> params);

    List groupbyLine2(Map<String, Object> params);

    List getStationByjcpc(Map<String, Object> params);

    /***
     * 定时检验监测问题是否超期未整改
     */
    void scheduleTaskOverdue();

    /***
     * 根据监测问题实际业务需求获取责任部门
     * @param map
     * @return
     */
    List<TreeEntity> getOrgDatasByLogin(Map<String, Object> map);

    List<JzjcProblem> groupdetaiByWorkshopType(Map<String, Object> map);

    List<JzjcProblem> groupdetaiByLineType(Map<String, Object> map);

    /***
     * 获取某一个车间的质检组部门编号
     * @param orgId
     * @return
     */
    List getOrgZjzByWorkshop(String orgId);
}
