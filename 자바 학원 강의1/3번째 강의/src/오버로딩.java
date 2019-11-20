class 오버로드
{
	public static int a(int b, int c)
	{
		return b+c;
	}
	public static int q(int w, int e)
	{
		return w-e;
	}
	public static int t(int y, int u)
	{
		return y*u;
	}
}
public class 오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z = 오버로드.a(3,5);
		int x = 오버로드.q(3,5);
		int v = 오버로드.t(3,5);
		
		System.out.println(z);
		System.out.println(x);
		System.out.println(v);
		
	}

}
