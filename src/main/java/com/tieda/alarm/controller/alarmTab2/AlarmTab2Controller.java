package com.tieda.alarm.controller.alarmTab2;

import com.alibaba.fastjson.JSON;
import com.github.abel533.echarts.*;
import com.github.abel533.echarts.code.Orient;
import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.code.Y;
import com.github.abel533.echarts.data.Data;
import com.github.abel533.echarts.series.Pie;
import com.github.abel533.echarts.style.ItemStyle;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tieda.alarm.constants.EchartsConstants;
import com.tieda.alarm.entity.alarmTab2.AlarmTab2;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.service.alarmTab2.IAlarmTab2Service;
import com.tieda.alarm.util.IdWorker;
import com.tieda.alarm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author
 * @since 2019-05-18
 */
@RestController
@RequestMapping("/alarmTab2")
public class AlarmTab2Controller {


    @Autowired
    IAlarmTab2Service iAlarmTab2Service;
    @Autowired
    IdWorker idWorker;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}")
    public ResponseData getAlarmTab2ById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            AlarmTab2 obj = iAlarmTab2Service.getAlarmTab2ById(id);
            responseData = ResponseData.okData(obj);   // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    @GetMapping("/alarmScore")
    public ResponseData alarmScore(@RequestParam Map<String, Object> params) {
        List<AlarmTab2> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    //
                int pageNo = 1;
                int pageSize = 10;
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iAlarmTab2Service.alarmScore(params);
                count = pageInfo.getTotal();
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);
                try {
                    objList = iAlarmTab2Service.alarmScore(params);
                }catch(Exception e){
                    e.printStackTrace();
                }
                count = pageInfo.getTotal();
            }

            responseData = ResponseData.okData(objList, count);  // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();                    // 处理失败
        }
        return responseData;
    }

    /**
     * 查询对象列表信息
     *
     * @param params 请求参数
     * @return
     */
    @GetMapping("/query")
    public ResponseData getAlarmTab2List(HttpServletRequest request,@RequestParam Map<String, Object> params) {
        User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
        if("KMBUR_KMNSEG_ORG_48".equals(user.getVcOrgId())||"KMBUR_KMNSEG_ORG_48".equals(user.getVcParOrgId())){
            params.remove("userlevel");
        }
        List<AlarmTab2> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    //
                int pageNo = 1;
                int pageSize = 10;
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iAlarmTab2Service.getAlarmTab2List(params);
                count = pageInfo.getTotal();
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);
                try {
                    objList = iAlarmTab2Service.getAlarmTab2List(params);
                }catch(Exception e){
                    e.printStackTrace();
                }
                count = pageInfo.getTotal();
            }

            responseData = ResponseData.okData(objList, count);  // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();                    // 处理失败
        }
        return responseData;
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     * @return
     */
    @PostMapping("/add")
    public ResponseData addAlarmTab2(@RequestBody AlarmTab2 obj) {

        ResponseData responseData = null;
        try {
            //obj.setnId(String.valueOf(idWorker.nextId()));
            iAlarmTab2Service.addAlarmTab2(obj);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;

    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     * @return
     */
    @PostMapping("/addBatch")
    public ResponseData addBatchAlarmTab2(@RequestBody List<AlarmTab2> list) {
        ResponseData responseData = null;
        try {
            iAlarmTab2Service.addBatchAlarmTab2(list);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     * @return
     */
    @PostMapping("/update")
    public ResponseData updateAlarmTab2(@RequestBody AlarmTab2 obj) {
        ResponseData responseData = null;
        try {
            iAlarmTab2Service.updateAlarmTab2(obj);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     * @return
     */
    @PostMapping("/updateBatch")
    public ResponseData updateBatchAlarmTab2(@RequestBody List<AlarmTab2> list) {
        ResponseData responseData = null;
        try {
            iAlarmTab2Service.updateBatchAlarmTab2(list);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     * @return
     */
    @PostMapping("/delete/{id}")
    public ResponseData deleteAlarmTab2ById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            iAlarmTab2Service.deleteAlarmTab2ById(id);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @PostMapping("/deleteBatch")
    public ResponseData deleteBatchAlarmTab2(@RequestBody List<Long> ids) {
        ResponseData responseData = null;
        try {
            iAlarmTab2Service.deleteBatchAlarmTab2(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     *
     */
    @GetMapping("/viewTest")

    public String test() {
        String result = "";
        ItemStyle dataStyle = new ItemStyle();
        dataStyle.normal().label(new Label().show(false)).labelLine().show(false);

        ItemStyle placeHolderStyle = new ItemStyle();
        placeHolderStyle.normal().color("rgba(0,0,0,0)").label(new Label().show(false)).labelLine().show(false);
        placeHolderStyle.emphasis().color("rgba(0,0,0,0)");

        Option option = new Option();
        option.title().text("你幸福吗？")
                .subtext("From ExcelHome")
                .sublink("http://e.weibo.com/1341556070/AhQXtjbqh")
                .x(X.center)
                .y(Y.center)
                .itemGap(20)
                .textStyle().color("rgba(30,144,255,0.8)")
                .fontFamily("微软雅黑")
                .fontSize(35)
                .fontWeight("bolder");
        option.tooltip().show(true).formatter("{a} <br/>{b} : {c} ({d}%)");
        option.legend().orient(Orient.vertical)
                .x("(function(){return document.getElementById('main').offsetWidth / 2;})()")
                .y(56)
                .itemGap(12)
                .data("68%的人表示过的不错", "29%的人表示生活压力很大", "3%的人表示“我姓曾”");
        option.toolbox().show(true).feature(Tool.mark, Tool.dataView, Tool.restore, Tool.saveAsImage);

        Pie p1 = new Pie("1");
        p1.clockWise(false).radius(125, 150).itemStyle(dataStyle)
                .data(new Data("68%的人表示过的不错", 68), new Data("invisible", 32).itemStyle(placeHolderStyle));

        Pie p2 = new Pie("2");
        p2.clockWise(false).radius(100, 125).itemStyle(dataStyle)
                .data(new Data("29%的人表示生活压力很大", 29), new Data("invisible", 71).itemStyle(placeHolderStyle));

        Pie p3 = new Pie("3");
        p3.clockWise(false).radius(75, 100).itemStyle(dataStyle)
                .data(new Data("3%的人表示“我姓曾”", 3), new Data("invisible", 97).itemStyle(placeHolderStyle));

        option.series(p1, p2, p3);
        ResponseData responseData = null;
        try {
            responseData = ResponseData.okData(option);  // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();                    // 处理失败
        } finally {
            result = JSON.toJSONString(responseData);
            return result;
        }

    }


    /*//按每个报警类型的数量画一个饼图
    @GetMapping("/groupbyAlarmType")
    public String groupbyAlarmType(@RequestParam Map<String, Object> params) {
        List<Map> list = iAlarmTab2Service.groupbyAlarmType(params);
        Map dataMap=new HashMap();
        List dataList=new ArrayList();
        for(Map m:list){
            String alarmtypename=(String)m.get("ALARMTYPENAME");
            String c=m.get("C").toString();
            Data data=new Data(alarmtypename,c);
            dataList.add(data);
        }
        dataMap.put("data",dataList);
        Option option=EchartsConstants.create("pie",dataMap);
        return JSON.toJSONString(option);
    }*/

    //统计周期内每个车站报警总数做一个条状图，显示报警最多的20的车站
    @GetMapping("/groupbyStation")
    public String groupbyStation(@RequestParam Map<String, Object> params) {
        List<Map> list = iAlarmTab2Service.groupbyStation(params);
        Map dataMap=new HashMap();
        List dataList=new ArrayList();
        List xList=new ArrayList();
        for(Map m:list){
            String stationname=(String)m.get("STATIONNAME");
            String c=m.get("C").toString();
            dataList.add(c);
            xList.add(stationname);
        }
        dataMap.put("data",dataList);
        dataMap.put("text",xList);
        Option option=EchartsConstants.create("bar",dataMap);
        return JSON.toJSONString(option);
    }
    //按日期 统计每天的报警数量，画一个折线图
    @GetMapping("/groupbyTime")
    public String groupbyTime(@RequestParam Map<String, Object> params) {
        List<Map> list = iAlarmTab2Service.groupbyTime(params);
        Map dataMap=new HashMap();
        List dataList=new ArrayList();
        List xList=new ArrayList();
        for(Map m:list){
            String date=m.get("TIME").toString().substring(0,10);
            String c=m.get("C").toString();
            dataList.add(c);
            xList.add(date);
        }
        dataMap.put("data",dataList);
        dataMap.put("text",xList);
        Option option=EchartsConstants.create("line",dataMap);
        return JSON.toJSONString(option);
    }


    @PostMapping("/charts")
    public String charts(@RequestBody Map<String, Object> params) {
        Map dataMap=new HashMap();
        List dataList=new ArrayList();
        List xList=new ArrayList();
        String type=(String)params.get("type");
        String groupby=(String)params.get("groupby");
        List<Map> list=new ArrayList();
        if(groupby.equals("workarea")){//工区分组
            list=iAlarmTab2Service.chartsWorkarea(params);
        }else if(groupby.equals("workshop")){//车间分组
            list=iAlarmTab2Service.chartsWorkshop(params);
        }else if(groupby.equals("devtype")){//设备类型分组
            list=iAlarmTab2Service.chartsDevTypeName(params);
        }else if(groupby.equals("station")){//车站分组
            list=iAlarmTab2Service.chartsStationName(params);
        }else if(groupby.equals("utime")){//时间分组
            list=iAlarmTab2Service.chartsUTime(params);
        }else if(groupby.equals("devname")){//设备名称分组

        }else{
            list = iAlarmTab2Service.charts(params);
        }

        if("pie".equals(type)){
            for(Map m:list){
                String g=(String)m.get("G");
                String c=m.get("C").toString();
                Data data=new Data(g,c);
                dataList.add(data);
            }
        }else{
            for(Map m:list){
                String g=(String)m.get("G");
                String c=m.get("C").toString();
                dataList.add(c);
                xList.add(g);
            }
        }

        dataMap.put("data",dataList);
        dataMap.put("text",xList);
        Option option=EchartsConstants.create(type,dataMap);
        return JSON.toJSONString(option);
    }

    //综合分析
    @GetMapping("/alarmAnalyse")
    public ResponseData alarmAnalyse(@RequestParam Map<String, Object> params) {
        ResponseData responseData = null;
        List list=new ArrayList();
        String type=(String)params.get("type");
        if("workshop".equals(type)){ //统计车间
            list=iAlarmTab2Service.analyseWorkshop(params);
        }else if("line".equals(type)){ //统计线路
            list=iAlarmTab2Service.analyseLine(params);
        }else if("stationworkshop".equals(type)){//车间统计车站
            list=iAlarmTab2Service.analyseStationByWorkshop(params);
        }else if("stationline".equals(type)){//线路统计车站
            list=iAlarmTab2Service.analyseStationByLine(params);
        }else if("devtype".equals(type)){ //统计设备类型
            list=iAlarmTab2Service.analyseDevType(params);
        }else if("dev".equals(type)){ //统计设备
            list=iAlarmTab2Service.analyseDev(params);
        }else if("alarmtype".equals(type)){//统计设备报警类型
            list=iAlarmTab2Service.analyseAlarmType(params);
        }
        responseData = ResponseData.okData(list);
        return responseData;
    }

    //综合时间分析
    @GetMapping("/alarmAnalyseByTime")
    public ResponseData alarmAnalyseByTime(@RequestParam Map<String, Object> params) {
        ResponseData responseData = null;
        List list=new ArrayList();
        list=iAlarmTab2Service.alarmAnalyseByTime(params);
        responseData = ResponseData.okData(list);
        return responseData;
    }

    //智能报警设备，预警
    @GetMapping("/alarmDev")
    public ResponseData alarmDev(@RequestParam Map<String, Object> params) {
        ResponseData responseData = null;
        List list=iAlarmTab2Service.alarmDev(params);
        responseData = ResponseData.okData(list);
        return responseData;
    }

    //智能报警时间，预警
    @GetMapping("/alarmTime")
    public ResponseData alarmTime(@RequestParam Map<String, Object> params) {
        ResponseData responseData = null;
        List list=iAlarmTab2Service.alarmTime(params);
        responseData = ResponseData.okData(list);
        return responseData;
    }


    //报警原因分组
    @GetMapping("/groupByAlarmType")
    public ResponseData groupByAlamrType(@RequestParam Map<String, Object> params) {
        ResponseData responseData = null;
        List list=iAlarmTab2Service.groupByAlarmType(params);
        responseData = ResponseData.okData(list);
        return responseData;
    }

}
