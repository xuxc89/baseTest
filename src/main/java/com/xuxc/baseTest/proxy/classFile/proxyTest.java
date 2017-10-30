package com.xuxc.baseTest.proxy.classFile;

import java.lang.reflect.Proxy;

import org.junit.Test;

import com.xuxc.baseTest.proxy.bean.Tesla;
import com.xuxc.baseTest.proxy.bean.benz;
import com.xuxc.baseTest.proxy.bean.carsProxy;
import com.xuxc.baseTest.proxy.bean.tank;
import com.xuxc.baseTest.proxy.handler.carDynamicProxy;
import com.xuxc.baseTest.proxy.inteFace.car;

public class proxyTest {

	private benz benz = new benz();

	private com.xuxc.baseTest.proxy.bean.tank tank = new tank();
	private Tesla tesla = new Tesla();

	/**
	 * 动态代理类
	 * @author xxc
	 * @since 2017年9月11日 下午3:25:33
	 * proxyTest.java
	 * TODO
	 */
	@Test
	public void dynamic() {
		carDynamicProxy pro = new carDynamicProxy(benz);
		car cars;
		System.out.println("classLoader:" + pro.getClass().getClassLoader());
		System.out.println("benz classLoader:" + benz.getClass().getClassLoader());
		System.out.println("Interfaces:" + pro.getClass().getInterfaces());
		System.out.println("benz Interfaces:" + benz.getClass().getInterfaces());
		
		/**
		 * 实际中pro.getClass().getClassLoader() 与benz.getClass().getClassLoader() 相同
		 * pro.getClass().getInterfaces()与benz.getClass().getInterfaces()获得的接口列表不同
		 * 故必须使用原形即benz的class的接口列表
		 */
		cars = (car) Proxy.newProxyInstance(pro.getClass().getClassLoader()
				, benz.getClass().getInterfaces(), pro);
		System.out.println(cars.getClass());
		/**
		 * 标准写法
		 */
		// cars = (car) Proxy.newProxyInstance(benz.getClass().getClassLoader(),
		// benz.getClass().getInterfaces(), pro);
		// System.out.println(cars.getClass());
		cars.carSize();
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		pro = new carDynamicProxy(tank);
		System.out.println("classLoader:" + pro.getClass().getClassLoader());
		System.out.println("tank classLoader:" + tank.getClass().getClassLoader());
		System.out.println("Interfaces:" + pro.getClass().getInterfaces());
		System.out.println("tank Interfaces:" + tank.getClass().getInterfaces());
		
		/**
		 * 实测 实际两次获得的classloadhashcode相同
		 * 认为两者相同 具体原因未知
		 * 实际使用时获得的接口列表错误的使用了benz的，实际使用时却并未出现问题
		 */
		cars = (car) Proxy.newProxyInstance(pro.getClass().getClassLoader()
				, benz.getClass().getInterfaces(), pro);
		System.out.println(cars.getClass());
		cars.carSize();
	}

	/**
	 * 静态代理方法 根据接口编写代理类与实现类 在代理类中注入实现类，根据接口确立的规则调用接口 但只能调用接口描述过的方法
	 * 
	 * @author xxc
	 * @since 2017年9月11日 下午2:43:23 proxyTest.java TODO
	 */
	// @Test
	public void proxy() {
		System.out.println("******************banz*************************");
		car car1 = new carsProxy(benz);
		car1.carSize();
		car1.power();
		car1.run();
		System.out.println("******************tank*************************");
		car car2 = new carsProxy(tank);
		car2.carSize();
		car2.power();
		car2.run();
		System.out.println("******************Tesla*************************");
		car car3 = new carsProxy(tesla);
		car3.carSize();
		car3.power();
		car3.run();
	}
}
