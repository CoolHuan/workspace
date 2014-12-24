/*
 * Collections:�Ǽ��Ͽ�ܵĹ����࣬�������Ǿ�̬����=�෽����
 * 
 * */

package a_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CollectionsDemo {

	
	public static void main(String[] args) {
			
		run1();
	//	run2();
	}
	
	
	
	public static void run1(){
		List<String> list=new ArrayList<>();
		list.add("baidu");
		list.add("abcd");
		list.add("java");
		list.add("oracle");
		list.add("google");
		list.add("facebook");
		list.add("b");
		list.add("bc");
		Collections.sort(list, new ComparatorByLength());
		for(String str:list){
			System.out.println(str);
		}
		
		System.out.println("��ת==========");
//		
//		Collections.reverse(list); ��ת����
//		for(String str:list){
//			System.out.println(str);
//		}
		
		//reverseOrder() ����Ȼ����
//		Comparator<String> com=Collections.reverseOrder();
//		Collections.sort(list,com);
//		
		//����Ƚ�������
		Comparator<String> comparator=Collections.reverseOrder(new ComparatorByLength());
		Collections.sort(list, comparator);
		
		
		for(String str:list){
			System.out.println(str);
		}
		
//		System.out.println("==========");
//		//ʹ��Ԫ�ص���Ȼ˳������
//		Collections.sort(list);
//		//ʹ�ñȽ���������
//		Collections.sort(list, new ComparatorByLength());
//		for(String str:list){
//			System.out.println(str);
//		}
	}
	public static void run2(){
		List<Person> list2=new ArrayList<>();
		list2.add(new Person(12,"android"));
		list2.add(new Person(1,"java"));
		list2.add(new Person(23,"baidu"));
		list2.add(new Person(100,"IBM"));
		list2.add(new Person(88,"IBM"));
		list2.add(new Person(99,"IBM"));
		
		
		for(Person p:list2){
			System.out.println(p);
		}
		System.out.println("==========");
		
		//Collections.sort(list2);
		Collections.sort(list2,new ComByAge());
		for(Person p:list2){
			System.out.println(p);
		}
		System.out.println("===========");
		
		
		Person max=Collections.max(list2);
		Person min=Collections.min(list2);
		System.out.println("Ĭ������max="+max+"\tmin="+min);
		
		
		Person max1=Collections.max(list2, new ComByAge());
		Person min1=Collections.min(list2, new ComByAge());
		System.out.println("�Ƚ�������max="+max1+"\tmin="+min1);
	}

}
