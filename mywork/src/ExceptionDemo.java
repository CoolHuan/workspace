//自定义异常类
//实现了：判断逻辑处理，和异常处理的分离
class FuException extends RuntimeException{
	public FuException(){}
	public FuException(String msg){
		super(msg);
	}
	
}



class Test1{
		void run(int[] arr,int index){// throws FuException
			//自动抛异常： JVM---new---throw--->main--->JVM--->控制台
			
			if(arr==null){
				throw new NullPointerException("空指针异常");
			}
			if(index<0){
				throw new FuException("下标为负");
			}else if(index>=arr.length){
				throw new ArrayIndexOutOfBoundsException("index="+index+">=数组长度"+arr.length);
			}else{
			System.out.println(arr[index]);
			}
		}
}
public class ExceptionDemo {
	//演示一下跑出异常的流程
	public static void main(String[] args) {//throws FuException
		
		int[] arr=new int[5];	
		int[] array=null;
		
		//一、在main函数中，直接非法操作数组
		//	arr[5]=1232;		//ArrayIndexOutOfBoundsException
		//	array[0]=123;
		
		//二、调用成员方法，在成员方法中非法操作数组
		//run(arr,6);
		
		//三、其他类的成员方法中非法操作
		Test1 test=new Test1();
		test.run(arr,-2);
		//test.run(arr, 5);
		//test.run(array,1);
	}
	public static void run(int[] arr,int index){
		System.out.println(arr[index]);
	}

}
