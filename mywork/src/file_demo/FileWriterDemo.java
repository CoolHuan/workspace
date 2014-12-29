package file_demo;



import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	
	public static void main(String[] args) throws IOException {
		FileWriter fiw=new FileWriter("wstc.java",true);
		
		fiw.write("\r\nGmail");
		fiw.close();
	}

}
