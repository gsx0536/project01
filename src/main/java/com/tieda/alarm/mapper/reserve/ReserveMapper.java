package com.tieda.alarm.mapper.reserve;

import com.tieda.alarm.entity.reserve.Reserve;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 备品备件统计表 Mapper 接口
 * </p>
 *
 * @author
 * @since 2019-05-11
 */
@Repository
@Mapper
public interface ReserveMapper extends BaseMapper<Reserve> {

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return Reserve
     */
    Reserve getReserveById(Long id);

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<Reserve>
     */
    List<Reserve> getReserveList(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addReserve(Reserve obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchReserve(List<Reserve> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateReserve(Reserve obj);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchReserve(List<Reserve> list);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deleteReserveById(Long id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchReserve(List<Long> ids);

}
