package com.tieda.alarm.controller.sys;


import com.alibaba.fastjson.JSON;
import com.tieda.alarm.entity.alarmTab2.AlarmTab2;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.service.sys.IUserService;
import com.tieda.alarm.util.BaseResult;
import com.tieda.alarm.util.JwtUtil;
import com.tieda.alarm.util.Response;
import com.tieda.alarm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public String login(@RequestBody User obj,HttpServletRequest request,HttpServletResponse res) {
        ResponseData responseData = null;
        try {
            obj.setVcServer(User.SERVER_ID);
            User user=userService.login(obj);
            if(obj!=null){
                if(user.getPwd().equals(obj.getPwd())){
                    user.setPwd(null);
                    HttpSession session = request.getSession();
                    session.setAttribute(User.USER_SESSION_NAME, user);
                    session.setMaxInactiveInterval(1800);
                    ServletContext ContextA = request.getSession().getServletContext();
                    String token = JwtUtil.sign(user, 30L * 24L * 3600L * 1000L);//一个月的时间
                    res.addHeader("Authorization", "Bearer" + token);
                    BaseResult baseResult = new BaseResult(user);
                    String result = JSON.toJSONString(baseResult);
                    return result;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        BaseResult baseResult=new BaseResult("fail","用户名密码错误",new Response());
        return baseResult.toString();
    }

}
