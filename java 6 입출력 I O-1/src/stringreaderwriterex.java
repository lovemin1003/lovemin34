import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class stringreaderwriterex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputData = "Sonata";
		StringReader input = new StringReader(inputData);
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		try
		{
			
			while((data=input.read())!=-1)
			{
				output.write(data); //void.write(int b)
			}
		}
		catch(IOException e)
		{
			
		}
		System.out.println("Input Data:"+ inputData);
		System.out.println("Output Data:"+ output.toString());
		System.out.println("Output Data:"+ output.getBuffer().toString());
		//getBuffer(): StringWriter�� ����� �����Ͱ� ����� StringBuffer�� ��ȯ��.
        //toString(): StringWriter�� ��µ� (StringBuffer�� �����) ���ڿ��� ��ȯ��.

	}

}
