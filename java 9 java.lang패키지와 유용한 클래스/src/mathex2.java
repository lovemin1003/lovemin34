import static java.lang.Math.*;
import static java.lang.System.*;

public class mathex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = Integer.MIN_VALUE;
		
		out.println(i);
		out.println(-i);
		
		try
		{
			out.printf("negateExact(%d)=%d%n",10,negateExact(10));
			out.printf("negateExact(%d)=%d%n",-10,negateExact(-10));
			out.printf("negateExact(%d)=%d%n",i,negateExact(i));//���� �߻�
		}
		catch(ArithmeticException e)//i�� long���� ����ȯ �� negateExact(long a)�� ȣ��
		{
			out.printf("negateExact(%d)=%d%n",(long)i,negateExact((long)i));
		}

	}

}
