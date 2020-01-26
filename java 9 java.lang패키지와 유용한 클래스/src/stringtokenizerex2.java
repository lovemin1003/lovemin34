import java.util.StringTokenizer;

public class stringtokenizerex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ex = "x=100*(234+634)/2";
		
		// 생성자 StringTokenizer(String a, String b, boolean c)를 사용해서 구분자도 토큰으로 간주되도록 만듬.
		StringTokenizer st = new StringTokenizer(ex,"+-*/=()",true);
		
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}


	}

}
