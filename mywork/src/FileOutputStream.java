import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.jar.Attributes.Name;


public class FileOutputStream {

	public static void main(String[] args){
		try {
			FileInputStream fot=new FileInputStream("FileOutputStream.java");
			FileOutputStream fos=new FileOutputStream();
			byte[] byt=new byte[1024];
			int hasRead=0;
			while((hasRead=fot.read(byt))>0){
				fos.write(byt,0,hasRead);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
