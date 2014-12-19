package a_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import bean.Person;

public class HashMapDemo {

	public static void main(String[] args) {
		//Person--Address
		HashMap<Person, String> hm=new HashMap<>();
		//HashSet元素是否相同的依据  ： hashCode equals
		//HashMap元素是否相同的依据：键是否相同
		hm.put(new Person(100, "IBM"), "USA");
		hm.put(new Person(15, "Alibaba"), "Hangzhou");
		hm.put(new Person(123, "Google"), "Sanfrancisco");
		hm.put(new Person(12, "Baidu"), "BeiJing");
		hm.put(new Person(12, "Baidu"), "SuZhou");
		
		//遍历：
		Set<Person> st=hm.keySet();
		Iterator<Person> iterator=st.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println("Age:"+person.getAge()+"\tName:"+person.getName()+"\tCity:"+hm.get(person));
		}
	}

}
