import java.io.File;

public class exceptionex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//commend line���� �Է¹��� ���� �̸����� ���� ������ �����Ѵ�.
		
		File f = createFile(args[0]); //'������'�� ������.
		System.out.println(f.getName()+"������ ���������� ������.");

	}

	 static File createFile(String filename) {
		// TODO Auto-generated method stub
		  try 
		  {
			if(filename==null || filename.equals(""))
			{
				throw new Exception("�����̸��� ��ȿ���� ����.");
			}
		  }
		  catch(Exception e)//filename�� �������� ��� ���� �̸����� '�������.txt'�� �Ѵ�.
		  {
			  filename="�������.txt";
		  }
		  finally
		  {
			  File f = new File(filename);//FileŬ������ ��ü�� �����.
			  createNewFile(f); // ������ ��ü�� �̿��ؼ� ������ �����Ѵ�.
			  return f;
		  }
		
	}

	 static void createNewFile(File f) {
		// TODO Auto-generated method stub
		 try
		 {
			 f.createNewFile();//������ �����Ѵ�.
		 }
		 catch(Exception e)
		 {
			  
		 }
		
	}

}
