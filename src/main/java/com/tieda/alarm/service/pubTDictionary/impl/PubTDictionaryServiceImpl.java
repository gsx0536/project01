package com.tieda.alarm.service.pubTDictionary.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tieda.alarm.entity.pubTDictionary.PubTDictionary;
import com.tieda.alarm.mapper.pubTDictionary.PubTDictionaryMapper;
import com.tieda.alarm.service.pubTDictionary.IPubTDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author
 * @since 2019-09-04
 */
@Service
@Transactional
public class PubTDictionaryServiceImpl extends ServiceImpl<PubTDictionaryMapper, PubTDictionary> implements IPubTDictionaryService {


    @Autowired
    PubTDictionaryMapper pubTDictionaryMapper;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return PubTDictionary
     */
    @Override
    public PubTDictionary getPubTDictionaryById(Long id) {
        return pubTDictionaryMapper.getPubTDictionaryById(id);
    }

    /**
     * 根据父节点查询子节点集合
     *
     * @param mId 对象 mId
     * @return
     */
    @Override
    public List<PubTDictionary> getChilds(String mId) {
        List<PubTDictionary> list = pubTDictionaryMapper.getChilds(mId);
        List<PubTDictionary> templist = new ArrayList<PubTDictionary>();
        if (list.size() > 0) {
            for (PubTDictionary pubTDict : list) {
                List<PubTDictionary> list1 = pubTDictionaryMapper.getChilds(pubTDict.getVcId());
                if (list1.size() == 0) {
                    pubTDict.setLeafNode(true);
                }
                templist.add(pubTDict);
            }
        }
        return templist;
    }
    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<PubTDictionary>
     */
    @Override
    public List<PubTDictionary> getPubTDictionaryList(Map<String, Object> params) {
        return pubTDictionaryMapper.getPubTDictionaryList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addPubTDictionary(PubTDictionary obj) {
        pubTDictionaryMapper.addPubTDictionary(obj);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchPubTDictionary(List<PubTDictionary> list) {
        pubTDictionaryMapper.addBatchPubTDictionary(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updatePubTDictionary(PubTDictionary obj) {
        pubTDictionaryMapper.updatePubTDictionary(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchPubTDictionary(List<PubTDictionary> list) {
        pubTDictionaryMapper.updateBatchPubTDictionary(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deletePubTDictionaryById(Long id) {
        pubTDictionaryMapper.deletePubTDictionaryById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchPubTDictionary(List<Long> ids) {
        pubTDictionaryMapper.deleteBatchPubTDictionary(ids);
    }

}
