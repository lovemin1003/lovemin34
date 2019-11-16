import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ioex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] insrc = {0,1,2,3,4,5,6,7};
		byte[] outsrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(insrc);
		output = new ByteArrayOutputStream();
		
		int data=0;
		
		while((data = input.read())!=-1) //data = input.read(): read()를 호출한 반환값을 data에 저장함(괄호 먼저)
		{
			output.write(data); // void write(int b)
		}

		outsrc = output.toByteArray(); 
		
		System.out.println("input source:"+Arrays.toString(insrc));
		System.out.println("output source:"+Arrays.toString(outsrc));

	}

}
