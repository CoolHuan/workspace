package a_Collection;
import java.util.*;
public class CollectionDemo {
	public static void main(String[] args) {
		Collection coll=new ArrayList();
		Collection co=new ArrayList();
		//String----Person
		//1.��
		coll.add("Google"); 
		coll.add("Apple"); 
		coll.add("Oracle"); 
		
		//BAT:  TABLE
		co.add("Baidu");
		co.add("Alibaba");
		co.add("Tencent");
		
		System.out.println("����"+co);
		System.out.println("����"+coll);
		
		co.addAll(coll);
		System.out.println("����"+co);
		System.out.println("����"+coll);
		
		//2.ɾ��
		System.out.println(coll.remove("Xiaomi"));
		System.out.println(coll.remove("Apple"));
		//coll.add("Xiaomi");
		System.out.println("����"+coll);
		
		//3.�жϲ���
		System.out.println("coll.isEmpty="+coll.isEmpty());
		System.out.println("co.isEmpty="+co.isEmpty());
		
		System.out.println("co.contains=Google=?"+co.contains("Google"));
		
		//�����������ڱ������ϵĹ����в��ܲ��������е�Ԫ��
		Iterator it=co.iterator();
		while(it.hasNext()){
			Object object=(Object)it.next();
		//	co.add("geminno");
		//	co.remove("Baidu");
			System.out.println(object);
		}
		/*
		 * for(Iterator it=coll.iterator();it.hasNext()){
		 * 		Object object=(Object)it.next();
				System.out.println(object);
		 * }
		 * 
		 * for(Object object:coll){
		 * 		System.out.println("coll:"+object);
		 * }
		 * 
		 * 
		 * */
	}
}
