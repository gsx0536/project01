package com.tieda.alarm.service.emerProcedure;
import com.tieda.alarm.entity.emerProcedure.EmerProcedure;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 应急处置流程 服务类
 * </p>
 *
 * @author 
 * @since 2019-05-26
 */
public interface IEmerProcedureService extends IService<EmerProcedure> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  EmerProcedure
         */
    EmerProcedure getEmerProcedureById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<EmerProcedure>
         */
        List<EmerProcedure> getEmerProcedureList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addEmerProcedure(EmerProcedure obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchEmerProcedure(List<EmerProcedure> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateEmerProcedure(EmerProcedure obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchEmerProcedure(List<EmerProcedure> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteEmerProcedureById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchEmerProcedure(List<Long> ids);
        }
