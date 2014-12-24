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
import java.security.PublicKey;

public class CopyTest {

	
	public static void main(String[] args) throws IOException {
		copy_2();

	}
	//从C盘读一个字符，就往D盘写一个字符
	public static void copy_1() throws IOException{
		//创建目的地。
		FileWriter fw=new FileWriter("D:\\DiyTest_copy.txt");
		
		//与已有文件关联。
		FileReader fr=new FileReader("DiyTest.java");
		
		int ch=0;
		while((ch=fr.read())!=-1){
			fw.write(ch);
		}
			fr.close();
			fw.close();
	}
	
		public static void copy_2(){
		
			FileWriter fw = null;
			FileReader fr = null;
			try {
				fw = new FileWriter("ExceptionDemo_copy.txt");
				fr=new FileReader("ExceptionDemo.java");
				
				char[] byt=new char[1024];
				int len=fr.read(byt);
				while (len!=-1) {
					fw.write(byt, 0, len);
				}
			} catch (IOException e) {	
				throw new RuntimeException("读写失败");
			}
			finally{
				if(fr!=null)
					try {
						fr.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				if (fw!=null) {
					try {
						fw.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}	
			}
		}
	}

