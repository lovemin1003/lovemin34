import java.util.*;

public class randomex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10; i++)
		{
			System.out.print(getrand(5,10)+",");
		}
		System.out.println();
		
		int[] result = fillRand(new int[10], new int[] {1,2,3,4,5});
		
		System.out.println(Arrays.toString(result));

	}
	
	//배열 is을 is2,is3의 값들로 채워서 반환한다.
	public static int[] fillRand(int[] is, int is2, int is3) 
	{
		for(int i=0; i< is.length; i++)
		{
			is[i] = getrand(is2,is3);
		}
		
		return is;
	}

	//배열 is을 배열 is2의 값들로 채워서 반환한다.
	private static int[] fillRand(int[] is, int[] is2) 
	{
		for(int i=0; i< is.length; i++)
		{
			is[i] = is2[getrand(0,is2.length-1)];
		}
		return is;
	}

	//i,j범위의 정수(int)값을 반환한다. i,j 모두 범위에 포함함.
	private static int getrand(int i, int j) 
	{
		// TODO Auto-generated method stub
		return (int)(Math.random()*(Math.abs(j-i)+1))+Math.min(i, j);
	}

}
