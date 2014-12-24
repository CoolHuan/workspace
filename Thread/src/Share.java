
public class Share implements Runnable{
	int ticket=400;//共有10张票
	int num=0;	//卖出了多少张
	Object obj=new Object();
	@Override
	public void run() {
		while(true){
			synchronized(obj){
				if(ticket>0){
					ticket--;
					num++;
					try {
						Thread.sleep(10);
					} catch (Exception e) {
					
					}
					System.out.println(Thread.currentThread().getName()+"卖出了第"
						+num+"张车票，还剩"+ticket+"张车票");
				}
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
