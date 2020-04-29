package com.tieda.alarm.service.emerEqpTemplate;
import com.tieda.alarm.entity.emerEqpTemplate.EmerEqpTemplate;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 应急处置设备故障相关模板 服务类
 * </p>
 *
 * @author 
 * @since 2019-05-26
 */
public interface IEmerEqpTemplateService extends IService<EmerEqpTemplate> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  EmerEqpTemplate
         */
    EmerEqpTemplate getEmerEqpTemplateById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<EmerEqpTemplate>
         */
        List<EmerEqpTemplate> getEmerEqpTemplateList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addEmerEqpTemplate(EmerEqpTemplate obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchEmerEqpTemplate(List<EmerEqpTemplate> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateEmerEqpTemplate(EmerEqpTemplate obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchEmerEqpTemplate(List<EmerEqpTemplate> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteEmerEqpTemplateById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchEmerEqpTemplate(List<Long> ids);
        }
