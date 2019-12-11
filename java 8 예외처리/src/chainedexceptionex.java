
public class chainedexceptionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			install();
		}
		catch(InstallException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	static void install() throws InstallException
	{
		try
		{
			startinstall(); //���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyfiles(); // ���ϵ��� �����Ѵ�.
		}
		catch(SpaceException e)
		{
			InstallException ie = new InstallException("��ġ �� ���� �߻�");
			ie.initCause(e);
			throw ie;
		}
		catch(MemoryException me)
		{
			InstallException ie = new InstallException("��ġ �� ���� �߻�");
			ie.initCause(me);
			throw ie;
		}
		finally
		{
			deletetempfile(); //���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		}
	}
	
	static void startinstall() throws SpaceException, MemoryException
	{
		if(!enoughSpace()) //����� ��ġ ������ ���� ��
		{
			throw new SpaceException("��ġ�� ������ ������.");
		}
		if(!enoughMemory()) //����� �޸𸮰� ���� ��
		{
			throw new MemoryException("�޸𸮰� ������.");
	//		throw new RuntimeException(new MemoryException("�޸𸮰� ������."));

		}
	}
	
	static void copyfiles()
	{
		//���ϵ��� �����ϴ� �ڵ带 ���´�.
	}
	static void deletetempfile()
	{
		//�ӽ����ϵ��� �����ϴ� �ڵ带 ���´�..
	}
	
	private static boolean enoughSpace() {
		// ��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
		return false;
	}
	private static boolean enoughMemory() {
		// ��ġ�ϴµ� �ʿ��� �޸� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
		return true;
	}

}

class InstallException extends Exception
{
	InstallException(String msg)
	{
		super(msg);
	}
}

class SpaceException extends Exception
{
	SpaceException(String msg)
	{
		super(msg);
	}
}

class MemoryException extends Exception
{
	MemoryException(String msg)
	{
		super(msg);
	}
}
