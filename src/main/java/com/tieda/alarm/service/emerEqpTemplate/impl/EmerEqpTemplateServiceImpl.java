package com.tieda.alarm.service.emerEqpTemplate.impl;

import com.tieda.alarm.entity.station.Station;
import com.tieda.alarm.entity.emerEqpTemplate.EmerEqpTemplate;
import com.tieda.alarm.mapper.emerEqpTemplate.EmerEqpTemplateMapper;
import com.tieda.alarm.mapper.station.StationMapper;
import com.tieda.alarm.service.emerEqpTemplate.IEmerEqpTemplateService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 应急处置设备故障相关模板 服务实现类
 * </p>
 *
 * @author 
 * @since 2019-05-26
 */
@Service
@Transactional
public class EmerEqpTemplateServiceImpl extends ServiceImpl<EmerEqpTemplateMapper, EmerEqpTemplate> implements IEmerEqpTemplateService {

    
    @Autowired
    EmerEqpTemplateMapper emerEqpTemplateMapper;

    @Autowired
    StationMapper stationMapper;

    /**
     * 根据 id 查询对象
     * @param id    对象 id
     * @return  EmerEqpTemplate
     */
    @Override
    public EmerEqpTemplate getEmerEqpTemplateById(Long id) {
        return emerEqpTemplateMapper.getEmerEqpTemplateById(id);
    }

    /**
     * 查询对象列表信息
     * @param params    查询参数
     * @return List<EmerEqpTemplate>
     */
    @Override
    public List<EmerEqpTemplate> getEmerEqpTemplateList(Map<String, Object> params) {
        List<EmerEqpTemplate> emerEqpTemplateList = emerEqpTemplateMapper.getEmerEqpTemplateList(params);
        //将 |id1|id2| 形式的车站ID转换为车站名
        for (EmerEqpTemplate emerEqpTemplate : emerEqpTemplateList) {
            String[] stationIds = emerEqpTemplate.getStation().split("\\|");
            StringBuilder stationStr = new StringBuilder();
            for (int i = 0, size = stationIds.length; i < size; i++) {
                Station station = stationMapper.selectById(stationIds[i]);
                if (station != null) {
                    stationStr.append(station.getVcName());
                }
                if (i < size - 1) {
                    stationStr.append("|");
                }
            }
            if(stationStr.toString() == ""){
                emerEqpTemplate.setStation(stationStr.toString());
            }
        }
        return emerEqpTemplateList;
    }

    /**
     * 添加对象实体
     * @param obj   对象实体
     */
    @Override
    public void addEmerEqpTemplate(EmerEqpTemplate obj) {
        emerEqpTemplateMapper.addEmerEqpTemplate(obj);
    }

    /**
     * 批量添加对象实体
     * @param list   对象实体集合
     */
    @Override
    public void addBatchEmerEqpTemplate(List<EmerEqpTemplate> list) {
        emerEqpTemplateMapper.addBatchEmerEqpTemplate(list);
    }

    /**
     * 更新对象实体
     * @param obj   对象实体
     */
    @Override
    public void updateEmerEqpTemplate(EmerEqpTemplate obj) {
        emerEqpTemplateMapper.updateEmerEqpTemplate(obj);
    }

    /**
    * 批量更新对象实体
    * @param list  对象实体集合
    */
    @Override
    public void updateBatchEmerEqpTemplate(List<EmerEqpTemplate> list) {
        emerEqpTemplateMapper.updateBatchEmerEqpTemplate(list);
    }

    /**
     * 根据ID删除对象实体
     * @param id 对象ID
     */
    @Override
    public void deleteEmerEqpTemplateById(Long id) {
        emerEqpTemplateMapper.deleteEmerEqpTemplateById(id);
    }

    /**
     * 批量删除对象实体
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchEmerEqpTemplate(List<Long> ids) {
        emerEqpTemplateMapper.deleteBatchEmerEqpTemplate(ids);
    }

}
