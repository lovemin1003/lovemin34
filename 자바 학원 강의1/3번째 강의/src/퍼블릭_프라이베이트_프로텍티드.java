
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

public class 퍼블릭_프라이베이트_프로텍티드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		qw e = new qw();
		e.a = 10;
		//e.b = 32;   //프라이베이트는 같은 클래스 내에서만 접근 가능.
		e.c = 40;
		 e.setB(23);
		
		
		System.out.println(e.a);
		
		System.out.println(e.c);
	}

}
