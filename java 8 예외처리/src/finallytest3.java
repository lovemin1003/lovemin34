
public class finallytest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method1()�� static�̹Ƿ� �ν��Ͻ� �������� ���� ȣ���� ��.
		finallytest3.method1();
		System.out.println("method1()�� ������ ��ġ�� main�޼ҵ�� ���ƿ�.");

	}

	 static void method1() 
	{
		// TODO Auto-generated method stub
		 try 
		 {
		     System.out.println("method1()�� ȣ���.");
		   return; 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 finally
		 {
			 System.out.println("method1()�� finally ����� �����.");
		 }
	}

}
