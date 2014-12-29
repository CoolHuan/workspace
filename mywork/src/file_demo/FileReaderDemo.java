package file_demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		//文件输入流
		FileReader fr=new FileReader("wstc.java");
		FileWriter fw=new FileWriter("coolhuan.txt");
		int len=0;
		while((len=fr.read())!=-1){
		fw.write(len);
		fw.flush();
			System.out.print((char)len);
		}
		
//		char[] ch=new char[1024];
//		int count=0;
//		while((count=fr.read(ch))!=-1){
//			fw.write(ch);
//			fw.flush();
//			System.out.println("count="+count+new String(ch, 0,count));
//		}
		fr.close();
		fw.close();
		
	}

}
