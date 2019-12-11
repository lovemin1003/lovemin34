
public class exceptionex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			method1();
		}
		catch(Exception e)
		{
			System.out.println("main메소드에서 예외가 처리됨.");
		}

	}

	 static void method1() throws Exception 
	 {
		try
		{
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("method1메소드에서 예외가 처리됨.");
			throw e; //다시 예외를 발생시킴.
		}
		
	 }

}
