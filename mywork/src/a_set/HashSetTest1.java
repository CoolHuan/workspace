package a_set;

import java.util.HashSet;
import java.util.Iterator;

import bean.Person;

public class HashSetTest1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet<>();
		hs.add(new Person(12,"google"));
		hs.add(new Person(23,"Apple"));
		hs.add(new Person(12,"google"));
		hs.add(new Person(12,"Baidu"));
		Iterator iterator=hs.iterator();
		
		while (iterator.hasNext()) {
			Person object = (Person) iterator.next();
			System.out.println(object.getName()+"-"+object);
		}
		System.out.println(hs+"\tsize="+hs.size());
	}

}
