package redir_stdio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * System.in   ����	setIn(InputStream)
 * System.out  ��Ļ	setOut(PrintSteam)
 * System.err  ��Ļ	setErr(PrintStream)
 * 
 */
public class RedirStdio {

	
	public static void main(String[] args) {
//		PrintStream ps=null;
//		try {
//			 ps=new PrintStream(new FileOutputStream("redir.txt"));
//			
//			
//			System.out.println("�ض���֮�󣺴�ӡ���ն�");
//			System.out.println(new Object());
//			
//			//System.out--->ps
//		//	System.setOut(ps);
//			System.out.println("�ض���֮�󣺴�ӡ���ļ�");
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
			//ʹ��System.in���󹹽�Scanner��������ȡ���
			Scanner in=new Scanner(System.in);
			in.useDelimiter("\n");
			while(in.hasNext()){
				System.out.println("�ļ��������ݣ�"+in.next());
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
