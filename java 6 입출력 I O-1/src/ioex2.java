import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ioex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] insrc = {0,1,2,3,4,5,6,7};
		byte[] outsrc = null;
		byte[] temp = new byte[10];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(insrc);
		output = new ByteArrayOutputStream();
		
		input.read(temp,0,temp.length);  // �о�� �����͸� �迭 temp�� ��´�.
		output.write(temp,5,4); //temp[5]���� ������ 4���� �������.
	  //output.write(temp,5,6); //������ �迭���� ���� �迭�� �����ʹ� ������ ���� �� ��.

		outsrc = output.toByteArray(); 
		
		System.out.println("input source:"+Arrays.toString(insrc));
		System.out.println("temp:"+Arrays.toString(temp));
		System.out.println("output source:"+Arrays.toString(outsrc));

	}

}
