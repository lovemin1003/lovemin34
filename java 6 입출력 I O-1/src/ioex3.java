import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ioex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] insrc = {0,1,2,3,4,5,6,7};
		byte[] outsrc = null;
		byte[] temp = new byte[3]; //배열 크기 변동.
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(insrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("input source:"+Arrays.toString(insrc));

		try
		{
			while(input.available()>0)
			{
				input.read(temp);
				output.write(temp);
				System.out.println("temp:"+Arrays.toString(temp));

				outsrc = output.toByteArray();
				printArrays(temp,outsrc);
			}
		}
		catch(IOException e) {}
	}

	private static void printArrays(byte[] temp, byte[] outsrc) {
		// TODO Auto-generated method stub
		System.out.println("temp:"+Arrays.toString(temp));
		System.out.println("output source:"+Arrays.toString(outsrc));

		
	}
}