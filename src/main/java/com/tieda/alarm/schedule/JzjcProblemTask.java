package com.tieda.alarm.schedule;

import com.tieda.alarm.service.jzjcProblem.IJzjcProblemService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class JzjcProblemTask {

    @Autowired
    IJzjcProblemService iJzjcProblemService;

    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    /***
     * 监测分析问题库-定时监测超期未整改问题
     * 每天00:30开始检验
     */
    @Scheduled(cron = "0 30 0 * * ?")
    public void jzProblemOverDateNocansor() {
        logger.info("开始检验监测问题是否超期未整改.");
        iJzjcProblemService.scheduleTaskOverdue();
    }

}
