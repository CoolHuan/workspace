/*
 * 装饰设计模式：
 * 当想要对已有对象进行功能增强时，
 * 可以定义类，将已有对象传入，基于已有的功能，并提供加强功能。
 * 那么自定义的该类称为装饰品
 * 
 * 装饰类通常会通过构造方法接受被装饰的对象
 * 并基于被装饰的对象的功能，提供更强的功能。
 * 装饰模式比继承要灵活。避免了继承体系臃肿。
 * 而且降低了类与类之间的关系。
 * 装饰类因为增强已有对象，具备的功能和已有的是相同的，只不过提供了更强的功能
 * 装饰类和被装饰类通常都在一个体系中
 * */
package ioKB;
class Person{
	public void chifan(){
		System.out.println("吃饭");
	}
}
class SuperPerson{
	private Person p;
	public SuperPerson(Person p) {
		this.p=p;
	}
	public void superChifan(){
		System.out.println("开胃酒");
		p.chifan();
		System.out.println("甜点");
		System.out.println("来一根");
	}
}

public class PersonDemo {

	
	public static void main(String[] args) {
		Person p=new Person();
		SuperPerson sp=new SuperPerson(p);
		sp.superChifan();

	}

}
