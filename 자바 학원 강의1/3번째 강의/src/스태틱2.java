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
public class ����ƽ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cc.setrate(1000);
		System.out.println("������:"+ cc.td(10000)+"�޷�");
		System.out.println("��޷���:"+ cc.tok(100)+"��");

	}

}
