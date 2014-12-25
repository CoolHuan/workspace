
/*
 * 产生线程安全问题的原因：
 * 1、多个线程在操作共享数据下：其他线程会对当前的线程造成干扰
 * 
 */
 
 
public class Share implements Runnable{
	int ticket=10;//共有10张票
	int num=0;	//卖出了多少张
	Object obj=new Object();
	@Override
	public void run() {
		for (int i=1;i<=10;i++) {
			test();
		}
//		while(true){
//			synchronized(obj){
//				if(ticket>0){
//					ticket--;
//					num++;
//					try {
//						Thread.sleep(100);
//					} catch (Exception e) {
//					
//					}
//					System.out.println(Thread.currentThread().getName()+"卖出了第"
//						+num+"张车票，还剩"+ticket+"张车票");
//				}
//			}
//		}
	}
	public synchronized void test(){
		
			synchronized(obj){
				if(ticket>0){
					ticket--;
					num++;
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					
					}
					System.out.println(Thread.currentThread().getName()+"卖出了第"
						+num+"张车票，还剩"+ticket+"张车票");
				}
			}
		
	}
	public static void main(String[] args) {
		Share t=new Share();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
	
		t1.setName("第一个售票窗口");
		t2.setName("第二个售票窗口");
		t3.setName("第三个售票窗口");
		t4.setName("第四个售票窗口");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}


}
