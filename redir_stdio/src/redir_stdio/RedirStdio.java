package redir_stdio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * System.in   键盘	setIn(InputStream)
 * System.out  屏幕	setOut(PrintSteam)
 * System.err  屏幕	setErr(PrintStream)
 * 
 */
public class RedirStdio {

	
	public static void main(String[] args) {
//		PrintStream ps=null;
//		try {
//			 ps=new PrintStream(new FileOutputStream("redir.txt"));
//			
//			
//			System.out.println("重定向之后：打印到终端");
//			System.out.println(new Object());
//			
//			//System.out--->ps
//		//	System.setOut(ps);
//			System.out.println("重定向之后：打印到文件");
//			System.out.println(new Object());
//			
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		}finally{
//			ps.close();
//		}
		
		try {
			FileInputStream fis=new FileInputStream("redir.txt");
			System.setIn(fis);
			//使用System.in对象构建Scanner对象，来获取输出
			Scanner in=new Scanner(System.in);
			in.useDelimiter("\n");
			while(in.hasNext()){
				System.out.println("文件输入内容："+in.next());
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
