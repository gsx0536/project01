package com.tieda.alarm.service.ymTMonthimpDKmn;
import com.tieda.alarm.entity.ymTMonthimpDKmn.YmTMonthimpDKmn;
import com.baomidou.mybatisplus.service.IService;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 昆明南月重点工作子表 服务类
 * </p>
 *
 * @author 
 * @since 2019-06-02
 */
public interface IYmTMonthimpDKmnService extends IService<YmTMonthimpDKmn> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YmTMonthimpDKmn
         */
    YmTMonthimpDKmn getYmTMonthimpDKmnById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YmTMonthimpDKmn>
         */
        List<YmTMonthimpDKmn> getYmTMonthimpDKmnList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addYmTMonthimpDKmn(YmTMonthimpDKmn obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchYmTMonthimpDKmn(List<YmTMonthimpDKmn> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateYmTMonthimpDKmn(YmTMonthimpDKmn obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchYmTMonthimpDKmn(List<YmTMonthimpDKmn> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteYmTMonthimpDKmnById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchYmTMonthimpDKmn(List<Long> ids);


    List getWorkType();

    List getWorkProject();

     void checkNorder(YmTMonthimpDKmn obj);

    void checknorderfordel(YmTMonthimpDKmn obj);

    void updatenNorderByNorder(Map<String,Object> params);

    void updatenNorderByNid(Map<String,Object> params);

    List getAllOrgByLvl(Map orgMap);



        }
