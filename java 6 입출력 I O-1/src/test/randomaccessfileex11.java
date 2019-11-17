package test;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomaccessfileex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			RandomAccessFile raf = new RandomAccessFile("test.dat","rw");
			System.out.println("파일 포인터 위치:"+raf.getFilePointer());
			raf.writeInt(1110); //+4byte
			System.out.println("파일 포인터 위치:"+raf.getFilePointer());
			raf.writeLong(1000L); //+8byte
			System.out.println("파일 포인터 위치:"+raf.getFilePointer());
			raf.writeLong(100L); //+8byte
			System.out.println("파일 포인터 위치:"+raf.getFilePointer());
			raf.writeInt(100); //+4byte
			System.out.println("파일 포인터 위치:"+raf.getFilePointer());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}


	}

}
