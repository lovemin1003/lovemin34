package poly.플레이어;

public class 메인클라스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		전사 전사1 = new 전사("잭스");
		플레이어 전사2 = new 전사("아트록스");
		전사 전사3 = new 전사("리븐");
		
		플레이어 마법사1 = new 마법사("르블랑");
		마법사 마법사2 = new 마법사("럭스");
		플레이어 마법사3 = new 마법사("니코");
		
		플레이어 사냥꾼1 = new 사냥꾼("애쉬");
		플레이어 사냥꾼2 = new 사냥꾼("렝가");
		사냥꾼 사냥꾼3 = new 사냥꾼("카직스");
		

		 플레이어[] 파티 = {전사1, 전사2, 마법사2, 마법사3, 사냥꾼1};
		 
	for(플레이어 플레이어: 파티)
	{
		플레이어.info();
	}
	
	전사1.attack(전사3);
	마법사2.attack(사냥꾼1);
	사냥꾼2.attack(마법사1);	 
	마법사2.궁극기(파티);
	}
}
