package Networking;

import java.io.*;
import java.net.*;
/*
 *1. ����socket����ָ�����������Ͷ˿ڡ�
 *2.��ȡsocket���е��������������д�������С�ͨ�����緢�͸��ͻ��ˡ�
 *3.��ȡsocket���е���������������˷��������ݻ�ȡ��������ӡ�� 
 *4.�رտͻ�����Դ
 * 
 * */
public class Client {

	public static void main(String[] args) throws IOException {
		Socket s=new Socket("127.0.0.1",30000);
		//�ͻ��������
		PrintWriter pw=new PrintWriter(s.getOutputStream(), true);
		//�ͻ���������
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			System.out.println("�ҷ���:");
			String fasong=br2.readLine();
			pw.println(fasong);
			
			String line=br.readLine();
			System.out.println("������˵:"+line);
		
			
		}
	}

}
