import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/*
 * ���ͣ��ڳ�����ʹ��<>��ָ������
 * 	����������Ķ��塢�ӿڶ��塢�������塢����
 * */

public class GenericDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<>();
		ts.add("google");
		ts.add("baidu");
		//list.add(123); ������ʱ�Ĵ�����ǰ������ʱ��飬���緢�ִ���
		for (String string : ts) {
			System.out.println(string);//������ǿ��ת��
		}
	}

}
