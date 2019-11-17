package 쓰레드2;

public class threadex19_2 {
	
	static long starttime=0;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		threadex193 th1 = new threadex193();
		threadex194 th2 = new threadex194();
		th1.start();
		th2.start();
		starttime = System.currentTimeMillis();
//		join() 미사용시
//		try
//		{
//			th1.join();
//			th2.join();
//		}
//		catch(InterruptedException e) 
//		{
//			
//		}
//		
		System.out.print("소요시간:"+(System.currentTimeMillis() - threadex19_2.starttime));
	}

}

class threadex193 extends Thread
{
	public void run()
	{
		for(int i=0; i<300; i++)
		{
			System.out.print(new String("-"));
		}
	}
}

class threadex194 extends Thread
{
	public void run()
	{
		for(int i=0; i<300; i++)
		{
			System.out.print(new String("#"));
		}
	}
}

