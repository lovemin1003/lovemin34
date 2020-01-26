
public class hashcodeex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("qwe");
		String str2 = new String("qwe");
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));


	}

}
