
class Monkey1{
	String name;
	public Monkey1(String name){
		super();
		this.name=name;
	}
	public void fight(){
		for(int i=1;i<11;i++){
			System.out.println(name+"打败第"+i+"个天兵天将");
		}
	}
}
public class NotThread {

	public static void main(String[] args) {
		Monkey1 m1=new Monkey1("第1个孙悟空");
		Monkey1 m2=new Monkey1("第2个孙悟空");
		Monkey1 m3=new Monkey1("第3个孙悟空");
		m1.fight();
		m2.fight();
		m3.fight();
	}

}
