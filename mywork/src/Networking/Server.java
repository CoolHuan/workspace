package Networking;

import java.io.*;
import java.net.*;

import javax.swing.text.AbstractDocument.BranchElement;


/*
 * 
 * 
 * 
 * */
public class Server {

	
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(30000);
		
			System.out.println("�������ڼ�����������");
			Socket s=ss.accept();
			//������������
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader bur=new BufferedReader(isr);
			//�����������
			PrintStream ps=new PrintStream(s.getOutputStream(),true);
			//��ȡ�ӿ���̨�������Ϣ
			InputStreamReader isr2=new InputStreamReader(System.in);
			BufferedReader bur2=new BufferedReader(isr2);
			
			while(true){
			String xinxi=bur.readLine();
			System.out.println("�ͻ���˵:"+xinxi);
			
			System.out.println("��˵:");
			String fasong=bur2.readLine();
			ps.println(fasong);
			
		}
			
	}

}
