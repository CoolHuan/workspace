package practiceDay14;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		
		ts.add(new Student("����",80));
		ts.add(new Student("����",95));
		ts.add(new Student("����",93));
		ts.add(new Student("С��",99));
		ts.add(new Student("��",99));
		ts.add(new Student("����",99));
		for (Object object : ts) {
			Student stu=(Student) object;
			System.out.println(stu);
		}
	}

}
