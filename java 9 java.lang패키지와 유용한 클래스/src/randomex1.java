import java.util.Random;

public class randomex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand1 = new Random(1);
		Random rand2 = new Random(1);
		
		for(int i=1; i<=5; i++)
		{
			System.out.println(i+":"+rand1.nextInt());
		}
		System.out.println();
		
		for(int i=11; i<=15; i++)
		{
			System.out.println(i+":"+rand2.nextInt());
		}

	}

}
