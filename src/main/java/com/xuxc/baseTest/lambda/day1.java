package com.xuxc.baseTest.lambda;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.xuxc.baseTest.model.people;

public class day1 {
	List<String> list;
	List<Integer> numberList;
	List<people> peopleList;
	public List<String> factory() {
		list = new ArrayList<>();
		list.add("小明");
		list.add("小刚");
		list.add("小李");
		list.add("小王");
		list.add("小小");
		list.add("11");
		list.add("11");
		return list;
	}
	
	public List<Integer> numberListFactory() {
		numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(1);
		numberList.add(1);
		numberList.add(1);
		numberList.add(1);
		numberList.add(1);
		numberList.add(2);
		numberList.add(2);
		numberList.add(2);
		numberList.add(2);
		numberList.add(2);
		numberList.add(2);
		numberList.add(2);
		return numberList;
	}
	public List<Integer> peopleListFactory() {
		peopleList = new ArrayList<>();
		people p1 = new people();
		p1.setAge(1);
		people p2 = new people();
		p1.setAge(2);
		peopleList.add(p1);
		peopleList.add(p2);
		peopleList.add(p2);
		
		return numberList;
	}
	
	@Test
	public void testLambda() {
//		factory();
//		list.forEach(item->{System.out.println(item);});
//		/**
//		 * 两种方式实际结果相同
//		 */
//		list.forEach(System.out::println);
		
//		list.stream().filter(item->new Integer(item)==11)
		peopleListFactory();
		peopleList.stream().filter(p->p.getAge()==1).forEach(System.out::print);
		
//		persons.parallelStream().filter(p -> p.getAge()>=25 && p.getAge()<=35).
//        collect(
//            Collectors.groupingBy(p->p.getSex(), Collectors.summingInt(p->1))
//    );
	}
}
