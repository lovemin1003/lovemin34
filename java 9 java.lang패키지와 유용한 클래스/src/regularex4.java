import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String so = "i must go because i must win.";
		String pa ="must";
		StringBuffer sb = new StringBuffer();
		
		Pattern p = Pattern.compile(pa);
		Matcher m = p.matcher(so);
		System.out.println("source:"+so);
		
		int i = 0;
		
		while(m.find())
		{
			System.out.println(++i+"����:"+m.start()+"-"+m.end());
			m.appendReplacement(sb, "will"); //must�� will�� �ٲ� ������.
		}
		m.appendTail(sb);
		System.out.println("replacement count:"+i);
		System.out.println("���:"+sb.toString());
		

	}

}
