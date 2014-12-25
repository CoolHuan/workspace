package Networking;

import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) throws IOException {
		Socket s=new Socket("127.0.0.1",30000);
		PrintWriter pw=new PrintWriter(s.getOutputStream(), true);	
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			System.out.println("我发言:");
			String fasong=br2.readLine();
			pw.println(fasong);
			
			String line=br.readLine();
			System.out.println("服务器说:"+line);
		
			
		}
	}

}
