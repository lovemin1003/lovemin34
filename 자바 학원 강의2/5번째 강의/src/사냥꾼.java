




public class 사냥꾼 extends 플레이어 {
	
		
		
		String beast;
		
		
	
	void attack()
	{
		System.out.println("사냥 개시!");
		
		
	}
	
	
	void multishot()
	{
		System.out.println("집중 발사!");
	}
	void info()
	{
		super.info();
		System.out.println("동물:"+beast);
	}
	

}

