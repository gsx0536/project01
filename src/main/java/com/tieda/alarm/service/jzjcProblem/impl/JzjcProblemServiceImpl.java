package com.tieda.alarm.service.jzjcProblem.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tieda.alarm.constants.DataConstants;
import com.tieda.alarm.entity.jzjcProblem.JzjcProblem;
import com.tieda.alarm.entity.jzjcProblem.TreeEntity;
import com.tieda.alarm.entity.jzjcProblemHandle.JzjcProblemHandle;
import com.tieda.alarm.entity.jzjcProblemLog.JzjcProblemLog;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.mapper.jzjcProblem.JzjcProblemMapper;
import com.tieda.alarm.mapper.jzjcProblemHandle.JzjcProblemHandleMapper;
import com.tieda.alarm.mapper.jzjcProblemLog.JzjcProblemLogMapper;
import com.tieda.alarm.service.jzjcProblem.IJzjcProblemService;
import com.tieda.alarm.util.IdWorker;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.*;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author
 * @since 2019-11-16
 */
@Service
@Transactional
public class JzjcProblemServiceImpl extends ServiceImpl<JzjcProblemMapper, JzjcProblem> implements IJzjcProblemService {


    @Autowired
    JzjcProblemMapper jzjcProblemMapper;

    @Autowired
    JzjcProblemLogMapper jzjcProblemLogMapper;

