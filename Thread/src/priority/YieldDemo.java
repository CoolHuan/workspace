package priority;

public class YieldDemo  extends Thread{
	
		
	public YieldDemo(String name) {
		super(name);
		
	}
	

	@Override
	public void run() {
		for(int i=0;i<50;i++){
			System.out.println(getName()+"=="+i);
			//��i=25��ʱ���õ�ǰ�̸߳������߳��ò�
			if(i==25){	
				System.out.println("��λ======");
			
				Thread.yield();
			}
		}
	}


	public static void main(String[] args) {
			YieldDemo yd1=new YieldDemo("�߳�1");
			YieldDemo yd2=new YieldDemo("�߳�2");
		//	yd1.setPriority(8);
		//  yd2.setPriority(6);
			yd1.start();
			yd2.start();

	}

}
