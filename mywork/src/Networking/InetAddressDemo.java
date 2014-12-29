package Networking;

import java.io.IOException;
import java.net.*;
/*
 * InetAddress����û���ṩ̫�๦�ܣ�������һ��IP��ַ����������ͨ�ŵĻ���
 * InetAddress��û���ṩ�������������ṩ��2����̬��������ȡʵ��
 * 		getByName(String host):����������ȡ��Ӧ��InetAddress����
 * 		getByAddress(byte[] addr):����ԭʼIP��ַ����ȡ��Ӧ��InetAddress����
 * 
 * */

public class InetAddressDemo {

	public static void main(String[] args) throws IOException {
		// ��������������ȡ��Ӧ��InetAddressʵ��
		InetAddress ip=InetAddress.getByName("www.baidu.com");
		//�ж��Ƿ�ɴ�
		System.out.println("crazyit�Ƿ�ɵ���"+ip.isReachable(20));
		//��ȡ��InetAddressʵ����IP�ַ���
		System.out.println(ip.getHostAddress());
		//����ԭʼIP��ַ����ȡ��Ӧ��InetAddressʵ��
		InetAddress local=InetAddress.getByAddress(new byte[]{127,0,0,1});
		System.out.println("�����Ƿ�ɴ�:"+local.isReachable(5000));
		//��ȡ��InetAddresʵ����Ӧ��ȫ�޶�����
		System.out.println(local.getCanonicalHostName());

	}

}
