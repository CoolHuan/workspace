package file_demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/file_demo/FileOutputStreamDemo.java");
		FileOutputStream fos=new FileOutputStream("hajha.txt");
		byte[] buy=new byte[1024];
		int len=0;
		while((len=fis.read(buy))!=-1){
			System.out.println(new String(buy, 0, len));
			fos.write(buy,0,len);
		}
	}

}
