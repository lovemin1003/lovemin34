
public class exceptionex12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		method1(); //같은 클래스 내 static멤버이므로 객체 생성없이 직접 호출 가능.

	}

	 static void method1() throws Exception 
	{
		method2();
	}

	 static void method2() throws Exception 
	{
		throw new Exception();
		
	}

}
