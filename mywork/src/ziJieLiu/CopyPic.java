/*
 * ����һ��ͼƬ
 * ˼·��
 *  ���ֽڶ�ȡ�������ͼƬ������
 *  ���ֽ�д��������һ��ͼƬ�ļ������ڴ洢��ȡ����ͼƬ���ݡ�
 *  ͨ��ѭ����д��������ݵĴ洢��
 *  �ر���Դ
 * 
 * */

package ziJieLiu;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPic {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		FileInputStream fis=null;
		
		try {
			fos=new FileOutputStream("smoking_copy.jpg");
			fis=new FileInputStream("smoking.jpg");
			byte[] buf=new byte[1024];
			int len=0;
		while((len=fis.read(buf))!=-1){
			
			fos.write(buf, 0, len);
		}
		} catch (IOException e) {
			
			throw new RuntimeException("�����ļ�ʧ��");
		}finally{
			if(fis!=null)
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("��ȡʧ��");
				}
			if(fos!=null)
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println("д��ʧ��");
			}
		}	
	}
}
