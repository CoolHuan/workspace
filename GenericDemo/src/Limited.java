class Father<T>{}
public class Limited {
	public static void test(Father<? super Number> father) {
		System.out.println("this is test");
	}
	public static void show(Father<? extends Number> father){
		System.out.println("this is show");
	}
	
	public static void main(String[] args) {
		Father<Integer> f1=new Father<>();
		Father<Object> f2=new Father<>();
		//test(f1);����ʵ��ֻ����Number����丸��
		test(f2);
		show(f1);
		//show(f2);����ʵ��ֻ����Number���������

	}

}
