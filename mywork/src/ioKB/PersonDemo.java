/*
 * װ�����ģʽ��
 * ����Ҫ�����ж�����й�����ǿʱ��
 * ���Զ����࣬�����ж����룬�������еĹ��ܣ����ṩ��ǿ���ܡ�
 * ��ô�Զ���ĸ����Ϊװ��Ʒ
 * 
 * װ����ͨ����ͨ�����췽�����ܱ�װ�εĶ���
 * �����ڱ�װ�εĶ���Ĺ��ܣ��ṩ��ǿ�Ĺ��ܡ�
 * װ��ģʽ�ȼ̳�Ҫ�������˼̳���ϵӷ�ס�
 * ���ҽ�����������֮��Ĺ�ϵ��
 * װ������Ϊ��ǿ���ж��󣬾߱��Ĺ��ܺ����е�����ͬ�ģ�ֻ�����ṩ�˸�ǿ�Ĺ���
 * װ����ͱ�װ����ͨ������һ����ϵ��
 * */
package ioKB;
class Person{
	public void chifan(){
		System.out.println("�Է�");
	}
}
class SuperPerson{
	private Person p;
	public SuperPerson(Person p) {
		this.p=p;
	}
	public void superChifan(){
		System.out.println("��θ��");
		p.chifan();
		System.out.println("���");
		System.out.println("��һ��");
	}
}

public class PersonDemo {

	
	public static void main(String[] args) {
		Person p=new Person();
		SuperPerson sp=new SuperPerson(p);
		sp.superChifan();

	}

}
