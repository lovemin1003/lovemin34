
public class finallytest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method1()은 static이므로 인스턴스 생성없이 직접 호출이 됨.
		finallytest3.method1();
		System.out.println("method1()의 수행을 마치고 main메소드로 돌아옴.");

	}

	 static void method1() 
	{
		// TODO Auto-generated method stub
		 try 
		 {
		     System.out.println("method1()이 호출됨.");
		   return; 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 finally
		 {
			 System.out.println("method1()의 finally 블록이 실행됨.");
		 }
	}

}
