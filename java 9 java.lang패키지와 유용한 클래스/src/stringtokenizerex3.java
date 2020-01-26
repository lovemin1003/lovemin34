import java.util.StringTokenizer;

public class stringtokenizerex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String poke = "1,창파나이트,타입:,격투|2,토게키스,타입:,페어리,비행|3,에이스번,타입:,불";
		StringTokenizer st = new StringTokenizer(poke,"|"); //포켓몬 정보를 가리기 위해 |를 사용함.
		
		
		while(st.hasMoreTokens())
		{
			String token = st.nextToken();
			StringTokenizer st2 = new StringTokenizer(token,","); //포켓몬 이름과 타입을 가리기 위해 ,를 사용함.
			while(st2.hasMoreTokens())
			{
				System.out.println(st2.nextToken());
			}
			System.out.println("@@@@@");
		}

	}

}
