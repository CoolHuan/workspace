package io;

import java.io.FileWriter;
import java.io.IOException;

/*
 * IO异常的处理方式。
 * 
 * */
public class FileWriterDemo2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		FileWriter fw=null;
		try {
			fw= new FileWriter("demo.txt");
			fw.write("abcdefg");
			

		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally{
			try {
				//一定要对所启用的流判断 不等于空 再去关闭流。
				if(fw!=null)
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
