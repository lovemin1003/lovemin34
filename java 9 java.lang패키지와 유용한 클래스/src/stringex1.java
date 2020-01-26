
public class stringex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "qwe";
		String str2 = "qwe";
		
		System.out.println("String str1 = qwe;");
		System.out.println("String str2 = qwe;");
		
		System.out.println("str1==str2:"+(str1==str2));
		System.out.println("str1.equals(str2):"+str1.equals(str2)+"\n");
		
		
		String str3 = new String("\"qwe\"");
		String str4 = new String("\"qwe\"");
		
		System.out.println("String str3 = new String(\"qwe\");");
		System.out.println("String str4 = new String(\"qwe\");");
		
		System.out.println("str3==str4:"+(str3==str4));
		System.out.println("str3.equals(str4):"+str3.equals(str4));

	}

}
