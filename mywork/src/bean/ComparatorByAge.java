package bean;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Person>{
/*
 * �Ȱ����������ٰ���������
 * */
	@Override
	public int compare(Person o1, Person o2) {
		Person p1=(Person) o1;
		Person p2=(Person) o2;
		int res=p1.getAge()-p2.getAge();
		return res==0?p1.getName().compareTo(p2.getName()):res;
	}

}
