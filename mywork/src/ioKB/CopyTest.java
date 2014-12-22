/*讲C盘一个文本文件复制到D盘
 * 复制的原理 
 * 其实就是讲C盘下的文件数据存储到D盘的一个文件中。
 * 步骤：
 * 1：在D盘创建一个文件。用于存储C盘文件中的数据。
 * 2，定义读取流和C盘文件关联。
 * 3，通过不断的读写完成数据存储。
 * 4，关闭资源。
 * 
 * */
package ioKB;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTest {

	
	public static void main(String[] args) throws IOException {
		copy_1();

	}
	//从C盘读一个字符，就往D盘写一个字符
	public static void copy_1() throws IOException{
		//创建目的地。
		FileWriter fw=new FileWriter("DiyTest_copy.txt");
		
		//与已有文件关联。
		FileReader fr=new FileReader("DiyTest.java");
		int ch=0;
	//	char[] byt=new char[1024]; 
		while((ch=fr.read())!=-1){
			fw.write(ch);
			
		}
		fw.close();
		fr.close();
		
		
	}
}
