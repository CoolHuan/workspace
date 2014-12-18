package a_List;

import java.security.AlgorithmConstraints;
import java.security.AllPermission;
import java.util.ArrayList;

import bean.Person;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		for (int i = 0; i < 5; i++) {
			list.add(new Person(i,"it-"+i));
		}
		Person p=new Person(3,"it-3");
		list.add(p);
		System.out.println(list);
		System.out.println(list.indexOf(p)+"==="+list.lastIndexOf(p));
	}

}
