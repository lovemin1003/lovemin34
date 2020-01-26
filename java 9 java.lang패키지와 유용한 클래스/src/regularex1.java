import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = {"bat","cola","chop","ball"};
		
		Pattern p = Pattern.compile("c[a-z]*"); //c로 시작하는 소문자 영단어
		
		for(int i=0; i<data.length; i++)
		{
			Matcher m = p.matcher(data[i]);
			if(m.matches())
			{
				System.out.print(data[i]+",");
			}
			
		}
	
	}
	
}
