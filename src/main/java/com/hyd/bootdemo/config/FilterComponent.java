package com.hyd.bootdemo.config;/**
 * @author huangYaDong
 * @date 2019-04-08 22:36
 * @description
 * @other
 */

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author huangYaDong
 * @date 2019-04-08 22:36
 * @description 配置filter的类 类名和方法返回必须一样
 * @other
 */
@Configuration
public class FilterComponent {
    @Bean
    public FilterRegistrationBean registFilterSession(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SessionFilter());
        registration.setName("sessionFilter");
        registration.addUrlPatterns("/*");
        registration.setOrder(99);
        return registration;
    }
//    @Bean
//    @ConfigurationProperties("app.datasource")
//    public DataSource dataSource(){
//        return DataSourceBuilder.create().build();
//    }
  /*  @Bean
    public FilterRegistrationBean registFilterTwo(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SessionFilter());
        registration.setName("sessionFilter2");
        registration.addUrlPatterns("/*");
        registration.setOrder(1);
        return registration;
    }*/

}
