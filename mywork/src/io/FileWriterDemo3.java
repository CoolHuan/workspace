/*
 * ��ʾ�������ļ���������д
 * */
package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo3 {

	public static void main(String[] args) {
	
		FileWriter fw=null;
		try {
			//����һ��true�����������������е��ļ������������ļ���ĩβ������������д	
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
