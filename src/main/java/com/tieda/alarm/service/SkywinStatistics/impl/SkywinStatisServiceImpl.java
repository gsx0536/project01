package com.tieda.alarm.service.SkywinStatistics.impl;

import com.tieda.alarm.entity.SkywinStatistics.SkywinDayStat;
import com.tieda.alarm.entity.SkywinStatistics.SkywinDayStatForm;
import com.tieda.alarm.entity.SkywinStatistics.SkywinDayStatGrid;
import com.tieda.alarm.entity.SkywinStatistics.SkywinDayStatSearch;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.mapper.SkywinStatistics.SkywinStatMapper;
import com.tieda.alarm.service.SkywinStatistics.SkywinStatisService;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SkywinStatisServiceImpl implements SkywinStatisService {

    @Autowired
    SkywinStatMapper skywinStatMapper;

    private Object skywinDayStatMain(SkywinDayStatSearch skywinDayStatSearch, User user) {
        String userOrgLevel = user.getOrgLevel();
        Map<String, Object> result = new HashMap<String, Object>();
        List<SkywinDayStat> result_list = new ArrayList<SkywinDayStat>();
        if (userOrgLevel.equals("50")) {
            //列表数据获取
            SkywinDayStat sg = skywinStatMapper.getSgskywinDayStatSeg(skywinDayStatSearch);
            if (sg == null) {
                sg = new SkywinDayStat();
                sg.setUnit(User.SERVER_ID);
                sg.setOrgName("昆明南电务段");
            }
            SkywinDayStat wx = skywinStatMapper.getWxskywinDayStatSeg(skywinDayStatSearch);
            if (wx != null) {
                sg.setWxTimeCashRate(wx.getWxTimeCashRate());
                sg.setWxTimeCash(wx.getWxTimeCash());
                sg.setWxTime(wx.getWxTime());
                sg.setWxPlanCou(wx.getWxPlanCou());
                sg.setWxPlanCash(wx.getWxPlanCash());
                sg.setWxPlanCashRate(wx.getWxPlanCashRate());
            }
            SkywinDayStat dw = new SkywinDayStat();
            if (skywinDayStatSearch.getWorkdateEnd().equals(skywinDayStatSearch.getWorkdateStart())) {
                dw = skywinStatMapper.getDwDayskywinDayStatSeg(skywinDayStatSearch);
            } else {
                dw = skywinStatMapper.getDwMoredayskywinDayStatSeg(skywinDayStatSearch);
            }
            if (dw != null) {
                sg.setDwTommrowCou(dw.getDwTommrowCou());
                sg.setDwTodayCou(dw.getDwTodayCou());
                sg.setDwCou(dw.getDwCou());
            }
            result_list.add(sg);
            result.put("grid", result_list);
            //表单数据获取
            List<SkywinDayStatForm> nocashinfos = skywinStatMapper.getSkywinDayStatNoCashInfos(skywinDayStatSearch);//未兑现情况
            List<SkywinDayStatForm> thirtyInfos = skywinStatMapper.getSkywinDayStatthirtyInfos(skywinDayStatSearch);//小于30分钟天窗及原因
            List<SkywinDayStatForm> givePointInfosSg = skywinStatMapper.getSkywinDayStatGivePointInfosSg(skywinDayStatSearch);//多、少给点-施工
            List<SkywinDayStatForm> givePointInfosWx = skywinStatMapper.getSkywinDayStatGivePointInfosWx(skywinDayStatSearch);//多、少给点-维修
            Map<String, Object> temp_givePoint = new HashMap<String, Object>();
            temp_givePoint.put("wx", givePointInfosWx);
            temp_givePoint.put("sg", givePointInfosSg);
            Map<String, Object> temp_map = new HashMap<String, Object>();
            temp_map.put("nocashinfos", nocashinfos);//未兑现内容
            temp_map.put("givePointInfos", temp_givePoint);//多、少给点
            temp_map.put("thirtyInfos", thirtyInfos);//小于30分钟天窗及原因
            result.put("info", temp_map);
            return result;
        } else if (userOrgLevel.equals("30")) {
            skywinDayStatSearch.setWorkshop(user.getVcOrgId());
            //列表数据获取
            List<SkywinDayStat> sgs = skywinStatMapper.getSgskywinDayStatCj(skywinDayStatSearch);
            SkywinDayStat sg = new SkywinDayStat();
            if (sgs.size() > 0) {
                sg = sgs.get(0);
            } else {
                sg.setUnit(user.getVcOrgId());
                sg.setOrgName(user.getVcOrgName());
            }
            List<SkywinDayStat> wxs = skywinStatMapper.getWxskywinDayStatCj(skywinDayStatSearch);
            if (wxs.size() > 0) {
                SkywinDayStat wx = wxs.get(0);
                sg.setWxTimeCashRate(wx.getWxTimeCashRate());
                sg.setWxTimeCash(wx.getWxTimeCash());
                sg.setWxTime(wx.getWxTime());
                sg.setWxPlanCou(wx.getWxPlanCou());
                sg.setWxPlanCash(wx.getWxPlanCash());
                sg.setWxPlanCashRate(wx.getWxPlanCashRate());
            }
            List<SkywinDayStat> dws = null;
            SkywinDayStat dw = new SkywinDayStat();
            if (skywinDayStatSearch.getWorkdateEnd().equals(skywinDayStatSearch.getWorkdateStart())) {
                dws = skywinStatMapper.getDwDayskywinDayStatCj(skywinDayStatSearch);
            } else {
                dws = skywinStatMapper.getDwMoredayskywinDayStatCj(skywinDayStatSearch);
            }
            if (dws != null && dws.size() > 0) {
                dw = dws.get(0);
                sg.setDwTommrowCou(dw.getDwTommrowCou());
                sg.setDwTodayCou(dw.getDwTodayCou());
                sg.setDwCou(dw.getDwCou());
            }
            result_list.add(sg);
            result.put("grid", result_list);
            //表单数据获取
            List<SkywinDayStatForm> nocashinfos = skywinStatMapper.getSkywinDayStatNoCashInfos(skywinDayStatSearch);//未兑现情况
            List<SkywinDayStatForm> thirtyInfos = skywinStatMapper.getSkywinDayStatthirtyInfos(skywinDayStatSearch);//小于30分钟天窗及原因
            List<SkywinDayStatForm> givePointInfosSg = skywinStatMapper.getSkywinDayStatGivePointInfosSg(skywinDayStatSearch);//多、少给点-施工
            List<SkywinDayStatForm> givePointInfosWx = skywinStatMapper.getSkywinDayStatGivePointInfosWx(skywinDayStatSearch);//多、少给点-维修
            Map<String, Object> temp_givePoint = new HashMap<String, Object>();
            temp_givePoint.put("wx", givePointInfosWx);
            temp_givePoint.put("sg", givePointInfosSg);
            Map<String, Object> temp_map = new HashMap<String, Object>();
            temp_map.put("nocashinfos", nocashinfos);//未兑现内容
            temp_map.put("givePointInfos", temp_givePoint);//多、少给点
            temp_map.put("thirtyInfos", thirtyInfos);//小于30分钟天窗及原因
            result.put("info", temp_map);
            return result;
        } else {
            skywinDayStatSearch.setWorkarea(user.getVcOrgId());
            //列表数据获取
            List<SkywinDayStat> sgs = skywinStatMapper.getSgskywinDayStatGq(skywinDayStatSearch);
            SkywinDayStat sg = new SkywinDayStat();
            if (sgs.size() > 0) {
                sg = sgs.get(0);
            } else {
                sg.setUnit(user.getVcOrgId());
                sg.setOrgName(user.getVcOrgName());
            }
            List<SkywinDayStat> wxs = skywinStatMapper.getWxskywinDayStatGq(skywinDayStatSearch);
            if (wxs.size() > 0) {
                SkywinDayStat wx = wxs.get(0);
                sg.setWxTimeCashRate(wx.getWxTimeCashRate());
                sg.setWxTimeCash(wx.getWxTimeCash());
                sg.setWxTime(wx.getWxTime());
                sg.setWxPlanCou(wx.getWxPlanCou());
                sg.setWxPlanCash(wx.getWxPlanCash());
                sg.setWxPlanCashRate(wx.getWxPlanCashRate());
            }
            SkywinDayStat dw = new SkywinDayStat();
            List<SkywinDayStat> dws = null;
            if (skywinDayStatSearch.getWorkdateEnd().equals(skywinDayStatSearch.getWorkdateStart())) {
                dws = skywinStatMapper.getDwDayskywinDayStatGq(skywinDayStatSearch);
            } else {
                dws = skywinStatMapper.getDwMoredayskywinDayStatGq(skywinDayStatSearch);
            }
            if (dws != null && dws.size() > 0) {
                dw = dws.get(0);
                sg.setDwTommrowCou(dw.getDwTommrowCou());
                sg.setDwTodayCou(dw.getDwTodayCou());
                sg.setDwCou(dw.getDwCou());
            }
            result_list.add(sg);
            result.put("grid", result_list);
            //表单数据获取
            List<SkywinDayStatForm> nocashinfos = skywinStatMapper.getSkywinDayStatNoCashInfos(skywinDayStatSearch);//未兑现情况
            List<SkywinDayStatForm> thirtyInfos = skywinStatMapper.getSkywinDayStatthirtyInfos(skywinDayStatSearch);//小于30分钟天窗及原因
            List<SkywinDayStatForm> givePointInfosSg = skywinStatMapper.getSkywinDayStatGivePointInfosSg(skywinDayStatSearch);//多、少给点-施工
            List<SkywinDayStatForm> givePointInfosWx = skywinStatMapper.getSkywinDayStatGivePointInfosWx(skywinDayStatSearch);//多、少给点-维修
            Map<String, Object> temp_givePoint = new HashMap<String, Object>();
            temp_givePoint.put("wx", givePointInfosWx);
            temp_givePoint.put("sg", givePointInfosSg);
            Map<String, Object> temp_map = new HashMap<String, Object>();
            temp_map.put("nocashinfos", nocashinfos);//未兑现内容
            temp_map.put("givePointInfos", temp_givePoint);//多、少给点
            temp_map.put("thirtyInfos", thirtyInfos);//小于30分钟天窗及原因
            result.put("info", temp_map);
            return result;
        }
    }

    @Override
    public Object skywinDayStat(SkywinDayStatSearch skywinDayStatSearch, User user) {
        return skywinDayStatMain(skywinDayStatSearch, user);
    }

    @Override
    public Object dayStatExpand(SkywinDayStatSearch skywinDayStatSearch, User user) {
        Map<String, Object> result = new HashMap<String, Object>();
        List<SkywinDayStat> result_list = new ArrayList<SkywinDayStat>();
        String unit = skywinDayStatSearch.getUnit();
        if (unit.equals("KMBUR_KMNSEG")) {//展开段
            List<SkywinDayStat> sgs = skywinStatMapper.getSgskywinDayStatCj(skywinDayStatSearch);
            List<SkywinDayStat> wxs = skywinStatMapper.getWxskywinDayStatCj(skywinDayStatSearch);
            List<SkywinDayStat> dws = new ArrayList<SkywinDayStat>();
            if (skywinDayStatSearch.getWorkdateEnd().equals(skywinDayStatSearch.getWorkdateStart())) {
                dws = skywinStatMapper.getDwDayskywinDayStatCj(skywinDayStatSearch);
            } else {
                dws = skywinStatMapper.getDwMoredayskywinDayStatCj(skywinDayStatSearch);
            }
            result_list = formatedatas(sgs, dws, "sgwxdw");
            result_list = formatedatas(result_list, wxs, "sgwx");
        } else if (skywinStatMapper.getOrgLevel(unit).equals("30")) {//展开车间
            skywinDayStatSearch.setWorkshop(unit);
            List<SkywinDayStat> sgs = skywinStatMapper.getSgskywinDayStatGq(skywinDayStatSearch);
            List<SkywinDayStat> wxs = skywinStatMapper.getWxskywinDayStatGq(skywinDayStatSearch);
            List<SkywinDayStat> dws = new ArrayList<SkywinDayStat>();
            if (skywinDayStatSearch.getWorkdateEnd().equals(skywinDayStatSearch.getWorkdateStart())) {
                dws = skywinStatMapper.getDwDayskywinDayStatGq(skywinDayStatSearch);
            } else {
                dws = skywinStatMapper.getDwMoredayskywinDayStatGq(skywinDayStatSearch);
            }
            result_list = formatedatas(sgs, dws, "sgwxdw");
            result_list = formatedatas(result_list, wxs, "sgwx");
        } else if (skywinStatMapper.getOrgLevel(unit).equals("10")) {//展开工区
            skywinDayStatSearch.setWorkarea(unit);
            List<SkywinDayStat> sgs = skywinStatMapper.getSgskywinDayStatCz(skywinDayStatSearch);
            List<SkywinDayStat> wxs = skywinStatMapper.getWxskywinDayStatCz(skywinDayStatSearch);
            result_list = formatedatas(sgs, wxs, "sgwx");
        }
        result.put("grid", result_list);
        return result;
    }

    /***
     * 天窗日兑现率 - 明细内容查看
     * @param skywinDayStatSearch
     * @return
     */
    @Override
    public List<SkywinDayStatGrid> dayStatDetail(SkywinDayStatSearch skywinDayStatSearch) {
        String unit = skywinDayStatSearch.getUnit();//部门编号
        if (unit != null && unit.equals("KMBUR_KMNSEG")) {
            switch (skywinDayStatSearch.getDetailType()) {
                case "A":
                    return skywinStatMapper.dayStatDetailSgPlanCou(skywinDayStatSearch);
                case "B":
                    return skywinStatMapper.dayStatDetailSgPlanCash(skywinDayStatSearch);
                case "C":
                    return skywinStatMapper.dayStatDetailWxPlanCou(skywinDayStatSearch);
                case "D":
                    return skywinStatMapper.dayStatDetailWxPlanCash(skywinDayStatSearch);
                default:
                    return skywinStatMapper.dayStatDetailDwPlan(skywinDayStatSearch);
            }
        } else if (unit.indexOf("STA") > -1) {//车站
            skywinDayStatSearch.setUnitType("station");
            switch (skywinDayStatSearch.getDetailType()) {
                case "A":
                    return skywinStatMapper.dayStatDetailSgPlanCou(skywinDayStatSearch);
                case "B":
                    return skywinStatMapper.dayStatDetailSgPlanCash(skywinDayStatSearch);
                case "C":
                    return skywinStatMapper.dayStatDetailWxPlanCou(skywinDayStatSearch);
                case "D":
                    return skywinStatMapper.dayStatDetailWxPlanCash(skywinDayStatSearch);
                default:
                    return skywinStatMapper.dayStatDetailDwPlan(skywinDayStatSearch);
            }
        } else if (unit.indexOf("ORG") > -1) {//车间、工区
            if (skywinStatMapper.getOrgLevel(unit).equals("30")) {
                skywinDayStatSearch.setUnitType("workshop");
                switch (skywinDayStatSearch.getDetailType()) {
                    case "A":
                        return skywinStatMapper.dayStatDetailSgPlanCou(skywinDayStatSearch);
                    case "B":
                        return skywinStatMapper.dayStatDetailSgPlanCash(skywinDayStatSearch);
                    case "C":
                        return skywinStatMapper.dayStatDetailWxPlanCou(skywinDayStatSearch);
                    case "D":
                        return skywinStatMapper.dayStatDetailWxPlanCash(skywinDayStatSearch);
                    default:
                        return skywinStatMapper.dayStatDetailDwPlan(skywinDayStatSearch);
                }
            } else {
                skywinDayStatSearch.setUnitType("workarea");
                switch (skywinDayStatSearch.getDetailType()) {
                    case "A":
                        return skywinStatMapper.dayStatDetailSgPlanCou(skywinDayStatSearch);
                    case "B":
                        return skywinStatMapper.dayStatDetailSgPlanCash(skywinDayStatSearch);
                    case "C":
                        return skywinStatMapper.dayStatDetailWxPlanCou(skywinDayStatSearch);
                    case "D":
                        return skywinStatMapper.dayStatDetailWxPlanCash(skywinDayStatSearch);
                    default:
                        return skywinStatMapper.dayStatDetailDwPlan(skywinDayStatSearch);
                }
            }
        }
        return new ArrayList<>();
    }

    /***
     * 天窗日兑现率 - 数据导出
     * @param wb
     * @param skywinDayStatSearch
     * @param sheet
     */
    @Override
    public void exportExc(Workbook wb, SkywinDayStatSearch skywinDayStatSearch, Sheet sheet, User user) throws Exception {
        //样式定义
        CellStyle cs_title = wb.createCellStyle();//标题
        CellStyle cs_name = wb.createCellStyle();//列名
        CellStyle cs_value = wb.createCellStyle();//列值
        CellStyle cs_content = wb.createCellStyle();//大文本框
        //字体定义
        Font title_font = wb.createFont();
        Font name_font = wb.createFont();
        Font value_font = wb.createFont();
        title_font.setFontHeightInPoints((short) 16);
        title_font.setColor(IndexedColors.BLACK.index);
        title_font.setBold(true);
        title_font.setFontName("宋体");
        name_font.setFontHeightInPoints((short) 10);
        name_font.setColor(IndexedColors.BLACK.index);
        name_font.setBold(false);
        name_font.setFontName("宋体");
        value_font.setFontHeightInPoints((short) 10);
        value_font.setColor(IndexedColors.BLACK.index);
        value_font.setBold(false);
        value_font.setFontName("宋体");
        //样式赋值
        cs_title.setFont(title_font);
        cs_title.setBorderLeft(BorderStyle.THIN);
        cs_title.setBorderRight(BorderStyle.THIN);
        cs_title.setBorderTop(BorderStyle.THIN);
        cs_title.setBorderBottom(BorderStyle.THIN);
        cs_title.setAlignment(HorizontalAlignment.CENTER);
        cs_title.setVerticalAlignment(VerticalAlignment.CENTER);
        cs_name.setFont(name_font);
        cs_name.setBorderLeft(BorderStyle.THIN);
        cs_name.setBorderRight(BorderStyle.THIN);
        cs_name.setBorderTop(BorderStyle.THIN);
        cs_name.setBorderBottom(BorderStyle.THIN);
        cs_name.setAlignment(HorizontalAlignment.CENTER);
        cs_name.setVerticalAlignment(VerticalAlignment.CENTER);
        cs_name.setWrapText(true);//自动换行
        cs_value.setFont(value_font);
        cs_value.setBorderLeft(BorderStyle.THIN);
        cs_value.setBorderRight(BorderStyle.THIN);
        cs_value.setBorderTop(BorderStyle.THIN);
        cs_value.setBorderBottom(BorderStyle.THIN);
        cs_value.setAlignment(HorizontalAlignment.CENTER);
        cs_value.setVerticalAlignment(VerticalAlignment.CENTER);
        cs_content.setFont(value_font);
        cs_content.setBorderLeft(BorderStyle.THIN);
        cs_content.setBorderRight(BorderStyle.THIN);
        cs_content.setBorderTop(BorderStyle.THIN);
        cs_content.setBorderBottom(BorderStyle.THIN);
        cs_content.setAlignment(HorizontalAlignment.GENERAL);
        cs_content.setVerticalAlignment(VerticalAlignment.CENTER);
        cs_content.setWrapText(true);//自动换行
        for (int i = 0; i <= 14; i++) {
            sheet.setColumnWidth((short) i, (short) (256 * 13));
        }
        int row_num = 0;
        CellRangeVal("昆明集团公司电务系统天窗日统计（" + skywinDayStatSearch.getWorkdateEnd() + ")",
                row_num++, sheet, wb, cs_title, "0");
        Row row_title = sheet.createRow(row_num++);
        Cell cell_title = row_title.createCell(0);
        cell_title.setCellValue("单位");
        CellRangeAddress c = new CellRangeAddress(row_num - 1, row_num, 0, 0);
        sheet.addMergedRegion(c);
        cell_title.setCellStyle(cs_name);
        //1
        cell_title = row_title.createCell(1);
        c = new CellRangeAddress(row_num - 1, row_num - 1, 1, 6);
        sheet.addMergedRegion(c);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("施工");

        cell_title = row_title.createCell(7);
        c = new CellRangeAddress(row_num - 1, row_num - 1, 7, 12);
        sheet.addMergedRegion(c);
        cell_title.setCellValue("维修");
        cell_title.setCellStyle(cs_name);

        cell_title = row_title.createCell(13);
        c = new CellRangeAddress(row_num - 1, row_num - 1, 13, 14);
        sheet.addMergedRegion(c);
        cell_title.setCellValue("点外");
        cell_title.setCellStyle(cs_name);
        row_title.setRowStyle(cs_name);
        //2
        row_title = sheet.createRow(row_num++);
        cell_title = row_title.createCell(1);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("计划项数");
        cell_title = row_title.createCell(2);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("兑现项数");
        cell_title = row_title.createCell(3);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("兑现率");
        cell_title = row_title.createCell(4);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("计划时间");
        cell_title = row_title.createCell(5);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("兑现时间");
        cell_title = row_title.createCell(6);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("兑现率");
        cell_title = row_title.createCell(7);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("计划项数");
        cell_title = row_title.createCell(8);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("兑现项数");
        cell_title = row_title.createCell(9);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("兑现率");
        cell_title = row_title.createCell(10);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("计划时间");
        cell_title = row_title.createCell(11);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("兑现时间");
        cell_title = row_title.createCell(12);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("兑现率");
        cell_title = row_title.createCell(13);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("今天");
        cell_title = row_title.createCell(14);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("明天");
        Map<String, Object> map = (Map) skywinDayStatMain(skywinDayStatSearch, user);
        List<SkywinDayStat> grids = (List<SkywinDayStat>) map.get("grid");
        SkywinDayStat grid = grids.get(0);
        //3
        row_title = sheet.createRow(row_num++);
        cell_title = row_title.createCell(0);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getOrgName());
        cell_title = row_title.createCell(1);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getSgPlanCou());
        cell_title = row_title.createCell(2);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getSgPlanCash());
        cell_title = row_title.createCell(3);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getSgPlanCashRate());
        cell_title = row_title.createCell(4);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getSgTime());
        cell_title = row_title.createCell(5);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getSgTimeCash());
        cell_title = row_title.createCell(6);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getSgTimeCashRate());
        cell_title = row_title.createCell(7);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getWxPlanCou());
        cell_title = row_title.createCell(8);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getWxPlanCash());
        cell_title = row_title.createCell(9);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getWxPlanCashRate());
        cell_title = row_title.createCell(10);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getWxTime());
        cell_title = row_title.createCell(11);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getWxTimeCash());
        cell_title = row_title.createCell(12);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getWxTimeCashRate());
        cell_title = row_title.createCell(13);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getDwTodayCou());
        cell_title = row_title.createCell(14);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getDwTommrowCou());
        //4
        row_title = sheet.createRow(row_num++);
        cell_title = row_title.createCell(0);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue("合计");
        cell_title = row_title.createCell(1);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getSgPlanCou());
        cell_title = row_title.createCell(2);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getSgPlanCash());
        cell_title = row_title.createCell(3);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getSgPlanCashRate());
        cell_title = row_title.createCell(4);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getSgTime());
        cell_title = row_title.createCell(5);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getSgTimeCash());
        cell_title = row_title.createCell(6);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getSgTimeCashRate());
        cell_title = row_title.createCell(7);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getWxPlanCou());
        cell_title = row_title.createCell(8);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getWxPlanCash());
        cell_title = row_title.createCell(9);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getWxPlanCashRate());
        cell_title = row_title.createCell(10);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getWxTime());
        cell_title = row_title.createCell(11);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getWxTimeCash());
        cell_title = row_title.createCell(12);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getWxTimeCashRate());
        cell_title = row_title.createCell(13);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getDwTodayCou());
        cell_title = row_title.createCell(14);
        cell_title.setCellStyle(cs_value);
        cell_title.setCellValue(grid.getDwTommrowCou());
        //5
        row_title = sheet.createRow(row_num++);
        cell_title = row_title.createCell(0);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("未兑现");
        c = new CellRangeAddress(row_num - 1, row_num - 1, 1, 14);
        sheet.addMergedRegion(c);
        cell_title = row_title.createCell(1);
        Map<String, Object> temp_map = (Map<String, Object>) map.get("info");
        List<SkywinDayStatForm> nocashinfos = (List<SkywinDayStatForm>) temp_map.get("nocashinfos");
        String nocashinfosStr = "";
        if (nocashinfos.size() > 0) {
            for (int i = 0; i < nocashinfos.size(); i++) {
                nocashinfosStr += (i + 1) + "." + nocashinfos.get(i).getStatoin() + "\r\n";
            }
        }
        cell_title.setCellValue(new HSSFRichTextString(nocashinfosStr));
        cell_title.setCellStyle(cs_content);
        row_title.setRowStyle(cs_content);
        enterCntSetHeight(row_title);
        //6
        row_title = sheet.createRow(row_num++);
        cell_title = row_title.createCell(0);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("多、少给点");
        c = new CellRangeAddress(row_num - 1, row_num - 1, 1, 14);
        sheet.addMergedRegion(c);
        cell_title = row_title.createCell(1);
        Map<String, Object> temp_amp1 = (Map<String, Object>) temp_map.get("givePointInfos");
        String givePointInfosStr = "";
        List<SkywinDayStatForm> sgs = (List<SkywinDayStatForm>) temp_amp1.get("sg");
        List<SkywinDayStatForm> wxs = (List<SkywinDayStatForm>) temp_amp1.get("wx");
        if (sgs.size() > 0) {
            givePointInfosStr += "施工：";
            for (SkywinDayStatForm sg : sgs) {
                int nums = sg.getNums();
                givePointInfosStr += sg.getStatoin() + (nums > 0 ? "+" + nums : "-" + nums) + "、";
            }
        }
        if (wxs.size() > 0) {
            givePointInfosStr += "\r\n" + "维修：" + "\r\n";
            String oneLevel = "I级：";
            String twoLevel = "\r\n" + "II级：";
            for (SkywinDayStatForm wx : wxs) {
                int nums = wx.getNums();
                String workLevel = wx.getWorkLevel();
                if (workLevel.equals("Ⅰ")) {
                    oneLevel += wx.getStatoin() + (nums > 0 ? "+" + nums : "-" + nums) + "、";
                } else {
                    twoLevel += wx.getStatoin() + (nums > 0 ? "+" + nums : "-" + nums) + "、";
                }
            }
            givePointInfosStr += oneLevel + twoLevel;
        }
        cell_title.setCellValue(givePointInfosStr);
        cell_title.setCellStyle(cs_content);
        row_title.setRowStyle(cs_content);
        enterCntSetHeight(row_title);
        //7
        row_title = sheet.createRow(row_num++);
        cell_title = row_title.createCell(0);
        cell_title.setCellStyle(cs_name);
        cell_title.setCellValue("小于30分钟天窗及原因");
        c = new CellRangeAddress(row_num - 1, row_num - 1, 1, 14);
        sheet.addMergedRegion(c);
        cell_title = row_title.createCell(1);
        List<SkywinDayStatSearch> thirtyInfos = (List<SkywinDayStatSearch>) temp_map.get("thirtyInfos");
        String thirtyInfosStr = "";
        if (thirtyInfos.size() > 0) {
            for (int i = 0; i < thirtyInfos.size(); i++) {
                thirtyInfosStr += i + "." + thirtyInfos.get(i).getStation() + "\r\n";
            }
        }
        cell_title.setCellValue(thirtyInfosStr);
        cell_title.setCellStyle(cs_content);
        row_title.setRowStyle(cs_content);
        enterCntSetHeight(row_title);
    }

    /***
     * 两个集合的数据融合
     * @param alist sg或者wx
     * @param blist wx或者dw
     * @param formateType 融合类型
     * @return
     */
    private List<SkywinDayStat> formatedatas(List<SkywinDayStat> alist, List<SkywinDayStat> blist, String formateType) {
        List<SkywinDayStat> clist = new ArrayList<SkywinDayStat>();
        if (formateType.equals("sgwx")) {//默认匹配维修
            for (SkywinDayStat a : alist) {
                for (SkywinDayStat b : blist) {
                    if (a.getUnit().equals(b.getUnit())) {
                        a.setWxPlanCou(b.getWxPlanCou());
                        a.setWxPlanCash(b.getWxPlanCash());
                        a.setWxPlanCashRate(b.getWxPlanCashRate());
                        a.setWxTime(b.getWxTime());
                        a.setWxTimeCash(b.getWxTimeCash());
                        a.setWxTimeCashRate(b.getWxTimeCashRate());
                        break;//匹配完成上就跳出
                    }
                }
                clist.add(a);
            }
            int k = 0;
            for (SkywinDayStat b : blist) {
                for (int j = 0; j < alist.size(); j++) {
                    if (!alist.get(j).getUnit().equals(b.getUnit())) {
                        k++;
                    }
                }
                if (k == alist.size()) {
                    clist.add(b);
                }
                k = 0;
            }
        } else if (formateType.equals("sgwxdw")) {//默认匹配点外
            for (SkywinDayStat a : alist) {
                for (SkywinDayStat b : blist) {
                    if (a.getUnit().equals(b.getUnit())) {
                        a.setDwCou(b.getDwCou());
                        a.setDwTodayCou(b.getDwTodayCou());
                        a.setDwTommrowCou(b.getDwTommrowCou());
                        break;//匹配完上就跳出
                    }
                }
                clist.add(a);
            }
            int k = 0;
            for (SkywinDayStat b : blist) {
                for (int j = 0; j < alist.size(); j++) {
                    if (!alist.get(j).getUnit().equals(b.getUnit())) {
                        k++;
                    }
                }
                if (k == alist.size()) {
                    clist.add(b);
                }
                k = 0;
            }
        }
        return clist;
    }

    private void CellRangeVal(String value, int row_num, Sheet sheet, Workbook wb, CellStyle cs, String isTitle) {
        CellRangeAddress cellRangeAddress = new CellRangeAddress(row_num, row_num, 0, 14);
        sheet.addMergedRegion(cellRangeAddress);
        Row row = sheet.createRow(row_num++);
        if (isTitle != null && isTitle.equals("0")) {
            row.setHeightInPoints(50);
        } else {
            row.setHeightInPoints(30);
        }
        Cell cell = row.createCell(0);
        cell.setCellValue(value == null ? "" : value);
        cell.setCellStyle(cs);
        RegionUtil.setBottomBorderColor(1, cellRangeAddress, sheet);
        RegionUtil.setLeftBorderColor(1, cellRangeAddress, sheet); // 左边框
        RegionUtil.setRightBorderColor(1, cellRangeAddress, sheet); // 有边框
        RegionUtil.setTopBorderColor(1, cellRangeAddress, sheet); // 上边框

    }

    private void enterCntSetHeight(Row row) {
        int enterCnt = 0;
        int colIdxOfMaxCnt = 1;
        for (int j = 0; j <= 14; j++) {
            if (row.getCell(j) != null) {
                int rwsTemp = row.getCell(j).toString().split("\r\n").length;
                if (rwsTemp > enterCnt) {
                    enterCnt = rwsTemp;
                    colIdxOfMaxCnt = j;
                }
            }
        }
        if (enterCnt == 0 || enterCnt == 1) {
            row.setHeightInPoints((short) 30f);
        } else {
            row.setHeightInPoints((short) (enterCnt * 23f));
        }
    }
}
