package io;
/*
 *�ڶ��ַ�ʽ��ͨ���ַ�������ж�ȡ 
 * */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("demo.txt");
		//����һ���ַ����飬���ڴ洢�������ַ�
		//��read(char[])���ص��Ƕ����ַ�������
		char[] buf=new char[1024];
		
		int num=0;
		while((num=fr.read(buf))!=-1){
			System.out.println("num="+num+"..."+new String(buf,0,num));
		}
		fr.close();
	}

}
