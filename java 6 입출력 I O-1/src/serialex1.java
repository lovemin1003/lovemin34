import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class serialex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성한 객체를 직렬화하여 userinfo.ser에 저장하는 예제.
		try
		{
			String filename ="userinfo.ser";
			FileOutputStream fos = new FileOutputStream(filename);
	    	BufferedOutputStream bos = new BufferedOutputStream(fos);
	    	
	    	ObjectOutputStream out = new ObjectOutputStream(bos);
	    	
	    	userinfo u1 = new userinfo("미타케 란","하네오카 여학원",17);
	    	userinfo u2 = new userinfo("우에하라 히마리","하네오카 여학원",17);
	    	
	    	ArrayList<userinfo> list = new ArrayList<>();
	    	list.add(u1);
	    	list.add(u2);
	    	
	    	//개체를 직렬화한다.
	    	out.writeObject(u1);
	    	out.writeObject(u2);
	    	out.writeObject(list);
	    	out.close();
	    	System.out.println("직렬화 종료");

	    	 
			
		}
		catch(IOException e)
        {
        	e.printStackTrace();
        }
		

	}

}
