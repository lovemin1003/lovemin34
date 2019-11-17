package 쓰레드2;

public class threadex12 {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		threadex12_1 t1 = new threadex12_1();
		threadex12_2 t2 = new threadex12_2();
		t1.start();
		t2.start();
		
		try
		{
			Thread.sleep(3000);//3초동안 기다림.
		}
		catch(InterruptedException e)//autosave의 값이 true면 autosave()를 호출한다.
		{
		
		}

		System.out.print("main 종료");
	}//main


}

class threadex12_1 extends Thread
{
	public void run()
	{
		for(int i=0; i<30; i++)
		{
			System.out.print("*");
		}
		System.out.print("t1 종료");

	}
}

class threadex12_2 extends Thread
{
	public void run()
	{
		for(int i=0; i<30; i++)
		{
			System.out.print("+");
		}
		System.out.print("t2 종료");

	}
}

