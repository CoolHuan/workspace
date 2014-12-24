/*
 * 复制一个图片
 * 思路：
 *  用字节读取流对象和图片关联。
 *  用字节写入流创建一个图片文件。用于存储获取到的图片数据。
 *  通过循环读写，完成数据的存储。
 *  关闭资源
 * 
 * */

package ziJieLiu;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPic {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		FileInputStream fis=null;
		
		try {
			fos=new FileOutputStream("smoking_copy.jpg");
			fis=new FileInputStream("smoking.jpg");
			byte[] buf=new byte[1024];
			int len=0;
		while((len=fis.read(buf))!=-1){
			
			fos.write(buf, 0, len);
		}
		} catch (IOException e) {
			
			throw new RuntimeException("复制文件失败");
		}finally{
			if(fis!=null)
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("读取失败");
				}
			if(fos!=null)
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println("写入失败");
			}
		}	
	}
}
