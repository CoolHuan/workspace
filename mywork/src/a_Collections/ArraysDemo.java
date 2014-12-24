/*容器:数组------>集合
 * asList:使数组可以使用集合的高级方法,不需要手动实现。
 * 但不支持增删操作，因为数组是固定长度
 * 
 * Arrays用来操作数组的类
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
		System.out.println("baidu是否存在："+list.contains("baidu"));
		
	}
	//判断数组中是否有某个元素？
	public static boolean isExist(String[] arr,String str){
		for(String e:arr){
			if(e.equals(str)){
				return true;
			}
			
		}
		
		return false;
	}
}
