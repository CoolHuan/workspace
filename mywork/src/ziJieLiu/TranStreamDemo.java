package ziJieLiu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * ͨ���ղŵļ���¼��һ�����ݲ���ӡ���д��������ʵ���Ƕ�һ�����ݵ�ԭ��Ҳ����readLine������
 * �ܲ���ֱ��ʹ��readLine��������ɼ���¼���һ�����ݵĶ�ȡ�أ�
 * 
 * readLine�������ַ���BufferedReader���еķ���
 * ������¼���read�������ֽ���InputStream�ķ���
 * 
 * ��ô�ܲ��ܽ��ֽ���ת���ַ�����ʹ���ַ���������readLine������
 * */
public class TranStreamDemo {

	public static void main(String[] args) throws IOException {
		
		OutputStream out=System.out;
		OutputStreamWriter osw=new OutputStreamWriter(out);
		BufferedWriter bfw=new BufferedWriter(osw);
		//��ȡ����¼�����
		InputStream in=System.in;
		//���ֽ�������ת���ַ�������ʹ��ת������InputStreamReader
		InputStreamReader isr=new InputStreamReader(in);
		//Ϊ�����Ч�ʣ����ַ������л�����������Ч������ʹ��BufferedReader
		BufferedReader bur=new BufferedReader(isr);
		String line=null;
		while((line=bur.readLine())!=null){
			if("over".equals(line))
				break;
			bfw.write(line.toUpperCase());
			bfw.newLine();
			bfw.flush();
		
		}
		in.close();
		
	}

}
