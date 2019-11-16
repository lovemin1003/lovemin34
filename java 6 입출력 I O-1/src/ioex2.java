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
		
		input.read(temp,0,temp.length);  // 읽어온 데이터를 배열 temp에 담는다.
		output.write(temp,5,4); //temp[5]부터 데이터 4개를 출력해줌.
	  //output.write(temp,5,6); //마지막 배열보다 높은 배열의 데이터는 가지고 오지 못 함.

		outsrc = output.toByteArray(); 
		
		System.out.println("input source:"+Arrays.toString(insrc));
		System.out.println("temp:"+Arrays.toString(temp));
		System.out.println("output source:"+Arrays.toString(outsrc));

	}

}
