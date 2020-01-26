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
	
	//�迭 is�� is2,is3�� ����� ä���� ��ȯ�Ѵ�.
	public static int[] fillRand(int[] is, int is2, int is3) 
	{
		for(int i=0; i< is.length; i++)
		{
			is[i] = getrand(is2,is3);
		}
		
		return is;
	}

	//�迭 is�� �迭 is2�� ����� ä���� ��ȯ�Ѵ�.
	private static int[] fillRand(int[] is, int[] is2) 
	{
		for(int i=0; i< is.length; i++)
		{
			is[i] = is2[getrand(0,is2.length-1)];
		}
		return is;
	}

	//i,j������ ����(int)���� ��ȯ�Ѵ�. i,j ��� ������ ������.
	private static int getrand(int i, int j) 
	{
		// TODO Auto-generated method stub
		return (int)(Math.random()*(Math.abs(j-i)+1))+Math.min(i, j);
	}

}
