package com.tieda.alarm.service.yjTDuty.impl;

import com.tieda.alarm.entity.yjTDuty.YjTDuty;
import com.tieda.alarm.mapper.yjTDuty.YjTDutyMapper;
import com.tieda.alarm.service.yjTDuty.IYjTDutyService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 值班人员信息表 服务实现类
 * </p>
 *
 * @author 
 * @since 2019-06-27
 */
@Service
@Transactional
        public class YjTDutyServiceImpl extends ServiceImpl<YjTDutyMapper, YjTDuty>implements IYjTDutyService {


        @Autowired
    YjTDutyMapper yjTDutyMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YjTDuty
         */
        @Override
        public YjTDuty getYjTDutyById(Long id){
        return yjTDutyMapper.getYjTDutyById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YjTDuty>
         */
        @Override
        public List<YjTDuty>getYjTDutyList(Map<String,Object>params){
        return yjTDutyMapper.getYjTDutyList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addYjTDuty(YjTDuty obj){
    yjTDutyMapper.addYjTDuty(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchYjTDuty(List<YjTDuty>list){
    yjTDutyMapper.addBatchYjTDuty(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateYjTDuty(YjTDuty obj){
    yjTDutyMapper.updateYjTDuty(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchYjTDuty(List<YjTDuty>list){
    yjTDutyMapper.updateBatchYjTDuty(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteYjTDutyById(Long id){
    yjTDutyMapper.deleteYjTDutyById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchYjTDuty(List<Long>ids){
    yjTDutyMapper.deleteBatchYjTDuty(ids);
        }

    @Override
    public List<YjTDuty> getAllYjTDutyListByCheck(Map<String, Object> params) {
        return yjTDutyMapper.getAllYjTDutyListByCheck(params);
    }

    @Override
    public void deleteYjTDutyByOrgDate(Map<String, Object> params) {
        yjTDutyMapper.deleteYjTDutyByOrgDate(params);
    }

}
