package com.xuxc.baseTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class factory {

	private static List<Integer> list = new ArrayList<>();
	public static boolean flag = true;
	
	/**
	 * 静态工厂返回一个整数随机数集合
	 * @author xxc
	 * @since 2017年9月18日 上午9:37:15
	 * factory.java
	 * TODO
	 */
	public static List<Integer> randomIntegerList() {
		if(!list.isEmpty()) {
			return list;
		}
		int i = 0;
		while(flag) {
			/**
			 * 创建随机整数的两种方式
			 */
//			int i = (int) Math.random();
			i++;
			Random ra = new Random();
			int number = ra.nextInt(100000);
			int absNumber = Math.abs(number);
			list.add(absNumber);
			System.out.println("number"+i+":" + number);
			System.out.println("abs number "+i+":"+absNumber);
			if (list.size() == 1000) {
				flag = false;
			}
		}
		System.out.println("countSize = "+i);
		return list;
	}
}
