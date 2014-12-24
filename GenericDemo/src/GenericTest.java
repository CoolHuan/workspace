
class More<K,V>{
	K name;
	V age;
	public More(K name,V age){
		this.name=name;
		this.age=age;
	}
	public K show(){
		return name;
	}
}
public class GenericTest<T> {
	public GenericTest(T A){
		System.out.println(A);
	}
	public static void main(String[] args) {
		GenericTest<String> gt=new GenericTest<>("haha");
		More<String, Integer> more=new More<>("xiaoming", 22);
		System.out.println(more.show());

	}

}
