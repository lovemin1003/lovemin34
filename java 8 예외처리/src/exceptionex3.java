
public class exceptionex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=100;
		int count=0;
		
		for(int i=1; i<=5; i++)
		{
			try
			{
				count=num/(int)(Math.random()*20);
				System.out.println(count);
			}
			catch(ArithmeticException e)
			{
				System.out.println("0"); //ArithmeticException발생시 실행하는 코드
			}
		}
		

	}

}
