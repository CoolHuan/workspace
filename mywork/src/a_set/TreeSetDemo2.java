package a_set;

import java.util.TreeSet;

import bean.Person;
/*
 * 
 * ����ͨ����пɱ��ԣ�ʵ��comparable,��дcompareTo����
 * �Զ���ȽϹ���=���ϵ��������
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
