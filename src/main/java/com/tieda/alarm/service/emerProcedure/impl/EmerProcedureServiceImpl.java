package com.tieda.alarm.service.emerProcedure.impl;

import com.tieda.alarm.entity.emerProcedure.EmerProcedure;
import com.tieda.alarm.mapper.emerProcedure.EmerProcedureMapper;
import com.tieda.alarm.service.emerProcedure.IEmerProcedureService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 应急处置流程 服务实现类
 * </p>
 *
 * @author 
 * @since 2019-05-26
 */
@Service
@Transactional
public class EmerProcedureServiceImpl extends ServiceImpl<EmerProcedureMapper, EmerProcedure> implements IEmerProcedureService {

    
    @Autowired
    EmerProcedureMapper emerProcedureMapper;

    /**
     * 根据 id 查询对象
     * @param id    对象 id
     * @return  EmerProcedure
     */
    @Override
    public EmerProcedure getEmerProcedureById(Long id) {
        return emerProcedureMapper.getEmerProcedureById(id);
    }

    /**
     * 查询对象列表信息
     * @param params    查询参数
     * @return List<EmerProcedure>
     */
    @Override
    public List<EmerProcedure> getEmerProcedureList(Map<String, Object> params) {
        return emerProcedureMapper.getEmerProcedureList(params);
    }

    /**
     * 添加对象实体
     * @param obj   对象实体
     */
    @Override
    public void addEmerProcedure(EmerProcedure obj) {
        emerProcedureMapper.addEmerProcedure(obj);
    }

    /**
     * 批量添加对象实体
     * @param list   对象实体集合
     */
    @Override
    public void addBatchEmerProcedure(List<EmerProcedure> list) {
        emerProcedureMapper.addBatchEmerProcedure(list);
    }

    /**
     * 更新对象实体
     * @param obj   对象实体
     */
    @Override
    public void updateEmerProcedure(EmerProcedure obj) {
        emerProcedureMapper.updateEmerProcedure(obj);
    }

    /**
    * 批量更新对象实体
    * @param list  对象实体集合
    */
    @Override
    public void updateBatchEmerProcedure(List<EmerProcedure> list) {
        emerProcedureMapper.updateBatchEmerProcedure(list);
    }

    /**
     * 根据ID删除对象实体
     * @param id 对象ID
     */
    @Override
    public void deleteEmerProcedureById(Long id) {
        emerProcedureMapper.deleteEmerProcedureById(id);
    }

    /**
     * 批量删除对象实体
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchEmerProcedure(List<Long> ids) {
        emerProcedureMapper.deleteBatchEmerProcedure(ids);
    }

}
