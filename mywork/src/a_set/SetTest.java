package a_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class SetTest {
	public static void main(String[] args) {
		//Set:����Ԫ�ز����ظ�
		Set set=new HashSet();
		
		set.add("abc");
		set.add("cba");
		set.add("bac");
		set.add("a");
		set.add("b");
		
		Iterator it=set.iterator();
		while (it.hasNext()) {
			String object = (String) it.next();
			System.out.println(object);
		}
		
		System.out.println(set.add("cba"));
		System.out.println(set);
		
		
	}

}
