package Networking;

import java.io.IOException;
import java.io.InputStream;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*��ʾtcp����
 * 
 * 1.tcp�ֿͻ��˺ͷ���ˡ�
 * 2���ͻ��˶�Ӧ�Ķ�����Socket
 * 		����˶�Ӧ�Ķ�����ServerSocket.
 * �ͻ���
 * ͨ������socket���󣬷����ڸö�����ʱ���Ϳ���ȥ����ָ��������
 * ��Ϊtcp���������ӵġ������ڽ���socket����ʱ��
 * ��Ҫ�з���˴��ڣ������ӳɹ����γ�ͩ®���ڸ�ͨ�����д���
 * 
 * ���裺
 * 1������Socket���񡣲�ָ��Ҫ���ӵ������Ͷ˿ڡ�
 * */
class Client1{
	public static void main(String[] args) throws IOException {
	//�����ͻ��˵�socket����ָ��Ŀ�������Ͷ˿�
	Socket s=new Socket("10.205.1.34",10003);
	//Ϊ�˷������ݣ�Ӧ�û�ȡsocket���е������
	OutputStream out=s.getOutputStream();
	out.write("tcp ge men lai le".getBytes());
	s.close();
	}
}
/*
 * ����ˣ�
 * 1����������˵�socket����ServerSocket();
 * ������һ���˿ڡ�
 * 2����ȡ���ӹ����Ŀͻ�����
 * 	ͨ��ServerSocket��accept������û�����Ӿͻ�������������������ʽ��
 * 3���ͻ���������������ݣ���ô�����Ҫʹ�ö�Ӧ�Ŀͻ��˶��󣬲���ȡ�ÿͻ��˶���Ķ�ȡ��
 * 	����ȡ�����������ݲ���ӡ�ڿ���̨
 * 4���رշ���ˣ���ѡ��;
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
