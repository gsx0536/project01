package com.tieda.alarm.service.SkywinStatistics;

import com.tieda.alarm.entity.SkywinStatistics.SkywinDayStatSearch;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public interface SkywinStatMonthService {

    /***
     * 天窗修申请及兑现情况统计月表
     * @param monthStr 月份 yyyy-MM
     * @return
     */
    public Object monthStat(String monthStr);

    /***
     *天窗月度兑现率 导出
     * @param monthStr
     * @return
     */
    public void monthStatExport(Workbook wb, Sheet sheet, String monthStr);

    /***
     *天窗月度兑现率 明细查看
     * @param monthStr
     * @return
     */
    public Object monthStatDetail(String skywinType, String line, String detailType, String monthStr);
}
