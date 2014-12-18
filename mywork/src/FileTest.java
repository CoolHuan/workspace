import java.io.File;


public class FileTest {

	public static void main(String[] args) {
		File file=new File("test.txt");
		if (file.exists()) {
			//file.delete();	���ļ�ɾ��
			//System.out.println("�ļ���ɾ��");
			String name=file.getName();//��ȡ�ļ���
			long length=file.length();//��ȡ�ļ��ĳ���
			boolean hidden=file.isHidden();//�ж��ļ��Ƿ�����
			boolean read=file.canRead();	//�ж��ļ��Ƿ�ɶ�
			boolean write=file.canWrite();	//�ж��ļ��Ƿ�ɱ�д��
			
			System.out.println("�ļ����ƣ�"+name+"��·����"+file.getParent());//����ļ����͸�·��
			System.out.println("�ļ����ȣ�"+length);
			System.out.println("���ļ��������ļ���"+hidden+"�ɶ���"+read+"�ɱ�д����"+write);
			} else {
				System.out.println("���ļ�������");
			/*	try {
					file.createNewFile();
					System.out.println("�ļ��Ѵ���");
				} catch (Exception e) {
					e.printStackTrace();
				}*/
			}
	}

}
