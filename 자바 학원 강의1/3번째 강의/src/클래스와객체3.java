class gogo
{
	int base;
	int exp;
	int getvalue()
	{
		int res=1;
		for(int q =0; q<exp; q++)
		{
			res = res*base;
		
		}
		return res;
	}
}
public class 클래스와객체3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gogo a = new gogo();
		gogo b = new gogo();
        a.base = 3;
        a.exp = 4;
        b.base = 7;
        b.exp = 2;
        
        System.out.println(a.getvalue());
        System.out.println(b.getvalue());
	}

}
