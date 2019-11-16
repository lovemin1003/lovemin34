import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class filereaderex1 {

	public static void main(String[] args) 
	{
		// 파일 정보 출력
		try
		{
			String filename = "C:\\Users\\COM\\eclipse-workspace\\java 6 입출력 I O\\src\\file.TXT";
			FileInputStream fis = new FileInputStream(filename);
			FileReader fr = new FileReader(filename);
			
			int data = 0;
			// FileInputStream을 이용해서 파일내용을 읽어 화면에 출력한다.
			while((data=fis.read())!=-1)
			{
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();	
			// FileReader를 이용해서 파일내용을 읽어 화면에 출력한다.
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
