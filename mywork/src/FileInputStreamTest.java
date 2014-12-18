import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileInputStreamTest {

	
	public static void main(String[] args) {
		File file=new File("MM.test");	//����һ��File�����
		try {
			file.createNewFile();		//���ô����ļ��ķ���������һ���ļ�
			
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		try {
				FileOutputStream out=new FileOutputStream(file);
				byte[] buy="�����ҵ�����������ô�ͳ����ԸУ����л����������������".getBytes();
				out.write(buy);
				out.close();
			}catch (Exception e) {
				
				e.printStackTrace();
			}
		
		try {
			FileInputStream fis=new FileInputStream(file);
				//����һ������Ϊ1024�ġ���Ͳ��
				byte[] bbuf=new byte[1024];
				//���ڱ���ʵ�ʶ�ȡ���ֽ���
				int hasRead=0;
				//ʹ��ѭ�����ظ���ȡˮ������
				while((hasRead=fis.read(bbuf))>0){
					//ȥ����Ͳ�е�ˮ��
					System.out.print(new String(bbuf, 0, hasRead));
				}
				fis.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
