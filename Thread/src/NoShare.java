
public class NoShare extends Thread{
	int ticket=10;//����10��Ʊ
	int num=0;	//�����˶�����
	
	
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			if(ticket>0){
				ticket--;
				num++;
				System.out.println(getName()+"�����˵�"
				+num+"�ų�Ʊ����ʣ"+ticket+"�ų�Ʊ");
			}
		}
		
	}

	public static void main(String[] args) {
		NoShare o1=new NoShare();
		NoShare o2=new NoShare();
		NoShare o3=new NoShare();
		o1.setName("��һ����Ʊ����");
		o2.setName("�ڶ�����Ʊ����");
		o3.setName("��������Ʊ����");
		o1.start();
		o2.start();
		o3.start();
	}

}
