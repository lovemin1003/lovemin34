
public class Stringex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ival = 100;
		String strval = String.valueOf(ival); // int�� String����
		
		double dval = 205.0;
		String strval2 = dval+""; // int�� String���� 2
		
		double sum = Integer.parseInt("+"+strval)+Double.parseDouble(strval2);
		
		double sum2 = Integer.valueOf(strval)+Double.valueOf(strval2);
		
		System.out.println(String.join("", strval,"+",strval2,"=")+sum);
		System.out.println(strval+"+"+strval2+"="+sum2);
	}

}
