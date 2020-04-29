package com.tieda.alarm.service.workdoor.impl;

import com.tieda.alarm.entity.devBaseInfos.DevBaseInfos;
import com.tieda.alarm.entity.workdoor.Workdoor;
import com.tieda.alarm.mapper.devBaseInfos.DevMapper;
import com.tieda.alarm.mapper.workdoor.WorkdoorMapper;
import com.tieda.alarm.service.workdoor.IWorkdoorService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 作业门信息 服务实现类
 * </p>
 *
 * @author
 * @since 2019-05-22
 */
@Service
@Transactional
public class WorkdoorServiceImpl extends ServiceImpl<WorkdoorMapper, Workdoor> implements IWorkdoorService {


    @Autowired
    WorkdoorMapper workdoorMapper;

    @Autowired
    DevMapper devMapper;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return Workdoor
     */
    @Override
    public Workdoor getWorkdoorById(Long id) {
        return workdoorMapper.getWorkdoorById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<Workdoor>
     */
    @Override
    public List<Workdoor> getWorkdoorList(Map<String, Object> params) {
        return workdoorMapper.getWorkdoorList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addWorkdoor(Workdoor obj) {
        workdoorMapper.addWorkdoor(obj);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchWorkdoor(List<Workdoor> list) {
        workdoorMapper.addBatchWorkdoor(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateWorkdoor(Workdoor obj) {
        workdoorMapper.updateWorkdoor(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchWorkdoor(List<Workdoor> list) {
        workdoorMapper.updateBatchWorkdoor(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteWorkdoorById(Long id) {
        workdoorMapper.deleteWorkdoorById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchWorkdoor(List<Long> ids) {
        workdoorMapper.deleteBatchWorkdoor(ids);
    }

    @Override
    public String getTrafficImage(String staId, String devName) {
        String devId = devMapper.getDevId(staId, devName);
        Assert.notNull(devId,"没有找到设备");
        return workdoorMapper.getTrafficImage(staId, devId).get(0);
    }

}
