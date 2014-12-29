package Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*���󣺶���һ��Ӧ�ó������ڽ���udpЭ�鴫������ݲ�����
 * 
 * 
 * ����udp�Ľ��ն�
 * ˼·��
 * 1������updsocket����ͨ�������һ���˿ڡ���ʵ���Ǹ������������Ӧ�ó���
 * �������ֱ�ʶ����������ȷ��Щ���ݹ�����Ӧ�ó�����Դ���
 * 2������һ�����ݰ�����ΪҪ�洢���ܵ����ֽ����ݡ�
 * ��Ϊ���ݰ��������и��๦�ܿ�����ȡ�ֽ������еĲ�ͬ������Ϣ
 * 3.ͨ��socket�����receive�������ܵ������ݴ����Ѷ���õ����ݰ��С�
 * 4.ͨ�����ݰ���������й��ܡ�����Щ��ͬ������ȥ������ӡ�ڿ���̨��
 * 5.�ر���Դ
 * */
public class UdpReceive{
	
	public static void main(String[] args) throws IOException{
		//1,����udp socket�������˵�
		DatagramSocket ds=new DatagramSocket(10000);

		//����һ�����ݰ�
		byte[] buf=new byte[1024];
		DatagramPacket dp=new DatagramPacket(buf,buf.length);
		
		//3��ͨ�������receive�������յ����ݴ������ݰ���
		ds.receive(dp);
		
		//4.ͨ�����ݰ��ķ�����ȡ���е�����
		String ip=dp.getAddress().getHostAddress();
		String Data=new String(dp.getData(),0,dp.getLength());
		int port=dp.getPort();
		System.out.println("ip::"+ip+"Data::"+Data+"port::"+port);
		//5.�ر���Դ
		ds.close();
		
	}
}