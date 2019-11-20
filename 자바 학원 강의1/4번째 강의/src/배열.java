
public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [] s;
	//	char[5] ss; 선언시 크기 명시 불가
		
		s = new char[5];
		s[0] = 'a';
		s[1] = 'b';
		s[2] = 'c';
		s[3] = 'd';
		s[4] = 'e';
		
		for(int a = 0; a<s.length; a++)
		{
			System.out.println(s[a]);
		}
		
		int [] array1 = {2,3,4,5,6,1,7};
		int [] array2;
		
		printArray(array1);
		array2 = array1;
		array2[0] = 0;
		array2[2] = 2;
		printArray(array1);
		printArray(array2);		
		
		int [] so = {0,3,4,7,6,1,7};
		int [] go = {2,8,4,5,6,8,7,9,1};
		System.arraycopy(so, 0, go, 0, so.length);
		for(int q =0; q<go.length; q++)
		{
			System.out.print(go[q]+" ");
		}
		String[] wa = {
				"mon", "tue", "wed",  "thu",  "fri",  "sat", 
				"sun", 
				
		};
		for (String day: wa)
		{
			System.out.print(day+" ");
		}
		
		
		
		int c[] = {2,3,5,7,8};
		 increase(c);
		 
		 for (int q = 0; q<c.length; q++)
		 {
			 System.out.print(c[q]+" ");
		 }
	}

	private static void printArray(int[] array1) {
		// TODO Auto-generated method stub
		System.out.print('<');
		for(int i=0; i<array1.length; i++)
		{
			System.out.print(array1[i]);
			if(i+1 < array1.length)
			{
				System.out.print(',');
			}
		}
		System.out.println('>');
	}
	static void increase(int[] array)
	{
		for(int a =0; a<array.length; a++)
			array[a]++;
	}

}

