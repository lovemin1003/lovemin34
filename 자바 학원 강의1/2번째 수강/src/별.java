
public class 별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int a =0; a<5; a++)
		{
			for (int b =0; b<a+1; b++)
			{
				System.out.print("별");
			}
			System.out.println();
		}
	
	
	for (int c =0; c<5; c++)
	{
		for (int d =0; d<5-c; d++)
		{
			System.out.print("의");
		}
		System.out.println();
	}
	for (int e =0; e<5; e++)
	{
		for (int f =0; f<5; f++)
		{
			if(f>=(4-e))
			System.out.print("*");
			else
				System.out.print(' ');	
		}
		
		System.out.println();
	}
	for (int e =0; e<5; e++)
	{
		for (int f =0; f<5; f++)
		{
			if(f<=e-1)
			System.out.print(" ");
			else
				System.out.print("*");	
			
		}
		
		System.out.println();
	}
	
	
	
	
}

}
