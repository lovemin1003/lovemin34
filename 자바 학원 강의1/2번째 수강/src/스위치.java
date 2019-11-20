import java.util.Scanner;

public class 스위치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("번호 입력:");
		int a = in.nextInt();
		 
		switch(a)
		{
		case(1):
			System.out.println("1번");
		 break;
		case(2):
			System.out.println("2번");
		 break;
		case(3):
			System.out.println("3번");
		 break;
		 default:
			 System.out.println("???");
			 break;
		
		}
		System.out.println("yes? no?:");
		String b = in.next();
		switch(b) {
		case "yes":
			System.out.println("yes");
			 break;
		case "no":
			System.out.println("no");
			 break;	 
		default:
			 System.out.println("???");
			 break;	 
		}

	}

}
