
public class exceptionex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(1);
		System.out.println(2);
		try
		{
			System.out.println(3);
			System.out.println(0/0);//0���� ���� ���Ƿ� ArithmeticException�� �߻���Ų��.
			System.out.println(5);//������ �� ��.
		}
		catch(ArithmeticException ae)
		{
			System.out.println(6);
			System.out.println(7);
		}
		
		System.out.println(8);
		System.out.println(9);

	}

}
