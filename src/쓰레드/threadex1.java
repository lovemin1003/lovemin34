package 쓰레드;

public class threadex1 {
	public static void main(String[] args) {
		Threadex11q t1 = new Threadex11q();
		
		Runnable r = new Threadex12w();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
	}
}

class Threadex11q extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(getName()); //조상인 thread의 getname()을 호출.
		}
	}
}

class Threadex12w implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			//thread.currentThread() - 현재 실행중인 thread를 반환함.
			System.out.println(Thread.currentThread().getName()); 
		}
	}
}