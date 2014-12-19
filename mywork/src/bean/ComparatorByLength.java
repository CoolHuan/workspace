package bean;

import java.util.Comparator;

public class ComparatorByLength implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String str1=(String) o1;
		String str2=(String) o2;
		return str1.length()-str2.length();
	}

}
