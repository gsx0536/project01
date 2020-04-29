package com.tieda.alarm.service.ymTMonthimpDKmn.impl;

import com.tieda.alarm.entity.ymTMonthimpDKmn.YmTMonthimpDKmn;
import com.tieda.alarm.mapper.ymTMonthimpDKmn.YmTMonthimpDKmnMapper;
import com.tieda.alarm.service.ymTMonthimpDKmn.IYmTMonthimpDKmnService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * <p>
 * 昆明南月重点工作子表 服务实现类
 * </p>
 *
 * @author 
 * @since 2019-06-02
 */
@Service
@Transactional
        public class YmTMonthimpDKmnServiceImpl extends ServiceImpl<YmTMonthimpDKmnMapper, YmTMonthimpDKmn>implements IYmTMonthimpDKmnService {


        @Autowired
    YmTMonthimpDKmnMapper ymTMonthimpDKmnMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YmTMonthimpDKmn
         */
        @Override
        public YmTMonthimpDKmn getYmTMonthimpDKmnById(Long id){
        return ymTMonthimpDKmnMapper.getYmTMonthimpDKmnById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YmTMonthimpDKmn>
         */
        @Override
        public List<YmTMonthimpDKmn>getYmTMonthimpDKmnList(Map<String,Object>params){
        return ymTMonthimpDKmnMapper.getYmTMonthimpDKmnList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addYmTMonthimpDKmn(YmTMonthimpDKmn obj){
    ymTMonthimpDKmnMapper.addYmTMonthimpDKmn(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchYmTMonthimpDKmn(List<YmTMonthimpDKmn>list){
    ymTMonthimpDKmnMapper.addBatchYmTMonthimpDKmn(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateYmTMonthimpDKmn(YmTMonthimpDKmn obj){
    ymTMonthimpDKmnMapper.updateYmTMonthimpDKmn(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchYmTMonthimpDKmn(List<YmTMonthimpDKmn>list){
    ymTMonthimpDKmnMapper.updateBatchYmTMonthimpDKmn(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteYmTMonthimpDKmnById(Long id){
    ymTMonthimpDKmnMapper.deleteYmTMonthimpDKmnById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchYmTMonthimpDKmn(List<Long>ids){
    ymTMonthimpDKmnMapper.deleteBatchYmTMonthimpDKmn(ids);
        }


    public List getWorkType() { return ymTMonthimpDKmnMapper.getWorkType();}


    public List getWorkProject() { return ymTMonthimpDKmnMapper.getWorkProject();}

    public void checkNorder(YmTMonthimpDKmn obj){ ymTMonthimpDKmnMapper.checknorder(obj);}


    public void checknorderfordel(YmTMonthimpDKmn obj){
            ymTMonthimpDKmnMapper.checknorderfordel(obj); }
    @Override
    public void updatenNorderByNorder(Map<String, Object> params) {
        ymTMonthimpDKmnMapper.updatenNorderByNorder(params);
    }

    @Override
    public void updatenNorderByNid(Map<String, Object> params) {
        ymTMonthimpDKmnMapper.updatenNorderByNid(params);
    }

    @Override
    public List getAllOrgByLvl(Map orgMap){
        return ymTMonthimpDKmnMapper.getAllOrgByLvl(orgMap);
    }


}
