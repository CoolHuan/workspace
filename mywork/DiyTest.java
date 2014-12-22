/*
 *异常处理：
 * 1、runtime异常：   程序员--抛出     vs  jvm---自动处理 
 * 2、checked异常：程序员--抛出     vs  程序员---手动处理
 * checked异常处理：
 * 1、【程序员】手动异常处理之一:throws
 * 2、【程序员】手动异常处理之二 :try catch finally
 * 
 * 程序员考虑:
 * 1.什么时候会发生异常？
 * 2.发生的是什么异常？
 * 3.根据异常类型，来考虑异常怎么处理
 * 		a、runtime  JVM
 * 		b、checked:
 * 			|——？throw  ===不知道如何解决      函数签名：throws+checked异常类名	--抛给调用者   
 * 			|——？ try catch===知道怎么解决
 * 4.catch(){}    --?
 * 
 * */


class FuShuException extends Exception{

	public FuShuException(String msg){
		super(msg);
	}
	public String toString(){
		return "程序员处理："+this.getMessage();
		
	}
	
}


class Demo{
	public void run(int[] arr,int index) throws FuShuException{
		if(arr==null)
			throw new NullPointerException("JVM:空指针异常");
		if(index>=arr.length){
			throw new ArrayIndexOutOfBoundsException("JVM:index大于等于数组长度");
		}else if(index<0){
				throw new FuShuException("程序员处理：index负数");
		}else{
			System.out.println("index:"+index);
		}
	}
}
public class DiyTest {
	public static void main(String[] args){
		int[] array=new int[5];
		Demo d=new Demo();
		try {
			d.run(array, -12);
		} catch (FuShuException e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.toString()+"\n"+e.getMessage());
		}
		System.out.println("======end======");
	}
}
