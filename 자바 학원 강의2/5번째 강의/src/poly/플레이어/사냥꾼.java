package poly.플레이어;





public class 사냥꾼 extends 플레이어 {
	
		
		
		String beast;
		
		public 사냥꾼(String name) {//컨트롤+스페이스 누르면 생성자 만들어짐.
			// TODO Auto-generated constructor stub
			
			super(name);
			this.beast = "야용이";
		}
	
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

