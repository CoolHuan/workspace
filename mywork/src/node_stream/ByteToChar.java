package node_stream;

import java.io.*;



public class ByteToChar {

	public static void main(String[] args) throws IOException {
		//System.in== 字节输入流
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader bur=new BufferedReader(isr);
		
		String buff=null;
		while((buff=bur.readLine())!=null){
			if(buff.equals("exit")){
				System.out.println("系统退出");
			}else
			System.out.println(buff);
		}
	}

}
