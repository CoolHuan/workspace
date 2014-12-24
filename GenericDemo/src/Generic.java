class Base<T>{}

public class Generic {
	public static void test(Base<?> base){
		System.out.println("this is test");
	}

	public static void main(String[] args) {
		Base<String> base=new Base<>();
		Base<Integer> base1=new Base<>();
		test(base);
		test(base1);

	}

}
