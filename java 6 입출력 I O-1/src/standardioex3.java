import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class standardioex3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try
		{
			fos = new FileOutputStream("C:\\Users\\COM\\eclipse-workspace\\java 6 ����� I O\\src\\file5.TXT");// �� ���Ͽ�(���ϸ��� ���� ���� ���� �������)->
			ps = new PrintStream(fos);
			System.setOut(ps);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not find");
		}
		
		//->�Ʒ��� ���ڸ� �Է½�����.
		System.out.println("Hello");
		System.out.println("Hello. kitty!");

	}

}
