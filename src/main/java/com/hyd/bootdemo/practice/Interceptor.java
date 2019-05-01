package com.hyd.bootdemo.practice;/**
 * @author huangYaDong
 * @date 2019-04-09 22:45
 * @description
 * @other
 */

import java.lang.reflect.Method;

/**
 *
 * @author huangYaDong
 * @date 2019-04-09 22:45
 * @description
 * @other
 */
public interface Interceptor {
    boolean before(Object proxy, Object target, Method method,Object[] args);
    void around(Object proxy, Object target, Method method,Object[] args);
    void after(Object proxy, Object target, Method method,Object[] args);
}
