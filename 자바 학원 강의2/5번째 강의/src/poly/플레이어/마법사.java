package poly.플레이어;





public class 마법사 extends 플레이어 {
	
		
		
		int mana;
		
		
	
	
	 마법사(String name) {
			super(name);
			this.mana = 90;
			
		}
	public void 최후의섬광() {
		// TODO Auto-generated method stub
		System.out.println("데마시아!");
	}
	void info()
	{
		super.info();
		System.out.println("마나:"+mana);
	}
	

}

