import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedreaderex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedReader의 readLine()을 이용해서 파일을 라인단위로 읽은 후 indexOf()을 이용하여 ';'를 포함하는지 확인 후 출력하는 예제(포함하지 않으면 아무 것도 출력되지 않음)
		try
		{
			FileReader fr = new FileReader("C:\\Users\\COM\\eclipse-workspace\\java 6 입출력 I O\\src\\file4.TXT");
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
