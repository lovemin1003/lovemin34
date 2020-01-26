import java.io.File;
import java.util.Scanner;

public class scannerex2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("明公明公.txt"));
		int s=0;
		int c=0;
		
		while(sc.hasNextInt())
		{
			s+=sc.nextInt();
			c++;
		}
		
		System.out.println("钦:"+s);
		System.out.println("乞闭:"+(double)s/c);

	}

}
