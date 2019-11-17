package 쓰레드;

public class threadex10 implements Runnable {
	static boolean autosave =false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread(new threadex10());
		t.setDaemon(true);//이게 있어야 종료됨. 쓰레드를 데몬 쓰레드로 또는 사용자 쓰레드로 변경함.
		t.start();
		
		for(int i=1; i<=10; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e)
			{
			
			}
			
			System.out.println(i);	
			
			if(i==5)
			{
				autosave = true;
			}
				
		}
		
		System.out.println("프로그램을 종료함.");
	}

	
	public void run() 
	
	{
		// TODO Auto-generated method stub
	
		while(true)
		{
			try
			{
				Thread.sleep(3000);//3초마다
			}
			catch(InterruptedException e)//autosave의 값이 true면 autosave()를 호출한다.
			{
			
			}
			if(autosave)
			{
				autosave();
			}
			
		}
	}


	private void autosave() {
		// TODO Auto-generated method stub
		System.out.println("파일이 자동 저장됨.");
	}

}
