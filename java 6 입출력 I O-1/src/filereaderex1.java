import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class filereaderex1 {

	public static void main(String[] args) 
	{
		// ���� ���� ���
		try
		{
			String filename = "C:\\Users\\COM\\eclipse-workspace\\java 6 ����� I O\\src\\file.TXT";
			FileInputStream fis = new FileInputStream(filename);
			FileReader fr = new FileReader(filename);
			
			int data = 0;
			// FileInputStream�� �̿��ؼ� ���ϳ����� �о� ȭ�鿡 ����Ѵ�.
			while((data=fis.read())!=-1)
			{
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();	
			// FileReader�� �̿��ؼ� ���ϳ����� �о� ȭ�鿡 ����Ѵ�.
			while((data=fr.read())!=-1)
			{
				System.out.print((char)data);
			}
			System.out.println();
			fr.close();

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}


}
