package a_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		//1、添加操作
		System.out.println(map.put(123, "Google"));//key不存在返回null
		System.out.println(map.put(123, "Apple"));//put 返回key上次对应的value
		
		map.put(312, "Baidu");
		map.put(11, "Alibaba");
		
		System.out.println(map);
		
		//2、删除元素
		System.out.println(map.remove(1));//当移除一个不存在的键返回null
		System.out.println(map.remove(11));//存在  移除键值对，返回其映射的value
		//map.clear();
		System.out.println(map);
		//3.判断
		if(map.containsKey(123))
			System.out.println("key存在");
		else {
			System.out.println("key不存在");
		}
		
		if(map.containsValue("Apple"))
			System.out.println("value存在");
		else {
			System.out.println("value不存在");
		}
		
		if(map.isEmpty()){
			System.out.println("map空");
		}else{
			System.out.println("map非空"+map.size());
		}
		
		//4.获取
		System.out.println(map.get(321));//不存在返回null
		System.out.println(map.get(312));//存在返回 value
		System.out.println("==========");
		
		/*5、遍历操作： map没有迭代器
		 *  a、得到一个key的set集合
		 *  b、使用该set集合的迭代器去遍历key
		 *  c、使用get+迭代器==遍历value
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
		
		//使用entrySet()方法把map集合转换成:set集合，使用迭代器
		//Map.Entry类型:映射项=键值对【键-值】
		Set<Map.Entry<Integer, String>> set1=map.entrySet();
		Iterator<Map.Entry<Integer, String>> it2=set1.iterator();
		while (it2.hasNext()) {
			Map.Entry<Integer, String> ma=it2.next();
			System.out.println(ma);
		//	System.out.println(ma.getKey()+"\t"+ma.getValue()); 
			
		}
	}

}
