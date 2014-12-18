package a_List;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<5;i++){
			list.add("it-"+i); //自动装箱  基本数据类型封装成对象
		}
		
		//遍历
		
	/*	Iterator<String> it=list.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
	*/	
		for (Iterator it=list.iterator();it.hasNext();){
			String str=(String)it.next();
			System.out.println(str);
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String str:list){
			System.out.println(str);
		}
		
	}

}
