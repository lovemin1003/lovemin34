package sample;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class dataoutputstreamex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try
		{
			fos = new FileOutputStream("samples.dat");//파일 생성
			dos = new DataOutputStream(fos);
			dos.writeInt(10);
			dos.writeFloat(25.0f);
			dos.writeBoolean(true);
			dos.close();
		}
		catch(IOException e)
        {
        	e.printStackTrace();
        }

	}

}
