package a_set;

import java.util.TreeSet;

import bean.Person;
/*
 * 
 * 让普通类具有可比性：实现comparable,重写compareTo方法
 * 自定义比较规则=集合的排序规则
 * 
 * 
 * */

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet<>();
		ts.add(new Person(12,"Google"));
		ts.add(new Person(22,"Apple"));
		ts.add(new Person(6,"Baidu"));
		ts.add(new Person(15,"Alibaba"));
		ts.add(new Person(6,"Oralce"));
		ts.add(new Person(7,"Baidu"));
		
		for (Object object : ts) {
			Person obj=(Person) object;
			System.out.println(obj);
		}
		System.out.println("==========");
		
		//System.out.println(ts.first());
		//System.out.println(ts.last());
	}

}
