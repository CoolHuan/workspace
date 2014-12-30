package Networking;

import java.io.*;
import java.net.*;
/*
 *1. 建立socket服务。指定连接主机和端口。
 *2.获取socket流中的输出流。将数据写到该流中。通过网络发送给客户端。
 *3.获取socket流中的输入流，将服务端反馈的数据获取到，并打印。 
 *4.关闭客户端资源
 * 
 * */
public class Client {

	public static void main(String[] args) throws IOException {
		Socket s=new Socket("127.0.0.1",30000);
		//客户端输出流
		PrintWriter pw=new PrintWriter(s.getOutputStream(), true);
		//客户端输入流
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			System.out.println("我发言:");
			String fasong=br2.readLine();
			pw.println(fasong);
			
			String line=br.readLine();
			System.out.println("服务器说:"+line);
		
			
		}
	}

}
