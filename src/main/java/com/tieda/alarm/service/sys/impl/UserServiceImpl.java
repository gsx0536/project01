package com.tieda.alarm.service.sys.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.mapper.sys.UserMapper;
import com.tieda.alarm.service.sys.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author
 * @since 2019-05-23
 */
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }
}
