
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ���϶�����ex {
	public static void main(String[] args)
	{
		
		InputStreamReader in = new InputStreamReader(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:\\tmp\\�׽�Ʈ.txt");
			
			while((c = in.read()) != -1)
			{
				fout.write(c);
			}
			in.close();
			fout.close();
		}
		catch(IOException e)
		{
			System.out.print("����� ����");
		}
		
	}
	}

