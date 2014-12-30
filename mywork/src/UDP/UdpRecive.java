package UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpRecive {

	public static void main(String[] args) {
		try {
			DatagramSocket ds=new DatagramSocket(30000);
			while(true){
				byte[] buf=new byte[1024];
				DatagramPacket dp=new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				String ip=dp.getAddress().getHostAddress();
				String data=new String(dp.getData(), 0, dp.getLength());
				System.out.println(ip+":"+"\n"+data);
			}
		} catch (SocketException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
