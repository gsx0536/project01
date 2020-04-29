package com.tieda.alarm.service.checkRack.impl;

import com.tieda.alarm.entity.checkRack.CheckRack;
import com.tieda.alarm.entity.checkRackItem.CheckRackItem;
import com.tieda.alarm.mapper.checkRack.CheckRackMapper;
import com.tieda.alarm.mapper.checkRackItem.CheckRackItemMapper;
import com.tieda.alarm.service.checkRack.ICheckRackService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tieda.alarm.util.IdWorker;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>
 * 作业主表 服务实现类
 * </p>
 *
 * @author
 * @since 2019-05-20
 */
@Service
@Transactional
public class CheckRackServiceImpl extends ServiceImpl<CheckRackMapper, CheckRack> implements ICheckRackService {


    @Autowired
    CheckRackMapper checkRackMapper;

    @Autowired
    CheckRackItemMapper checkRackItemMapper;
    @Autowired
    IdWorker idWorker;
    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return CheckRack
     */
    @Override
    public CheckRack getCheckRackById(Long id) {
        return checkRackMapper.getCheckRackById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<CheckRack>
     */
    @Override
    public List<CheckRack> getCheckRackList(Map<String, Object> params) {
        return checkRackMapper.getCheckRackList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addCheckRack(CheckRack obj) {
        checkRackMapper.addCheckRack(obj);
        List<String> itemList=obj.getItemName();
        List<String> itemIdList=obj.getItemId();
        if(itemList!=null&&itemIdList!=null){
            for(int i=0;i<itemIdList.size();i++){
                CheckRackItem item=new CheckRackItem();
                item.setId(String.valueOf(idWorker.nextId()));
                item.setCheckrackid(obj.getId());
                item.setWorkdate(obj.getFinishdate());
                item.setItem(itemList.get(i));
                item.setItemid(itemIdList.get(i));
                item.setStatus("1");
                item.setRackname(obj.getRackname());
                checkRackItemMapper.addCheckRackItem(item);
            }
        }

    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchCheckRack(List<CheckRack> list) {
        checkRackMapper.addBatchCheckRack(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateCheckRack(CheckRack obj) {
        checkRackMapper.updateCheckRack(obj);
        List<String> itemList=obj.getItemName();
        List<String> itemIdList=obj.getItemId();
        if(itemList==null||itemIdList==null){
            checkRackItemMapper.deleteCheckRackItemByCheckId(obj.getId());
        }
        else{
            checkRackItemMapper.deleteCheckRackItemByNotItemId(itemIdList);
            for(int i=0;i<itemIdList.size();i++){
                String itemid=itemIdList.get(i);
                Map param=new HashMap();
                param.put("itemid",itemid);
                List list=checkRackItemMapper.getCheckRackItemListByItemId(param);
                if(list.size()>0){
                    continue;
                }
                CheckRackItem item=new CheckRackItem();
                item.setId(String.valueOf(idWorker.nextId()));
                item.setCheckrackid(obj.getId());
                item.setWorkdate(obj.getFinishdate());
                item.setItem(itemList.get(i));
                item.setItemid(itemIdList.get(i));
                item.setStatus("1");
                item.setRackname(obj.getRackname());
                checkRackItemMapper.addCheckRackItem(item);
            }
        }

    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchCheckRack(List<CheckRack> list) {
        checkRackMapper.updateBatchCheckRack(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteCheckRackById(Long id) {
        checkRackMapper.deleteCheckRackById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchCheckRack(List<Long> ids) {
        checkRackMapper.deleteBatchCheckRack(ids);
    }

}
