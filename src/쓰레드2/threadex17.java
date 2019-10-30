package 쓰레드2;

public class threadex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadEx171 th1 =new ThreadEx171("*");
		ThreadEx171 th2 =new ThreadEx171("**");
		ThreadEx171 th3 =new ThreadEx171("***");
		
		
		th1.start();
		th2.start();
		th3.start();
		
		try
		{
			Thread.sleep(2000);
			th1.suspend(); // 쓰레드 th1을 잠시 중단시킨다.
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume(); // 쓰레드 th1이 다시 동작하도록 한다.
			Thread.sleep(3000);
			th1.stop();  //호출되는 즉시 쓰레드가 종료된다.
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		}
		catch(InterruptedException e)
		{
			
		}


	}

}

class ThreadEx171 implements Runnable
{
//	boolean suspended = false;
//	boolean stopped = false;
	volatile boolean suspended = false;
	volatile boolean stopped = false;
	
	Thread th;
	
	ThreadEx171(String name)
	{
		th = new Thread(this, name);
	}
	
	public void run()
	{
		while(!stopped)
		{
			if(!suspended)
			{
			System.out.println(Thread.currentThread().getName());
		
		try
		        {
			          Thread.sleep(1000);
		        }
	    catch(InterruptedException e)
		        {
			
	 	        }
			}
		}
		System.out.println(Thread.currentThread().getName()+ " stopped");
	}
	
	
	public void suspend() 
	{ 
		suspended = true;
	}
	public void resume() 
	{ 
		suspended = false;
	}
	public void stop() 
	{ 
		stopped = true;
	}
	public void start() 
	{ 
		th.start();
	}
	
}
