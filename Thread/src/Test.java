/*
 * �߳�������ͬ�Ķ��߳�
 * 
 * 1����ôȥ��ù������ݣ�			----һ�ι��캯��
 * 2����ô��֤Input��Output�߳�ͬ��
 * 3����Ʒ==����
 * 
 * */

class Resource{
	int id;
	String name;
}
/*����:��Ʒ�Ƿ�����ȥ�ˣ�������ȥȷ���Ƿ��������
 * 	|-��:1��֪ͨ����   ��2��ֹͣ����
 * 	|---��:1������֪��  2������
 * */
class  Input implements Runnable{
	Resource r;
	
	public Input(Resource r) {
		super();
		this.r = r;
	}

	int key=0;
	@Override
	public void run() {
		while(true){
			synchronized (r) {
				switch (key++%3) {
				case 0:
					r.id=6666;
					r.name="iphone6";
					System.out.println("����iphone6");
					break;
				case 1:
					r.id=7777;
					r.name="iphone7";
					System.out.println("����iphone7");
					break;
				case 2:
					r.id=8888;
					r.name="iphone8";
					System.out.println("����iphone8");
					break;
				default:
					break;
				}
			}
			
		}
	}
	
}

/*���ۣ��Ƿ��в�Ʒ������
 * �У�1�������߸�֪   2������
 * �ޣ�1��֪ͨ ����     2����Ϣ��ֹͣ����
 * 
 * */
class Outpt implements Runnable{
	Resource r;
	
	public Outpt(Resource r) {
		super();
		this.r = r;
	}

	public void run() {
			while(true){
				synchronized (r) {
					System.out.println("��  name:"+r.name+"\t id:"+r.id);
				}
				
			}
	}
	
}
public class Test{

	public static void main(String[] args) {
		//1������������Դ
		Resource r=new Resource();
		//2�������߳�����run
		Input input=new Input(r);
		Outpt outpt=new Outpt(r);
		Thread t1=new Thread(input);
		Thread t2=new Thread(outpt);
		t1.start();
		t2.start();
		
	}

}
