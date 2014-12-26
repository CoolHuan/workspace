package ipc;


/*
 * �߳�ͨ�ţ��ȴ�--����
 * wait():�ͷ������ͷ�cpu�������̳߳�
 * notify():����
 * notifyAll()
 * ʹ��ͬһ���������÷���==������Դ
 * 
 * �������ݡ�������>��������������>��.����---
 * 		�߳�ͬ�������ݰ�ȫ     �̼߳�ͨ�ţ�Э��
 *
 * */

class Resource{
	int id;
	String name;
	boolean flag=false;//�Ƿ��в�Ʒ
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
				//1����Ʒ��
				if(r.flag){//ͣ������Ϣ���߳��ͷ�cpu
					try {
							r.wait();
					} catch (InterruptedException e) {
				
						e.printStackTrace();
					}
				}
			//2����������
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
				//3���в�Ʒ�ˣ�֪ͨ����
					r.flag=true;
					r.notify();
					
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
					if (!r.flag) {//û��Ʒ��
							try {
								r.wait();
							} catch (InterruptedException e) {
				
								e.printStackTrace();
							}
					}
					
					
					System.out.println("��  name:"+r.name+"\t id:"+r.id);
					//3.������
					r.flag=false;
					r.notify();
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

