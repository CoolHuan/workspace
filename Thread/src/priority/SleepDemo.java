package priority;

public class SleepDemo extends Thread{
	public void run(){
		System.out.println("休眠5s开始");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println(getName());
		System.out.println("休眠5s结束");
	}
	
	public static void main(String[] args) {
		System.out.println("main开始");
		SleepDemo sd=new SleepDemo();
		sd.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println("main结束");

	}

}
