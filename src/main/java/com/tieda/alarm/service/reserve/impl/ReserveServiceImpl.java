package com.tieda.alarm.service.reserve.impl;

import com.tieda.alarm.entity.reserve.Reserve;
import com.tieda.alarm.mapper.reserve.ReserveMapper;
import com.tieda.alarm.service.reserve.IReserveService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 备品备件统计表 服务实现类
 * </p>
 *
 * @author
 * @since 2019-05-11
 */
@Service
@Transactional
public class ReserveServiceImpl extends ServiceImpl<ReserveMapper, Reserve> implements IReserveService {


    @Autowired
    ReserveMapper reserveMapper;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return Reserve
     */
    @Override
    public Reserve getReserveById(Long id) {
        return reserveMapper.getReserveById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<Reserve>
     */
    @Override
    public List<Reserve> getReserveList(Map<String, Object> params) {
        return reserveMapper.getReserveList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addReserve(Reserve obj) {
        reserveMapper.addReserve(obj);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchReserve(List<Reserve> list) {
        reserveMapper.addBatchReserve(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateReserve(Reserve obj) {
        reserveMapper.updateReserve(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchReserve(List<Reserve> list) {
        reserveMapper.updateBatchReserve(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteReserveById(Long id) {
        reserveMapper.deleteReserveById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchReserve(List<Long> ids) {
        reserveMapper.deleteBatchReserve(ids);
    }

}
