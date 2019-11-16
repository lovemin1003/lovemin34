import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomaccessfileex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//                   ��ȣ , ü��,����,  ���� , Ư��, Ư��, ���ǵ�		
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
            //readInt()�� ȣ���� ��� �� �̻� ���� ������ ���� �� EOFException�� �߻���.
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
