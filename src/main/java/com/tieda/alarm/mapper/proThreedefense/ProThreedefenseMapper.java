package com.tieda.alarm.mapper.proThreedefense;

import com.tieda.alarm.entity.proThreedefense.ProThreedefense;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 派工单作业项目与三防相关关联关系表 Mapper 接口
 * </p>
 *
 * @author
 * @since 2019-09-04
 */
@Repository
@Mapper
public interface ProThreedefenseMapper extends BaseMapper<ProThreedefense> {

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return ProThreedefense
     */
    ProThreedefense getProThreedefenseById(Long id);

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<ProThreedefense>
     */
    List<ProThreedefense> getProThreedefenseList(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addProThreedefense(ProThreedefense obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchProThreedefense(List<ProThreedefense> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateProThreedefense(ProThreedefense obj);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchProThreedefense(List<ProThreedefense> list);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deleteProThreedefenseById(Long id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchProThreedefense(List<Long> ids);

}
