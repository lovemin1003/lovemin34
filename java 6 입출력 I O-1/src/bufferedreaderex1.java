import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedreaderex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedReader�� readLine()�� �̿��ؼ� ������ ���δ����� ���� �� indexOf()�� �̿��Ͽ� ';'�� �����ϴ��� Ȯ�� �� ����ϴ� ����(�������� ������ �ƹ� �͵� ��µ��� ����)
		try
		{
			FileReader fr = new FileReader("C:\\Users\\COM\\eclipse-workspace\\java 6 ����� I O\\src\\file4.TXT");
			BufferedReader br = new BufferedReader(fr);
			
			String line ="";
			
			for(int i=1; (line = br.readLine())!=null; i++)
			{
				if(line.indexOf(";")!=-1)
				{
					System.out.println(i+":"+line);
				}
			}
			br.close();
		}
		catch(IOException e)
		{
			
		}

	}

}
