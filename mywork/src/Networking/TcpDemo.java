package Networking;

import java.io.IOException;
import java.io.InputStream;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*演示tcp传输
 * 
 * 1.tcp分客户端和服务端。
 * 2，客户端对应的对象是Socket
 * 		服务端对应的对象是ServerSocket.
 * 客户端
 * 通过查阅socket对象，发现在该对象建立时，就可以去连接指定主机。
 * 因为tcp是面向连接的。所以在建立socket服务时，
 * 就要有服务端存在，并连接成功。形成桐庐后，在该通道进行传输
 * 
 * 步骤：
 * 1，创建Socket服务。并指定要连接的主机和端口。
 * */
class Client1{
	public static void main(String[] args) throws IOException {
	//创建客户端的socket服务。指定目的主机和端口
	Socket s=new Socket("10.205.1.34",10003);
	//为了发送数据，应该获取socket流中的输出流
	OutputStream out=s.getOutputStream();
	out.write("tcp ge men lai le".getBytes());
	s.close();
	}
}
/*
 * 服务端：
 * 1，建立服务端的socket服务。ServerSocket();
 * 并监听一个端口。
 * 2，获取连接过来的客户对象。
 * 	通过ServerSocket的accept方法。没有连接就会等所以这个方法是阻塞式的
 * 3，客户端如果发过来数据，那么服务端要使用对应的客户端对象，并获取该客户端对象的读取流
 * 	来读取发过来的数据并打印在控制台
 * 4，关闭服务端（可选）;
 */			
class Server1{
	public static void main(String[] args) throws IOException{
	ServerSocket ss=new ServerSocket(10003);
	Socket s=ss.accept();
	InputStream is=s.getInputStream();
	byte[] buf=new byte[1024];
	int len=is.read(buf);
	System.out.println(new String(buf, 0, len));
	System.out.println("ip:"+s.getInetAddress().getHostAddress());
	s.close();
	ss.close();
	}
}
	

//public class TcpDemo {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
