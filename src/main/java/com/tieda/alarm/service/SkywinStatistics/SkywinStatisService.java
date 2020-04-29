package com.tieda.alarm.service.SkywinStatistics;

import com.tieda.alarm.entity.SkywinStatistics.SkywinDayStatGrid;
import com.tieda.alarm.entity.SkywinStatistics.SkywinDayStatSearch;
import com.tieda.alarm.entity.user.User;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.List;

public interface SkywinStatisService {

    /***
     * 天窗日兑现率统计
     * @param skywinDayStatSearch
     * @return
     */
    public Object skywinDayStat(SkywinDayStatSearch skywinDayStatSearch, User user);

    /***
     * 天窗日兑现率统计展开
     * @param skywinDayStatSearch
     * @param user
     * @return
     */
    public Object dayStatExpand(SkywinDayStatSearch skywinDayStatSearch, User user);

    /***
     * 天窗日兑现率统计 查看明细内容
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStatGrid> dayStatDetail(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 天窗日兑现率统计 内容导出渲染
     * @param wb
     * @param skywinDayStatSearch
     * @param sheet
     */
    public void exportExc(Workbook wb, SkywinDayStatSearch skywinDayStatSearch, Sheet sheet,User user) throws Exception;
}
