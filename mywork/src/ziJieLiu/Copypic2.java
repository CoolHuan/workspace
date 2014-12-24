//通过字节流的缓冲区完成图片的复制。
package ziJieLiu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;


import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Copypic2 {

	public static void main(String[] args) {
		BufferedInputStream buis=null;
		BufferedOutputStream buos=null;
		try {
			buos=new BufferedOutputStream(new FileOutputStream("fish_copy.jpg"));
			buis=new BufferedInputStream(new FileInputStream("fish.jpg"));
			
			byte[] buf=new byte[1024];
			int len=0;
			while((len=buis.read(buf))!=-1){
				buos.write(buf, 0, len);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			if(buis!=null)
			try {
				
				buis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			if(buos!=null)
				try {
					buos.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
		}
		

	}

}
