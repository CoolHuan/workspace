package a_set;

import java.util.TreeSet;

import bean.ComparatorByLength;

class Errs{
	
}
/*
 * TreeSet: Ҫ�����Ԫ�ر�����пɱ���
 * �������ʵ��Comparable�ӿ�
 * Ԫ�رȽϱ�׼��compareTo()==0
 * */
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new ComparatorByLength());
		
	/*	ts.add(3);
		ts.add(23);
		ts.add(-12);
		ts.add(0);
		ts.add(35);
		ts.add(10);
	*/
		ts.add("abc");
		ts.add("nba");
		ts.add("cba");
		ts.add("cuba");
		ts.add("apple");
		ts.add("zxa");
		ts.add("hello");
		ts.add("hello3");
		//��TreeSet��ӵ�Ԫ��Ӧ����ͬһ������
		//ts.add(123);
		
		for(Object obj:ts){
			String str=(String) obj;
			System.out.println(str);
		}
		/*System.out.println("============");
		System.out.println(ts.first());
		System.out.println(ts.last());
		

		TreeSet ts2=new TreeSet();
		ts2.add(new Errs());
		ts2.add(new Errs());
		ts2.add(new Errs());
		*/
		
	}

}
