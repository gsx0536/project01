package com.tieda.alarm.service.jzjcProblemLog.impl;

import com.tieda.alarm.entity.jzjcProblemLog.JzjcProblemLog;
import com.tieda.alarm.mapper.jzjcProblemLog.JzjcProblemLogMapper;
import com.tieda.alarm.service.jzjcProblemLog.IJzjcProblemLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2019-11-16
 */
@Service
@Transactional
        public class JzjcProblemLogServiceImpl extends ServiceImpl<JzjcProblemLogMapper, JzjcProblemLog>implements IJzjcProblemLogService {


        @Autowired
    JzjcProblemLogMapper jzjcProblemLogMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  JzjcProblemLog
         */
        @Override
        public JzjcProblemLog getJzjcProblemLogById(Long id){
        return jzjcProblemLogMapper.getJzjcProblemLogById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<JzjcProblemLog>
         */
        @Override
        public List<JzjcProblemLog>getJzjcProblemLogList(Map<String,Object>params){
        return jzjcProblemLogMapper.getJzjcProblemLogList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addJzjcProblemLog(JzjcProblemLog obj){
    jzjcProblemLogMapper.addJzjcProblemLog(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchJzjcProblemLog(List<JzjcProblemLog>list){
    jzjcProblemLogMapper.addBatchJzjcProblemLog(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateJzjcProblemLog(JzjcProblemLog obj){
    jzjcProblemLogMapper.updateJzjcProblemLog(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchJzjcProblemLog(List<JzjcProblemLog>list){
    jzjcProblemLogMapper.updateBatchJzjcProblemLog(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteJzjcProblemLogById(Long id){
    jzjcProblemLogMapper.deleteJzjcProblemLogById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchJzjcProblemLog(List<Long>ids){
    jzjcProblemLogMapper.deleteBatchJzjcProblemLog(ids);
        }

        }
