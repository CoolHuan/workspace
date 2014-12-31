package chattool;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TextClient {
	
	public static void main(String[] args) throws IOException {
		Socket s=new Socket("127.0.0.1", 30000);
		BufferedReader buf=new BufferedReader(new FileReader("hajha.txt"));
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		String line=null;
		while((line=buf.readLine())!=null){
			pw.println(line);
		}
		s.shutdownOutput();
		
		BufferedReader buf2=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line2=buf2.readLine();
		System.out.println(line2);
		buf.close();
		s.close();
	}

}
