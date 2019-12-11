
public class exceptionex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(1);
		System.out.println(2);
		try
		{
			System.out.println(3);
			System.out.println(0/0);//0으로 나눠 고의로 ArithmeticException을 발생시킨다.
			System.out.println(5);//실행이 안 됨.
		}
		catch(Exception ae)//ArithmeticException대신 Exception
		{
			System.out.println(6);
			System.out.println(7);
		}
		
		System.out.println(8);
		System.out.println(9);

	}

}
