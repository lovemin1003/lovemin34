package 쓰레드;

public class threadex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threadex81 th1 = new Threadex81();
		Threadex82 th2 = new Threadex82();

		th2.setPriority(7); //쓰레드의 우선순위를 지정한 값(7)으로 변경한다.
		
		System.out.println("Priority of th1(@)"+th1.getPriority());
		System.out.println("Priority of th2(%)"+th2.getPriority());
		//getPriority(): 쓰레드의 우선군위를 반환함.
		
		th1.start();
		
		th2.start();
		
	}

}

class Threadex81 extends Thread
{
	public void run()
	{
		
		for(int i=0; i<300; i++)
		{
			System.out.print("@");
			for(int x=0; x<100000000; x++);
		}
		
	}
}


class Threadex82 extends Thread
{
	public void run()
	{
		
		for(int i=0; i<300; i++)
		{
			System.out.print("%");
			for(int x=0; x<100000000; x++);	
			
		}
		
	}
}