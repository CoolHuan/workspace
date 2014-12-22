/*
 * 演示对已有文件的数据续写
 * */
package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo3 {

	public static void main(String[] args) {
	
		FileWriter fw=null;
		try {
			//传递一个true参数，代表不覆盖已有的文件、并在已有文件的末尾处进行数据续写	
			 fw=new FileWriter("demo.txt", true);
			 fw.write("nihao\r\nxiexie");
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			try {
				if(fw!=null);
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
