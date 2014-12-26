package ipc2;
/*
		使用同步方法

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
	private int id;
	private String name;
	boolean flag=false;//是否有产品
	//生产:同步方法：锁--this
	public synchronized void set(int id,String name){
		
		if(this.flag){//停产、休息：线程释放cpu
			try {
					this.wait();
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
		}
		this.id=id;
		this.name=name;
		System.out.println("生产了一部"+this.name);
		this.flag=true;
		this.notify();
		
	}
	public synchronized void sales(){
		if (!this.flag) {//没产品了
			try {
				this.wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("卖  name:"+this.name+"\t id:"+this.id);
		//3.卖完了
		this.flag=false;
		this.notify();
	}
	
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
			//2、继续生产
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
				r.sales();
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

