package com.tieda.alarm.service.proThreedefense.impl;

import com.tieda.alarm.entity.proThreedefense.ProThreedefense;
import com.tieda.alarm.mapper.proThreedefense.ProThreedefenseMapper;
import com.tieda.alarm.service.proThreedefense.IProThreedefenseService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 派工单作业项目与三防相关关联关系表 服务实现类
 * </p>
 *
 * @author
 * @since 2019-09-04
 */
@Service
@Transactional
public class ProThreedefenseServiceImpl extends ServiceImpl<ProThreedefenseMapper, ProThreedefense> implements IProThreedefenseService {


    @Autowired
    ProThreedefenseMapper proThreedefenseMapper;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return ProThreedefense
     */
    @Override
    public ProThreedefense getProThreedefenseById(Long id) {
        return proThreedefenseMapper.getProThreedefenseById(id);
    }
    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<ProThreedefense>
     */
    @Override
    public List<ProThreedefense> getProThreedefenseList(Map<String, Object> params) {
        return proThreedefenseMapper.getProThreedefenseList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addProThreedefense(ProThreedefense obj) {
        proThreedefenseMapper.addProThreedefense(obj);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchProThreedefense(List<ProThreedefense> list) {
        proThreedefenseMapper.addBatchProThreedefense(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateProThreedefense(ProThreedefense obj) {
        proThreedefenseMapper.updateProThreedefense(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchProThreedefense(List<ProThreedefense> list) {
        proThreedefenseMapper.updateBatchProThreedefense(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteProThreedefenseById(Long id) {
        proThreedefenseMapper.deleteProThreedefenseById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchProThreedefense(List<Long> ids) {
        proThreedefenseMapper.deleteBatchProThreedefense(ids);
    }

}
