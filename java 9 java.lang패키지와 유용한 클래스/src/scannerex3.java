import java.io.File;
import java.util.Scanner;

public class scannerex3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("����.txt"));
		int c = 0;
		int t = 0;
		
		while(sc.hasNextLine())
		{
			String l = sc.nextLine();
			Scanner sc2 = new Scanner(l).useDelimiter(","); // useDelimiter()�� ,�� �����ڷ� ����Ѵ�.
			int s = 0;
			
			while(sc2.hasNextInt())
			{
				s+=sc2.nextInt();
			}
			System.out.println(l+", ��:"+s);
			t+=s;
			c++;
		}
		
		System.out.println("�� "+c+"��, ��:"+t);
		

	}

}
