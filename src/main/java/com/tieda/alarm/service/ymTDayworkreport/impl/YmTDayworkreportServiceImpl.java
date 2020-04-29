package com.tieda.alarm.service.ymTDayworkreport.impl;

import com.tieda.alarm.entity.ymTDayworkreport.YmTDayworkreport;
import com.tieda.alarm.entity.ymTMonthimpworkMKmn.YmTMonthimpworkMKmn;
import com.tieda.alarm.mapper.ymTDayworkreport.YmTDayworkreportMapper;
import com.tieda.alarm.service.ymTDayworkreport.IYmTDayworkreportService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2019-06-24
 */
@Service
@Transactional
        public class YmTDayworkreportServiceImpl extends ServiceImpl<YmTDayworkreportMapper, YmTDayworkreport>implements IYmTDayworkreportService {


        @Autowired
    YmTDayworkreportMapper ymTDayworkreportMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YmTDayworkreport
         */
        @Override
        public YmTDayworkreport getYmTDayworkreportById(Long id){
        return ymTDayworkreportMapper.getYmTDayworkreportById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YmTDayworkreport>
         */
        @Override
        public List<YmTDayworkreport> getYmTDayworkreportList (Map<String,Object> params){
        return ymTDayworkreportMapper.getYmTDayworkreportList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addYmTDayworkreport(YmTDayworkreport obj){
    ymTDayworkreportMapper.addYmTDayworkreport(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchYmTDayworkreport(List<YmTDayworkreport>list){
    ymTDayworkreportMapper.addBatchYmTDayworkreport(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateYmTDayworkreport(YmTDayworkreport obj){
    ymTDayworkreportMapper.updateYmTDayworkreport(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchYmTDayworkreport(List<YmTDayworkreport>list){
    ymTDayworkreportMapper.updateBatchYmTDayworkreport(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteYmTDayworkreportById(Long id){
    ymTDayworkreportMapper.deleteYmTDayworkreportById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchYmTDayworkreport(List<Long>ids){
    ymTDayworkreportMapper.deleteBatchYmTDayworkreport(ids);
        }

    @Override
    public List<YmTDayworkreport> segGetCatalog(Map pmap) {
        return ymTDayworkreportMapper.segGetCatalog(pmap);
    }

    @Override
    public List<YmTDayworkreport> wsGetCatalog(Map pmap) {
        return ymTDayworkreportMapper.wsGetCatalog(pmap);
    }

    @Override
    public List<YmTDayworkreport> waGetCatalog(Map pmap) {
        return ymTDayworkreportMapper.waGetCatalog(pmap);
    }

    @Override
    public List<YmTDayworkreport> waGetList(Map pmap) {
        return ymTDayworkreportMapper.waGetList(pmap);
    }

    @Override
    public List<YmTDayworkreport> wsGetList(Map pmap) {
        return ymTDayworkreportMapper.wsGetList(pmap);
    }

    @Override
    public void updateStatus(Map pmap) {
        ymTDayworkreportMapper.updateStatus(pmap);
        ymTDayworkreportMapper.updateStatusmore(pmap);
    }

    @Override
    public void createdayreport(Map pmap) {
        ymTDayworkreportMapper.createdayreport(pmap);
    }

}
