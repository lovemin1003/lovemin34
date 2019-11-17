package test;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomaccessfileex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//randomaccessfileex11에서 저장한 test.dat파일에서 가장 마지막으로 저장된 Int 값을 출력시켜줌.

		int sum=0;
		
		try
		{
			RandomAccessFile raf = new RandomAccessFile("test.dat","r");
			int i = 4;
			
			while(true)
			{
				raf.seek(i);
				sum += raf.readInt();
				i+=16;
			}

		}
		
		catch(EOFException e)
		{
			System.out.println("sum:"+sum);

		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
