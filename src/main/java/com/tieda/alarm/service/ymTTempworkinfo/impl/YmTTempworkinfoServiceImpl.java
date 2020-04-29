package com.tieda.alarm.service.ymTTempworkinfo.impl;

import com.tieda.alarm.entity.ymTTempworkinfo.YmTTempworkinfo;
import com.tieda.alarm.mapper.ymTTempworkinfo.YmTTempworkinfoMapper;
import com.tieda.alarm.service.ymTTempworkinfo.IYmTTempworkinfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * <p>
 * 临时上道 服务实现类
 * </p>
 *
 * @author 
 * @since 2019-07-19
 */
@Service
@Transactional
        public class YmTTempworkinfoServiceImpl extends ServiceImpl<YmTTempworkinfoMapper, YmTTempworkinfo>implements IYmTTempworkinfoService {


        @Autowired
    YmTTempworkinfoMapper ymTTempworkinfoMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YmTTempworkinfo
         */
        @Override
        public YmTTempworkinfo getYmTTempworkinfoById(Long id){
        return ymTTempworkinfoMapper.getYmTTempworkinfoById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YmTTempworkinfo>
         */
        @Override
        public List<YmTTempworkinfo>getYmTTempworkinfoList(Map<String,Object>params){
        return ymTTempworkinfoMapper.getYmTTempworkinfoList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addYmTTempworkinfo(YmTTempworkinfo obj){
    ymTTempworkinfoMapper.addYmTTempworkinfo(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchYmTTempworkinfo(List<YmTTempworkinfo>list){
    ymTTempworkinfoMapper.addBatchYmTTempworkinfo(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateYmTTempworkinfo(YmTTempworkinfo obj){
    ymTTempworkinfoMapper.updateYmTTempworkinfo(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchYmTTempworkinfo(YmTTempworkinfo ymTTempworkinfo){
    ymTTempworkinfoMapper.updateYmTTempworkinfo(ymTTempworkinfo);
        }

        @Override
        public void rejectAplly(String nId){
            ymTTempworkinfoMapper.rejectAplly(nId);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteYmTTempworkinfoById(Long id){
    ymTTempworkinfoMapper.deleteYmTTempworkinfoById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchYmTTempworkinfo(List<Long>ids){
    ymTTempworkinfoMapper.deleteBatchYmTTempworkinfo(ids);
        }

    @Override
    public void setcodenum(Map<String,Object> params) {
        ymTTempworkinfoMapper.setcodenum(params);
    }

    @Override
    public String getonNoadcodenum(String nid) {
        return ymTTempworkinfoMapper.getonNoadcodenum(nid);
    }

    @Override
    public String getoutNoadcodenum(String nid) {
        return ymTTempworkinfoMapper.getoutNoadcodenum(nid);
    }

    @Override
    public String getCenterLeader(){
            return ymTTempworkinfoMapper.getCenterLeader();
    }
}
