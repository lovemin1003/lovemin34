
public class exceptionex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method1(); //���� Ŭ���� �� static����̹Ƿ� ��ü �������� ���� ȣ�� ����.


	}

	 static void method1() {

		 try
		 {
			throw new Exception(); 
		 }
		 catch(Exception e)
		 {
			 System.out.println("�޼ҵ忡�� ���ܰ� ó����.");
			 e.printStackTrace();
		 }
	}

}
