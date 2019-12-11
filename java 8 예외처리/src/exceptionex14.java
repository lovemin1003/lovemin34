
public class exceptionex14 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		

			 try
			 {
				 method1();
			 }
			 catch(Exception e)
			 {
				 System.out.println("메소드에서 예외가 처리됨.");
				 e.printStackTrace();
			 }
	}

	private static void method1() throws Exception 
	{
		throw new Exception();
		
	}


}

	 


