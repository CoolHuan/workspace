package a_List;

import java.security.AllPermission;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		for(int i=0;i<3;i++){
			ll.add("dsf"+i);
		}
		ll.add("dsf1");
		//1、插入
		System.out.println(ll);
		ll.addFirst("omg");
		ll.addLast("ig");
		System.out.println(ll);
		//2、获取
		System.out.println(ll.getFirst()+"\t"+ll.getLast()+"\t"+ll.get(2));
		System.out.println(ll.indexOf("dsf2"));
		System.out.println(ll.lastIndexOf("dsf1"));
		//3.修改
		ll.set(0, "EDG");
		System.out.println(ll);
		//4.删除
		ll.remove(2);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		System.out.println("==========");
		//5.克隆
		LinkedList lt=(LinkedList)ll.clone();
		System.err.println(lt);
		
		for(Object obj:ll){
			String str=(String) obj;
			System.out.println(str);
		}
		System.out.println("==========");
		Iterator it=ll.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		System.out.println("==========");
		Iterator it1=ll.descendingIterator();
		while (it1.hasNext()) {
			Object obj = (Object) it1.next();
			System.out.println(obj);
		}
	
	}

}
