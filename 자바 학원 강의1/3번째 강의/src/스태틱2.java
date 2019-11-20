class cc
{
	private static int rate;
	public static int td(int won)
	{
	 return won/rate;
}
	public static int tok(int dollar)
	{
		return dollar * rate;
	}
	public static void setrate(int r)
	{
		rate = r;
	}
	
}
public class 스태틱2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cc.setrate(1000);
		System.out.println("만원은:"+ cc.td(10000)+"달러");
		System.out.println("백달러는:"+ cc.tok(100)+"원");

	}

}
