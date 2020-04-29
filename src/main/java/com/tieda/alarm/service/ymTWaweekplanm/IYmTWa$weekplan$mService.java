package com.tieda.alarm.service.ymTWaweekplanm;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.entity.ymTWaweekplanm.YmTWa$weekplan$m;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2020-01-13
 */
public interface IYmTWa$weekplan$mService extends IService<YmTWa$weekplan$m> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YmTWa$weekplan$m
         */
    YmTWa$weekplan$m getYmTWa$weekplan$mById(String id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YmTWa$weekplan$m>
         */
        List<YmTWa$weekplan$m> getYmTWa$weekplan$mList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addYmTWa$weekplan$m(YmTWa$weekplan$m obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchYmTWa$weekplan$m(List<YmTWa$weekplan$m> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateYmTWa$weekplan$m(YmTWa$weekplan$m obj,User user);

    void reject(YmTWa$weekplan$m obj,User user);

    void submit(YmTWa$weekplan$m obj,User user);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchYmTWa$weekplan$m(List<YmTWa$weekplan$m> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteYmTWa$weekplan$mById(String id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchYmTWa$weekplan$m(List<String> ids);


    void pass(YmTWa$weekplan$m obj, User user);

    void reset(Map params);
}
