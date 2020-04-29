package com.tieda.alarm.controller.SkywinStatistics;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tieda.alarm.entity.SkywinStatistics.SkywinDayStatGrid;
import com.tieda.alarm.entity.SkywinStatistics.SkywinDayStatSearch;
import com.tieda.alarm.entity.saTStandard.SaTStandard;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.service.SkywinStatistics.SkywinStatMonthService;
import com.tieda.alarm.service.SkywinStatistics.SkywinStatisService;
import com.tieda.alarm.util.ResponseData;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.List;

@RestController
@RequestMapping("/skywinStat")
public class SkywinStatisticsController {

    @Autowired
    SkywinStatisService skywinStatisService;

    @Autowired
    SkywinStatMonthService skywinStatMonthService;

    private User user;

    /****
     * 初始化统计（天窗日兑现率统计）
     * @param skywinDayStatSearch
     * @return
     */
    @RequestMapping(value = "/dayStat", method = RequestMethod.POST)
    public Object skywinDayStat(SkywinDayStatSearch skywinDayStatSearch) {
        ResponseData responseData = null;
        try {
            Object obj = skywinStatisService.skywinDayStat(skywinDayStatSearch, user);
            responseData = ResponseData.okData(obj);
        } catch (Exception ex) {
            ex.printStackTrace();
            responseData = ResponseData.error();
        }
        return responseData;
    }

    /***
     * 展开节点统计（天窗日兑现率统计）
     * @param skywinDayStatSearch
     * @return
     */
    @RequestMapping(value = "/dayStatExpand", method = RequestMethod.POST)
    public Object dayStatExpand(SkywinDayStatSearch skywinDayStatSearch) {
        ResponseData responseData = null;
        try {
            Object obj = skywinStatisService.dayStatExpand(skywinDayStatSearch, user);
            responseData = ResponseData.okData(obj);
        } catch (Exception ex) {
            responseData = ResponseData.error();
            ex.printStackTrace();
        }
        return responseData;
    }

    /****
     * 天窗日兑现率统计 - 查看明细内容
     * @param skywinDayStatSearch
     * @return
     */
    @RequestMapping(value = "/dayStatDetail", method = RequestMethod.POST)
    public Object dayStatDetail(SkywinDayStatSearch skywinDayStatSearch) {
        ResponseData Response = null;
        try {
            List<SkywinDayStatGrid> grid = skywinStatisService.dayStatDetail(skywinDayStatSearch);
            Response = ResponseData.okData(grid, grid.size());
        } catch (Exception ex) {
            ex.printStackTrace();
            Response = ResponseData.error();
        }
        return Response;
    }

    /****
     * 天窗日兑现率统计 - 导出
     * @param skywinDayStatSearch
     * @return
     */
    @RequestMapping(value = "/dayStatExport", method = RequestMethod.POST)
    public void dayStatExport(SkywinDayStatSearch skywinDayStatSearch, HttpServletResponse response) throws Exception {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        Workbook wb = (Workbook) new HSSFWorkbook();
        Sheet sheet = wb.createSheet("昆明集团公司电务系统天窗日统计");
        skywinStatisService.exportExc(wb, skywinDayStatSearch, sheet, user);
        wb.write(os);
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("昆明集团公司电务系统天窗日统计.xls", "utf-8"));
        ServletOutputStream out = response.getOutputStream();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (final IOException e) {
            throw e;
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
    }

    /***
     * 天窗兑现率 月度统计
     * @param monthStr
     * @return
     */
    @RequestMapping(value = "/monthStat", method = RequestMethod.POST)
    public Object monthStat(String monthStr) {
        return skywinStatMonthService.monthStat(monthStr);
    }

    /***
     * 天窗兑现率月统计 导出
     * @param monthStr
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/monthStatExport", method = RequestMethod.POST)
    public void monthStatExport(String monthStr, HttpServletResponse response) throws Exception {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        Workbook wb = (Workbook) new HSSFWorkbook();
        Sheet sheet = wb.createSheet("昆明集团公司电务系统天窗月统计");
        skywinStatMonthService.monthStatExport(wb, sheet, monthStr);
        wb.write(os);
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("昆明集团公司电务系统天窗月统计.xls", "utf-8"));
        ServletOutputStream out = response.getOutputStream();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (final IOException e) {
            throw e;
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
    }

    /***
     * 天窗兑现率 月度统计 查看明细
     * @param monthStr
     * @return
     */
    @RequestMapping(value = "/monthStatDetail", method = RequestMethod.POST)
    public Object monthStatDetail(String skywinType, String line, String detailType, String monthStr
            , String page, String limit) {
        List<SkywinDayStatGrid> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            if (page == null && limit == null) {// 查询所有数据
                objList = (List<SkywinDayStatGrid>) skywinStatMonthService.monthStatDetail(skywinType, line, detailType, monthStr);
            } else {            // 查询分页列表数据
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);// 使用PageHelper进行分页
                objList = (List<SkywinDayStatGrid>) skywinStatMonthService.monthStatDetail(skywinType, line, detailType, monthStr);
                count = pageInfo.getTotal();
            }
            responseData = ResponseData.okData(objList, count);//处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();// 处理失败
        }
        return responseData;
    }

    @ModelAttribute
    private void setDefualtUser(HttpServletRequest request) {
        this.user = (User) request.getSession().getAttribute(User.USER_SESSION_NAME);
    }

}
