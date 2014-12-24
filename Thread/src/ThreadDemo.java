/*
 * main--------------------{}
 * Thread:�߳��࣬�߳����Լ����������Զ����߳����ʱ����Ҫʵ�֣����� run()
 * 
 * һ���̳�Thread��������
 * 	1���̳�
 * 	2����дrun()����:����  //����
 *  3.ʵ����:�̶߳���
 *  4.�����߳�:����start()����
 * */
class Monkey extends Thread{
	String name;
	public Monkey(String name){
		super();
		this.name=name;
	}
	public void fight(){
		for(int i=1;i<11;i++){
			System.out.println(name+"��ܵ�"+i+"������콫");
		}
	}
	public void run(){
		
		System.out.println(Thread.currentThread().getId()+Thread.currentThread().getName());
		fight();
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		Monkey m1=new Monkey("��1�������");
		Monkey m2=new Monkey("��2�������");
		Monkey m3=new Monkey("��3�������");
		m1.setName("�߳�һ");
		m1.start();
		m2.start();
		m3.start();
		System.out.println(Thread.currentThread().getId()+Thread.currentThread().getName());
	}

}
