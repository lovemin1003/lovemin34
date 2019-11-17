import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class serialex2 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//serialex1에서 직렬화한 걸 역직렬화하는 예제.
		try
		{
			String filename ="userinfo.ser";
			FileInputStream fis = new FileInputStream(filename);
	    	BufferedInputStream bis = new BufferedInputStream(fis);
	    	
	    	ObjectInputStream in = new ObjectInputStream(bis);
	    	
	    	userinfo u1 = (userinfo)in.readObject();
	    	userinfo u2 = (userinfo)in.readObject();
	    	ArrayList list = (ArrayList)in.readObject();
	    	
	    	System.out.println(u1);
	    	System.out.println(u2);
	    	System.out.println(list);
	    	in.close();

		}
		catch(IOException e)
        {
        	e.printStackTrace();
        }
	}

}
