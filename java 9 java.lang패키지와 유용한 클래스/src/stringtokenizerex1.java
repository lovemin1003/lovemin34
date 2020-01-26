import java.util.StringTokenizer;

public class stringtokenizerex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String so = "100,254,256";
		StringTokenizer st = new StringTokenizer(so,","); //,를 구분자로 하는 StringTokenizer를 생성하여 문자열(so)을 나눔.
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
