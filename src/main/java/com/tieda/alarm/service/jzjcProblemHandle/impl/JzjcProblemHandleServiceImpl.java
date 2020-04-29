package com.tieda.alarm.service.jzjcProblemHandle.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tieda.alarm.entity.jzjcProblem.JzjcProblem;
import com.tieda.alarm.entity.jzjcProblemHandle.JzjcProblemHandle;
import com.tieda.alarm.entity.jzjcProblemLog.JzjcProblemLog;
import com.tieda.alarm.mapper.jzjcProblem.JzjcProblemMapper;
import com.tieda.alarm.mapper.jzjcProblemHandle.JzjcProblemHandleMapper;
import com.tieda.alarm.mapper.jzjcProblemLog.JzjcProblemLogMapper;
import com.tieda.alarm.service.jzjcProblemHandle.IJzjcProblemHandleService;
import com.tieda.alarm.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author
 * @since 2019-11-16
 */
@Service
@Transactional
public class JzjcProblemHandleServiceImpl extends ServiceImpl<JzjcProblemHandleMapper, JzjcProblemHandle> implements IJzjcProblemHandleService {


    @Autowired
    JzjcProblemHandleMapper jzjcProblemHandleMapper;
    @Autowired
    JzjcProblemLogMapper jzjcProblemLogMapper;
    @Autowired
    JzjcProblemMapper jzjcProblemMapper;

    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return JzjcProblemHandle
     */
    @Override
    public JzjcProblemHandle getJzjcProblemHandleById(Long id) {
        return jzjcProblemHandleMapper.getJzjcProblemHandleById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<JzjcProblemHandle>
     */
    @Override
    public List<JzjcProblemHandle> getJzjcProblemHandleList(Map<String, Object> params) {
        return jzjcProblemHandleMapper.getJzjcProblemHandleList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addJzjcProblemHandle(JzjcProblemHandle obj) {
        jzjcProblemHandleMapper.addJzjcProblemHandle(obj);
        JzjcProblemLog problemLog = new JzjcProblemLog();
        problemLog.setCreatedate(new Date());
        problemLog.setId(String.valueOf(idWorker.nextId()));
        problemLog.setProblemid(obj.getId());
        problemLog.setInfor("整改情况：" + obj.getOrgname() + "," + obj.getOperator());
        jzjcProblemLogMapper.addJzjcProblemLog(problemLog);
        JzjcProblem problem = new JzjcProblem();
        problem.setId(obj.getProblemid());
        problem.setStatus("1");
        jzjcProblemMapper.updateJzjcProblem(problem);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchJzjcProblemHandle(List<JzjcProblemHandle> list) {
        jzjcProblemHandleMapper.addBatchJzjcProblemHandle(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateJzjcProblemHandle(JzjcProblemHandle obj) {
        jzjcProblemHandleMapper.updateJzjcProblemHandle(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchJzjcProblemHandle(List<JzjcProblemHandle> list) {
        jzjcProblemHandleMapper.updateBatchJzjcProblemHandle(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteJzjcProblemHandleById(Long id) {
        jzjcProblemHandleMapper.deleteJzjcProblemHandleById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchJzjcProblemHandle(List<Long> ids) {
        jzjcProblemHandleMapper.deleteBatchJzjcProblemHandle(ids);
    }

}
