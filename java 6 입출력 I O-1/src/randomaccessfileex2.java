import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomaccessfileex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//                   번호 , 체력,물공,  물방 , 특공, 특방, 스피드		
		int[]score= { 1, 320, 317, 289, 320, 317, 289,
				      2, 326, 425, 245, 320, 317, 289,
				      3, 279, 287, 110, 320, 317, 289,
				      4, 409, 123, 317, 320, 317, 289,
				      5, 206, 118, 220, 320, 317, 289,
				      6, 427, 389, 125, 320, 317, 289
		};
		
		try
		{
			//RandomAccessFile raf1 = new RandomAccessFile("score1.dat","rww"); //Illegal mode "rww" must be one of "r", "rw", "rws", or "rwd"
			RandomAccessFile raf1 = new RandomAccessFile("score1.dat","rw");
			for(int i=0; i<score.length; i++)
			{
				raf1.writeInt(score[i]);
			}
			while(true)
			{
				System.out.println(raf1.readInt());
			}
		}
		catch(EOFException e)
		{
            //readInt()를 호출핫 경우 더 이상 읽을 내용이 없을 시 EOFException이 발생함.
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
