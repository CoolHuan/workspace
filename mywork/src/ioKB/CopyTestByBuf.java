package ioKB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTestByBuf {

	
	public static void main(String[] args) {
		BufferedReader bufr=null;
		BufferedWriter bufw=null; //
		try {
			bufr=new BufferedReader(new FileReader("BufferedWriterDemo.java"));
			bufw=new BufferedWriter(new FileWriter("BufferedWriter_copy.txt"));
	
			String line=null;
			while((line=bufr.readLine())!=null){
				
				bufw.write(line);
				bufw.newLine();
				bufw.flush();
			}
				
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			if(bufr!=null){
				try {
					bufr.close();
				} catch (IOException e) {
					
					System.out.println("∂¡»° ß∞‹");
				}
			}
			if(bufw!=null){
				try {
					bufw.close();
				} catch (IOException e) {
					
					System.out.println("–¥»Î ß∞‹");
				}
			}
		}
	}

}
