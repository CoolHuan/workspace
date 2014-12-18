package practiceDay14;



public class Student implements Comparable{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student st=(Student) o;
		int res=this.score-st.score;
		return res==0?this.name.compareTo(st.name):res;
	}

}
