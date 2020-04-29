package com.tieda.alarm.service.SkywinStatistics.impl;

import com.tieda.alarm.entity.SkywinStatistics.SkywinDayStatGrid;
import com.tieda.alarm.entity.SkywinStatistics.SkywinMonthStat;
import com.tieda.alarm.mapper.SkywinStatistics.SkywinStatMonthMapper;
import com.tieda.alarm.service.SkywinStatistics.SkywinStatMonthService;
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
public class SkywinStatMonthServiceImpl implements SkywinStatMonthService {

    @Autowired
    SkywinStatMonthMapper skywinStatMonthMapper;

    /***
     * 天窗修申请及兑现情况统计月表
     * @param monthStr 月份 yyyy-MM 2019-11
     * @return
     */
    @Override
    public Object monthStat(String monthStr) {

        return monthStatMain(monthStr);
    }

    /***
     *天窗月度兑现率统计
     * @param monthStr
     * @return
     */
    private Object monthStatMain(String monthStr) {
        List<SkywinMonthStat> result = new ArrayList<SkywinMonthStat>();
        Map map = new HashMap();
        map.put("monthStr", monthStr);
        List<SkywinMonthStat> applys = skywinStatMonthMapper.skywinStatMonthForApply(map);
        List<SkywinMonthStat> plans = skywinStatMonthMapper.skywinStatMonthForPlan(map);
        for (SkywinMonthStat apply : applys) {
            for (SkywinMonthStat plan : plans) {
                if (apply.getSkywinType().equals(plan.getSkywinType())
                        && apply.getLine().equals(plan.getLine())) {
                    apply.setPlanCash(plan.getPlanCash());
                    apply.setPlanCashRate(plan.getPlanCashRate());
                    apply.setPlanCount(plan.getPlanCount());

                    apply.setPlanTime(plan.getPlanTime());
                    apply.setPlanCashTime(plan.getPlanCashTime());
                    apply.setPlanCashTimeRate(plan.getPlanCashTimeRate());
                    break;//匹配完成上就跳出
                }
            }
            result.add(apply);
        }
        int k = 0;
        for (SkywinMonthStat b : plans) {
            for (int j = 0; j < applys.size(); j++) {
                if ((!applys.get(j).getSkywinType().equals(b.getSkywinType()))
                        && (!applys.get(j).getLine().equals(b.getLine()))) {
                    k++;
                }
            }
            if (k == applys.size()) {
                result.add(b);
            }
            k = 0;
        }
        return result;
    }

    /***
     * 月统计查看明细内容
     * @param skywinType
     * @param line
     * @param detailType A B C D
     * @param monthStr
     * @return
     */
    public List<SkywinDayStatGrid> monthStatDetail(String skywinType, String line, String detailType, String monthStr) {
        String skywinTypes = skywinType.equals("综合天窗") ? "V,X,V型,其它,Q,X,A" : "U";
        String zhOrcz = skywinType.equals("综合天窗") ? "zh" : "cz";
        String[] skywinTypss2 = skywinTypes.split(",");
        Map map = new HashMap<>();
        if (skywinType.equals("小计") || skywinType.equals("总计")) {
            skywinTypss2 = null;
        }
        if (line.equals("小计") || line.equals("总计")) {
            line = "";
        }
        map.put("skywinType", skywinTypss2);
        //A和B对应的是施工平台的数据 需要对线路进行转换
        if (detailType.equals("A") || detailType.equals("B")) {
            map.put("line", for_route(line));
        } else {
            map.put("line", line);
        }
        map.put("monthStr", monthStr);
        map.put("zhOrcz", zhOrcz);
        switch (detailType) {
            case "A":
                return skywinStatMonthMapper.monthStatDetailApplyC(map);//申请计划数量
            case "B":
                return skywinStatMonthMapper.monthStatDetailinPlan(map);//正式列入计划数量
            case "C":
                return skywinStatMonthMapper.monthStatDetailPlanC(map);//计划数量
            default:
                return skywinStatMonthMapper.monthStatDetailCashC(map);//计划兑现数量
        }
    }

