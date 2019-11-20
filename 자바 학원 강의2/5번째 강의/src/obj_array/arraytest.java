package obj_array;

public class arraytest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		사람 kim = new 사람("김치남", 50, "남자");
		사람 don = new 사람("된장녀", 52, "여자");
		
		kim.info();
		don.info();
		
		사람[] 인간 = new  사람[3];
		인간[0] = new 사람("돌머리", 20, "남자");
		인간[1] = new 사람("쇠머리", 22, "여자");
		인간[2] = new 사람("금머리", 10, "남자");
		
		for (int q = 0; q<인간.length; q++)
		{
			인간[q].info();;
		}
		for (사람 a : 인간)
		{
			a.info();
		}
		
		int[] aa = {1,2,3,4,5};
		
		for ( int b  : aa)
		{
			System.out.print(b);
		}
}
}
