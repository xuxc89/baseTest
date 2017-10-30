package com.xuxc.baseTest.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

import com.xuxc.baseTest.proxy.inteFace.car;

public class carDynamicProxy implements InvocationHandler {

	private int count = 0;
	/**
	 * 指定为car时只能代理car与car的子类
	 * 可以声明为object类型来代理全部类型
	 */
//	public Object delegate;
	public car delegate;
	
	public carDynamicProxy(car delegate) {
		System.out.println(delegate.getClass());
		this.delegate = delegate;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("进入次数" + count);
		count++;
		System.out.println("********dynamic**************");
		System.out.println("********proxy**************"+proxy.getClass().getSimpleName());
		System.out.println("********delegate**************"+delegate.getClass().getSimpleName());
		System.out.println("********method**************"+method.getName());
		method.invoke(delegate,args);
//		method.invoke(proxy,args);
		return null;
	}

}
