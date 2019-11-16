package score;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class datainputstreamex2 {

	public static void main(String[] args) {
		
		int sum = 0;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try
		{
			 fis = new FileInputStream("score.dat");//파일 읽기
			 dis = new DataInputStream(fis);
			
			while(true)
			{
				score = dis.readInt();
				System.out.println(score);
				sum+=score;

			}
			
			
			
		}
		catch(EOFException e)
        {
			System.out.println("점수 총 합계:"+sum);
        }
		catch(IOException ee)
        {
        	ee.printStackTrace();
        }
		finally
		{
			try
			{
				if(dis!=null)
				{
					dis.close();
				}
			}
			catch(IOException ee)
	        {
	        	ee.printStackTrace();
	        }
		}

	}

}
