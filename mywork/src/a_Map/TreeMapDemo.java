package a_Map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import bean.ComparatorByAge;
import bean.Person;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Person, String> tm=new TreeMap<>(new ComparatorByAge());
		tm.put(new Person(100, "IBM"), "USA");
		tm.put(new Person(15, "Alibaba"), "Hangzhou");
		tm.put(new Person(123, "Google"), "Sanfrancisco");
		tm.put(new Person(12, "Baidu"), "BeiJing");
		tm.put(new Person(12, "Baidu"), "SuZhou");

		//±éÀú£º
		Set<Person> st=tm.keySet();
	/*	Iterator<Person> iterator=st.iterator();
			while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println("Age:"+person.getAge()+"\tName:"+person.getName()+"\tCity:"+tm.get(person));
		}
	*/
		for(Person p:st){
			System.out.println("Age:"+p.getAge()+"\tName:"+p.getName()+"\tCity:"+tm.get(p));
		}
		System.out.println("================");
		
		for (Iterator iterator2 = st.iterator(); iterator2.hasNext();) {
			Person person = (Person) iterator2.next();
			System.out.println("Age:"+person.getAge()+"\tName:"+person.getName()+"\tCity:"+tm.get(person));
		}
	}
}
