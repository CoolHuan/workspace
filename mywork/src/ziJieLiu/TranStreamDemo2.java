package ziJieLiu;

import java.io.*;
/*
 * �������Ļ������ɣ�
 * ��ʹ��ľ����������кܶ࣬��֪��������һ��
 * ͨ��������ȷ�����
 * 1.��ȷԴ��Ŀ�ġ�
 * 	Դ����������InputStream  Reader
 * 	Ŀ�ģ��������OutputStream Writer
 * 2.�����������Ƿ��Ǵ��ı���
 * 		�ǣ����ַ���
 * 		���ǣ����ֽ���
 * 3.����ϵ��ȷ������ȷҪʹ���ĸ�����Ķ���
 * 	ͨ���豸���������֣�
 * 	�豸���ڴ棬Ӳ�̡�����
 * 	Ŀ���豸���ڴ棬 Ӳ�̣�����̨
 * 
 * 
 * */

public class TranStreamDemo2 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader bur=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("dfsfds.txt")));
		
		String line=null;
		while((line=bur.readLine())!=null){
			bfw.write(line.toUpperCase());
			bfw.newLine();
			bfw.flush();
		}
		bur.close();
		System.out.close();
	}

}
