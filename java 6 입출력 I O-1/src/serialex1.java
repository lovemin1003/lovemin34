import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class serialex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ��ü�� ����ȭ�Ͽ� userinfo.ser�� �����ϴ� ����.
		try
		{
			String filename ="userinfo.ser";
			FileOutputStream fos = new FileOutputStream(filename);
	    	BufferedOutputStream bos = new BufferedOutputStream(fos);
	    	
	    	ObjectOutputStream out = new ObjectOutputStream(bos);
	    	
	    	userinfo u1 = new userinfo("��Ÿ�� ��","�ϳ׿�ī ���п�",17);
	    	userinfo u2 = new userinfo("�쿡�϶� ������","�ϳ׿�ī ���п�",17);
	    	
	    	ArrayList<userinfo> list = new ArrayList<>();
	    	list.add(u1);
	    	list.add(u2);
	    	
	    	//��ü�� ����ȭ�Ѵ�.
	    	out.writeObject(u1);
	    	out.writeObject(u2);
	    	out.writeObject(list);
	    	out.close();
	    	System.out.println("����ȭ ����");

	    	 
			
		}
		catch(IOException e)
        {
        	e.printStackTrace();
        }
		

	}

}
