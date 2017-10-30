package com.xuxc.baseTest.proxy.bean;

import com.xuxc.baseTest.proxy.inteFace.car;

public class Tesla implements car{

	@Override
	public void carSize() {
		// TODO Auto-generated method stub
		System.out.println("small car");
		
	}

	@Override
	public void power() {
		// TODO Auto-generated methodstub
		System.out.println("the car use Electricity");
		
	}

}
