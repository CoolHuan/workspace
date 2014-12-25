
public class DeadLock implements Runnable{
	static Object s1=new Object();
	static Object s2=new Object();
		@Override
		public void run() {
			if(Thread.currentThread().getName().equals("th1")){
				synchronized (this) {
					System.out.println("�߳�1����s1");//�����1
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					synchronized (s2) {
						System.out.println("�߳�1����s2");//�����2
					}
				}
			}else{
				synchronized (s2) {
					System.out.println("�߳�2����s2");
					synchronized (s1) {
						System.out.println("�߳�2����s1");
					}
				}
			}
		}

		public static void main(String[] args) {
			Thread t1=new Thread(new DeadLock(),"th1");
			Thread t2=new Thread(new DeadLock(),"th2");
			t1.start();
			t2.start();
		}

}