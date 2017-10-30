package com.xuxc.baseTest.proxy.bean;

import com.xuxc.baseTest.proxy.inteFace.car;

public class benz implements car{

	public car car;
	
//	public benz(car car) {
//		this.car = car;
//	}
	@Override
	public void carSize() {
		System.out.println("car is benz");
		System.out.println("small car");
	}

	@Override
	public void power() {
		System.out.println("car is benz");
		System.out.println("the car use oil");
	}

}
