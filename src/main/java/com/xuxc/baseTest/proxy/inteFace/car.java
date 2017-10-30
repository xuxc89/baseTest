package com.xuxc.baseTest.proxy.inteFace;

public interface car {

	default void run() {
		System.out.println("this is interface--------------------------");
		System.out.println("car is running");
	}
	
	void carSize();
	
	void power();
}
