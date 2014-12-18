package a_set;

import java.util.HashSet;

class A{
	public boolean equals(Object j){
		return true;
		
	}
	
}
class B{
	public int hashCode(){
		return 60;
	}
	
}
class C{
	public boolean equals(Object j){
		return true;
		
	}
	public int hashCode(){
		return  20;
	}
	
}

public class HashSetTest {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		/*
		 * 复写equals方法，返回true的情况下，由于hashCode不一样
		 * 因此：hashSet依然当做两个对象
		 * 
		 * 
		 * */
		System.out.println(hs.add(new A()));
		System.out.println(hs.add(new A())+"\t"+hs.size());
		/*
		 * 两个对象的hashcode相同，但是equals方法返回false：
		 * 因此：hashSet添加两个不同的元素
		 * 
		 * */
		System.out.println(hs.add(new B()));
		System.out.println(hs.add(new B())+"\t"+hs.size());
		
		/**
		 * 当equals返回true、hashcode返回相同的值；
		 * hashSet集合认为是同一个元素;
		 * 
		 * */
		
		System.out.println(hs.add(new C()));
		System.out.println(hs.add(new C())+"\t"+hs.size());
		
		System.out.println(hs.add(null));
		System.out.println(hs.add(null));//只能有一个null元素
	}

}
