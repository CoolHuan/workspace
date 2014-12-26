package ipc;


/*
 * 线程通信：等待--唤醒
 * wait():释放锁、释放cpu、进入线程池
 * notify():唤醒
 * notifyAll()
 * 使用同一个锁来调用方法==共享资源
 * 
 * 共享数据————>锁——————>锁.方法---
 * 		线程同步：数据安全     线程间通信：协作
 *
 * */

class Resource{
	int id;
	String name;
	boolean flag=false;//是否有产品
}
/*产线:产品是否卖出去了？——再去确定是否继续生产
 * 	|-有:1，通知销售   ，2、停止生产
 * 	|---无:1、被告知，  2、生产
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
				//1、产品？
				if(r.flag){//停产、休息：线程释放cpu
					try {
							r.wait();
					} catch (InterruptedException e) {
				
						e.printStackTrace();
					}
				}
			//2、继续生产
				switch (key++%3) {
				case 0:
					r.id=6666;
					r.name="iphone6";
					System.out.println("生产iphone6");
					break;
				case 1:
					r.id=7777;
					r.name="iphone7";
					System.out.println("生产iphone7");
					break;
				case 2:
					r.id=8888;
					r.name="iphone8";
					System.out.println("生产iphone8");
					break;
				default:
					break;
				}	
				//3、有产品了，通知销售
					r.flag=true;
					r.notify();
					
				}
			}
			
			
	}
	
}

/*销售：是否有产品可卖？
 * 有：1、被产线告知   2、销售
 * 无：1、通知 产线     2、休息：停止销售
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
					if (!r.flag) {//没产品了
							try {
								r.wait();
							} catch (InterruptedException e) {
				
								e.printStackTrace();
							}
					}
					
					
					System.out.println("卖  name:"+r.name+"\t id:"+r.id);
					//3.卖完了
					r.flag=false;
					r.notify();
				}
			}
	}
	
}
public class Test{

	public static void main(String[] args) {
		//1、创建共享资源
		Resource r=new Resource();
		//2、创建线程任务：run
		Input input=new Input(r);
		Outpt outpt=new Outpt(r);
		Thread t1=new Thread(input);
		Thread t2=new Thread(outpt);
		t1.start();
		t2.start();
		
	}

}

