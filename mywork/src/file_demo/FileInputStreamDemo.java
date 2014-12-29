package file_demo;

import java.io.FileInputStream;

import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			 fis=new FileInputStream("./src/file_demo/FileInputStreamDemo.java");
		//	int ch=0;
			//while((ch=fis.read())!=-1){
				//System.out.print((char)ch);
			 byte[] bbuf=new byte[1024];
			 int num=0;
			 while((num=fis.read(bbuf))!=-1){
				 System.out.println(new String(bbuf, 0, num));
			 }
			 
			
		} catch (IOException e) {
			System.out.println("¶ÁÈ¡ÎÄ¼þÊ§°Ü");
			e.printStackTrace();
		}
			try {
				if(fis!=null)
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}

}
