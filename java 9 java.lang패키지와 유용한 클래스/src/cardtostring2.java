class cards
{
	String kind;
	int number;
	
	cards()
	{
		this("SPADE",1);
	}
	cards(String kind, int number)
	{
		this.kind = kind;
		this.number = number;
	}
	public String toString()
	{
		return "kind:"+kind+",number:"+number; // card 인스턴스의 kind와 number를 문자열로 반환한다.
	}
}
public class cardtostring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cards c1 = new cards();
		cards c2 = new cards("nono",12);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
