package com.xuxc.baseTest.proxy.bean;

import com.xuxc.baseTest.proxy.inteFace.car;

public class tank implements car{

	@Override
	public void run() {
		System.out.println("this is tank-----------------------------");
		System.out.println("it's stop");
	}
	@Override
	public void carSize() {
		System.out.println("this is tank-----------------------------");
		System.out.println("it's big car");
		
	}

	@Override
	public void power() {
		System.out.println("this is tank-----------------------------");
		System.out.println("the car use oil");
	}
	
	public void warMonster() {
		System.out.println("tank is warMonster");
	}

}
