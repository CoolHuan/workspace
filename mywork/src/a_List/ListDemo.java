/*
 * List:存储各种数据、元素可以重复、有序【可以使用索引访问元素】
 * 相对于Colletion，特有方法：带有索引index的方法
 * 
 * */



package a_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		List list=new ArrayList();
		//1.增
		list.add("Android-001");
		list.add("Android-002");
		list.add("Android-003");
		list.add("Android-004");
		list.add("Android-005");
		
		list.add(2, "Android-004");
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("================");
		//2、删除操作
		list.remove(2);
		list.remove("Android-003");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("================");
		
		//3、修改
		list.set(0, "Android-003");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("================");
		
		//4、遍历
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
			
		}
		System.out.println("================");
		Iterator it=list.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		System.out.println("================");
		
		
		//ListIterator:
		ListIterator iit=list.listIterator();
			while (iit.hasNext()) {
				Object object = (Object) iit.next();
			//	iit.add("Alibaba");   OK
				System.out.println(object);
			}
			while(iit.hasPrevious()){
				System.out.println(iit.previous());
			}
			System.out.println(list);
		
	}

}
