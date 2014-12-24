//�Զ����쳣��
//ʵ���ˣ��ж��߼��������쳣����ķ���
class FuException extends RuntimeException{
	public FuException(){}
	public FuException(String msg){
		super(msg);
	}
	
}



class Test1{
		void run(int[] arr,int index){// throws FuException
			//�Զ����쳣�� JVM---new---throw--->main--->JVM--->����̨
			
			if(arr==null){
				throw new NullPointerException("��ָ���쳣");
			}
			if(index<0){
				throw new FuException("�±�Ϊ��");
			}else if(index>=arr.length){
				throw new ArrayIndexOutOfBoundsException("index="+index+">=���鳤��"+arr.length);
			}else{
			System.out.println(arr[index]);
			}
		}
}
public class ExceptionDemo {
	//��ʾһ���ܳ��쳣������
	public static void main(String[] args) {//throws FuException
		
		int[] arr=new int[5];	
		int[] array=null;
		
		//һ����main�����У�ֱ�ӷǷ���������
		//	arr[5]=1232;		//ArrayIndexOutOfBoundsException
		//	array[0]=123;
		
		//�������ó�Ա�������ڳ�Ա�����зǷ���������
		//run(arr,6);
		
		//����������ĳ�Ա�����зǷ�����
		Test1 test=new Test1();
		test.run(arr,-2);
		//test.run(arr, 5);
		//test.run(array,1);
	}
	public static void run(int[] arr,int index){
		System.out.println(arr[index]);
	}

}
