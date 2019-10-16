enum direction {동,서,남,북}

public class enumex1 {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		direction d1 = direction.동;
		direction d2 = direction.valueOf("남");
		direction d3 = Enum.valueOf(direction.class, "동");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println();
		
		System.out.println(d1==d2);
		System.out.println(d1==d3);
		System.out.println(d1.equals(d3));
		System.out.println();
		
		System.out.println(d1.compareTo(d3));
		System.out.println(d1.compareTo(d2));
		System.out.println();
		
		switch(d1)
		{
		case 동:
			System.out.println("동남아");
			break;
		case 서:
			System.out.println("서구문화");
			break;
		case 남:
			System.out.println("남대문");
			break;
		case 북:
			System.out.println("북한");
			break;
		default:
			System.out.println("ㅋㅋ");
			break;
		}
		System.out.println();
		
		direction[] darr = direction.values();
		
		for(direction d : darr) //for(direction d : direction.values())
		{
			System.out.printf("%s=%d",d.name(),d.ordinal());
			System.out.println();
		}
				
		
		
		
		
	}
}
