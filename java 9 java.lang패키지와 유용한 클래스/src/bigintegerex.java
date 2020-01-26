import java.math.BigInteger;

public class bigintegerex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		for(int i=1; i<100; i++)
		{
			System.out.printf("%d!=%s%n", i , calcFactorial(i));
			Thread.sleep(300);
		}

	}

	private static Object calcFactorial(int i) {
		// TODO Auto-generated method stub
		return factorial(BigInteger.valueOf(i)).toString();
	}

	private static BigInteger factorial(BigInteger n) {
		// TODO Auto-generated method stub
		if(n.equals(BigInteger.ZERO))
		{
			return BigInteger.ONE;
		}
		else
		{
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
		
	}
	

}
