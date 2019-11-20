import java.io.*;


public class fileinputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\test.txt");
		
		int c;
		while((c = fis.read()) != -1)
		{
			System.out.print((char)c);
		}
		
fis.close();
	}
catch(IOException e)
{
	e.printStackTrace();
}
	}
}
