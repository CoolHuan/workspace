
/*
 * �����̰߳�ȫ�����ԭ��
 * 1������߳��ڲ������������£������̻߳�Ե�ǰ���߳���ɸ���
 * 
 */
 
 
public class Share implements Runnable{
	int ticket=10;//����10��Ʊ
	int num=0;	//�����˶�����
	Object obj=new Object();
	@Override
	public void run() {
		for (int i=1;i<=10;i++) {
			test();
		}
//		while(true){
//			synchronized(obj){
//				if(ticket>0){
//					ticket--;
//					num++;
//					try {
//						Thread.sleep(100);
//					} catch (Exception e) {
//					
//					}
//					System.out.println(Thread.currentThread().getName()+"�����˵�"
//						+num+"�ų�Ʊ����ʣ"+ticket+"�ų�Ʊ");
//				}
//			}
//		}
	}
	public synchronized void test(){
		
			synchronized(obj){
				if(ticket>0){
					ticket--;
					num++;
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					
					}
					System.out.println(Thread.currentThread().getName()+"�����˵�"
						+num+"�ų�Ʊ����ʣ"+ticket+"�ų�Ʊ");
				}
			}
		
	}
	public static void main(String[] args) {
		Share t=new Share();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
	
		t1.setName("��һ����Ʊ����");
		t2.setName("�ڶ�����Ʊ����");
		t3.setName("��������Ʊ����");
		t4.setName("���ĸ���Ʊ����");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}


}
