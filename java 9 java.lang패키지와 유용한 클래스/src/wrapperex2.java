
public class wrapperex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = new Integer("100").intValue();
		int i2 = Integer.parseInt("100");
		Integer i3 = Integer.valueOf("100");
		
		int i4 = Integer.parseInt("100",2); //2진수
		int i5 = Integer.parseInt("100",8); //8진수
		int i6 = Integer.parseInt("100",16); //16진수
		int i7 = Integer.parseInt("ac",16); //16진수
		
		int i8 = Integer.valueOf("100",2); //2진수
		int i9 = Integer.valueOf("100",8); //8진수
		int i10 = Integer.valueOf("100",16); //16진수
		int i11 = Integer.valueOf("ac",16); //16진수 
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println();
		
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		System.out.println(i7);
		System.out.println();
		
		System.out.println(i8);
		System.out.println(i9);
		System.out.println(i10);
		System.out.println(i11);

	}

}
