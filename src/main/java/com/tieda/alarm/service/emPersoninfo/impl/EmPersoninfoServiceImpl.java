package com.tieda.alarm.service.emPersoninfo.impl;

import com.tieda.alarm.entity.emPersoninfo.EmPersoninfo;
import com.tieda.alarm.mapper.emPersoninfo.EmPersoninfoMapper;
import com.tieda.alarm.service.emPersoninfo.IEmPersoninfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 应急抢修队伍 服务实现类
 * </p>
 *
 * @author 
 * @since 2019-05-28
 */
@Service
@Transactional
public class EmPersoninfoServiceImpl extends ServiceImpl<EmPersoninfoMapper, EmPersoninfo> implements IEmPersoninfoService {

    
    @Autowired
    EmPersoninfoMapper emPersoninfoMapper;

    /**
     * 根据 id 查询对象
     * @param id    对象 id
     * @return  EmPersoninfo
     */
    @Override
    public EmPersoninfo getEmPersoninfoById(String id) {
        return emPersoninfoMapper.getEmPersoninfoById(id);
    }

    /**
     * 查询对象列表信息
     * @param params    查询参数
     * @return List<EmPersoninfo>
     */
    @Override
    public List<EmPersoninfo> getEmPersoninfoList(Map<String, Object> params) {
        return emPersoninfoMapper.getEmPersoninfoList(params);
    }

    /**
     * 添加对象实体
     * @param obj   对象实体
     */
    @Override
    public void addEmPersoninfo(EmPersoninfo obj) {
        emPersoninfoMapper.addEmPersoninfo(obj);
    }

    /**
     * 批量添加对象实体
     * @param list   对象实体集合
     */
    @Override
    public void addBatchEmPersoninfo(List<EmPersoninfo> list) {
        emPersoninfoMapper.addBatchEmPersoninfo(list);
    }

    /**
     * 更新对象实体
     * @param obj   对象实体
     */
    @Override
    public void updateEmPersoninfo(EmPersoninfo obj) {
        emPersoninfoMapper.updateEmPersoninfo(obj);
    }

    /**
    * 批量更新对象实体
    * @param list  对象实体集合
    */
    @Override
    public void updateBatchEmPersoninfo(List<EmPersoninfo> list) {
        emPersoninfoMapper.updateBatchEmPersoninfo(list);
    }

    /**
     * 根据ID删除对象实体
     * @param id 对象ID
     */
    @Override
    public void deleteEmPersoninfoById(String id) {
        emPersoninfoMapper.deleteEmPersoninfoById(id);
    }

    /**
     * 批量删除对象实体
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchEmPersoninfo(List<String> ids) {
        emPersoninfoMapper.deleteBatchEmPersoninfo(ids);
    }

}
