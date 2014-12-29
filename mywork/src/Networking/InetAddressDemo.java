package Networking;

import java.io.IOException;
import java.net.*;
/*
 * InetAddress本身没有提供太多功能，它代表一个IP地址对象，是网络通信的基础
 * InetAddress类没有提供构造器，而是提供了2个静态方法来获取实例
 * 		getByName(String host):根据主机获取对应的InetAddress对象
 * 		getByAddress(byte[] addr):根据原始IP地址来获取对应的InetAddress对象
 * 
 * */

public class InetAddressDemo {

	public static void main(String[] args) throws IOException {
		// 根据主机名来获取对应的InetAddress实例
		InetAddress ip=InetAddress.getByName("www.baidu.com");
		//判断是否可达
		System.out.println("crazyit是否可到达"+ip.isReachable(20));
		//获取该InetAddress实例的IP字符串
		System.out.println(ip.getHostAddress());
		//根据原始IP地址来获取对应的InetAddress实例
		InetAddress local=InetAddress.getByAddress(new byte[]{127,0,0,1});
		System.out.println("本机是否可达:"+local.isReachable(5000));
		//获取该InetAddres实例对应的全限定域名
		System.out.println(local.getCanonicalHostName());

	}

}
