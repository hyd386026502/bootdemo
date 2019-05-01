package com.hyd.bootdemo.practice;/**
 * @author huangYaDong
 * @date 2019-04-09 23:12
 * @description
 * @other
 */

/**
 *
 * @author huangYaDong
 * @date 2019-04-09 23:12
 * @description
 * @other
 */
public class test {
    public static void main(String[] args) {
      // new FruitImp().toString();
       fruit proxy = (fruit) InterceptorProxy.bind(new FruitImp(), "com.hyd.bootdemo.practice.MyInterceptor");
        proxy.eat();
    }
}
