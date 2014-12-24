
public class NoShare extends Thread{
	int ticket=10;//共有10张票
	int num=0;	//卖出了多少张
	
	
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			if(ticket>0){
				ticket--;
				num++;
				System.out.println(getName()+"卖出了第"
				+num+"张车票，还剩"+ticket+"张车票");
			}
		}
		
	}

	public static void main(String[] args) {
		NoShare o1=new NoShare();
		NoShare o2=new NoShare();
		NoShare o3=new NoShare();
		o1.setName("第一个售票窗口");
		o2.setName("第二个售票窗口");
		o3.setName("第三个售票窗口");
		o1.start();
		o2.start();
		o3.start();
	}

}
