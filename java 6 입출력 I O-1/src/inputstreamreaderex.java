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
			
			System.out.println("������� OS�� ���ڵ�:"+isr.getEncoding());
			do
			{
				System.out.print("������ �Է��Ͻÿ�. �������� q�� �Է��Ͻÿ�. ");
				line = br.readLine();
				System.out.println("�Է��Ͻ� ����:"+line);
			}
			while(!line.equalsIgnoreCase("q"));
			
			br.close();
			System.out.println("���α׷� ����.");
		}
		catch(IOException e)
		{
			
		}


	}

}
