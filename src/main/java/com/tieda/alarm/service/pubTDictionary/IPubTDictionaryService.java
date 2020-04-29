package com.tieda.alarm.service.pubTDictionary;

import com.tieda.alarm.entity.pubTDictionary.PubTDictionary;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author
 * @since 2019-09-04
 */
public interface IPubTDictionaryService extends IService<PubTDictionary> {

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return PubTDictionary
     */
    PubTDictionary getPubTDictionaryById(Long id);

    /**
     * 根据父节点查询子节点集合
     *
     * @param mId 对象 mId
     * @return
     */
    List<PubTDictionary> getChilds(String mId);

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<PubTDictionary>
     */
    List<PubTDictionary> getPubTDictionaryList(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addPubTDictionary(PubTDictionary obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchPubTDictionary(List<PubTDictionary> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updatePubTDictionary(PubTDictionary obj);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchPubTDictionary(List<PubTDictionary> list);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deletePubTDictionaryById(Long id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchPubTDictionary(List<Long> ids);
}
