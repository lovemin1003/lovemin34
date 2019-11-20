


public class 다차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] table = {
				{12,62,22,85,34,15,75,54,76,16}, 
				{52,34,42,65,95,16,52,84,67,88},
				{97,46,24,62,36,73,82,89,77,85},	
				{11,91,49,86,43,20,50,70,80,17},
				{1,2,3,4,5,6,7,8,9,10}				
				
		};
		
		for (int a = 0; a<table.length; a++)
		{
			for (int b = 0; b<table[a].length; b++)
			{
				System.out.print(table[a][b]+" ");
			}
			
			System.out.println();
		}
		
		String a = "sad";
		String b = a;
		String c = new String("sad");
		
		System.out.print(a.equals(b));
		System.out.print(a==b);
		System.out.print(a==c);
		System.out.print(a.equals(c));
		System.out.print(!a.equals(b));
	}

}
