package com.tieda.alarm.config;

import com.tieda.alarm.filter.JwtLoginFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean registFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new JwtLoginFilter());
        registration.addUrlPatterns("/*" );
        registration.setName("JwtLoginFilter" );
        registration.setOrder(1);
        return registration;
    }

}
