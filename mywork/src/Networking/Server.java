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
		
			System.out.println("服务器在监听····");
			Socket s=ss.accept();
			//服务器输入流
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader bur=new BufferedReader(isr);
			//服务器输出流
			PrintStream ps=new PrintStream(s.getOutputStream(),true);
			//读取从控制台输入的消息
			InputStreamReader isr2=new InputStreamReader(System.in);
			BufferedReader bur2=new BufferedReader(isr2);
			
			while(true){
			String xinxi=bur.readLine();
			System.out.println("客户端说:"+xinxi);
			
			System.out.println("我说:");
			String fasong=bur2.readLine();
			ps.println(fasong);
			
		}
			
	}

}
