/*
 * 1��ʵ���ˡ��߳�����run�����̶߳���
 * 2��RunnableDemo extends A�����ⵥ�̳еľ����ԡ�
 * */
public class RunnableDemo implements Runnable{
	private int i;
	Object object=new Object();
	@Override
	public void run() {
		
			
				for(int i=0;i<20;i++){
					
					System.out.println(Thread.currentThread().getName()+"\ti="+i);
				}
			
		
	}
	
	public static void main(String[] args) {
		RunnableDemo rdDemo=new RunnableDemo();
	//	RunnableDemo rdDemo1=new RunnableDemo();
		
		Thread t=new Thread(rdDemo);
		Thread t1=new Thread(rdDemo);
		
		t.start();
		t1.start();
		
	}
}
