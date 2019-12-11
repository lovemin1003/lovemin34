
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
			startinstall(); //프로그램 설치에 필요한 준비를 한다.
			copyfiles(); // 파일들을 복사한다.
		}
		catch(SpaceException e)
		{
			InstallException ie = new InstallException("설치 중 예외 발생");
			ie.initCause(e);
			throw ie;
		}
		catch(MemoryException me)
		{
			InstallException ie = new InstallException("설치 중 예외 발생");
			ie.initCause(me);
			throw ie;
		}
		finally
		{
			deletetempfile(); //프로그램 설치에 사용된 임시파일들을 삭제한다.
		}
	}
	
	static void startinstall() throws SpaceException, MemoryException
	{
		if(!enoughSpace()) //충분한 설치 공간이 없을 시
		{
			throw new SpaceException("설치할 공간이 부족함.");
		}
		if(!enoughMemory()) //충분한 메모리가 없을 시
		{
			throw new MemoryException("메모리가 부족함.");
	//		throw new RuntimeException(new MemoryException("메모리가 부족함."));

		}
	}
	
	static void copyfiles()
	{
		//파일들을 복사하는 코드를 적는다.
	}
	static void deletetempfile()
	{
		//임시파일들을 삭제하는 코드를 적는다..
	}
	
	private static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
		return false;
	}
	private static boolean enoughMemory() {
		// 설치하는데 필요한 메모리 공간이 있는지 확인하는 코드를 적는다.
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
