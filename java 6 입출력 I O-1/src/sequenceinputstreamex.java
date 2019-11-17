import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

public class sequenceinputstreamex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] arr1 = {1,2,3};
		byte[] arr2 = {4,5,6};
		byte[] arr3 = {7,8,9};
		byte[] outsrc = null;

		Vector v = new Vector();
		v.add(new ByteArrayInputStream(arr1));
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));
		
		SequenceInputStream input = new SequenceInputStream(v.elements());
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		try
		{
			while((data = input.read())!=-1) 
		    {
			output.write(data); // void write(int b)
	        }
		}
		catch(IOException e)
        {
        	e.printStackTrace();
        }
		outsrc = output.toByteArray();
		
		System.out.println("Input Source1:"+ Arrays.toString(arr1));
		System.out.println("Input Source2:"+ Arrays.toString(arr2));
		System.out.println("Input Source3:"+ Arrays.toString(arr3));
		System.out.println("Output Source:"+ Arrays.toString(outsrc));

	}

}
