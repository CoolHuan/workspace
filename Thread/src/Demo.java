/*
 * ���̣��ǲ���ϵͳ��Ӧ�ó�����Դ�������С���������еĳ���
 * �̣߳���ϵͳ��ִ���������С��λ���������ִ�е���С��λ�����̵Ķ��ִ������
 * 		�߳����Լ����е�����
 * 		
 * 			����ִ��/ͬʱ
 * ������
 * ����̣�
 * ���̣߳�
 * 	����ϵͳ�����̡��̷߳���ǳ�С��ʱ��Ƭ����OSȥ���ȡ�����л�----����Ͽ�����ͬʱִ�С�
 * 
 * 
 * JVM������Ķ��̣߳�
 * 		1��main�̣߳�
 * 		2�����������̣߳�
 * java:Object ����+   ���գ�
 * */
class A{
	//�漰��ϵͳ����Դ��ʱ����Ҫ����дһ�¸÷���
	protected void finalize() throws Throwable {
		System.out.println("�ֶ���������");
		System.out.println(Thread.currentThread().getId()+Thread.currentThread().getName());
		super.finalize();
	}
}

public class Demo {

	
	public static void main(String[] args) {
		
		System.out.print(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		
		A a=new A();
		new A();
		new A();
		new A();
		System.gc();
		new A();
		new A();
		
		System.out.println("main����");
		
	}

}
