
public class trywithresourceex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(CloseableResource cr = new CloseableResource())//close()에서만 예외 발생
		{
			cr.exceptionWork(false); //예외가 생기지 않음.
		}
		catch(WorkException e)
		{
			e.printStackTrace();
		}
		catch(CloseException e)
		{
			e.printStackTrace();
		}
		
		try(CloseableResource cr = new CloseableResource())//close(),exceptionWork()에서 예외 발생
		{
			cr.exceptionWork(true); //예외가 생김.
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
		System.out.println("exceptionWork("+exception+")가 호출됨");
		if(exception)
		{
			throw new WorkException("WorkException발생.");
		}
	}
	
	public void close() throws CloseException 
	{
		System.out.println("close()가 호출됨");
		throw new CloseException("CloseException발생.");
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
