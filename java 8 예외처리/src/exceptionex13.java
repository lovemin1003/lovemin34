
public class exceptionex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method1(); //같은 클래스 내 static멤버이므로 객체 생성없이 직접 호출 가능.


	}

	 static void method1() {

		 try
		 {
			throw new Exception(); 
		 }
		 catch(Exception e)
		 {
			 System.out.println("메소드에서 예외가 처리됨.");
			 e.printStackTrace();
		 }
	}

}
