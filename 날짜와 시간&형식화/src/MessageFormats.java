import java.text.MessageFormat;

public class MessageFormats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String 버뮤다="이름:{0},그레이드:{1},파워{2}";
		
		String[] 피나= {"피나","3","13000"};
		
		String b=MessageFormat.format(버뮤다, 피나);
		
		System.out.print(b);

	}

}
