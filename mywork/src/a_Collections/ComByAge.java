package a_Collections;

import java.util.Comparator;

public class ComByAge implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		int res=o1.getAge()-o2.getAge();
		return res==0?o1.getName().compareTo(o2.getName()):res;
	}

}
