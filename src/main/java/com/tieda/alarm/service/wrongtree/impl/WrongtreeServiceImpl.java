package com.tieda.alarm.service.wrongtree.impl;

import com.tieda.alarm.entity.wrongtree.Wrongtree;
import com.tieda.alarm.mapper.wrongtree.WrongtreeMapper;
import com.tieda.alarm.service.wrongtree.IWrongtreeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>
 * 故障树 服务实现类
 * </p>
 *
 * @author
 * @since 2019-05-17
 */
@Service
@Transactional
public class WrongtreeServiceImpl extends ServiceImpl<WrongtreeMapper, Wrongtree> implements IWrongtreeService {


    @Autowired
    WrongtreeMapper wrongtreeMapper;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return Wrongtree
     */
    @Override
    public Wrongtree getWrongtreeById(Long id) {
        return wrongtreeMapper.getWrongtreeById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<Wrongtree>
     */
    @Override
    public List<Wrongtree> getWrongtreeList(Map<String, Object> params) {
        return wrongtreeMapper.getWrongtreeList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addWrongtree(Wrongtree obj) {
        wrongtreeMapper.addWrongtree(obj);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchWrongtree(List<Wrongtree> list) {
        wrongtreeMapper.addBatchWrongtree(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateWrongtree(Wrongtree obj) {
        wrongtreeMapper.updateWrongtree(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchWrongtree(List<Wrongtree> list) {
        wrongtreeMapper.updateBatchWrongtree(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteWrongtreeById(Long id) {
        wrongtreeMapper.deleteWrongtreeById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchWrongtree(List<Long> ids) {
        wrongtreeMapper.deleteBatchWrongtree(ids);
    }

    /**
     * 根据ID返回节点树
     *
     * @param treeids 对象实体ID集合
     * @return
     */
    @Override
    public List<Map> getWrongtrees(List<String> treeids) {
//        List<Map> nodelist = new List<HashMap>;
        List<Map> nodelist = wrongtreeMapper.getWrongtrees(treeids);
        return nodelist;
    }

}
