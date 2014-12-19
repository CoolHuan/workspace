
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

import org.omg.CORBA.PUBLIC_MEMBER;
public class Test {
	
	public  static void count(char c ,char[]arr){
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(c==arr[i])
				j++;
		}	
		System.out.println("×Ö·û"+c+"³öÏÖ£º"+j+"´Î");
		}
	
	public static void main(String[] args) {
		
		int[] a=new int[10];
		for(int i=0;i<a.length;i++){
			a[i]=0;
		}
		String str=new String("13913535174");
		char[] ch=str.toCharArray();
		HashSet hs=new HashSet();
		for(int i=0;i<ch.length;i++){
			hs.add(ch[i]);
		}
		Iterator it=hs.iterator();
		
		while (it.hasNext()) {
			Character object = (Character) it.next();
			count(object,ch);
		}
	}
}

 