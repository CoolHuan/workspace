package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;


public class Client {
	public static void main(String[] args) throws IOException {
		Socket s=new Socket("127.0.0.1",10548);
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		PrintStream ps=new PrintStream(s.getOutputStream(),true);
		
		BufferedReader bfr2=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		while(true){
			System.out.println("��˵:");
			String str=bfr.readLine();
			ps.println(str);
			
			String str2=bfr2.readLine();
			System.out.println("������˵��"+str2);
			
		}
		
		
//		OutputStream os=s.getOutputStream();
//		os.write("����������".getBytes());
//		
//		
//		InputStream is=s.getInputStream();
//		byte[] buf=new byte[1024];
//		int len=is.read(buf);
//		System.out.println(new String(buf, 0, len));
//	

	}

}
