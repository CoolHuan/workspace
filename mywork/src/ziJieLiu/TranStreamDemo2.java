package ziJieLiu;

import java.io.*;
/*
 * 流操作的基本规律：
 * 最痛苦的就是流对象有很多，不知道该用哪一个
 * 通过两个明确来完成
 * 1.明确源和目的。
 * 	源：输入流。InputStream  Reader
 * 	目的：输出流。OutputStream Writer
 * 2.操作的数据是否是纯文本。
 * 		是：用字符流
 * 		不是：用字节流
 * 3.当体系明确后，在明确要使用哪个具体的对象。
 * 	通过设备来进行区分：
 * 	设备：内存，硬盘。键盘
 * 	目的设备：内存， 硬盘，控制台
 * 
 * 
 * */

public class TranStreamDemo2 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader bur=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("dfsfds.txt")));
		
		String line=null;
		while((line=bur.readLine())!=null){
			bfw.write(line.toUpperCase());
			bfw.newLine();
			bfw.flush();
		}
		bur.close();
		System.out.close();
	}

}
