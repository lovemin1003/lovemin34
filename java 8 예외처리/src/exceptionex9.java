
public class exceptionex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Exception e = new Exception("고의로 발생시킴.");
			throw e; //예외를 발생시킴.
			// throw new Exception("고의로 발생시킴"); //위의 두 줄을 한 줄로 줄일 수 있음.
			
		}
		catch(Exception e)
		{
			System.out.println("에러 메시지:"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("정상 종료");

	}

}
