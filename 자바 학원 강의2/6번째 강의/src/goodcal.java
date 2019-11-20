
public class goodcal extends cal
{

	public int add(int a, int b) {
	// TODO Auto-generated method stub
	return a+b;
}


public int sub(int a, int b) {
	// TODO Auto-generated method stub
	return a-b;
}

public double ave(int[] a) {
	// TODO Auto-generated method stub
	double sum = 0;
	for(int i=0; i<a.length; i++)
	{
		sum +=a[i];
	}
	return sum/a.length;
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal c = new goodcal();
		System.out.println(c.add(2, 4));
		System.out.println(c.sub(8, 4));
		System.out.println(c.ave(new int [] {2, 4}));
		

	}


	
	
}
