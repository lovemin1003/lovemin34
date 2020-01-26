class card
{
	String kind;
	int number;
	
	card()
	{
		this("SPADE",1);
	}
	card(String kind, int number)
	{
		this.kind = kind;
		this.number = number;
	}
}
public class cardtostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		card c1 = new card();
		card c2 = new card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
