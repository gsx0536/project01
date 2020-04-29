package com.tieda.alarm.mapper.wrongtree;

import com.tieda.alarm.entity.wrongtree.Wrongtree;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 故障树 Mapper 接口
 * </p>
 *
 * @author
 * @since 2019-05-17
 */
@Repository
@Mapper
public interface WrongtreeMapper extends BaseMapper<Wrongtree> {

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return Wrongtree
     */
    Wrongtree getWrongtreeById(Long id);

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<Wrongtree>
     */
    List<Wrongtree> getWrongtreeList(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addWrongtree(Wrongtree obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchWrongtree(List<Wrongtree> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateWrongtree(Wrongtree obj);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchWrongtree(List<Wrongtree> list);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deleteWrongtreeById(Long id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchWrongtree(List<Long> ids);

    /**
     * 返回树节点
     *
     * @param treeids 对象实体ID集合
     * @return
     */
    List<Map> getWrongtrees(List<String> treeids);

}
