/*
 * �ַ���ȡ����������
 * �û������ṩ��һ��һ�ζ�һ�еķ���readLine,�����ڶ��ı����ݵĻ�ȡ
 * ������nullʱ����ʾ�����ļ�ĩβ��
 * 
 * readLine�������ص�ʱ��ֻ���ػس���֮ǰ���������ݡ��������ػس�����
 * 
 * */
package ioKB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception {
		//����һ����ȡ��������ļ��������
		FileReader fr=new FileReader("buf.txt");
		//Ϊ�����Ч�ʡ����뻺�弼�������ַ���ȡ��������Ϊ�������ݸ��������Ĺ��캯�����ɡ�
		BufferedReader bufr=new BufferedReader(fr);
		String line=null;
		while((line=bufr.readLine())!=null)
		System.out.println(line);
		bufr.close();
	}

}
