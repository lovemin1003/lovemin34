import java.util.Scanner;

public class 스트링 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner in = new Scanner(System.in);
		int a = 0;
		do
		{
		System.out.println("너의 점수는?");
		
		 a = in.nextInt();
		if ((a>100) | (a<0))
		{
			System.out.println("다시 입력해라.");
		}
		 else if (a>=60)
		 {
			 System.out.println("축 합격!");
		 }
		 else
		 {
			 System.out.println("축 실격!");
		 }
		}while((a>100) | (a<0));
		
		System.out.println("숫자 입력:");
		
		int b = in.nextInt();
		
		if (b%3==0)
		{
			System.out.println("3의 배수.");
		}
		else
		{
			System.out.println("3의 배수가 아님.");
		}
		Scanner ina = new Scanner(System.in);
		String q = ina.nextLine();
		for(int w = q.length(); w>0; w--)
		{
			System.out.print(q.charAt(w-1));
		}
		
		
		
		
	}

}
