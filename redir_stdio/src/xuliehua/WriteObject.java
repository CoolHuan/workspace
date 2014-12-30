package xuliehua;

/*
 * 对象序列化：把内存中的对象，保存在磁盘、网络传输
 * 【对象--->转成平台无关的二进制--->保存到磁盘】
 * 实现：对象与程序的分析     对象可以跨程序使用
 * 
 * 对象都可以序列化吗？-----普通类怎么变成可序列化的类？
 * no、
 * Serizlizable
 * Externallizable
 * 
 * 序列化：内存对象p---->IO流
 * 反序列化：IO流---->对象【内存】 p.name p.age
 * */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject{
	
	public static void main(String[] args) {
		ObjectOutputStream oos;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
			Person p=new Person("大华", 22);
			oos.writeObject(p);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
