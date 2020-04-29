package com.tieda.alarm.service.ymTWeekPlan.impl;

import com.tieda.alarm.entity.ymTWeekPlan.YmTWeekPlan;
import com.tieda.alarm.mapper.ymTWeekPlan.YmTWeekPlanMapper;
import com.tieda.alarm.service.ymTWeekPlan.IYmTWeekPlanService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tieda.alarm.util.IdWorker;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2020-01-14
 */
@Service
@Transactional
        public class YmTWeekPlanServiceImpl extends ServiceImpl<YmTWeekPlanMapper, YmTWeekPlan>implements IYmTWeekPlanService {


        @Autowired
    YmTWeekPlanMapper ymTWeekPlanMapper;
    @Autowired
    IdWorker idWorker;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YmTWeekPlan
         */
        @Override
        public YmTWeekPlan getYmTWeekPlanById(String id){
        return ymTWeekPlanMapper.getYmTWeekPlanById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YmTWeekPlan>
         */
        @Override
        public List<YmTWeekPlan>getYmTWeekPlanList(Map<String,Object>params){
        return ymTWeekPlanMapper.getYmTWeekPlanList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addYmTWeekPlan(YmTWeekPlan obj,String dates[]){
            SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
            for(int i=0;i<dates.length;i++){
                YmTWeekPlan ymTWeekPlan=new YmTWeekPlan();
                String d=dates[i];
                try {
                    if(d!=""){
                        BeanUtils.copyProperties(obj,ymTWeekPlan);
                        ymTWeekPlan.setSource("4");
                        ymTWeekPlan.setWorkdate(sdf.parse(d));
                        ymTWeekPlan.setId(String.valueOf(idWorker.nextId()));
                        ymTWeekPlanMapper.addYmTWeekPlan(ymTWeekPlan);
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchYmTWeekPlan(List<YmTWeekPlan>list){
    ymTWeekPlanMapper.addBatchYmTWeekPlan(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateYmTWeekPlan(YmTWeekPlan obj,String dates[]){
            SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
            for(int i=0;i<dates.length;i++){
                YmTWeekPlan ymTWeekPlan=new YmTWeekPlan();
                String d=dates[i];
                try {
                    if(d!=""){
                        BeanUtils.copyProperties(obj,ymTWeekPlan);
                        ymTWeekPlan.setWorkdate(sdf.parse(d));
                        ymTWeekPlan.setId(String.valueOf(idWorker.nextId()));
                        ymTWeekPlanMapper.addYmTWeekPlan(ymTWeekPlan);
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            ymTWeekPlanMapper.deleteById(obj.getId());
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchYmTWeekPlan(List<YmTWeekPlan>list){
    ymTWeekPlanMapper.updateBatchYmTWeekPlan(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteYmTWeekPlanById(String id){
    ymTWeekPlanMapper.deleteYmTWeekPlanById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchYmTWeekPlan(List<String>ids){
    ymTWeekPlanMapper.deleteBatchYmTWeekPlan(ids);
        }

        }
