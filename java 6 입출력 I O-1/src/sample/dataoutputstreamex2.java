package sample;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class dataoutputstreamex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteArrayOutputStream bos = null;
		DataOutputStream dos = null;
		byte[] result = null;
		
		try
		{
			bos = new ByteArrayOutputStream();
			dos = new DataOutputStream(bos);
			dos.writeInt(15);
			dos.writeFloat(25.0f);
			dos.writeBoolean(true);
			
			result = bos.toByteArray();
			String[] hex = new String[result.length];
			
			for(int i=0; i<result.length; i++)
			{
				if(result[i]<0)
				{
					hex[i] = String.format("%02x", result[i]+256);
				}
				else
				{
					hex[i] = String.format("%02x", result[i]);
				}
			}
			
			System.out.println("10����:"+Arrays.toString(result));
			System.out.println("16����:"+Arrays.toString(hex));

			dos.close();
		}
		catch(IOException e)
        {
        	e.printStackTrace();
        }

	}

}
