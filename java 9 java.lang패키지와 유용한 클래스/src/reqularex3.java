import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reqularex3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String so = "010-6969-1234, 033-245-3185";
		String pa = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		
		Pattern p = Pattern.compile(pa);
		Matcher m = p.matcher(so);
		
		int i=0;
		
		while(m.find()) //일치하는 패턴이 없으면 빠져나옴.
		{
			System.out.println(m.group()+"->"+m.group(1)+","+m.group(2)+","+m.group(3));
		}
		
	}

}
