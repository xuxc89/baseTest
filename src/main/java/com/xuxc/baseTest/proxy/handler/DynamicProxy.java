package com.xuxc.baseTest.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Created by xuxc
 * since  2017/10/18 15:30.
 * version 1
 */

public class DynamicProxy implements InvocationHandler{
    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(object,args);
//        会出现死循环代码 预计原因为proxy为代理对象 调用代理对象相当于自己调用自己的递归调用
//        method.invoke(proxy,args);
        after();
        return null;
    }

    private void before() {
        System.out.println("before proxy run");
    }

    private void after() {
        System.out.println("after proxy run");
    }

    public static Object factory(Object obj) {
        Class<? extends Object> cla = obj.getClass();
        Class<?>[] classes = cla.getInterfaces();
        Arrays.stream(classes).forEach((x)->{
            System.out.println(x);
        });
        return Proxy.newProxyInstance(cla.getClassLoader(),cla.getInterfaces(),new DynamicProxy(obj));
    }
}
