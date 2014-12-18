package practiceDay13;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ArrayListTest {

	public static void main(String[] args) {
		Student t=new Student(0, "张三","男", 18, 87);
		Student t1=new Student(1, "李四","女", 22, 62);
		Student t2=new Student(2, "王二","男", 23, 76);
		Student t3=new Student(3, "麻子","女", 20, 78);
		Student t4=new Student(4, "小明","男", 25, 90);
	//方法一:
		List lt=new ArrayList();
		lt.add(t);
		lt.add(t1);
		lt.add(t2);
		lt.add(t3);
		lt.add(t4);
		//输出学生信息
		for(int i=0;i<lt.size();i++){
			System.out.println(lt.get(i));
		}
		
		//计算平均分
		int sum=0;
		int avg;
		for(int i=0;i<lt.size();i++){
			Student stu=(Student) lt.get(i);
			sum=sum+stu.getsJava();
		}
		avg=sum/lt.size();
		System.out.println("java语言的平均分为:"+avg);
		
		//输出java成绩的最大值
		int max=((Student) lt.get(0)).getsJava();
		for(int i=1;i<lt.size();i++){
			Student stu=(Student) lt.get(i);
			if(max<stu.getsJava()){
				max=stu.getsJava();
			}
		}	
		System.out.println("Java语言的最大值为："+max);
		//输出java成绩的最小值
		
		int min=((Student) lt.get(0)).getsJava();
		for(int i=1;i<lt.size();i++){
			Student stu=(Student) lt.get(i);
			if(min>stu.getsJava()){
				min=stu.getsJava();
			}
		}	
		System.out.println("Java语言的最小值为："+min);
			
		//方法二:
		TreeSet ts=new TreeSet();
		ts.add(t);
		ts.add(t1);
		ts.add(t2);
		ts.add(t3);
		ts.add(t4);
		
		System.out.println(ts);
		int sum1=0;
		int avg1;
		for(Object obj:ts){
			Student stu=(Student) obj;
			sum1=sum1+stu.getsJava();
		}
		avg1=sum1/ts.size();
		System.out.println("java语言的平均分为:"+avg1);
		
		System.out.println("Java语言的最大值为："+((Student)ts.last()).getsJava());
		System.out.println("Java语言的最小值为："+((Student)ts.first()).getsJava());
	}
}


