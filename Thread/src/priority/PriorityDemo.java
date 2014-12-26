package priority;
class Demo extends Thread{
	String name;

	public Demo(String name) {
		super(name);
		
	}
	public void  run(){
		System.out.println(this.name+"pri="+getPriority());
	}
	
}
public class PriorityDemo {

	
	public static void main(String[] args) {
		Demo d1=new Demo("线程1");
		Demo d2=new Demo("线程2");
		Demo d3=new Demo("线程3");
		
		d1.setPriority(Demo.MAX_PRIORITY);
		d3.setPriority(Demo.MIN_PRIORITY);
		
		d1.start();
		d2.start();
		d3.start();
	}

}
