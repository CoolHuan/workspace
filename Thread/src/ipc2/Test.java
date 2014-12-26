package ipc2;
/*
		ʹ��ͬ������

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
	private int id;
	private String name;
	boolean flag=false;//�Ƿ��в�Ʒ
	//����:ͬ����������--this
	public synchronized void set(int id,String name){
		
		if(this.flag){//ͣ������Ϣ���߳��ͷ�cpu
			try {
					this.wait();
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
		}
		this.id=id;
		this.name=name;
		System.out.println("������һ��"+this.name);
		this.flag=true;
		this.notify();
		
	}
	public synchronized void sales(){
		if (!this.flag) {//û��Ʒ��
			try {
				this.wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("��  name:"+this.name+"\t id:"+this.id);
		//3.������
		this.flag=false;
		this.notify();
	}
	
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
			//2����������
				switch (key++%3) {
				case 0:
					r.set(6666, "iphone6");
					break;
				case 1:
					r.set(7777, "iphone7");	
					break;
				case 2:
					r.set(8888, "iphone8");
				default:
					break;
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
				r.sales();
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

