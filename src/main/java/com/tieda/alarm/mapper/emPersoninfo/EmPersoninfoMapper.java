package com.tieda.alarm.mapper.emPersoninfo;
import com.tieda.alarm.entity.emPersoninfo.EmPersoninfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 应急抢修队伍 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-05-28
 */
@Repository
@Mapper
public interface EmPersoninfoMapper extends BaseMapper<EmPersoninfo> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  EmPersoninfo
         */
    EmPersoninfo getEmPersoninfoById(String id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<EmPersoninfo>
         */
        List<EmPersoninfo> getEmPersoninfoList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
        */
        void addEmPersoninfo(EmPersoninfo obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchEmPersoninfo(List<EmPersoninfo> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateEmPersoninfo(EmPersoninfo obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchEmPersoninfo(List<EmPersoninfo> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteEmPersoninfoById(String id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchEmPersoninfo(List<String> ids);

        }
