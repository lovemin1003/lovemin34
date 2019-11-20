import java.util.Scanner;

public class 스캐너2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ina = new Scanner(System.in);
		String q = ina.nextLine();
		for(int w = q.length(); w>0; w--)//글자 거꾸로 나오게 함.
		{
			System.out.print(q.charAt(w-1));
		}
		System.out.println();
		
		Scanner in = new Scanner(System.in);
		System.out.println("가로 길이는?");
		int z = in.nextInt();
		System.out.println("세로 길이는?");
		int x = in.nextInt();
		System.out.print("넓이:"+aigo(z,x));
		
	}


static int aigo(int a, int b)
{
	return a*b;
}
}