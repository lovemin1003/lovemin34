import java.io.*;

public class 한글텍스트파일_읽기_출력 {
	public static void main(String[] args)
	{
		
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("c:\\tmp\\한글.txt");
			in = new InputStreamReader(fin,"MS949");
			int c;
			
			System.out.println("인코딩 문자 집합은"+in.getEncoding());
			while((c = in.read()) != -1)
			{
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}
		catch(IOException e)
		{
			System.out.print("입출력 오류");
		}
		
	}
	}

