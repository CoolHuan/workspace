package practiceDay13;

public class Student implements Comparable{
	private int sNo;
	private String sName;
	private String sSex;
	

	private int sAge;
	private int sJava;
	
	public Student(int sNo, String sName ,String sSex, int sAge, int sJava) {
		super();
		this.sName = sName;
		this.sNo = sNo;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}
	public String getsName(){
		return this.sName;
	}
	public int getsNo() {
		return sNo;
	}
	
	public String getsSex() {
		return sSex;
	}
	
	public int getsAge() {
		return sAge;
	}
	
	public int getsJava() {
		return sJava;
	}
	
	@Override
	public String toString() {
		return "Student [sNo=" + sNo + ", sName=" + sName + ", sSex=" + sSex
				+ ", sAge=" + sAge + ", sJava=" + sJava + "]";
	}
	@Override
	public int compareTo(Object o) {
		Student student=(Student) o;
		int res=this.sJava-student.sJava;
		return res==0?this.sAge-student.sAge:res; 
	}

}
