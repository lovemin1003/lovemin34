
public class exceptionex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(1);
		System.out.println(2);
		try
		{
			System.out.println(3);
			System.out.println(0/0);//예외를 발생시킨다.
			System.out.println(5);//실행이 안 됨.
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();//참조변수 ae를 통해, ArithmeticException생성된 인스턴스에 접근 가능.
			
			System.out.println("예외메시지:"+ae.getMessage());
		}
		
		System.out.println(8);
		

	}

}
