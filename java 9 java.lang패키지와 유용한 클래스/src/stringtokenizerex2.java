import java.util.StringTokenizer;

public class stringtokenizerex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ex = "x=100*(234+634)/2";
		
		// ������ StringTokenizer(String a, String b, boolean c)�� ����ؼ� �����ڵ� ��ū���� ���ֵǵ��� ����.
		StringTokenizer st = new StringTokenizer(ex,"+-*/=()",true);
		
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}


	}

}
