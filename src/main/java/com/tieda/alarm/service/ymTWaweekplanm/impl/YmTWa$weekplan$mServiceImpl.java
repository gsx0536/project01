package com.tieda.alarm.service.ymTWaweekplanm.impl;

import com.tieda.alarm.constants.DataConstants;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.entity.weekPlanOperator.WeekPlanOperator;
import com.tieda.alarm.entity.ymTWaweekplanm.YmTWa$weekplan$m;
import com.tieda.alarm.entity.ymTWeekPlan.YmTWeekPlan;
import com.tieda.alarm.mapper.weekPlanOperator.WeekPlanOperatorMapper;
import com.tieda.alarm.mapper.ymTWaweekplanm.YmTWa$weekplan$mMapper;
import com.tieda.alarm.mapper.ymTWeekPlan.YmTWeekPlanMapper;
import com.tieda.alarm.service.ymTWaweekplanm.IYmTWa$weekplan$mService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tieda.alarm.util.IdWorker;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author
 * @since 2020-01-13
 */
@Service
@Transactional
public class YmTWa$weekplan$mServiceImpl extends ServiceImpl<YmTWa$weekplan$mMapper, YmTWa$weekplan$m> implements IYmTWa$weekplan$mService {


    @Autowired
    YmTWa$weekplan$mMapper ymTWa$weekplan$mMapper;
    @Autowired
    WeekPlanOperatorMapper weekPlanOperatorMapper;
    @Autowired
    YmTWeekPlanMapper ymTWeekPlanMapper;
    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return YmTWa$weekplan$m
     */
    @Override
    public YmTWa$weekplan$m getYmTWa$weekplan$mById(String id) {
        return ymTWa$weekplan$mMapper.getYmTWa$weekplan$mById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<YmTWa$weekplan$m>
     */
    @Override
    public List<YmTWa$weekplan$m> getYmTWa$weekplan$mList(Map<String, Object> params) {
        return ymTWa$weekplan$mMapper.getYmTWa$weekplan$mList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addYmTWa$weekplan$m(YmTWa$weekplan$m obj) {
        ymTWa$weekplan$mMapper.addYmTWa$weekplan$m(obj);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchYmTWa$weekplan$m(List<YmTWa$weekplan$m> list) {
        ymTWa$weekplan$mMapper.addBatchYmTWa$weekplan$m(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateYmTWa$weekplan$m(YmTWa$weekplan$m obj, User user) {
        weekPlanLog(obj,user);
        ymTWa$weekplan$mMapper.updateYmTWa$weekplan$m(obj);
    }

    @Override
    public void reject(YmTWa$weekplan$m obj, User user) {
        String nid=obj.getnId();
        String ids[]=nid.split(",");
        String id=nid;
        String content=obj.getContent();
        String status=obj.getVcStatus();
        for(int i=0;i<ids.length;i++){
            YmTWa$weekplan$m ymTWa$weekplan$m=new YmTWa$weekplan$m();
            ymTWa$weekplan$m.setnId(ids[i]);
            ymTWa$weekplan$m.setVcWs$app$per(user.getVcNumber());
            ymTWa$weekplan$m.setDtWs$app$date(new Date());
            ymTWa$weekplan$m.setContent(content);
            ymTWa$weekplan$m.setVcStatus(status);
            weekPlanLog(ymTWa$weekplan$m,user);
            ymTWa$weekplan$mMapper.updateYmTWa$weekplan$m(ymTWa$weekplan$m);
        }

    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchYmTWa$weekplan$m(List<YmTWa$weekplan$m> list) {
        ymTWa$weekplan$mMapper.updateBatchYmTWa$weekplan$m(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteYmTWa$weekplan$mById(String id) {
        ymTWa$weekplan$mMapper.deleteYmTWa$weekplan$mById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchYmTWa$weekplan$m(List<String> ids) {
        ymTWa$weekplan$mMapper.deleteBatchYmTWa$weekplan$m(ids);
    }


    //日志记录
    private void weekPlanLog(YmTWa$weekplan$m obj, User user){
        WeekPlanOperator weekPlanOperator = new WeekPlanOperator();
        weekPlanOperator.setId(String.valueOf(idWorker.nextId()));
        weekPlanOperator.setMid(obj.getnId());
        if (!"".equals(obj.getContent()) && obj.getContent() != null) {
            weekPlanOperator.setContent(obj.getContent());
        }
        String status = DataConstants.WeekPlanStatus.getValue(obj.getVcStatus()).getName();

        weekPlanOperator.setOperate(user.getVcName() + ":" + status);
        weekPlanOperator.setCreatedate(new Date());
        weekPlanOperatorMapper.addWeekPlanOperator(weekPlanOperator);
    }

    public void submit(YmTWa$weekplan$m obj, User user){
        String nid=obj.getnId();
        String ids[]=nid.split(",");
        String id=nid;
        String status=obj.getVcStatus();
        for(int i=0;i<ids.length;i++){
            YmTWa$weekplan$m ymTWa$weekplan$m=new YmTWa$weekplan$m();
            ymTWa$weekplan$m.setnId(ids[i]);
            ymTWa$weekplan$m.setVcStatus(status);
            weekPlanLog(ymTWa$weekplan$m,user);
            ymTWa$weekplan$mMapper.updateYmTWa$weekplan$m(ymTWa$weekplan$m);
        }
    }


    public void pass(YmTWa$weekplan$m obj, User user){
        String nid=obj.getnId();
        String ids[]=nid.split(",");
        String id=nid;
        for(int i=0;i<ids.length;i++){
            String status=obj.getVcStatus();
            id=ids[i];
            YmTWa$weekplan$m ymTWa$weekplan$m=ymTWa$weekplan$mMapper.getYmTWa$weekplan$mById(id);
            String orgType=ymTWa$weekplan$m.getOrgType();
            ymTWa$weekplan$m.setVcStatus(obj.getVcStatus());
            ymTWa$weekplan$m.setContent(obj.getContent());
            ymTWa$weekplan$m.setVcWs$app$per(user.getVcNumber());
            ymTWa$weekplan$m.setDtWs$app$date(new Date());
            if(status.equals(DataConstants.WeekPlanStatus.techApprove.getValue())&&orgType.equals("2")){
                //技术科批准 车间 任务,
                techPass(ymTWa$weekplan$m,user);
            }else if(status.equals(DataConstants.WeekPlanStatus.duanApprove.getValue())&&orgType.equals("3")){
                //段领导批准技术科任务
                techPass(ymTWa$weekplan$m,user);
            }else if(status.equals(DataConstants.WeekPlanStatus.workshopApprove.getValue())&&orgType.equals("1")){
                //车间批准 工区任务
                techPass(ymTWa$weekplan$m,user);
            }else{
                //技术科长 批准技术科任务,车间批准
                updateYmTWa$weekplan$m(ymTWa$weekplan$m,user);
            }
        }
    }

    private void techPass(YmTWa$weekplan$m ymTWa$weekplan$m, User user) {
        weekPlanLog(ymTWa$weekplan$m,user);
        Map plan_par=new HashMap();
        String weekNum=ymTWa$weekplan$m.getVcWeeknum();
        String year=ymTWa$weekplan$m.getVcYear();
        String month=ymTWa$weekplan$m.getVcMonth();

        //需要分发任务主表
        Map distribute_map=new HashMap();
        distribute_map.put("weekNum",weekNum);
        distribute_map.put("year",year);
        distribute_map.put("month",month);

        plan_par.put("mid",ymTWa$weekplan$m.getnId());
        List <YmTWeekPlan>planList=ymTWeekPlanMapper.getYmTWeekPlanList(plan_par);
        for(YmTWeekPlan ymTWeekPlan:planList){
            String orgid=ymTWeekPlan.getOrgid();
            String orgname=ymTWeekPlan.getOrgname();
            String orgids[]=orgid.split(",");
            String orgnames[]=orgname.split(",");
            for(int i=0;i<orgids.length;i++){
                YmTWeekPlan weekPlan=ymTWeekPlan;
                weekPlan.setOrgid(orgids[i]);
                weekPlan.setOrgname(orgnames[i]);

                distribute_map.put("orgId",orgids[i]);
                YmTWa$weekplan$m dis_m=ymTWa$weekplan$mMapper.getByYearMWOrg(distribute_map);
                String dis_id=dis_m.getnId();
                weekPlan.setMid(dis_id);
                weekPlan.setId(String.valueOf(idWorker.nextId()));
                ymTWeekPlanMapper.addYmTWeekPlan(weekPlan);
            }

        }

        ymTWa$weekplan$mMapper.updateYmTWa$weekplan$m(ymTWa$weekplan$m);
    }

    @Override
    public void reset(Map params) {
        ymTWa$weekplan$mMapper.reset(params);
    }
}
