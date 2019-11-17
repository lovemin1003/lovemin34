import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ioex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] insrc = {0,1,2,3,4,5,6,7};
		byte[] outsrc = null;
		byte[] temp = new byte[3]; //�迭 ũ�� ����.
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(insrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("input source:"+Arrays.toString(insrc));

		try
		{
			while(input.available()>0)
			{
				int len = input.read(temp); //�о�� �������� ������ ��ȯ��.
				output.write(temp,0,len); //�о�� ��ŭ�� �����.
			}
			
		}
		catch(IOException e)
		{
			
		}
		
		outsrc = output.toByteArray();

		System.out.println("input source:"+Arrays.toString(insrc));
		System.out.println("temp:"+Arrays.toString(temp));
		System.out.println("output source:"+Arrays.toString(outsrc));

	}
}