

package ziJieLiu;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
	public static void main(String[] args) throws IOException {
	//	writeFile();
	//	readFile();
		//readFile2();
		readFile3();

	}
	public static void writeFile() throws IOException{
		FileOutputStream fos=new FileOutputStream("fos.txt");
		fos.write("abcde".getBytes());
		fos.close();
	}
	
	public static void readFile() throws IOException{
		FileInputStream fis=new FileInputStream("fos.txt");
		int ch=0;
		while((ch=fis.read())!=-1){
			System.out.print((char)ch);
		}
		fis.close();
	}
	public static void readFile2()throws IOException{
		FileInputStream fis=new FileInputStream("fos.txt");
		byte[] byt=new byte[1024];
		int len=0;
		while((len=fis.read(byt))!=-1){
			System.out.println(new String(byt, 0, len));
		}
		fis.close();
	}
	public static void readFile3()throws IOException{
		FileInputStream fis=new FileInputStream("fos.txt");
	//	int num=fis.available();
			//System.out.println("num="+num);
		//����һ���ոպõĻ����� ������ѭ���ˡ�
		//������ʹ��   ��������̫�������ڴ����
		byte[] buf=new byte[fis.available()];
		fis.read(buf);
		System.out.println(new String(buf));
		fis.close();
	}	
}