    @Autowired
    JzjcProblemHandleMapper jzjcProblemHandleMapper;

    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return JzjcProblem
     */
    @Override
    public JzjcProblem getJzjcProblemById(String id) {
        return jzjcProblemMapper.getJzjcProblemById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param tabtype 1本部门负责,2本部门参与,3未整改,4已整改,5调度待处理
     * @param params  查询参数
     * @return List<JzjcProblem>
     */
    @Override
    public List<JzjcProblem> getJzjcProblemList(Map<String, Object> params, User user) {
        String userType = "";
        if (user.getVcOrgId().equals("KMBUR_KMNSEG_ORG_40")
                || user.getVcNumber().equals("admin")) {//调度指挥中心或者管理员
            userType = "fxcenter";
        } else if (user.getVcOrgId().equals(DataConstants.JISHUKEID) ||
                user.getVcOrgId().equals("KMBUR_KMNSEG_ORG_31") ||
                user.getVcOrgId().equals("KMBUR_KMNSEG_ORG_39")) {//技术科 行政领导 安全科
            if (params.get("chargeorg") == null || params.get("chargeorg").toString() == "") {
                params.put("chargeorg", user.getVcOrgId());
            } else {
                params.put("chargeorgSearch", params.get("chargeorg"));
            }
            params.put("assistorg", user.getVcOrgId());
            userType = "jxkcenter";
        } else {
            if (params.get("chargeorg") == null || params.get("chargeorg").toString() == "") {
                List chargeorgs = new ArrayList();
                if (user.getOrgLevel().equals("30")) {
                    chargeorgs = jzjcProblemMapper.getOrgZjzByWorkshop(user.getVcOrgId());
                } else if (user.getOrgLevel().equals("10") && user.getVcOrgName().indexOf("质检组") > -1) {
                    chargeorgs = jzjcProblemMapper.getOrgZjzByWorkshop(user.getVcParOrgId());
                } else {
                    Map map = new HashMap();
                    map.put("ORGID", user.getVcOrgId());
                    chargeorgs.add(map);
                }
                params.put("parchargeorg", chargeorgs);//针对于车间和质检组查看管辖工区设定的参数
                params.put("chargeorg", user.getVcOrgId());
            } else {
                params.put("chargeorgSearch", params.get("chargeorg"));
            }
            params.put("assistorg", user.getVcOrgId());
            userType = "other";
        }
        params.put("userType", userType);
        return jzjcProblemMapper.getJzjcProblemList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addJzjcProblem(JzjcProblem obj, User user) {
        obj.setOrgnames(obj.getChargeorgname());
        obj.setHandlers(obj.getCharger());
        jzjcProblemMapper.addJzjcProblem(obj);
        JzjcProblemLog problemLog = new JzjcProblemLog();
        problemLog.setId(String.valueOf(idWorker.nextId()));
        problemLog.setProblemid(obj.getId());
        problemLog.setCreatedate(new Date());
        if (obj.getStatus().equals("1")) {
            problemLog.setInfor(user.getVcOrgName() + "（" + user.getVcName() + "）" +
                    " 下发给：" + obj.getChargeorgname() + "（" + obj.getCharger() + "）");
            jzjcProblemLogMapper.addJzjcProblemLog(problemLog);

        }
    }

    /**
     * 添加对象实体 - 监测报警纳入
     *
     * @param obj 对象实体
     */
    @Override
    public int SystemAddJzjcProblem(JzjcProblem obj) {
        String stationId = obj.getStationid();
        JzjcProblem isExits = jzjcProblemMapper.getJzjcProblemById(obj.getId());
        if (isExits != null) {
            return -1;
        }
        jzjcProblemMapper.addJzjcProblem(obj);
        return 1;
    }

    /**
     * 更新对象实体 - 所有监测问题的流转都在此方法中操作
     * 问题跟踪：0未处理、1已下发、2已签收、3上报调度、4申请延期、5延期同意、6延期驳回、7申请销号、8销号同意、9销号驳回、10逾期销号
     *
     * @param obj 对象实体
     */
    @Override
    public void updateJzjcProblem(JzjcProblem obj, User user) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (obj.getStatus() != null && obj.getStatus() != "") {
            if (obj.getStatus().equals("1")) {//已下发（调度下发、技术科下发、科室下发、车间下发）
                saveProblemLogs(obj.getId(), user.getVcOrgName() + "（" + user.getVcName() + "）" +
                        " 下发给：" + obj.getChargeorgname() + "（" + obj.getCharger() + "）", user.getVcOrgId());

                //如果调度修改整改日期，就将该问题的逾期状态恢复正常
                if (obj.getRectdate() != null) {
                    Date thisdate = new Date();
                    String thisdateStr = simpleDateFormat.format(thisdate);
                    Date thisdate2 = simpleDateFormat.parse(thisdateStr);
                    if (obj.getRectdate().getTime() > thisdate2.getTime()) {
                        obj.setCancle("0");
                    }
                }
                JzjcProblem pb = jzjcProblemMapper.getJzjcProblemById(obj.getId());
                if (pb != null) {
                    String orgnames = pb.getOrgnames() == null ? "" : pb.getOrgnames();//获取历史责任部门
                    if (!orgnames.contains(obj.getChargeorgname())) {
                        obj.setOrgnames(orgnames + "<br>" + obj.getChargeorgname());
                    }
                    String handlers = pb.getHandlers() == null ? "" : pb.getHandlers();//获取历史责任人
                    if (!handlers.contains(obj.getCharger())) {
                        obj.setHandlers(handlers + "<br>" + obj.getCharger());
                    }
                }

            } else if (obj.getStatus().equals("2")) {//已签收（技术科签收、科室签收、车间签收、工区签收）
                saveProblemLogs(obj.getId(), user.getVcOrgName() + "（" + user.getVcName() + "）已签收", "");

            } else if (obj.getStatus().equals("3")) {//上报调度（技术科上报、科室上报、车间上报、工区上报）
                saveProblemLogs(obj.getId(), user.getVcOrgName() + "（" + user.getVcName() + "）不能处理上报分析中心", user.getVcOrgId());
                //存储上报原因至整改从表
                JzjcProblemHandle handle = new JzjcProblemHandle();
                handle.setId(String.valueOf(idWorker.nextId()));
                handle.setProblemid(obj.getId());
                handle.setOrg(user.getVcOrgId());
                handle.setOrgname(user.getVcOrgName());
                handle.setOperator(user.getVcName());
                handle.setContent(obj.getHandleinfo());
                handle.setCreatedate(new Date());
                jzjcProblemHandleMapper.addJzjcProblemHandle(handle);
                /***
                 *主表整改情况中记录此信息
                 */
                saveProblemRectInfos(obj.getId(), obj.getHandleinfo());
                obj.setHandleinfo("");
            } else if (obj.getStatus().equals("4")) {//申请延期（技术科申请、科室申请、车间申请、工区申请）
                //延期申请记录当前整改日期
                JzjcProblem getObj = jzjcProblemMapper.getJzjcProblemById(obj.getId());
                saveProblemLogs(obj.getId(), "（当前整改日期：" + simpleDateFormat.format(getObj.getRectdate()) + "）" + user.getVcOrgName() + "（" + user.getVcName() + "）申请延期到 " + simpleDateFormat.format(obj.getApplyrectdate()), "");
                //存储申请延期原因至整改从表
                JzjcProblemHandle handle = new JzjcProblemHandle();
                handle.setId(String.valueOf(idWorker.nextId()));
                handle.setProblemid(obj.getId());
                handle.setOrg(user.getVcOrgId());
                handle.setOrgname(user.getVcOrgName());
                handle.setOperator(user.getVcName());
                handle.setContent(obj.getHandleinfo());
                handle.setCreatedate(new Date());
                jzjcProblemHandleMapper.addJzjcProblemHandle(handle);
                /***
                 *主表整改情况中记录此信息
                 */
                saveProblemRectInfos(obj.getId(), obj.getHandleinfo());
                obj.setHandleinfo("");
            } else if (obj.getStatus().equals("5")) {//延期同意（调度同意）
                //延期同意后 把整改日期改成申请延期的日期
                JzjcProblem jzjcProblem = jzjcProblemMapper.getJzjcProblemById(obj.getId());
                Date applyrect = jzjcProblem.getApplyrectdate();
                obj.setRectdate(applyrect);
                //如果申请的整改日期大于当前的整改日期，就把逾期未整改状态改成未销号
                if (applyrect.getTime() > jzjcProblem.getRectdate().getTime()) {
                    obj.setCancle("0");
                }
                //存储流转信息
                saveProblemLogs(obj.getId(), user.getVcOrgName() + "（" + user.getVcName() + "）同意延期申请", "");

            } else if (obj.getStatus().equals("6")) {//延期驳回（调度驳回）
                saveProblemLogs(obj.getId(), user.getVcOrgName() + "（" + user.getVcName() + "）驳回延期申请", "");

            } else if (obj.getStatus().equals("7")) {//申请销号（技术科、科室、车间、工区）
                saveProblemLogs(obj.getId(), user.getVcOrgName() + "（" + user.getVcName() + "）申请销号", "");

                obj.setCancle("1");//提交销号申请
            } else if (obj.getStatus().equals("8")) {//调度同意销号（调度同意）
                saveProblemLogs(obj.getId(), user.getVcOrgName() + "（" + user.getVcName() + "）同意申请销号", "");
                obj.setCancle("2");//已消号
                //判断是否逾期销号
                JzjcProblem getObj = jzjcProblemMapper.getJzjcProblemById(obj.getId());
                Date rectDate = getObj.getRectdate();
                Date thisDate = new Date();
                String thisDateStr = simpleDateFormat.format(thisDate);
                Date thisdate2 = simpleDateFormat.parse(thisDateStr);
                if (rectDate.getTime() < thisdate2.getTime()) {
                    obj.setStatus("10");
                }

            } else if (obj.getStatus().equals("9")) {//调度驳回销号（调度驳回）
                saveProblemLogs(obj.getId(), user.getVcOrgName() + "（" + user.getVcName() + "）驳回申请销号", "");
                obj.setCancle("0");//未销号
            }
        } else {
            //状态为空的话就是调度纯粹的修改，这里主要是处理修改整改日期逾期销号和逾期未整改的装填需要恢复正常
            if (obj.getRectdate() != null) {
                Date thisdate = new Date();
                String thisdateStr = simpleDateFormat.format(thisdate);
                Date thisdate2 = simpleDateFormat.parse(thisdateStr);
                if (obj.getRectdate().getTime() >= thisdate2.getTime()) {//大于或者等于当前日期，默认恢复逾期状态
                    JzjcProblem getObj = jzjcProblemMapper.getJzjcProblemById(obj.getId());
                    String status = getObj.getStatus();
                    String cancle = getObj.getCancle();
                    if (status.equals("10")) {
                        obj.setStatus("8");
                        obj.setCancle("2");
                    }
                    if (!status.equals("8") && !status.equals("10")) {
                        if (status.equals("7")) {
                            obj.setCancle("1");
                        } else {
                            obj.setCancle("0");
                        }
                    }
                }
            }
        }
        //更新主表信息
        jzjcProblemMapper.updateJzjcProblem(obj);
    }

    /***
     * 存储流转信息
     *
     * @param problemId 问题主表编号
     * @param infos     流转信息
     * @param infos     原始流转机构(A-->B,这里取得是A)
     */
    private void saveProblemLogs(String problemId, String infos, String operOrg) {
        JzjcProblemLog problemLog = new JzjcProblemLog();
        problemLog.setId(String.valueOf(idWorker.nextId()));
        problemLog.setProblemid(problemId);
        problemLog.setInfor(infos);
        problemLog.setOperorg(operOrg);
        problemLog.setCreatedate(new Date());
        jzjcProblemLogMapper.addJzjcProblemLog(problemLog);
    }

    /***
     * 整改过程记录
     *
     * @param obj
     * @param user
     */
    @Override
    public void rectProblem(JzjcProblemHandle obj, User user) {
        //整改从表数据记录
        obj.setId(String.valueOf(idWorker.nextId()));
        obj.setOrgname(user.getVcOrgName());
        obj.setOrg(user.getVcOrgId());
        obj.setOperator(user.getVcName());
        obj.setCreatedate(new Date());
        jzjcProblemHandleMapper.addJzjcProblemHandle(obj);
        //监测问题主表信息修改
        JzjcProblem pb = jzjcProblemMapper.getJzjcProblemById(obj.getProblemid());
        String chargerOrg = pb.getChargeorgname();//责任部门
        String charger = pb.getCharger();//责任人
        String handleinfo = pb.getHandleinfo() == null ? "" : pb.getHandleinfo();//获取历史整改情况
        pb.setHandleinfo(handleinfo + "<br>" + obj.getContent());
        String orgnames = pb.getOrgnames() == null ? "" : pb.getOrgnames();//获取历史责任部门
        if (!orgnames.contains(chargerOrg)) {
            pb.setOrgnames(orgnames + "<br>" + chargerOrg);
        }
        String handlers = pb.getHandlers() == null ? "" : pb.getHandlers();//获取历史责任人
        if (!handlers.contains(charger)) {
            pb.setHandlers(handlers + "<br>" + charger);
        }
        jzjcProblemMapper.updateJzjcProblem(pb);
    }

    /***
     * 补充功能--延期申请和上报调度原因没有加到主表整改情况字段中，现在加一个新方法实现加入;
     *
     * @return
     */
    private void saveProblemRectInfos(String id, String msgStr) {
        JzjcProblem pb = jzjcProblemMapper.getJzjcProblemById(id);
        String handleinfo = pb.getHandleinfo() == null ? "" : pb.getHandleinfo();//获取历史整改情况
        pb.setHandleinfo(handleinfo + "<br>" + msgStr);
        jzjcProblemMapper.updateJzjcProblem(pb);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteJzjcProblemById(String id) {
        jzjcProblemMapper.deleteJzjcProblemById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchJzjcProblem(List<Long> ids) {
        jzjcProblemMapper.deleteBatchJzjcProblem(ids);
    }


    @Override
    public List groupbyLvl(Map<String, Object> params) {
        return jzjcProblemMapper.groupbyLvl(params);
    }

    @Override
    public List groupbyType(Map<String, Object> params) {
        return jzjcProblemMapper.groupbyType(params);
    }

    @Override
    public List groupbyLine(Map<String, Object> params) {
        return jzjcProblemMapper.groupbyLine(params);
    }

    @Override
    public List getStationByjcpc(Map<String, Object> params) {
        return jzjcProblemMapper.getStationByjcpc(params);
    }

    @Override
    public void scheduleTaskOverdue() {
        jzjcProblemMapper.scheduleTaskOverdue();
    }

    @Override
    public List getHandlelist(Map<String, Object> params) {
        return jzjcProblemHandleMapper.getJzjcProblemHandleList(params);
    }

    @Override
    public List getOrgDatasByLogin(User user, String findall) {
        Map map = new HashMap();
        List<TreeEntity> result = new ArrayList();
        String parOrgId = "";
        if (user.getVcOrgId().equals("KMBUR_KMNSEG_ORG_40") || user.getVcNumber().equals("admin")) {//调度中心
            map.put("userType", "fxcenter");
            result = jzjcProblemMapper.getOrgDatasByLogin(map);
            if (user.getVcNumber().equals("admin")) {
                parOrgId = user.getVcOrgId();
            } else {
                parOrgId = user.getVcParOrgId();
            }
            JSONArray jsonA = new JSONArray();
            if (result.size() > 0) {
                JSONArray childDatas = getChildDatas(result, parOrgId);
                jsonA.addAll(childDatas);
            }
            return jsonA;

        } else if (user.getVcOrgId().equals(DataConstants.JISHUKEID) || findall.equals("1")) {//技术科
            map.put("userType", "jishuke");
            result = jzjcProblemMapper.getOrgDatasByLogin(map);
            if (findall.equals("1")) {
                parOrgId = "KMBUR_KMNSEG";
            } else {
                parOrgId = user.getVcParOrgId();
            }
            JSONArray jsonA = new JSONArray();
            if (result.size() > 0) {
                JSONArray childDatas = getChildDatas(result, parOrgId);
                jsonA.addAll(childDatas);
            }
            return jsonA;

        } else if (user.getOrgLevel().equals("50")) {
            map.put("userType", "seg");
            map.put("orgid", user.getVcOrgId());
            result = jzjcProblemMapper.getOrgDatasByLogin(map);
            parOrgId = user.getVcParOrgId();
            JSONArray jsonA = new JSONArray();
            if (result.size() > 0) {
                JSONArray childDatas = getChildDatas(result, parOrgId);
                jsonA.addAll(childDatas);
            }
            return jsonA;

        } else if (user.getOrgLevel().equals("30")) {
            map.put("userType", "workshop");
            map.put("orgid", user.getVcOrgId());
            result = jzjcProblemMapper.getOrgDatasByLogin(map);
            parOrgId = user.getVcParOrgId();
            JSONArray jsonA = new JSONArray();
            if (result.size() > 0) {
                JSONArray childDatas = getChildDatas(result, parOrgId);
                jsonA.addAll(childDatas);
            }
            return jsonA;
        } else {
            return new JSONArray();
        }
    }

    private JSONArray getChildDatas(List<TreeEntity> list, String vcOrgId) {
        JSONArray childList = new JSONArray();
        for (int j = 0; j < list.size(); j++) {
            TreeEntity treeChild = list.get(j);
            if (treeChild.getPid().equals(vcOrgId)) {
                JSONObject map = new JSONObject();
                JSONArray childDatas = getChildDatas(list, treeChild.getId());
                map.put("key", treeChild.getId());
                map.put("title", treeChild.getText());
                if (childDatas.size() > 0) {
                    map.put("children", childDatas);
                } else {
                    map.put("isLeaf", true);
                }
                childList.add(map);
            }
        }
        return childList;
    }

    /***
     * 统计明细查询
     * orgid 线路编号、车间编号、科室编号
     * enddate 截止日期
     * begindate 开始日期
     * nodetype 统计分支（问题分级、问题类型）
     */
    @Override
    public List groupDetail(Map<String, Object> params) {
        List<JzjcProblem> result = new ArrayList<JzjcProblem>();
        String nodetype = params.get("nodetype").toString();
        if (params.get("orgid").toString().indexOf("_LINE") > -1) {
            if (nodetype.indexOf("级") > -1) {//级别
                params.remove("nodetype");
                params.put("nodetype", "problemlevel");
                params.put("problemlevel", formatProblemLevel(nodetype));
            } else {//类型
                params.remove("nodetype");
                params.put("nodetype", "problemtype");
                params.put("problemtype", nodetype);
            }
            result = jzjcProblemMapper.groupdetaiByLineType(params);

        } else if (params.get("orgid").toString().indexOf("_ORG") > -1) {
            if (nodetype.indexOf("级") > -1) {//级别
                params.remove("nodetype");
                params.put("nodetype", "problemlevel");
                params.put("problemlevel", formatProblemLevel(nodetype));
            } else {//类型
                params.remove("nodetype");
                params.put("nodetype", "problemtype");
                params.put("problemtype", nodetype);
            }
            result = jzjcProblemMapper.groupdetaiByWorkshopType(params);
        } else {
            //总计行查询明细
            String orgid = params.get("orgid").toString();
            if (orgid.equals("LINE")) {
                params.remove("nodetype");
                params.put("nodetype", "problemtype");
                params.put("problemtype", nodetype);
                result = jzjcProblemMapper.groupdetaiByLineType(params);
            } else if (orgid.equals("TYPE")) {
                params.remove("nodetype");
                params.put("nodetype", "problemtype");
                params.put("problemtype", nodetype);
                result = jzjcProblemMapper.groupdetaiByWorkshopType(params);
            } else if (orgid.equals("LEVEL")) {
                params.remove("nodetype");
                params.put("nodetype", "problemlevel");
                result = jzjcProblemMapper.groupdetaiByWorkshopType(params);
            }
        }
        return result;
    }

    /***
     * 1、exporttype 1车间问题级别、2车间问题类型、3线路
     * 2、enddate 截止日期
     * 3、begindate 起始日期
     *
     * @param params
     */
    public void groupExport(Workbook wb, Sheet sheet, Map<String, Object> params) {
        String exporttype = params.get("exporttype").toString();
        String title = "";
        int cells = 0;
        if (exporttype.equals("1")) {
            title = "集中监测分析问题按问题级别统计";
            cells = 6;
        } else if (exporttype.equals("2")) {
            title = "集中监测分析问题统计";
            cells = 12;
        } else if (exporttype.equals("3")) {
            title = "集中监测分析问题按线别统计";
            cells = 3;
        }
        Font f_title = wb.createFont();
        Font f_name = wb.createFont();
        Font f_value = wb.createFont();
        f_title.setBold(true);
        f_title.setFontHeightInPoints((short) 14f);
        f_title.setFontName("宋体");
        f_title.setColor(IndexedColors.BLACK.index);

        f_name.setBold(false);
        f_name.setFontHeightInPoints((short) 11f);
        f_name.setFontName("宋体");
        f_name.setColor(IndexedColors.BLACK.index);
        f_value.setBold(false);
        f_value.setFontHeightInPoints((short) 11f);
        f_value.setFontName("宋体");
        f_value.setColor(IndexedColors.BLACK.index);
        //定义样式
        CellStyle cs_title = wb.createCellStyle();
        CellStyle cs_name = wb.createCellStyle();
        CellStyle cs_value = wb.createCellStyle();

        cs_title.setFont(f_title);
        cs_title.setAlignment(HorizontalAlignment.CENTER);
        cs_title.setVerticalAlignment(VerticalAlignment.CENTER);
        cs_title.setBorderBottom(BorderStyle.THIN);
        cs_title.setBorderTop(BorderStyle.THIN);

        cs_name.setFont(f_name);
        cs_name.setAlignment(HorizontalAlignment.CENTER);
        cs_name.setVerticalAlignment(VerticalAlignment.CENTER);
        cs_name.setBorderBottom(BorderStyle.THIN);
        cs_name.setBorderTop(BorderStyle.THIN);
        cs_name.setBorderLeft(BorderStyle.THIN);
        cs_name.setBorderRight(BorderStyle.THIN);
        cs_name.setWrapText(true);

        cs_value.setFont(f_value);
        cs_value.setAlignment(HorizontalAlignment.CENTER);
        cs_value.setVerticalAlignment(VerticalAlignment.CENTER);
        cs_value.setBorderBottom(BorderStyle.THIN);
        cs_value.setBorderTop(BorderStyle.THIN);
        cs_value.setBorderLeft(BorderStyle.THIN);
        cs_value.setBorderRight(BorderStyle.THIN);
        cs_value.setWrapText(true);
        for (int i = 0; i <= cells; i++) {
            sheet.setColumnWidth((short) i, (short) (260 * 15));
        }
        int row_num = 0;
        //1
        Row row_title = sheet.createRow(row_num++);
        row_title.setHeightInPoints(36.75f);
        CellRangeVal(title, row_title, 0, row_num - 1, row_num - 1, 0, cells, sheet, cs_title);
        //2
        if (exporttype.equals("1")) {
            row_title = sheet.createRow(row_num++);
            CellRangeVal("序号", row_title, 0, row_num - 1, row_num, 0, 0, sheet, cs_name);
            CellRangeVal("部门", row_title, 1, row_num - 1, row_num, 1, 1, sheet, cs_name);
            CellRangeVal("问题级别（I/II/III级）", row_title, 2, row_num - 1, row_num - 1, 2, 4, sheet, cs_name);
            CellRangeVal("问题数量", row_title, 5, row_num - 1, row_num, 5, 5, sheet, cs_name);
            CellRangeVal("占比", row_title, 6, row_num - 1, row_num, 6, 6, sheet, cs_name);
            row_title = sheet.createRow(row_num++);
            Cell cell_title = row_title.createCell(2);
            cell_title.setCellValue("一级");
            cell_title.setCellStyle(cs_name);
            cell_title = row_title.createCell(3);
            cell_title.setCellValue("二级");
            cell_title.setCellStyle(cs_name);
            cell_title = row_title.createCell(4);
            cell_title.setCellValue("三级");
            cell_title.setCellStyle(cs_name);
        } else if (exporttype.equals("2")) {
            row_title = sheet.createRow(row_num++);
            CellRangeVal("序号", row_title, 0, row_num - 1, row_num, 0, 0, sheet, cs_name);
            CellRangeVal("部门", row_title, 1, row_num - 1, row_num, 1, 1, sheet, cs_name);
            CellRangeVal("问题类型", row_title, 2, row_num - 1, row_num - 1, 2, 8, sheet, cs_name);
            CellRangeVal("未整改", row_title, 9, row_num - 1, row_num, 9, 9, sheet, cs_name);
            CellRangeVal("已消号", row_title, 10, row_num - 1, row_num, 10, 10, sheet, cs_name);
            CellRangeVal("问题数量", row_title, 11, row_num - 1, row_num, 11, 11, sheet, cs_name);
            CellRangeVal("占比", row_title, 12, row_num - 1, row_num, 12, 12, sheet, cs_name);
            row_title = sheet.createRow(row_num++);
            Cell cell_title = row_title.createCell(2);
            cell_title.setCellValue("电源");
            cell_title.setCellStyle(cs_name);
            cell_title = row_title.createCell(3);
            cell_title.setCellValue("道岔");
            cell_title.setCellStyle(cs_name);
            cell_title = row_title.createCell(4);
            cell_title.setCellValue("轨道电路");
            cell_title.setCellStyle(cs_name);
            cell_title = row_title.createCell(5);
            cell_title.setCellValue("信号机");
            cell_title.setCellStyle(cs_name);
            cell_title = row_title.createCell(6);
            cell_title.setCellValue("电子设备");
            cell_title.setCellStyle(cs_name);
            cell_title = row_title.createCell(7);
            cell_title.setCellValue("电缆绝缘");
            cell_title.setCellStyle(cs_name);
            cell_title = row_title.createCell(8);
            cell_title.setCellValue("其它");
            cell_title.setCellStyle(cs_name);
            cell_title.setCellStyle(cs_name);
        } else if (exporttype.equals("3")) {
            row_title = sheet.createRow(row_num++);
            Cell cell_title = row_title.createCell(0);
            cell_title.setCellValue("序号");
            cell_title.setCellStyle(cs_name);
            cell_title = row_title.createCell(1);
            cell_title.setCellValue("线别");
            cell_title.setCellStyle(cs_name);
            cell_title = row_title.createCell(2);
            cell_title.setCellValue("问题数量");
            cell_title.setCellStyle(cs_name);
            cell_title = row_title.createCell(3);
            cell_title.setCellValue("占比");
            cell_title.setCellStyle(cs_name);
        }

        if (exporttype.equals("1")) {
            List result = jzjcProblemMapper.groupbyLvl2(params);
            if (result.size() > 0) {
                for (int i = 0; i < result.size(); i++) {
                    Map<String, Object> map = (Map<String, Object>) result.get(i);
                    row_title = sheet.createRow(row_num++);
                    Cell cell_title = row_title.createCell(0);
                    cell_title.setCellValue(i + 1);
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(1);
                    cell_title.setCellValue(map.get("WORKSHOPNAME").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(2);
                    cell_title.setCellValue(map.get("I级").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(3);
                    cell_title.setCellValue(map.get("II级").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(4);
                    cell_title.setCellValue(map.get("III级").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(5);
                    cell_title.setCellValue(map.get("C").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(6);
                    cell_title.setCellValue(map.get("PERCENT").toString());
                    cell_title.setCellStyle(cs_value);
                }
            }
        } else if (exporttype.equals("2")) {
            List result = jzjcProblemMapper.groupbyType2(params);
            if (result.size() > 0) {
                for (int i = 0; i < result.size(); i++) {
                    Map<String, Object> map = (Map<String, Object>) result.get(i);
                    row_title = sheet.createRow(row_num++);
                    Cell cell_title = row_title.createCell(0);
                    cell_title.setCellValue(i + 1);
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(1);
                    cell_title.setCellValue(map.get("WORKSHOPNAME").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(2);
                    cell_title.setCellValue(map.get("电源") == null ? "" : map.get("电源").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(3);
                    cell_title.setCellValue(map.get("道岔") == null ? "" : map.get("道岔").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(4);
                    cell_title.setCellValue(map.get("轨道电路") == null ? "" : map.get("轨道电路").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(5);
                    cell_title.setCellValue(map.get("信号机") == null ? "" : map.get("信号机").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(6);
                    cell_title.setCellValue(map.get("电子设备") == null ? "" : map.get("电子设备").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(7);
                    cell_title.setCellValue(map.get("电缆绝缘") == null ? "" : map.get("电缆绝缘").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(8);
                    cell_title.setCellValue(map.get("其他") == null ? "" : map.get("其他").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(9);
                    cell_title.setCellValue(map.get("SUM_PROCESS").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(10);
                    cell_title.setCellValue(map.get("SUM_OVER").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(11);
                    cell_title.setCellValue(map.get("C").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(12);
                    cell_title.setCellValue(map.get("PERCENT").toString());
                    cell_title.setCellStyle(cs_value);
                }
            }
        } else if (exporttype.equals("3")) {
            List result = jzjcProblemMapper.groupbyLine2(params);
            if (result.size() > 0) {
                for (int i = 0; i < result.size(); i++) {
                    Map<String, Object> map = (Map<String, Object>) result.get(i);
                    row_title = sheet.createRow(row_num++);
                    Cell cell_title = row_title.createCell(0);
                    cell_title.setCellValue(i + 1);
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(1);
                    cell_title.setCellValue(map.get("NAME").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(2);
                    cell_title.setCellValue(map.get("C").toString());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(3);
                    cell_title.setCellValue(map.get("PERCENT").toString());
                    cell_title.setCellStyle(cs_value);
                }
            }
        }
    }

    private String formatProblemLevel(String problemLevel) {
        if (problemLevel.equals("I级")) {
            return "1";
        } else if (problemLevel.equals("II级")) {
            return "2";
        } else {
            return "3";
        }
    }

    private void CellRangeVal(String value, Row row, int cell_num, int firstRow, int lastRow, int firstCol,
                              int lastCol, Sheet sheet, CellStyle cs) {
        CellRangeAddress cellRangeAddress = new CellRangeAddress(firstRow, lastRow, firstCol, lastCol);
        sheet.addMergedRegion(cellRangeAddress);
        Cell cell = row.createCell(cell_num);
        cell.setCellValue(value == null ? "" : value);
        cell.setCellStyle(cs);
        RegionUtil.setBorderBottom(BorderStyle.THIN, cellRangeAddress, sheet);
        RegionUtil.setBorderTop(BorderStyle.THIN, cellRangeAddress, sheet);
        RegionUtil.setBorderLeft(BorderStyle.THIN, cellRangeAddress, sheet);
        RegionUtil.setBorderRight(BorderStyle.THIN, cellRangeAddress, sheet);
    }
}
