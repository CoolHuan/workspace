/*
 * �������ĳ���ʱΪ��������Ĳ���Ч�ʶ����ֵ�
 * �����ڴ���������֮ǰ������Ҫ����������
 * �û��������ṩ��һ����ƽ̨�Ļ��з���new line()
 *
 * */
package ioKB;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.security.auth.x500.X500Principal;

public class BufferedWriterDemo {

	
	public static void main(String[] args) throws IOException {
		//����һ���ַ�д��������
		FileWriter fw=new FileWriter("buf.txt");
		//Ϊ������ַ�д������Ч�ʡ������˻��弼����ֻҪ����Ҫ�����Ч�ʵ�
		//��������Ϊ�������ݸ��������Ĺ��캯�����ɡ�
		BufferedWriter bufw=new BufferedWriter(fw);
		for(int x=1;x<5;x++){
			bufw.write("abcde"+x);
			bufw.newLine();
			bufw.flush();
		}
		
		
		//��ס��ֻҪ�õ����������ͼǵ�ˢ�¡�
		//��ʵ�رջ������������ڹرջ������е�������
		bufw.close();
		
	}

}
