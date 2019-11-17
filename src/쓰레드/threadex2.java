package 쓰레드;

public class threadex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threadex21 t1 = new Threadex21();
		t1.start();

	}

}

class Threadex21 extends Thread
{
	
	public void run()
	{
		throwException();
	}
	
	public void throwException()
	{
		try
		{
			throw new Exception();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}

