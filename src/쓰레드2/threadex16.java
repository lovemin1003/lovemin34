package 쓰레드2;

public class threadex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runimpex16 r1 =new Runimpex16();
		Runimpex16 r2 =new Runimpex16();
		Runimpex16 r3 =new Runimpex16();
		Thread th1 = new Thread(r1,"*");
		Thread th2 = new Thread(r2,"**");
		Thread th3 = new Thread(r3,"***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try
		{
			Thread.sleep(2000);
			r1.suspend(); // 쓰레드 th1을 잠시 중단시킨다.
			Thread.sleep(2000);
			r2.suspend();
			Thread.sleep(3000);
			r3.resume(); // 쓰레드 th1이 다시 동작하도록 한다.
			Thread.sleep(3000);
			r1.stop();  //호출되는 즉시 쓰레드가 종료된다.
			r2.stop();
			Thread.sleep(2000);
			r3.stop();
		}
		catch(InterruptedException e)
		{
			
		}


	}

}

class Runimpex16 implements Runnable
{
	//boolean suspended = false;
	//boolean stopped = false;
	volatile boolean suspended = false;
	volatile boolean stopped = false;
	
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
	
}
