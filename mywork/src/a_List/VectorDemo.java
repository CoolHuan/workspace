package a_List;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		
		for(int i=0;i<5;i++){
			v.addElement("it-"+i);
		}
		System.out.println(v);
		
		Enumeration enu= v.elements();
		while(enu.hasMoreElements()){
			String obj=(String)enu.nextElement();
			System.out.println(obj);
		}
	}

}
