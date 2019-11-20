
public class person {

	private static int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person[] pa;
		pa = new person[10];
		for (int i = 0; i<pa.length; i++)
		{
			pa[i] = new person();
			pa[i].age = 20+i;
			System.out.print(pa[i].age+ " ");
		}
		

	}

}
