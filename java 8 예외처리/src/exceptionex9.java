
public class exceptionex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Exception e = new Exception("���Ƿ� �߻���Ŵ.");
			throw e; //���ܸ� �߻���Ŵ.
			// throw new Exception("���Ƿ� �߻���Ŵ"); //���� �� ���� �� �ٷ� ���� �� ����.
			
		}
		catch(Exception e)
		{
			System.out.println("���� �޽���:"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���� ����");

	}

}
