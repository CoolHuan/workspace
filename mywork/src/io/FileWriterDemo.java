/*��ȻIO�������ڲ������ݵģ���ô���ݵ����������ʽ�ǣ��ļ���
 * ��ô���Բ����ļ�Ϊ������ʾ��
 * ������Ӳ���ϣ�����һ���ļ���д��һЩ�������ݡ�
 * �ҵ�һ��ר�����ڲ����ļ���Writer�������FileWriter.��׺���Ǹ�������ǰ׺�ǹ���
*/
package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	
	public static void main(String[] args) throws IOException {
		//����һ��FileWriter���󡣸ö���һ����ʼ���ͱ���Ҫ��ȷ���������ļ���
		//���Ҹ��ļ��ᱻ������ָ��Ŀ¼�¡������Ŀ¼������ͬ���ļ����������ǡ�
		//��ʵ�ò���������ȷ����Ҫ��ŵ�Ŀ�ĵء�
		FileWriter fw=new FileWriter("demo.txt");
		//����write���������ַ���д�뵽���С�
		fw.write("abcde");
		//ˢ���������еĻ����е�����
		//������ˢ��Ŀ�ĵ��С�
		//fw.flush();
		
		
		//�ر�����Դ�����ǹر�֮ǰ��ˢ��һ���ڲ��Ļ����е����ݡ�
		//������ˢ��Ŀ�ĵ���
		//��flush����  flushˢ��hour�������Լ���ʹ�ã�closeˢ�º󣬻Ὣ���رա�
		fw.close();
	//	fw.write("haha");
		
	}

}