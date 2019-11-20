import java.util.Scanner;

class card
{
	private String name;
	private int price;
	private int stock;
	private int sold;
	
	card(String n, int p, int s, int o)
	{
		name = n;
		price = p;
		stock = s;
		sold = o;
	}
	
	String getname()
	{
		return name;
	}
	int getprice()
	{
		return price;
	}
	int getstock()
	{
		return stock;
	}
	int getsold()
	{
		return sold;
	}
}



public class 클라스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
card [] ca;
ca = new card[5];

Scanner s = new Scanner(System.in);
for (int i=0; i<ca.length; i++)
{
	System.out.print("카드이름을 적으시오.");
	String name = s.next();
	System.out.print("카드가격을 적으시오.");
	int price = s.nextInt();
	System.out.print("카드재고을 적으시오.");
	int stock = s.nextInt();
	System.out.print("카드판매수을 적으시오.");
	int sold = s.nextInt();
	ca[i] = new card(name, price, stock, sold);
}
for (int i=0; i<ca.length; i++)
{
 System.out.print(ca[i].getname()+",");	
 System.out.print(ca[i].getprice()+",");	
 System.out.print(ca[i].getstock()+",");	
 System.out.print(ca[i].getsold()+",");	
 System.out.println();	
}




	}

}
