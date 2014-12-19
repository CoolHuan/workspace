package a_set;

import java.util.TreeSet;

import bean.ComparatorByAge;
import bean.Person;

//使用比较器来排序
public class TreeSetDemo3 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new ComparatorByAge());
		ts.add(new Person(12,"Google"));
		ts.add(new Person(22,"Apple"));
		ts.add(new Person(6,"Baidu"));
		ts.add(new Person(15,"Alibaba"));
		ts.add(new Person(6,"Oralce"));
		ts.add(new Person(7,"Baidu"));
		
		ts.add(new Person(7,"Oralce"));
		ts.add(new Person(2,"Oralce"));
		ts.add(new Person(4,"Oralce"));
		ts.add(new Person(9,"Oralce"));
		

		for (Object object : ts) {
			Person p=(Person) object;
			System.out.println(p);
		}
	}

}
