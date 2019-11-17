package 쓰레드;



public class threadex5 {

	static long startTime = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Threadex51 t1 = new Threadex51();
		t1.start();
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<1000; i++)
		{
			System.out.printf("%s",new String("ㅋ"));
		}
		System.out.println();
		System.out.print("소요시간1:"+(System.currentTimeMillis()-threadex5.startTime)+"밀리 세컨드입니다.");
		System.out.println();
		
	}

}
class Threadex51 extends Thread
{
	public void run()
	{
		
			for(int i=0; i<1000; i++)
			{
				System.out.printf("%s",new String("ㅋ"));
			}
			System.out.println(); 
			
			System.out.print("소요시간2:"+(System.currentTimeMillis()-threadex5.startTime)+"밀리 세컨드입니다.");
		
	}
}
