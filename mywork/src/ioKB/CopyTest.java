/*��C��һ���ı��ļ����Ƶ�D��
 * ���Ƶ�ԭ�� 
 * ��ʵ���ǽ�C���µ��ļ����ݴ洢��D�̵�һ���ļ��С�
 * ���裺
 * 1����D�̴���һ���ļ������ڴ洢C���ļ��е����ݡ�
 * 2�������ȡ����C���ļ�������
 * 3��ͨ�����ϵĶ�д������ݴ洢��
 * 4���ر���Դ��
 * 
 * */
package ioKB;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTest {

	
	public static void main(String[] args) throws IOException {
		copy_1();

	}
	//��C�̶�һ���ַ�������D��дһ���ַ�
	public static void copy_1() throws IOException{
		//����Ŀ�ĵء�
		FileWriter fw=new FileWriter("DiyTest_copy.txt");
		
		//�������ļ�������
		FileReader fr=new FileReader("DiyTest.java");
		int ch=0;
	//	char[] byt=new char[1024]; 
		while((ch=fr.read())!=-1){
			fw.write(ch);
			
		}
		fw.close();
		fr.close();
		
		
	}
}
