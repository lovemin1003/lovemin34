
class sta
{
	public int q;
	public void w()
	{
		m = 20;
	}
	
	public void e()
	{
		m = 23;
	}
	
	public static int m;
	public static void r()
	{
		m = 43;
	}
}

public class 스태틱 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sta a,s;
		a = new sta();
		s = new sta();
		a.q = 4;
		a.w();
		a.m = 30;
		System.out.println(a.m);
		 
		s.q = 5;
		s.e();
		s.r();
		System.out.println(s.m);
		
		
		//스태틱 메소드는 스태틱만 접근 가능. 
		
		

	}

}
