package file_demo;

import java.io.File;
import java.io.IOException;
/*
 * File:java.io. 与平台无关的，目录、文件
 * 		创建、删除、重命名...
 * File类：不能直接访问内容本身，---使用输入、输出流来对内容操作
 * 
 * */

public class FileDemo {

	public static void main(String[] args) throws IOException {
		//. 当前路径 ..  上一目录
		File file=new File(".");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());	//返回String类型
		System.out.println(file.getAbsoluteFile());	//返回File类型
		System.out.println(file.getAbsoluteFile().getParent());
		System.out.println(file.getParent());
		
		
		//创建文件
		File tmpFile=File.createTempFile("tem", ".txt");
		File tmpFile2=File.createTempFile("tmp", "txt", file);
		//当JVM退出，删除
		tmpFile.deleteOnExit();
		tmpFile2.deleteOnExit();
		
		File file2=new File("create_bycode");
		System.out.println("存在？="+file2.exists());
		//在同一目录：不能创建同名的文件、文件夹
		file2.createNewFile();
		
		//如果file表示一个文件，那么list()将返回null
		String[]  str_dir=file.list();
		String[] str_file=file2.list();
		System.out.println(str_dir);
		System.out.println(str_file);
		//file2.mkdir();
		System.out.println("存在？="+file2.exists());
	//	for(String str:str_dir){
		//	System.out.println(str);
		//}
		File[] roots=File.listRoots();
		for(File root:roots){
			System.out.println(root);
		}
		//创建嵌套文件夹
		File file3=new File("abc\\sfff\\hahha");
		file3.mkdirs();
	}

}
