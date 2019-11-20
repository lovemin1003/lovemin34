import java.util.StringTokenizer;

public class tokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("소나타/카논/피나/세레나/캐로");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());

	}

}
