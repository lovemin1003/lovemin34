import java.util.StringTokenizer;

public class stringtokenizerex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String poke = "1,â�ĳ���Ʈ,Ÿ��:,����|2,���Ű��,Ÿ��:,��,����|3,���̽���,Ÿ��:,��";
		StringTokenizer st = new StringTokenizer(poke,"|"); //���ϸ� ������ ������ ���� |�� �����.
		
		
		while(st.hasMoreTokens())
		{
			String token = st.nextToken();
			StringTokenizer st2 = new StringTokenizer(token,","); //���ϸ� �̸��� Ÿ���� ������ ���� ,�� �����.
			while(st2.hasMoreTokens())
			{
				System.out.println(st2.nextToken());
			}
			System.out.println("@@@@@");
		}

	}

}
