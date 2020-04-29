package com.tieda.alarm.mapper.sys;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tieda.alarm.entity.sparepartsStatistics.SparepartsStatistics;
import com.tieda.alarm.entity.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {

    User login(User user);

}
