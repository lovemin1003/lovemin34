package sample;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class datainputstreamex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			FileInputStream fis = new FileInputStream("samples.dat");//파일 읽기
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			
			dis.close();
		}
		catch(IOException e)
        {
        	e.printStackTrace();
        }

	}

}
