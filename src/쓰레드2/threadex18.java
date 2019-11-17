package 쓰레드2;

public class threadex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadEx181 th1 =new ThreadEx181("*");
		ThreadEx181 th2 =new ThreadEx181("**");
		ThreadEx181 th3 =new ThreadEx181("***");
		
		
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

class ThreadEx181 implements Runnable
{
//	boolean suspended = false;
//	boolean stopped = false;
	volatile boolean suspended = false;
	volatile boolean stopped = false;
	
	Thread th;
	
	ThreadEx181(String name)
	{
		th = new Thread(this, name);
	}
	
	public void run()
	{
		String name = th.getName();
		while(!stopped)
		{
			if(!suspended)
			{
			System.out.println(name);
		
		try
		        {
			          Thread.sleep(1000);
		        }
	    catch(InterruptedException e)
		        {
	    	System.out.println(name+"interrupted");
	 	        }
			}
			else
			{
				Thread.yield();
			}
		}
		System.out.println(name+ " stopped");
	}
	
	
	public void suspend() 
	{ 
		suspended = true;
		th.interrupt();
		System.out.println(th.getName()+ " interrupt() by suspend()");
	}
	
	public void stop() 
	{ 
		stopped = true;
		th.interrupt();
		System.out.println(th.getName()+ " interrupt() by stop()");
	}
	public void resume() 
	{ 
		suspended = false;
	}
	public void start() 
	{ 
		th.start();
	}
	
}
