package com.xuxc.baseTest.controller;


import java.lang.reflect.Proxy;

import org.junit.Test;

import com.xuxc.baseTest.model.classBean;
import com.xuxc.baseTest.model.superBean;

public class superTest {

	superBean superBean = new superBean();
	
	superBean super2 = new classBean();
	
	classBean classBean = new classBean();
	
//	classBean class2 = new superBean();
	
	@Test
	public void test() {
		superBean.sayHello("wx");
		super2.sayHello("ll");
		classBean.sayHello("xxc");
	}
	
	@Test
	public void todo() {
//		superBean.doSomeThing();
//		super2.doSomeThing();
//		classBean.doSomeThing();
//		InteFace inf = new InteFace() {
//			public int returnInt(int i ) {
//				System.out.println(i);
//				return i;
//			}
//			
//			@Override
//			public void notAFunction() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
//		System.out.println(InteFace.returnInt(2));
	}
	
}
