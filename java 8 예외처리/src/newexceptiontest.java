
public class newexceptiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			startinstall(); //���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyfiles(); // ���ϵ��� �����Ѵ�.
		}
		catch(SpaceException e)
		{
			System.out.println("���� �޽���:"+e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���� �� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
		}
		catch(MemoryException me)
		{
			System.out.println("���� �޽���:"+me.getMessage());
			me.printStackTrace();
			System.gc(); //Garbage Collection�� �����Ͽ� �޸𸮸� �÷��ش�.
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���.");
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
