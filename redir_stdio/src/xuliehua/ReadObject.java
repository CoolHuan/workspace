package xuliehua;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * �����л���
 * 1.ObjectInputStream����������==������===���ڽڵ���FileInputStream
 * 2.readObject() ֪������Ҫǿת��
 * 
 * */

public class ReadObject {


	public static void main(String[] args) {
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object.txt"));
			
			Person per=(Person)ois.readObject();
			System.out.println("������"+per.getName()+"\t���䣺"+per.getAge());
			per.eat();
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
