import java.util.StringTokenizer;

public class tokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("�ҳ�Ÿ/ī��/�ǳ�/������/ĳ��");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());

	}

}
