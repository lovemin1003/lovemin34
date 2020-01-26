import java.io.File;
import java.util.Scanner;

public class scannerex3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("토노삐.txt"));
		int c = 0;
		int t = 0;
		
		while(sc.hasNextLine())
		{
			String l = sc.nextLine();
			Scanner sc2 = new Scanner(l).useDelimiter(","); // useDelimiter()로 ,를 구분자로 사용한다.
			int s = 0;
			
			while(sc2.hasNextInt())
			{
				s+=sc2.nextInt();
			}
			System.out.println(l+", 합:"+s);
			t+=s;
			c++;
		}
		
		System.out.println("총 "+c+"줄, 합:"+t);
		

	}

}
