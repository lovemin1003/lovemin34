import java.io.File;

public class exceptionex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		File f = createFile(args[0]); //'���̰�'�� ������.
		System.out.println(f.getName()+"������ ���������� ������.");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage()+"�ٽ� �Է����ּ���.");
		}

	}

	 static File createFile(String filename) throws Exception {
		// TODO Auto-generated method stub
		  
			if(filename==null || filename.equals(""))
			{
				throw new Exception("�����̸��� ��ȿ���� ����.");
			}
			File f = new File(filename); //FileŬ������ ��ü�� �����.
			// File��ü�� createNewFile �޼ҵ带 �̿��ؼ� ���� ������ �����Ѵ�.
			f.createNewFile();
			return f; // ������ ��ü�� ������ ��ȯ�Ѵ�.
		  
		
	}

	

}
