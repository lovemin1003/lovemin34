
public class Stringex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ival = 100;
		String strval = String.valueOf(ival); // int를 String으로
		
		double dval = 205.0;
		String strval2 = dval+""; // int를 String으로 2
		
		double sum = Integer.parseInt("+"+strval)+Double.parseDouble(strval2);
		
		double sum2 = Integer.valueOf(strval)+Double.valueOf(strval2);
		
		System.out.println(String.join("", strval,"+",strval2,"=")+sum);
		System.out.println(strval+"+"+strval2+"="+sum2);
	}

}
