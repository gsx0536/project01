package com.tieda.alarm.service.sys;

import com.baomidou.mybatisplus.service.IService;
import com.tieda.alarm.entity.alarmTab2.AlarmTab2;
import com.tieda.alarm.entity.user.User;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author
 * @since 2019-05-23
 */
public interface IUserService extends IService<User> {

    User login(User user);
}
