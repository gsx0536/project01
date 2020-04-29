package com.tieda.alarm.service.yjTDuty;
import com.tieda.alarm.entity.yjTDuty.YjTDuty;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 值班人员信息表 服务类
 * </p>
 *
 * @author 
 * @since 2019-06-27
 */
public interface IYjTDutyService extends IService<YjTDuty> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YjTDuty
         */
    YjTDuty getYjTDutyById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YjTDuty>
         */
        List<YjTDuty> getYjTDutyList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addYjTDuty(YjTDuty obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchYjTDuty(List<YjTDuty> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateYjTDuty(YjTDuty obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchYjTDuty(List<YjTDuty> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteYjTDutyById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchYjTDuty(List<Long> ids);


    List<YjTDuty> getAllYjTDutyListByCheck(Map<String, Object> params);

    void deleteYjTDutyByOrgDate(Map<String, Object> params);
        }
