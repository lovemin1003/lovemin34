import java.io.IOException;

public class standardioex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int input = 0;
			System.out.print("아무거나 입력하시오:");
			while((input=System.in.read())!=-1)//System.in.read(): 글자를 입력받음.
			{
				System.out.println("input:"+input+", (char)input:"+(char)input);
			}
		}
		catch(IOException e)
		{
			
		}

	}

}
