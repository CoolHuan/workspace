import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/*
 * 泛型：在程序中使用<>来指定类型
 * 	可以用在类的定义、接口定义、方法定义、集合
 * */

public class GenericDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<>();
		ts.add("google");
		ts.add("baidu");
		//list.add(123); 把运行时的错误，提前到编译时检查，提早发现错误
		for (String string : ts) {
			System.out.println(string);//避免了强制转换
		}
	}

}
