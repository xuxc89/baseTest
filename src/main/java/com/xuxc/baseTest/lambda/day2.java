package com.xuxc.baseTest.lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.Test;

import com.xuxc.baseTest.factory;
public class day2 {

	@Test
	public void sorts() {
		System.out.println("排序--------***************----------------");
//		factory.randomIntegerList()
//		.stream()
		//默认顺序
//		.sorted()
//		.forEach((x)->System.out.println(x));
		
		factory.randomIntegerList()
		.stream()
		//倒序
		.sorted((i2,i3)->(i3-i2))
		//顺序
		.sorted((i2,i3)->(i2-i3))
		.forEach(System.out::println);
	}
	
	@Test
	public void lambdalimit() {
		System.out.println("截取--------***************----------------");
		factory.randomIntegerList()
		.stream()
		.limit(7)
		.forEach(System.out::println);
	}
	
	@Test
	public void toList() {
		System.out.println("转换集合--------***************----------------");
		List<Integer> list = factory.randomIntegerList()
									.stream()
									.sorted()
									.limit(10)
									.collect(Collectors.toList());
		
		list.stream()
			.forEach(System.out::println);
	}
	
	@Test
	public void filter() {
		
		Predicate<Integer> smallList = (i)->(i<1000);
//		Predicate<Integer> doCount = ()->(doCount());
//		Predicate<Integer> doFalse = factory.flag=false;
		
		
		List<Integer> list = factory.randomIntegerList()
									.stream()
									.filter(smallList)
									.sorted()
									.limit(100)
									//无法停止故无法生效
//									.onClose(()->factory.flag=false)
									.collect(Collectors.toList());

		list.stream()
			.forEach(System.out::println);
	}
	
}
