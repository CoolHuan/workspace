package io;

import java.io.FileWriter;
import java.io.IOException;

/*
 * IO�쳣�Ĵ���ʽ��
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
				//һ��Ҫ�������õ����ж� �����ڿ� ��ȥ�ر�����
				if(fw!=null)
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
