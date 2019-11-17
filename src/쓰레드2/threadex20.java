package 쓰레드2;

public class threadex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadex201 gc = new threadex201();
		gc.setDaemon(true);
		gc.start();
		
		int requirememory=0;
		
		for(int i=0; i<20; i++)
		{
			requirememory = (int)(Math.random()*10)*20;
			
			//필요 메모리가 사용 가능량보다 크거나 전체 메모리의 60% 이상을 사용했을 경우 gc를 깨운다.
			if(gc.freememory() < requirememory || gc.freememory() < gc.totalmemory()*0.4 )
					{
				gc.interrupt();
					}
			gc.usedmemory += requirememory;
			System.out.println("usedmemory:"+ gc.usedmemory);
		}

	}

}

class threadex201 extends Thread
{
	final static int maxmemory =1000;
	int usedmemory=0;
	
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("awaken by interrupt().");
			}
			gc();//gabage collection을 수행함.
			System.out.println("gabage collected. freememory:"+ freememory());
		}
	}
	public void gc()
	{
		usedmemory -=300;
		if(usedmemory <0) usedmemory=0;
	}
	public int totalmemory() {return maxmemory;}
	public int freememory() {return maxmemory - usedmemory;}
}