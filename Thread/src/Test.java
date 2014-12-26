/*
 * 线程任务不相同的多线程
 * 
 * 1、怎么去获得共享数据？			----一参构造函数
 * 2、怎么保证Input、Output线程同步
 * 3、产品==销量
 * 
 * */

class Resource{
	int id;
	String name;
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
					System.out.println("卖  name:"+r.name+"\t id:"+r.id);
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
