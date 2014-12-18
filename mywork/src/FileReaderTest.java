import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderTest {

	
	public static void main(String[] args)throws IOException {
		try {
			FileReader file=new FileReader("IO.txt");
			char[] chs=new char[32];
			int hasRead=0;
			while((hasRead=file.read(chs))>0){
				System.out.println(new String(chs,0,hasRead));
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
