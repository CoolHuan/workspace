package tcp;

import java.io.*;
import java.net.*;


public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(10548);
		Socket s=ss.accept();
		BufferedReader bfr=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		
		PrintStream ps=new PrintStream(s.getOutputStream(),true);
		BufferedReader bfr2=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str1=bfr.readLine();
			System.out.println("�ͻ���˵��"+str1);
			
			System.out.println("��˵:");
			String str2=bfr2.readLine();
			ps.println(str2);
			
		}
		
		
//		InputStream is=s.getInputStream();	
//		byte[] buf=new byte[1024];
//		int len=is.read(buf);
//		System.out.println(new String(buf, 0, len));
//		OutputStream os=s.getOutputStream();
//		os.write("�����ȥ˯����...".getBytes());
		
		
	}

}
