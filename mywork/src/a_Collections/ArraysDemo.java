/*����:����------>����
 * asList:ʹ�������ʹ�ü��ϵĸ߼�����,����Ҫ�ֶ�ʵ�֡�
 * ����֧����ɾ��������Ϊ�����ǹ̶�����
 * 
 * Arrays���������������
 * */

package a_Collections;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		run1();
	}
	public static  void run1(){
		String[] str={"baidu","google","alibaba"};
		System.out.println(str);
		System.out.println(Arrays.toString(str));
		
		for(String string:str){
			System.out.println(string);
		}
		List<String> list=Arrays.asList(str);
		System.out.println("baidu�Ƿ���ڣ�"+list.contains("baidu"));
		
	}
	//�ж��������Ƿ���ĳ��Ԫ�أ�
	public static boolean isExist(String[] arr,String str){
		for(String e:arr){
			if(e.equals(str)){
				return true;
			}
			
		}
		
		return false;
	}
}
