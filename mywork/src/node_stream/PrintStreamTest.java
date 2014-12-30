package node_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;




/*
 * 处理流：隐藏了底层物理设备上节点流的差异、并提供更加方便的输入输出方法
 * 步骤：
 * 		1.提供一个节点流
 * 		2.封装成处理流
 * 		3.直接使用处理流的IO操作：间接的操作底层的设备文件
 * 		4.关闭
 * 
 * 使用PrintStream包装OutputStream:字节流=节点流
 * */
public class PrintStreamTest {


	public static void main(String[] args) throws IOException {
			FileOutputStream fos=null;
		
		 try {
			 //1、创建节点流
			fos=new FileOutputStream("process_stream.txt",true);
			 //2、封装处理流
			PrintStream ps=new PrintStream(fos);
			//3、IO
			ps.println("处理流");
			ps.println(new PrintStreamTest());
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally{
			fos.close();
			
		}
	}
}
