package 쓰레드2;

public class threadex19_1 {
	
	static long starttime=0;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		threadex191 th1 = new threadex191();
		threadex192 th2 = new threadex192();
		th1.start();
		th2.start();
		starttime = System.currentTimeMillis();
//		join() 사용시
		try
		{
			th1.join();
			th2.join();
		}
		catch(InterruptedException e) 
		{
			
		}
		
		System.out.print("소요시간:"+(System.currentTimeMillis() - threadex19_1.starttime));
	}

}

class threadex191 extends Thread
{
	public void run()
	{
		for(int i=0; i<300; i++)
		{
			System.out.print(new String("-"));
		}
	}
}

class threadex192 extends Thread
{
	public void run()
	{
		for(int i=0; i<300; i++)
		{
			System.out.print(new String("#"));
		}
	}
}

