/*
 *�쳣����
 * 1��runtime�쳣��   ����Ա--�׳�     vs  jvm---�Զ����� 
 * 2��checked�쳣������Ա--�׳�     vs  ����Ա---�ֶ�����
 * checked�쳣����
 * 1��������Ա���ֶ��쳣����֮һ:throws
 * 2��������Ա���ֶ��쳣����֮�� :try catch finally
 * 
 * ����Ա����:
 * 1.ʲôʱ��ᷢ���쳣��
 * 2.��������ʲô�쳣��
 * 3.�����쳣���ͣ��������쳣��ô����
 * 		a��runtime  JVM
 * 		b��checked:
 * 			|������throw  ===��֪����ν��      ����ǩ����throws+checked�쳣����	--�׸�������   
 * 			|������ try catch===֪����ô���
 * 4.catch(){}    --?
 * 
 * */


class FuShuException extends Exception{

	public FuShuException(String msg){
		super(msg);
	}
	public String toString(){
		return "����Ա����"+this.getMessage();
		
	}
	
}


class Demo{
	public void run(int[] arr,int index) throws FuShuException{
		if(arr==null)
			throw new NullPointerException("JVM:��ָ���쳣");
		if(index>=arr.length){
			throw new ArrayIndexOutOfBoundsException("JVM:index���ڵ������鳤��");
		}else if(index<0){
				throw new FuShuException("����Ա����index����");
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
