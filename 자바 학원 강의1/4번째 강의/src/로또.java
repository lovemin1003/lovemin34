
public class ·Î¶Ç {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] lotto = {0,0,0,0,0,0};
		
		int index = 0;
		while (true)
		{
			int rand = (int)(Math.random()*45)+1;
			int i = 0;
			for(i = 0; 1<index; i++)
			{
				if(rand == lotto[i])
				{
					break;
				}
			}
			if(index == i)
			{
				lotto[index++] = rand;
			}
			if(index>5)
                 break;
		}
		
		for(int i = 0; i<lotto.length; i++)
		{
			System.out.println(lotto[i]);
		}
	}

}
