
class qw
{
	public int a;
	private int b;
	protected int c;
	
	public int getB()
	{
		return b;
		
	}
	
	public void setB(int val)
	{
		 b = val;
		
	}
}

public class �ۺ�_�����̺���Ʈ_������Ƽ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		qw e = new qw();
		e.a = 10;
		//e.b = 32;   //�����̺���Ʈ�� ���� Ŭ���� �������� ���� ����.
		e.c = 40;
		 e.setB(23);
		
		
		System.out.println(e.a);
		
		System.out.println(e.c);
	}

}
