package practiceDay13;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ArrayListTest {

	public static void main(String[] args) {
		Student t=new Student(0, "����","��", 18, 87);
		Student t1=new Student(1, "����","Ů", 22, 62);
		Student t2=new Student(2, "����","��", 23, 76);
		Student t3=new Student(3, "����","Ů", 20, 78);
		Student t4=new Student(4, "С��","��", 25, 90);
	//����һ:
		List lt=new ArrayList();
		lt.add(t);
		lt.add(t1);
		lt.add(t2);
		lt.add(t3);
		lt.add(t4);
		//���ѧ����Ϣ
		for(int i=0;i<lt.size();i++){
			System.out.println(lt.get(i));
		}
		
		//����ƽ����
		int sum=0;
		int avg;
		for(int i=0;i<lt.size();i++){
			Student stu=(Student) lt.get(i);
			sum=sum+stu.getsJava();
		}
		avg=sum/lt.size();
		System.out.println("java���Ե�ƽ����Ϊ:"+avg);
		
		//���java�ɼ������ֵ
		int max=((Student) lt.get(0)).getsJava();
		for(int i=1;i<lt.size();i++){
			Student stu=(Student) lt.get(i);
			if(max<stu.getsJava()){
				max=stu.getsJava();
			}
		}	
		System.out.println("Java���Ե����ֵΪ��"+max);
		//���java�ɼ�����Сֵ
		
		int min=((Student) lt.get(0)).getsJava();
		for(int i=1;i<lt.size();i++){
			Student stu=(Student) lt.get(i);
			if(min>stu.getsJava()){
				min=stu.getsJava();
			}
		}	
		System.out.println("Java���Ե���СֵΪ��"+min);
			
		//������:
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
		System.out.println("java���Ե�ƽ����Ϊ:"+avg1);
		
		System.out.println("Java���Ե����ֵΪ��"+((Student)ts.last()).getsJava());
		System.out.println("Java���Ե���СֵΪ��"+((Student)ts.first()).getsJava());
	}
}


