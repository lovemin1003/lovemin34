
public class stringbufferex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("qwe");
		StringBuffer sb2 = new StringBuffer("qwe");
		
		System.out.println("sb==sb2:"+(sb==sb2));
		System.out.println("sb.equals(sb2):"+(sb.equals(sb2)));
		
		//StringBuffer의 내용을 String으로 바꿔준다.
		String s = sb.toString();
		String s2 = sb2.toString();
		
		System.out.println("s==s2:"+(s==s2));
		System.out.println("s.equals(s2):"+(s.equals(s2)));

	}

}
