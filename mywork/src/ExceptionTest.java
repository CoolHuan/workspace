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
			System.out.println("电脑运行");
		if(state==2)
			throw new LanPingException("电脑蓝屏了");
		if(state==3)
			throw new MaoYanException("电脑冒烟了");
	}
	public void restart() {
		System.out.println("电脑重启");
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
			throw new NoPlanException("课时无法继续");
		}
		System.out.println("开始讲课");
	}
	
}

public class ExceptionTest {
	public static void main(String[] args) {
		Teacher t=new Teacher("毕老师");
		try {
			t.prelect();
		} catch (NoPlanException e) {
			System.out.println(e.toString());
			System.out.println("换老师或者放假");
		}

	}

}
