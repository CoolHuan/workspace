package UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpSend {

	public static void main(String[] args) {
		try {
			DatagramSocket ds=new DatagramSocket();
			BufferedReader bur=new BufferedReader(new InputStreamReader(System.in));
			String line=null;
			while((line=bur.readLine())!=null){
				if("886".equals(line))
					break;
				
					byte[] bye=line.getBytes();
					DatagramPacket dp=new DatagramPacket(bye, bye.length, InetAddress.getByName("10.205.1.13"), 30000);
					ds.send(dp);
			}
				ds.close();
		} catch (SocketException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
