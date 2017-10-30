package com.xuxc.baseTest.proxy.bean;

import com.xuxc.baseTest.proxy.inteFace.car;

public class carsProxy implements car{

	private car cars;

	public carsProxy(car car) {
		this.cars = car;
	}
	@Override
	public void carSize() {
		System.out.println("this is carsProxy");
		cars.carSize();
	}

	@Override
	public void power() {
		System.out.println("this is carsProxy");
		cars.power();
	}
	
	public void run() {
		System.out.println("this is carsProxy");
		cars.run();
	}
	
}
