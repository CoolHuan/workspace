
package Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 *����ͨ��udp���䷽ʽ����һ���������ݷ��ͳ�ȥ��
 *˼·��
 *1������updsocket����
 *2���ṩ���ݣ��������ݷ�װ�����ݰ���
 *3��ͨ��socket����ķ��͹��ܣ������ݰ�����ȥ
 *4���ر���Դ 
 * 
 */

public class UdpSend {

	
	public static void main(String[] args) throws IOException {
		//1������udp����ͨ��DatagaramSocket����
		DatagramSocket ds=new DatagramSocket();
		
		
		//2,ȷ�����ݣ�����װ�����ݰ�
		byte[] data="udp ge men lai le".getBytes();
		DatagramPacket dp=new DatagramPacket(data, data.length, InetAddress.getByName("10.205.1.34"),10000);
		
		//3��ͨ��socket����ķ��͹��ܣ������ݰ�����ȥ
		ds.send(dp);
		
		//4���ر���Դ
		ds.close();
		
		
	}

}


