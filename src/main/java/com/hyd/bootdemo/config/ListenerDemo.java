package com.hyd.bootdemo.config;/**
 * @author huangYaDong
 * @date 2019-04-08 23:51
 * @description
 * @other
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author huangYaDong
 * @date 2019-04-08 23:51
 * @description  拦截器
 * @other
 */
@WebListener
public class ListenerDemo implements ServletRequestListener{
    private static Logger logger = LoggerFactory.getLogger(ListenerDemo.class);
    /**
     * The request is about to go out of scope of the web application.
     * The default implementation is a NO-OP.
     *
     * @param sre Information about the request
     */
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        logger.info(sre.toString());
        logger.info("listener destory ");
    }

    /**
     * The request is about to come into scope of the web application.
     * The default implementation is a NO-OP.
     *
     * @param sre Information about the request
     */
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        logger.info(sre.toString());
        logger.info("listener 初始化 ");
    }
}
