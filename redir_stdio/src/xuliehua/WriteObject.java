package xuliehua;

/*
 * �������л������ڴ��еĶ��󣬱����ڴ��̡����紫��
 * ������--->ת��ƽ̨�޹صĶ�����--->���浽���̡�
 * ʵ�֣����������ķ���     ������Կ����ʹ��
 * 
 * ���󶼿������л���-----��ͨ����ô��ɿ����л����ࣿ
 * no��
 * Serizlizable
 * Externallizable
 * 
 * ���л����ڴ����p---->IO��
 * �����л���IO��---->�����ڴ桿 p.name p.age
 * */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject{
	
	public static void main(String[] args) {
		ObjectOutputStream oos;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
			Person p=new Person("��", 22);
			oos.writeObject(p);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
