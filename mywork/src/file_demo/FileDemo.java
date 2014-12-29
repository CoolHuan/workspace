package file_demo;

import java.io.File;
import java.io.IOException;
/*
 * File:java.io. ��ƽ̨�޹صģ�Ŀ¼���ļ�
 * 		������ɾ����������...
 * File�ࣺ����ֱ�ӷ������ݱ���---ʹ�����롢������������ݲ���
 * 
 * */

public class FileDemo {

	public static void main(String[] args) throws IOException {
		//. ��ǰ·�� ..  ��һĿ¼
		File file=new File(".");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());	//����String����
		System.out.println(file.getAbsoluteFile());	//����File����
		System.out.println(file.getAbsoluteFile().getParent());
		System.out.println(file.getParent());
		
		
		//�����ļ�
		File tmpFile=File.createTempFile("tem", ".txt");
		File tmpFile2=File.createTempFile("tmp", "txt", file);
		//��JVM�˳���ɾ��
		tmpFile.deleteOnExit();
		tmpFile2.deleteOnExit();
		
		File file2=new File("create_bycode");
		System.out.println("���ڣ�="+file2.exists());
		//��ͬһĿ¼�����ܴ���ͬ�����ļ����ļ���
		file2.createNewFile();
		
		//���file��ʾһ���ļ�����ôlist()������null
		String[]  str_dir=file.list();
		String[] str_file=file2.list();
		System.out.println(str_dir);
		System.out.println(str_file);
		//file2.mkdir();
		System.out.println("���ڣ�="+file2.exists());
	//	for(String str:str_dir){
		//	System.out.println(str);
		//}
		File[] roots=File.listRoots();
		for(File root:roots){
			System.out.println(root);
		}
		//����Ƕ���ļ���
		File file3=new File("abc\\sfff\\hahha");
		file3.mkdirs();
	}

}
