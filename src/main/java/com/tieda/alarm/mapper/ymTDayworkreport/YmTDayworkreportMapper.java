package com.tieda.alarm.mapper.ymTDayworkreport;
import com.tieda.alarm.entity.ymTDayworkreport.YmTDayworkreport;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-06-24
 */
@Repository
@Mapper
public interface YmTDayworkreportMapper extends BaseMapper<YmTDayworkreport> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YmTDayworkreport
         */
    YmTDayworkreport getYmTDayworkreportById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YmTDayworkreport>
         */
        List<YmTDayworkreport> getYmTDayworkreportList (Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
        */
        void addYmTDayworkreport(YmTDayworkreport obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchYmTDayworkreport(List<YmTDayworkreport> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateYmTDayworkreport(YmTDayworkreport obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchYmTDayworkreport(List<YmTDayworkreport> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteYmTDayworkreportById(Long id);

    /**
     * 批量删除对象实体
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchYmTDayworkreport(List<Long> ids);

    /**
     * 段查询目录
     * @param orgIds 对象实体ID集合
     * @return
     */
    List<YmTDayworkreport>  segGetCatalog(Map pmap);

    /**
     * 车间查询目录
     * @param orgIds 对象实体ID集合
     * @return
     */
    List<YmTDayworkreport>  wsGetCatalog(Map pmap);

    /**
     * 工区查询目录
     * @param orgIds 对象实体ID集合
     * @return
     */
    List<YmTDayworkreport>  waGetCatalog(Map pmap);

    /**
     * 工区查询目录
     * @param orgIds 对象实体ID集合
     * @return
     */
    List<YmTDayworkreport>  waGetList(Map pmap);


    /**
     * 车间查询目录
     * @param orgIds 对象实体ID集合
     * @return
     */
    List<YmTDayworkreport>  wsGetList(Map pmap);

    /**
     * 更新状态
     * @param orgIds 对象实体ID集合
     * @return
     */
    void updateStatus(Map pmap);
    /**
     * 更新状态
     * @param orgIds 对象实体ID集合
     * @return
     */
    void updateStatusmore(Map pmap);

    void createdayreport(Map pmap);
}
