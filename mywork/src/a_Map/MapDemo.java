package a_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		//1����Ӳ���
		System.out.println(map.put(123, "Google"));//key�����ڷ���null
		System.out.println(map.put(123, "Apple"));//put ����key�ϴζ�Ӧ��value
		
		map.put(312, "Baidu");
		map.put(11, "Alibaba");
		
		System.out.println(map);
		
		//2��ɾ��Ԫ��
		System.out.println(map.remove(1));//���Ƴ�һ�������ڵļ�����null
		System.out.println(map.remove(11));//����  �Ƴ���ֵ�ԣ�������ӳ���value
		//map.clear();
		System.out.println(map);
		//3.�ж�
		if(map.containsKey(123))
			System.out.println("key����");
		else {
			System.out.println("key������");
		}
		
		if(map.containsValue("Apple"))
			System.out.println("value����");
		else {
			System.out.println("value������");
		}
		
		if(map.isEmpty()){
			System.out.println("map��");
		}else{
			System.out.println("map�ǿ�"+map.size());
		}
		
		//4.��ȡ
		System.out.println(map.get(321));//�����ڷ���null
		System.out.println(map.get(312));//���ڷ��� value
		System.out.println("==========");
		
		/*5������������ mapû�е�����
		 *  a���õ�һ��key��set����
		 *  b��ʹ�ø�set���ϵĵ�����ȥ����key
		 *  c��ʹ��get+������==����value
		 */
		Set<Integer> set=map.keySet();
		
		Iterator<Integer> it=set.iterator();
		
		while (it.hasNext()) {
			Integer integer =it.next();
			System.out.println(map.get(integer));
		}
		System.out.println("==========");
		
		
		Collection<String> co=map.values();
		Iterator<String> it1=co.iterator();
		while (it1.hasNext()) {
			String string = it1.next();
			System.out.println(string);
		}
		System.out.println("==========");
		
		//ʹ��entrySet()������map����ת����:set���ϣ�ʹ�õ�����
		//Map.Entry����:ӳ����=��ֵ�ԡ���-ֵ��
		Set<Map.Entry<Integer, String>> set1=map.entrySet();
		Iterator<Map.Entry<Integer, String>> it2=set1.iterator();
		while (it2.hasNext()) {
			Map.Entry<Integer, String> ma=it2.next();
			System.out.println(ma);
		//	System.out.println(ma.getKey()+"\t"+ma.getValue()); 
			
		}
	}

}
