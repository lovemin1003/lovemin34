final class cardo
{
	String kind;
	int number;
	
	cardo()
	{
		this("SPADE",1);
	}
	cardo(String kind, int number)
	{
		this.kind = kind;
		this.number = number;
	}
	public String toString()
	{
		return kind+":"+number;
	}
}
public class classex1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		cardo c1 = new cardo("nono",12);
		cardo c2 = cardo.class.newInstance();
		
		Class cObj = c1.getClass();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());

	}

}
