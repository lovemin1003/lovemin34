import java.util.Random;

public class randomex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		int[] number = new int[100];
		int[] counter = new int[10];
		
		for(int i=0; i<number.length; i++)
		{
			System.out.print(number[i]=rand.nextInt(10));
			// rand.nextInt(10)=(int)(Math.random()*10)
			// 범위의 정수 x를 반환함.
		}
		System.out.println();
		
		for(int i=0; i<number.length; i++)
		{
			counter[number[i]]++;
		}
		System.out.println();
		
		for(int i=0; i<counter.length; i++)
		{
			System.out.println(i+":"+counter[i]+"개");
		}

	}

}
