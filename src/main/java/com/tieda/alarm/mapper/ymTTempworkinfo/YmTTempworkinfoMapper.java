package com.tieda.alarm.mapper.ymTTempworkinfo;

import com.tieda.alarm.entity.ymTTempworkinfo.YmTTempworkinfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 临时上道 Mapper 接口
 * </p>
 *
 * @author
 * @since 2019-07-19
 */
@Repository
@Mapper
public interface YmTTempworkinfoMapper extends BaseMapper<YmTTempworkinfo> {

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return YmTTempworkinfo
     */
    YmTTempworkinfo getYmTTempworkinfoById(Long id);

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<YmTTempworkinfo>
     */
    List<YmTTempworkinfo> getYmTTempworkinfoList(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addYmTTempworkinfo(YmTTempworkinfo obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchYmTTempworkinfo(List<YmTTempworkinfo> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateYmTTempworkinfo(YmTTempworkinfo obj);

    void rejectAplly(String nId);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchYmTTempworkinfo(List<YmTTempworkinfo> list);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deleteYmTTempworkinfoById(Long id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchYmTTempworkinfo(List<Long> ids);

    void setcodenum(Map<String, Object> params);

    /***
     * 获取上道命令号
     * @param nid
     * @return
     */
    String getonNoadcodenum(String nid);

    /***
     * 获取下道命令号
     * @param nid
     * @return
     */
    String getoutNoadcodenum(String nid);

    /***
     * 获取指挥中心主任
     * @return
     */
    String getCenterLeader();
}
