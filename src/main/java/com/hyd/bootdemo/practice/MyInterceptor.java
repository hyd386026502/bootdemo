package com.hyd.bootdemo.practice;
/**
 * @author huangYaDong
 * @date 2019-04-09 22:52
 * @description
 * @other
 */

import java.lang.reflect.Method;

/**
 *
 * @author huangYaDong
 * @date 2019-04-09 22:52
 * @description
 * @other
 */
public class MyInterceptor implements Interceptor {
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("清洗水果");
        return true;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("水果烂了,不能吃了");

    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("吃完水果了");
    }
}
