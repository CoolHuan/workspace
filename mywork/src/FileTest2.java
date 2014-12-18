import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//FileInputStream类常用的构造方法
//FileInputStream(String name);
//FileInputStream(File file);此方法语序在把文件链接输入流之前对文件作进一步分析
public class FileTest2 {

	public static void main(String[] args) {
		File file=new File("IO.txt");
		try {
			FileOutputStream out=new FileOutputStream(file);
			byte[] buy="今天我的声音又是那么低沉且性感，其中还夹杂着少许的忧伤".getBytes();
			out.write(buy);
			out.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		try {
			FileInputStream in=new FileInputStream(file);
			byte[] byt=new byte[1024];
			int len=in.read(byt);
			System.out.println("文件中的信息是："+new String(byt,0,len));//byt用什么取，0 从哪开始取，len取多少次
			in.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
