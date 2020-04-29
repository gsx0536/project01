
package com.tieda.alarm.filter;


import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.util.BaseResult;
import com.tieda.alarm.util.JwtUtil;
import com.tieda.alarm.util.Response;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


public class JwtLoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String header = ((HttpServletRequest) request).getHeader("Authorization");
        String headerReferer = ((HttpServletRequest) request).getHeader("Referer");

        String requstPath = ((HttpServletRequest) request).getRequestURI();
        /***
         * Standard项目不需要登录验证
         */
        if (headerReferer != null && headerReferer.indexOf("standard/") > -1) {
            chain.doFilter(request, response);
        }else if(requstPath != null && requstPath.indexOf("user/login") > -1){
            chain.doFilter(request, response);
        } else {
            if (header == null || !header.startsWith("Bearer")) {
                BaseResult baseResult = new BaseResult("login_fail", "jwt失效", new Response());
                response.setContentType("text/html;charset=UTF-8");
                response.getWriter().write(baseResult.toString());
                return;
            }
            User user = JwtUtil.unsign(header.substring(6), User.class);
            if (user == null) {
                BaseResult baseResult = new BaseResult("login_fail", "jwt验证失败", new Response());
                response.setContentType("text/html;charset=UTF-8");
                response.getWriter().write(baseResult.toString());
                return;
            }
            ((HttpServletRequest) request).getSession().setAttribute(User.USER_SESSION_NAME, user);
            chain.doFilter(request, response);
        }

    }
}

