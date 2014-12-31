package chattool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

class send implements Runnable {
	DatagramSocket ds;
	public send(DatagramSocket ds){
		this.ds=ds;
	}
	public void run() {
		try {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
			
			while((line = bfr.readLine())!=null){
			if("886".equals(line))
				break;
			byte[] buf=line.getBytes();
			DatagramPacket dp=new DatagramPacket(buf,buf.length, InetAddress.getByName("10.205.1.13"), 45678);
			ds.send(dp);
			
			}
		} catch (Exception e) {
			System.out.println("´«ËÍÊ§°Ü");
			e.printStackTrace();
		}
		
	}
}

class Receive implements Runnable{
	DatagramSocket ds;
	public Receive(DatagramSocket ds){
		this.ds=ds;
	}
	
	public void run() {
		try {	
			while(true){
			byte[] buf=new byte[1024];
			DatagramPacket dp=new DatagramPacket(buf, buf.length);
	
			ds.receive(dp);
			String ip=dp.getAddress().getHostName();
			String data=new String(dp.getData(),0,dp.getLength());
			int port=dp.getPort();
			System.out.println("ip:"+ip+"\n"+data);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
} 
public class ChatDemo {


	public static void main(String[] args) throws IOException {
		DatagramSocket send=new DatagramSocket();
		DatagramSocket receive=new DatagramSocket(45678);
		new Thread(new send(send)).start();
		new Thread(new Receive(receive)).start();

	}

}
