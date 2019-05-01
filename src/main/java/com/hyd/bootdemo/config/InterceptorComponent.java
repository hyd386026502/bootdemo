package com.hyd.bootdemo.config;/**
 * @author huangYaDong
 * @date 2019-04-09 00:06
 * @description
 * @other
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.handler.MappedInterceptor;

/**
 *
 * @author huangYaDong
 * @date 2019-04-09 00:06
 * @description
 * @other
 */
@Configuration
public class InterceptorComponent implements WebMvcConfigurer{
    @Autowired
    private interceptorDemo interceptorDemo;
    /**
     * Add Spring MVC lifecycle interceptors for pre- and post-processing of
     * controller method invocations. Interceptors can be registered to apply
     * to all requests or be limited to a subset of URL patterns.
     * <p><strong>Note</strong> that interceptors registered here only apply to
     * controllers and not to resource handler requests. To intercept requests for
     * static resources either declare a
     * {@link MappedInterceptor MappedInterceptor}
     * bean or switch to advanced configuration mode by extending
     * {@link WebMvcConfigurationSupport
     * WebMvcConfigurationSupport} and then override {@code resourceHandlerMapping}.
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(interceptorDemo);
        interceptorRegistration.addPathPatterns("/**").excludePathPatterns("/a");
        interceptorRegistration.order(3);
    }

    /**
     * Add handlers to serve static resources such as images, js, and, css
     * files from specific locations under web application root, the classpath,
     * and others.
     *
     * @param registry
     * @desciption
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //用户访问my下的文件,会自动 映射到e盘下,也可以是其他路径
        // registry.addResourceHandler("/my/**").addResourceLocations("E:/*")
    }
}
