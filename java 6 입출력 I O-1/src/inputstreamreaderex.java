import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputstreamreaderex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line= "";
		
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("사용중인 OS의 인코딩:"+isr.getEncoding());
			do
			{
				System.out.print("문장을 입력하시오. 끝내려면 q를 입력하시오. ");
				line = br.readLine();
				System.out.println("입력하신 문장:"+line);
			}
			while(!line.equalsIgnoreCase("q"));
			
			br.close();
			System.out.println("프로그램 종료.");
		}
		catch(IOException e)
		{
			
		}


	}

}
