import java.io.File;


public class FileTest {

	public static void main(String[] args) {
		File file=new File("test.txt");
		if (file.exists()) {
			//file.delete();	将文件删除
			//System.out.println("文件已删除");
			String name=file.getName();//获取文件名
			long length=file.length();//获取文件的长度
			boolean hidden=file.isHidden();//判断文件是否隐藏
			boolean read=file.canRead();	//判断文件是否可读
			boolean write=file.canWrite();	//判断文件是否可被写入
			
			System.out.println("文件名称："+name+"父路径："+file.getParent());//输出文件名和父路径
			System.out.println("文件长度："+length);
			System.out.println("该文件是隐藏文件吗？"+hidden+"可读吗？"+read+"可被写入吗？"+write);
			} else {
				System.out.println("该文件不存在");
			/*	try {
					file.createNewFile();
					System.out.println("文件已创建");
				} catch (Exception e) {
					e.printStackTrace();
				}*/
			}
	}

}
