class LanPingException extends Exception{
	public LanPingException(String msg) {
		super(msg);
	}
}
class MaoYanException extends Exception{
	public MaoYanException(String msg) {
		super(msg);
	}
}
class NoPlanException extends Exception{
	public NoPlanException(String msg) {
		super(msg);
	}
}
class Computer{
	int state=1;
	public void run() throws LanPingException, MaoYanException{
		int state=3;
		if (state==1)
			System.out.println("��������");
		if(state==2)
			throw new LanPingException("����������");
		if(state==3)
			throw new MaoYanException("����ð����");
	}
	public void restart() {
		System.out.println("��������");
	}
}
class Teacher{
	private String name;
	private Computer cmpt;
	
	public Teacher(String name) {
		this.name=name;
		cmpt=new Computer();
	}
	
	public void  prelect() throws NoPlanException{
		try {
			cmpt.run();
		} catch (LanPingException e) {
			
			cmpt.restart();
		} catch(MaoYanException e){
			throw new NoPlanException("��ʱ�޷�����");
		}
		System.out.println("��ʼ����");
	}
	
}

public class ExceptionTest {
	public static void main(String[] args) {
		Teacher t=new Teacher("����ʦ");
		try {
			t.prelect();
		} catch (NoPlanException e) {
			System.out.println(e.toString());
			System.out.println("����ʦ���߷ż�");
		}

	}

}
