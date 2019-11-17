package score;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class dataoutputstreamex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {30,50,90,10,20};
		
		try
		{
			FileOutputStream fos = new FileOutputStream("score.dat");//파일 생성
			DataOutputStream dos = new DataOutputStream(fos);
			for(int i=0; i<score.length; i++)
			{
				dos.writeInt(score[i]);
			}
			dos.close();
		}
		catch(IOException e)
        {
        	e.printStackTrace();
        }

	}

}
