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
import java.security.PublicKey;

public class CopyTest {

	
	public static void main(String[] args) throws IOException {
		copy_2();

	}
	//��C�̶�һ���ַ�������D��дһ���ַ�
	public static void copy_1() throws IOException{
		//����Ŀ�ĵء�
		FileWriter fw=new FileWriter("D:\\DiyTest_copy.txt");
		
		//�������ļ�������
		FileReader fr=new FileReader("DiyTest.java");
		
		int ch=0;
		while((ch=fr.read())!=-1){
			fw.write(ch);
		}
			fr.close();
			fw.close();
	}
	
		public static void copy_2(){
		
			FileWriter fw = null;
			FileReader fr = null;
			try {
				fw = new FileWriter("ExceptionDemo_copy.txt");
				fr=new FileReader("ExceptionDemo.java");
				
				char[] byt=new char[1024];
				int len=fr.read(byt);
				while (len!=-1) {
					fw.write(byt, 0, len);
				}
			} catch (IOException e) {	
				throw new RuntimeException("��дʧ��");
			}
			finally{
				if(fr!=null)
					try {
						fr.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				if (fw!=null) {
					try {
						fw.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}	
			}
		}
	}

