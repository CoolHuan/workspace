package chattool;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TextServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss=new ServerSocket(30000);
		Socket s=ss.accept();
	
	BufferedReader bfr=new BufferedReader(new InputStreamReader(s.getInputStream()));
	PrintWriter pw=new PrintWriter(new FileWriter("D:\\server.txt"),true);
		String line=null;
		while((line=bfr.readLine())!=null){
			pw.println(line);
		}

		PrintWriter pw1=new PrintWriter(s.getOutputStream(),true);
		String str="上传成功";
		pw1.println(str);
		
		bfr.close();
		s.close();
		ss.close();
		
		
	}

}
