package xuliehua;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 反序列化：
 * 1.ObjectInputStream输入流对象：==处理流===基于节点流FileInputStream
 * 2.readObject() 知道类型要强转。
 * 
 * */

public class ReadObject {


	public static void main(String[] args) {
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object.txt"));
			
			Person per=(Person)ois.readObject();
			System.out.println("姓名："+per.getName()+"\t年龄："+per.getAge());
			per.eat();
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
