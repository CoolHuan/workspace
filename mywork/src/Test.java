import java.util.ArrayList;


public class Test {

	
	public static void main(String[] args) {
		int[] a=new int[10];
		for(int i=0;i<a.length;i++){
			a[i]=0;
		}
		System.out.println(a);
		String str=new String("13913535174");
		char[] ch=str.toCharArray();
		ArrayList lt=new ArrayList();
		for(int i=0;i<ch.length;i++){
			lt.add(ch[i]);
		}
		System.out.println(lt);
	}
}