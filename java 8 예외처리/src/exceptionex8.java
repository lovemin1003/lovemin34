
public class exceptionex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(1);
		System.out.println(2);
		try
		{
			System.out.println(3);
			System.out.println(0/0);//���ܸ� �߻���Ų��.
			System.out.println(5);//������ �� ��.
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();//�������� ae�� ����, ArithmeticException������ �ν��Ͻ��� ���� ����.
			
			System.out.println("���ܸ޽���:"+ae.getMessage());
		}
		
		System.out.println(8);
		

	}

}
