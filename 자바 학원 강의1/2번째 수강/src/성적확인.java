import java.util.Scanner;

public class 성적확인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("너의 점수는?");
		while(in.hasNext())//ctrl,z를 누르면 종료됨.
		{ 
			int b = in.nextInt();
			
			if (b>=80)
			{
				System.out.println("축 합격!");
			}
			else if(b>=60 ) 
			{
				System.out.println("합격!");
			}
			else
			{
				System.out.println("실격!");
			}
			System.out.println("너의 점수는?");
		}
		
	}

}
