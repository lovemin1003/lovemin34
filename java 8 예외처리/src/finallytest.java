

public class finallytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			startInstall(); //���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles(); //���ϵ��� �����Ѵ�.
			deleteTempFiles(); //���α׷�  ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		}
		catch(Exception e)
		{
			e.printStackTrace();
			deleteTempFiles(); //���α׷�  ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		}
		
		

	}

	private static void deleteTempFiles() {
		// TODO Auto-generated method stub
		//�ӽ� ���ϵ��� �����ϴ� �ڵ带 ���´�.
	}

	private static void copyFiles() {
		// TODO Auto-generated method stub
		//���ϵ��� �����ϴ� �ڵ带 ���´�.
	}

	private static void startInstall() {
		// TODO Auto-generated method stub
		//���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�.
	}

}
