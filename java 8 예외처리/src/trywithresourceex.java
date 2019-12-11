
public class trywithresourceex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(CloseableResource cr = new CloseableResource())//close()������ ���� �߻�
		{
			cr.exceptionWork(false); //���ܰ� ������ ����.
		}
		catch(WorkException e)
		{
			e.printStackTrace();
		}
		catch(CloseException e)
		{
			e.printStackTrace();
		}
		
		try(CloseableResource cr = new CloseableResource())//close(),exceptionWork()���� ���� �߻�
		{
			cr.exceptionWork(true); //���ܰ� ����.
		}
		catch(WorkException e)
		{
			e.printStackTrace();
		}
		catch(CloseException e)
		{
			e.printStackTrace();
		}

	}

}

class CloseableResource implements AutoCloseable
{
	public void exceptionWork(boolean exception) throws WorkException
	{
		System.out.println("exceptionWork("+exception+")�� ȣ���");
		if(exception)
		{
			throw new WorkException("WorkException�߻�.");
		}
	}
	
	public void close() throws CloseException 
	{
		System.out.println("close()�� ȣ���");
		throw new CloseException("CloseException�߻�.");
	}
	
}

class WorkException extends Exception 
{
	WorkException(String msg)
	{
		super(msg);
	}
}

class CloseException extends Exception 
{
	CloseException(String msg)
	{
		super(msg);
	}
}
