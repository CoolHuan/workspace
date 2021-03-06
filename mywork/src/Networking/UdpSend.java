
package Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 *需求：通过udp传输方式，将一段文字数据发送出去。
 *思路：
 *1，建立updsocket服务
 *2，提供数据，并将数据封装到数据包中
 *3，通过socket服务的发送功能，将数据包发出去
 *4，关闭资源 
 * 
 */

public class UdpSend {

	
	public static void main(String[] args) throws IOException {
		//1、创建udp服务。通过DatagaramSocket对象
		DatagramSocket ds=new DatagramSocket();
		
		
		//2,确定数据，并封装成数据包
		byte[] data="udp ge men lai le".getBytes();
		DatagramPacket dp=new DatagramPacket(data, data.length, InetAddress.getByName("10.205.1.34"),10000);
		
		//3、通过socket服务的发送功能，将数据包发出去
		ds.send(dp);
		
		//4，关闭资源
		ds.close();
		
		
	}

}


