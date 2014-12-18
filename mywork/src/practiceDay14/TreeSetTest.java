package practiceDay14;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		
		ts.add(new Student("李四",80));
		ts.add(new Student("张三",95));
		ts.add(new Student("王二",93));
		ts.add(new Student("小明",99));
		ts.add(new Student("大华",99));
		ts.add(new Student("阿里",99));
		for (Object object : ts) {
			Student stu=(Student) object;
			System.out.println(stu);
		}
	}

}
