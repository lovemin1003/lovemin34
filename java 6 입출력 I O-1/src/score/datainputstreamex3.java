package score;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class datainputstreamex3 {

	public static void main(String[] args) {
		// datainputstreamex2를 try-with-resourse문을 이용하여 변경한 것.
		int sum = 0;
		int score = 0;
		
		
		try
		{

			FileInputStream fis = new FileInputStream("score.dat");
			DataInputStream dis = new DataInputStream(fis);
			
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

	}

}
