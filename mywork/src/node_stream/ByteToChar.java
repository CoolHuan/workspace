package node_stream;

import java.io.*;



public class ByteToChar {

	public static void main(String[] args) throws IOException {
		//System.in== �ֽ�������
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader bur=new BufferedReader(isr);
		
		String buff=null;
		while((buff=bur.readLine())!=null){
			if(buff.equals("exit")){
				System.out.println("ϵͳ�˳�");
			}else
			System.out.println(buff);
		}
	}

}
