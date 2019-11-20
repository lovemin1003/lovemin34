package poly.플레이어;





public class 전사 extends 플레이어 {

	
		
		
		int rage;
		//전사 생성자 선언.
		전사(String name)
		{
			super(name);//부모 클래스에서 상속받아 씀. 맨 위에 써야 함.
			System.out.println("전사 생성자 호출");
			//super(name);//안 그러면 오류 나옴.
			this.hp = 90;
			
			this.rage = 40;
			
		}
		전사()
		{
			
		}
		
		
	
	



	void attack()
	{
		System.out.println("때린다!");
		
		
	}
	
	public void powercharge() {
		// TODO Auto-generated method stub
		System.out.println("원한다면!");
	}
	//메서드 오버라이딩: 부모 클래스로부터 상속받은 메서드를 자식 클래스에거 기능을 바꿔서 사용하는 것.
	void info()
	{
		super.info();
		System.out.println("분노:"+rage);
	}

}

