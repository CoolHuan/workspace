import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//FileInputStream�ೣ�õĹ��췽��
//FileInputStream(String name);
//FileInputStream(File file);�˷��������ڰ��ļ�����������֮ǰ���ļ�����һ������
public class FileTest2 {

	public static void main(String[] args) {
		File file=new File("IO.txt");
		try {
			FileOutputStream out=new FileOutputStream(file);
			byte[] buy="�����ҵ�����������ô�ͳ����ԸУ����л����������������".getBytes();
			out.write(buy);
			out.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		try {
			FileInputStream in=new FileInputStream(file);
			byte[] byt=new byte[1024];
			int len=in.read(byt);
			System.out.println("�ļ��е���Ϣ�ǣ�"+new String(byt,0,len));//byt��ʲôȡ��0 ���Ŀ�ʼȡ��lenȡ���ٴ�
			in.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
