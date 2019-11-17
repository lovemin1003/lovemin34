import java.text.*;

public class DecimalFormats {



	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		double number=1234567.89;
		String[] 패턴= {"0","#","0.0","###.##","0000000000.0000"};
		
		for(int i=0; i<패턴.length; i++)
		{
		DecimalFormat dec = new DecimalFormat(패턴[i]);
		System.out.printf("%19s: %s\n",패턴[i], dec.format(number));
		}
		
		
		DecimalFormat dec1 = new DecimalFormat("00");
		System.out.printf("%s\n", dec1.format(number));
		
		DecimalFormat dec2 = new DecimalFormat("0.0");
		System.out.printf("%s\n",dec2.format(number));
	}

	

	
	
}
