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
			fos = new FileOutputStream("C:\\Users\\COM\\eclipse-workspace\\java 6 입출력 I O\\src\\file5.TXT");// 이 파일에(파일명이 없는 경우면 새로 만들어줌)->
			ps = new PrintStream(fos);
			System.setOut(ps);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not find");
		}
		
		//->아래의 글자를 입력시켜줌.
		System.out.println("Hello");
		System.out.println("Hello. kitty!");

	}

}
