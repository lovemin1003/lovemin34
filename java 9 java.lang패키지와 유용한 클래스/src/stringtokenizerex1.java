import java.util.StringTokenizer;

public class stringtokenizerex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String so = "100,254,256";
		StringTokenizer st = new StringTokenizer(so,","); //,�� �����ڷ� �ϴ� StringTokenizer�� �����Ͽ� ���ڿ�(so)�� ����.
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
