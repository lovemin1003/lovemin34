package test;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomaccessfileex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			RandomAccessFile raf = new RandomAccessFile("test.dat","rw");
			System.out.println("���� ������ ��ġ:"+raf.getFilePointer());
			raf.writeInt(1110); //+4byte
			System.out.println("���� ������ ��ġ:"+raf.getFilePointer());
			raf.writeLong(1000L); //+8byte
			System.out.println("���� ������ ��ġ:"+raf.getFilePointer());
			raf.writeLong(100L); //+8byte
			System.out.println("���� ������ ��ġ:"+raf.getFilePointer());
			raf.writeInt(100); //+4byte
			System.out.println("���� ������ ��ġ:"+raf.getFilePointer());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}


	}

}
