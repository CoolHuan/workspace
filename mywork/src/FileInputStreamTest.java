import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileInputStreamTest {

	
	public static void main(String[] args) {
		File file=new File("MM.test");	//创建一个File类对象
		try {
			file.createNewFile();		//调用创建文件的方法，创建一个文件
			
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		try {
				FileOutputStream out=new FileOutputStream(file);
				byte[] buy="今天我的声音又是那么低沉且性感，其中还夹杂着少许的忧伤".getBytes();
				out.write(buy);
				out.close();
			}catch (Exception e) {
				
				e.printStackTrace();
			}
		
		try {
			FileInputStream fis=new FileInputStream(file);
				//创建一个长度为1024的“竹筒”
				byte[] bbuf=new byte[1024];
				//用于保存实际读取的字节数
				int hasRead=0;
				//使用循环来重复“取水”过程
				while((hasRead=fis.read(bbuf))>0){
					//去除竹筒中的水滴
					System.out.print(new String(bbuf, 0, hasRead));
				}
				fis.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
