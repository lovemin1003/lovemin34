package poly.플레이어;

class 플레이어
{
	String name;
	int atk;
	int hp;
	int level;
	플레이어()
	{
		
		this.atk = 20;
		this.hp = 100;
		this.level = 1;
	}
	플레이어(String name)
	{
		this();//플레이어()
		
		this.name = name;
	}
	
	플레이어(String name, int hp)
	{
		this(name);//플레이어(name)
		
		this.hp = hp;
	}
	
	void info()
	{
		System.out.println("캐릭터 정보");
		System.out.println("이름:"+name);
		System.out.println("공격력:"+atk);
		System.out.println("체력:"+hp);
		System.out.println("레벨:"+level);
		
	}
	void attack(플레이어 ㅂ)//다형성이 짱인 이유. 전사, 마법사, 사냥꾼으로 지정시 지정 대상만 공격 가능하므로 부모로 지정된 클래스인 플레이어로 지정하는게 좋음.
	{
		System.out.printf("%s가 %s에게 공격\n",this.name, ㅂ.name);
		
		
	}
	void 궁극기(플레이어[] 파티)
	{
		System.out.println(this.name+": 데마시아!");
		for(플레이어 q: 파티)
		{int 데미지 = (int) (Math.random()*10 +10);
			q.hp -=데미지;
		System.out.println(q.name+"님이"+데미지+"데미지를 맞음. "+"남은 체력:"+ q.hp);
		}
	}
}
public class 플레이어1 {
	public static void main(String[] args) {
     // TODO Auto-generated method stub
		
		전사 트린다미어 = new 전사(null);
		
		트린다미어.rage = 100;
		트린다미어.powercharge();
		
		트린다미어.name = "나영이앞의조두순";
		트린다미어.atk = 56;
		트린다미어.level = 1;
		트린다미어.hp = 655;
		
		트린다미어.info();
마법사 럭스 = new 마법사("리산드라");
		
럭스.mana = 100;
럭스.최후의섬광();
		
럭스.name = "데마시아의 광녀";
럭스.atk = 76;
럭스.level = 1;
럭스.hp = 455;
		
		럭스.info();
사냥꾼 애쉬 = new 사냥꾼("리 신");
		
애쉬.beast = "렝가";
애쉬.multishot();
		
애쉬.name = "프로젝트 애쉬";
애쉬.atk = 60;
애쉬.level = 1;
애쉬.hp = 575;
		
애쉬.info();
				
}
}
