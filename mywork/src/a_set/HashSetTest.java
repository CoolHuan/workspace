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
		 * ��дequals����������true������£�����hashCode��һ��
		 * ��ˣ�hashSet��Ȼ������������
		 * 
		 * 
		 * */
		System.out.println(hs.add(new A()));
		System.out.println(hs.add(new A())+"\t"+hs.size());
		/*
		 * ���������hashcode��ͬ������equals��������false��
		 * ��ˣ�hashSet���������ͬ��Ԫ��
		 * 
		 * */
		System.out.println(hs.add(new B()));
		System.out.println(hs.add(new B())+"\t"+hs.size());
		
		/**
		 * ��equals����true��hashcode������ͬ��ֵ��
		 * hashSet������Ϊ��ͬһ��Ԫ��;
		 * 
		 * */
		
		System.out.println(hs.add(new C()));
		System.out.println(hs.add(new C())+"\t"+hs.size());
		
		System.out.println(hs.add(null));
		System.out.println(hs.add(null));//ֻ����һ��nullԪ��
	}

}
