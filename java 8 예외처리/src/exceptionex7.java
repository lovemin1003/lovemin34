
public class exceptionex7 {

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
		catch(ArithmeticException ae)
		{
			if(ae instanceof ArithmeticException)
			{
				System.out.println("트루");
			}
			System.out.println(6);
			System.out.println(7);
		}
		catch(Exception e)//ArithmeticException을 재외한 모든 예외가 처리된다.
		{
			System.out.println(66);
		}
		
		
		System.out.println(8);
		System.out.println(9);

	}

}
