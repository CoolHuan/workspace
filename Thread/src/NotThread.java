
class Monkey1{
	String name;
	public Monkey1(String name){
		super();
		this.name=name;
	}
	public void fight(){
		for(int i=1;i<11;i++){
			System.out.println(name+"��ܵ�"+i+"������콫");
		}
	}
}
public class NotThread {

	public static void main(String[] args) {
		Monkey1 m1=new Monkey1("��1�������");
		Monkey1 m2=new Monkey1("��2�������");
		Monkey1 m3=new Monkey1("��3�������");
		m1.fight();
		m2.fight();
		m3.fight();
	}

}
