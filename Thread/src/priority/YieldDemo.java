package priority;

public class YieldDemo  extends Thread{
	
		
	public YieldDemo(String name) {
		super(name);
		
	}
	

	@Override
	public void run() {
		for(int i=0;i<50;i++){
			System.out.println(getName()+"=="+i);
			//当i=25的时候，让当前线程给其他线程让步
			if(i==25){	
				System.out.println("让位======");
			
				Thread.yield();
			}
		}
	}


	public static void main(String[] args) {
			YieldDemo yd1=new YieldDemo("线程1");
			YieldDemo yd2=new YieldDemo("线程2");
		//	yd1.setPriority(8);
		//  yd2.setPriority(6);
			yd1.start();
			yd2.start();

	}

}