    /***
     * 天窗修申请及兑现情况统计月表 导出
     * @param monthStr
     * @return
     */
    @Override
    public void monthStatExport(Workbook wb, Sheet sheet, String monthStr) {
        //定义字体
        Font f_title = wb.createFont();
        Font f_title_child = wb.createFont();
        Font f_title2 = wb.createFont();
        Font f_name = wb.createFont();
        Font f_value = wb.createFont();
        f_title.setBold(true);
        f_title.setFontHeightInPoints((short) 23.25f);
        f_title.setFontName("宋体");
        f_title.setColor(IndexedColors.BLACK.index);
        f_title_child.setBold(false);
        f_title_child.setFontHeightInPoints((short) 10);
        f_title_child.setFontName("宋体");
        f_title_child.setColor(IndexedColors.BLACK.index);


        f_title2.setBold(true);
        f_title2.setFontHeightInPoints((short) 19.5f);
        f_title2.setFontName("宋体");
        f_title2.setColor(IndexedColors.BLACK.index);
        f_name.setBold(false);
        f_name.setFontHeightInPoints((short) 14.25f);
        f_name.setFontName("宋体");
        f_name.setColor(IndexedColors.BLACK.index);
        f_value.setBold(false);
        f_value.setFontHeightInPoints((short) 14.25f);
        f_value.setFontName("宋体");
        f_value.setColor(IndexedColors.BLACK.index);
        //定义样式
        CellStyle cs_title = wb.createCellStyle();
        CellStyle cs_title_chile = wb.createCellStyle();
        CellStyle cs_title2 = wb.createCellStyle();
        CellStyle cs_name = wb.createCellStyle();
        CellStyle cs_value = wb.createCellStyle();

        cs_title.setFont(f_title);
        cs_title.setAlignment(HorizontalAlignment.CENTER);
        cs_title.setVerticalAlignment(VerticalAlignment.CENTER);
        cs_title.setBorderBottom(BorderStyle.THIN);
        cs_title.setBorderTop(BorderStyle.THIN);

        cs_title_chile.setFont(f_title_child);
        cs_title_chile.setAlignment(HorizontalAlignment.CENTER);
        cs_title_chile.setVerticalAlignment(VerticalAlignment.CENTER);
        cs_title_chile.setBorderBottom(BorderStyle.THIN);
        cs_title_chile.setBorderTop(BorderStyle.THIN);

        cs_title2.setFont(f_title2);
        cs_title2.setAlignment(HorizontalAlignment.CENTER);
        cs_title2.setVerticalAlignment(VerticalAlignment.CENTER);
        cs_title2.setBorderBottom(BorderStyle.THIN);
        cs_title2.setBorderTop(BorderStyle.THIN);
        cs_title2.setBorderLeft(BorderStyle.THIN);
        cs_title2.setBorderRight(BorderStyle.THIN);
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

        for (int i = 0; i <= 15; i++) {
            sheet.setColumnWidth((short) i, (short) (256 * 10));
        }
        int row_num = 0;
        //1
        Row row_title = sheet.createRow(row_num++);
        CellRangeVal("昆明局电务天窗修申请及兑现情况统计表", row_title, 0, row_num - 1, row_num - 1, 0, 12, sheet, cs_title);
        CellRangeVal("电信统表12", row_title, 13, row_num - 1, row_num - 1, 13, 15, sheet, cs_title_chile);
        //2
        row_title = sheet.createRow(row_num++);
        String dateStr = monthStr.substring(0, 4) + "年" + monthStr.substring(4, 6) + "月";
        CellRangeVal("填报单位: 昆明南电务段                               " + dateStr + "  ", row_title, 0, row_num - 1, row_num - 1, 0, 15, sheet, cs_title2);
        //3
        row_title = sheet.createRow(row_num++);
        CellRangeVal("天窗类型", row_title, 0, row_num - 1, row_num + 1, 0, 0, sheet, cs_name);
        CellRangeVal("段名", row_title, 1, row_num - 1, row_num + 1, 1, 1, sheet, cs_name);
        CellRangeVal("线别", row_title, 2, row_num - 1, row_num + 1, 2, 2, sheet, cs_name);
        CellRangeVal("申请兑现情况", row_title, 3, row_num - 1, row_num - 1, 3, 8, sheet, cs_name);
        CellRangeVal("计划兑现情况", row_title, 9, row_num - 1, row_num - 1, 9, 14, sheet, cs_name);
        CellRangeVal("天窗兑现情况及未完成原因分析", row_title, 15, row_num - 1, row_num + 1, 15, 15, sheet, cs_name);
        //4
        row_title = sheet.createRow(row_num++);
        CellRangeVal("次数", row_title, 3, row_num - 1, row_num - 1, 3, 5, sheet, cs_value);
        CellRangeVal("次数", row_title, 6, row_num - 1, row_num - 1, 6, 8, sheet, cs_value);
        CellRangeVal("次数", row_title, 9, row_num - 1, row_num - 1, 9, 11, sheet, cs_value);
        CellRangeVal("时间（分钟）", row_title, 12, row_num - 1, row_num - 1, 12, 14, sheet, cs_value);
        //5
        row_title = sheet.createRow(row_num++);
        Cell cell_title = row_title.createCell(3);
        cell_title.setCellValue("申请");
        cell_title.setCellStyle(cs_name);
        cell_title = row_title.createCell(4);
        cell_title.setCellValue("列入计划");
        cell_title.setCellStyle(cs_name);
        cell_title = row_title.createCell(5);
        cell_title.setCellValue("兑现率");
        cell_title.setCellStyle(cs_name);
        cell_title = row_title.createCell(6);
        cell_title.setCellValue("申请");
        cell_title.setCellStyle(cs_name);
        cell_title = row_title.createCell(7);
        cell_title.setCellValue("列入计划");
        cell_title.setCellStyle(cs_name);
        cell_title = row_title.createCell(8);
        cell_title.setCellValue("兑现率");
        cell_title.setCellStyle(cs_name);
        cell_title = row_title.createCell(9);
        cell_title.setCellValue("计划");
        cell_title.setCellStyle(cs_name);
        cell_title = row_title.createCell(10);
        cell_title.setCellValue("兑现");
        cell_title.setCellStyle(cs_name);
        cell_title = row_title.createCell(11);
        cell_title.setCellValue("兑现率");
        cell_title.setCellStyle(cs_name);
        cell_title = row_title.createCell(12);
        cell_title.setCellValue("计划");
        cell_title.setCellStyle(cs_name);
        cell_title = row_title.createCell(13);
        cell_title.setCellValue("兑现");
        cell_title.setCellStyle(cs_name);
        cell_title = row_title.createCell(14);
        cell_title.setCellValue("兑现率");
        cell_title.setCellStyle(cs_name);
        //6
        List<SkywinMonthStat> datas = (List<SkywinMonthStat>) monthStatMain(monthStr);
        List<SkywinMonthStat> czdatas = new ArrayList<SkywinMonthStat>();
        List<SkywinMonthStat> zhdatas = new ArrayList<SkywinMonthStat>();
        SkywinMonthStat total = new SkywinMonthStat();//合计对象
        if (datas.size() > 0) {
            for (int i = 0; i < datas.size(); i++) {
                SkywinMonthStat skywinMonthStat = datas.get(i);
                if (skywinMonthStat.getSkywinType().equals("综合天窗")) {
                    zhdatas.add(skywinMonthStat);
                } else if (skywinMonthStat.getSkywinType().equals("垂直天窗")) {
                    czdatas.add(skywinMonthStat);
                } else {
                    total = skywinMonthStat;
                }
            }
        }
        if (zhdatas.size() > 0) {
            row_title = sheet.createRow(row_num++);
            CellRangeVal("综合天窗", row_title, 0, row_num - 1, row_num + (zhdatas.size() - 2), 0, 0, sheet, cs_value);
            CellRangeVal("昆明局", row_title, 1, row_num - 1, row_num + (zhdatas.size() - 2), 1, 1, sheet, cs_value);
            cell_title = row_title.createCell(2);
            cell_title.setCellValue(zhdatas.get(0).getLine());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(3);
            cell_title.setCellValue(zhdatas.get(0).getApplyCount());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(4);
            cell_title.setCellValue(zhdatas.get(0).getApplyInplanCount());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(5);
            cell_title.setCellValue(zhdatas.get(0).getApplyCountRate());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(6);
            cell_title.setCellValue(zhdatas.get(0).getApplyTime());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(7);
            cell_title.setCellValue(zhdatas.get(0).getApplyInplanTime());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(8);
            cell_title.setCellValue(zhdatas.get(0).getApplyTimeRate());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(9);
            cell_title.setCellValue(zhdatas.get(0).getPlanCount());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(10);
            cell_title.setCellValue(zhdatas.get(0).getPlanCash());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(11);
            cell_title.setCellValue(zhdatas.get(0).getPlanCashRate());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(12);
            cell_title.setCellValue(zhdatas.get(0).getPlanTime());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(13);
            cell_title.setCellValue(zhdatas.get(0).getPlanCashTime());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(14);
            cell_title.setCellValue(zhdatas.get(0).getPlanCashTimeRate());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(15);
            cell_title.setCellValue("");
            cell_title.setCellStyle(cs_value);
            if (zhdatas.size() > 1) {
                for (int i = 1; i < zhdatas.size(); i++) {
                    row_title = sheet.createRow(row_num++);
                    cell_title = row_title.createCell(2);
                    cell_title.setCellValue(zhdatas.get(i).getLine());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(3);
                    cell_title.setCellValue(zhdatas.get(i).getApplyCount());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(4);
                    cell_title.setCellValue(zhdatas.get(i).getApplyInplanCount());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(5);
                    cell_title.setCellValue(zhdatas.get(i).getApplyCountRate());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(6);
                    cell_title.setCellValue(zhdatas.get(i).getApplyTime());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(7);
                    cell_title.setCellValue(zhdatas.get(i).getApplyInplanTime());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(8);
                    cell_title.setCellValue(zhdatas.get(i).getApplyTimeRate());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(9);
                    cell_title.setCellValue(zhdatas.get(i).getPlanCount());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(10);
                    cell_title.setCellValue(zhdatas.get(i).getPlanCash());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(11);
                    cell_title.setCellValue(zhdatas.get(i).getPlanCashRate());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(12);
                    cell_title.setCellValue(zhdatas.get(i).getPlanTime());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(13);
                    cell_title.setCellValue(zhdatas.get(i).getPlanCashTime());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(14);
                    cell_title.setCellValue(zhdatas.get(i).getPlanCashTimeRate());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(15);
                    cell_title.setCellValue("");
                    cell_title.setCellStyle(cs_value);
                }
            }
        }
        if (czdatas.size() > 0) {
            row_title = sheet.createRow(row_num++);
            CellRangeVal("垂直天窗", row_title, 0, row_num - 1, row_num + (czdatas.size() - 2), 0, 0, sheet, cs_value);
            CellRangeVal("昆明局", row_title, 1, row_num - 1, row_num + (czdatas.size() - 2), 1, 1, sheet, cs_value);
            cell_title = row_title.createCell(2);
            cell_title.setCellValue(czdatas.get(0).getLine());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(3);
            cell_title.setCellValue(czdatas.get(0).getApplyCount());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(4);
            cell_title.setCellValue(czdatas.get(0).getApplyInplanCount());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(5);
            cell_title.setCellValue(czdatas.get(0).getApplyCountRate());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(6);
            cell_title.setCellValue(czdatas.get(0).getApplyTime());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(7);
            cell_title.setCellValue(czdatas.get(0).getApplyInplanTime());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(8);
            cell_title.setCellValue(czdatas.get(0).getApplyTimeRate());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(9);
            cell_title.setCellValue(czdatas.get(0).getPlanCount());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(10);
            cell_title.setCellValue(czdatas.get(0).getPlanCash());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(11);
            cell_title.setCellValue(czdatas.get(0).getPlanCashRate());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(12);
            cell_title.setCellValue(czdatas.get(0).getPlanTime());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(13);
            cell_title.setCellValue(czdatas.get(0).getPlanCashTime());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(14);
            cell_title.setCellValue(czdatas.get(0).getPlanCashTimeRate());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(15);
            cell_title.setCellValue("");
            cell_title.setCellStyle(cs_value);
            if (czdatas.size() > 1) {
                for (int i = 1; i < czdatas.size(); i++) {
                    row_title = sheet.createRow(row_num++);
                    cell_title = row_title.createCell(2);
                    cell_title.setCellValue(czdatas.get(i).getLine());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(3);
                    cell_title.setCellValue(czdatas.get(i).getApplyCount());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(4);
                    cell_title.setCellValue(czdatas.get(i).getApplyInplanCount());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(5);
                    cell_title.setCellValue(czdatas.get(i).getApplyCountRate());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(6);
                    cell_title.setCellValue(czdatas.get(i).getApplyTime());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(7);
                    cell_title.setCellValue(czdatas.get(i).getApplyInplanTime());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(8);
                    cell_title.setCellValue(czdatas.get(i).getApplyTimeRate());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(9);
                    cell_title.setCellValue(czdatas.get(i).getPlanCount());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(10);
                    cell_title.setCellValue(czdatas.get(i).getPlanCash());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(11);
                    cell_title.setCellValue(czdatas.get(i).getPlanCashRate());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(12);
                    cell_title.setCellValue(czdatas.get(i).getPlanTime());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(13);
                    cell_title.setCellValue(czdatas.get(i).getPlanCashTime());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(14);
                    cell_title.setCellValue(czdatas.get(i).getPlanCashTimeRate());
                    cell_title.setCellStyle(cs_value);
                    cell_title = row_title.createCell(15);
                    cell_title.setCellValue("");
                    cell_title.setCellStyle(cs_value);
                }
            }
        }
        //7
        if (total != null) {
            row_title = sheet.createRow(row_num++);
            CellRangeVal(total.getSkywinType(), row_title, 0, row_num - 1, row_num - 1, 0, 2, sheet, cs_value);
            cell_title = row_title.createCell(3);
            cell_title.setCellValue(total.getApplyCount());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(4);
            cell_title.setCellValue(total.getApplyInplanCount());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(5);
            cell_title.setCellValue(total.getApplyCountRate());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(6);
            cell_title.setCellValue(total.getApplyTime());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(7);
            cell_title.setCellValue(total.getApplyInplanTime());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(8);
            cell_title.setCellValue(total.getApplyTimeRate());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(9);
            cell_title.setCellValue(total.getPlanCount());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(10);
            cell_title.setCellValue(total.getPlanCash());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(11);
            cell_title.setCellValue(total.getPlanCashRate());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(12);
            cell_title.setCellValue(total.getPlanTime());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(13);
            cell_title.setCellValue(total.getPlanCashTime());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(14);
            cell_title.setCellValue(total.getPlanCashTimeRate());
            cell_title.setCellStyle(cs_value);
            cell_title = row_title.createCell(15);
            cell_title.setCellValue("");
            cell_title.setCellStyle(cs_value);
        }
        String values = "填报人：                          审批人：                    填报日期：";
        row_title = sheet.createRow(row_num++);
        CellRangeVal(values, row_title, 0, row_num - 1, row_num - 1, 0, 15, sheet, cs_value);
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

    /**
     * 根据csmis系统的线路返回施工平台的线路
     *
     * @param csmis_route csmis系统线路名称
     * @return
     */
    private String[] for_route(String csmis_route) {
        Map<String, String[]> map = new HashMap<String, String[]>();
        map.put("盘西线", new String[]{"盘西线", "盘西疏解线"});
        map.put("威红线", new String[]{"威红线"});
        map.put("羊场支线", new String[]{"羊场支线"});
        map.put("东川支线", new String[]{"东川支线"});
        map.put("沪昆线", new String[]{"沪昆线"});
        map.put("联络线", new String[]{"石林西至石林南联络线", "小团山联络线"});
        map.put("南昆线", new String[]{"南昆线", "石林西疏解线"});
        map.put("沪昆高速", new String[]{"沪昆高速", "沪昆动右线", "小团山出入所线", "沪昆动左线"});
        map.put("南昆客专", new String[]{"南昆客专"});
        map.put("枢纽高铁", new String[]{"动车所三场右联线", "云桂动右线", "云桂动左线"});
        return map.get(csmis_route);
    }
}
