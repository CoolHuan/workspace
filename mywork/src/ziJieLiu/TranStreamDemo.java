package ziJieLiu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * 通过刚才的键盘录入一行数据并打印其大写，发现其实就是读一行数据的原理，也就是readLine方法。
 * 能不能直接使用readLine方法来完成键盘录入的一行数据的读取呢？
 * 
 * readLine方法是字符流BufferedReader类中的方法
 * 而键盘录入的read方法是字节流InputStream的方法
 * 
 * 那么能不能将字节流转成字符流再使用字符流缓冲区readLine方法呢
 * */
public class TranStreamDemo {

	public static void main(String[] args) throws IOException {
		
		OutputStream out=System.out;
		OutputStreamWriter osw=new OutputStreamWriter(out);
		BufferedWriter bfw=new BufferedWriter(osw);
		//获取键盘录入对象
		InputStream in=System.in;
		//将字节流对象转成字符流对象，使用转换流。InputStreamReader
		InputStreamReader isr=new InputStreamReader(in);
		//为了提高效率，将字符串进行缓冲区技术高效操作，使用BufferedReader
		BufferedReader bur=new BufferedReader(isr);
		String line=null;
		while((line=bur.readLine())!=null){
			if("over".equals(line))
				break;
			bfw.write(line.toUpperCase());
			bfw.newLine();
			bfw.flush();
		
		}
		in.close();
		
	}

}
