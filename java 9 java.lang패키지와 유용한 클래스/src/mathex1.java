import static java.lang.Math.*;
import static java.lang.System.*;

public class mathex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double val = 10.234;
		out.println(round(val)); //�ݿø�
		
		val *=10;
		out.println(round(val)); //�ݿø�

		out.println(round(val)/10); //�ݿø�
		out.println(round(val)/10.0); //�ݿø�
		out.println();
		
		out.printf("%.1f: %.1f%n",1.1,ceil(1.1)); //�ø�
		out.printf("%.1f: %.1f%n",1.5,ceil(1.5)); //����
		out.printf("%.1f: %d%n",1.1,round(1.1)); //�ݿø�
		out.printf("%.1f: %d%n",1.5,round(1.5)); //�ݿø�
		out.printf("%.1f: %.1f%n",1.5,rint(1.5)); //�ݿø�
		out.printf("%.1f: %d%n",-1.5,round(-1.5)); //�ݿø�
		out.printf("%.1f: %.1f%n",-1.5,rint(-1.5)); //�ݿø�
		out.printf("%.1f: %.1f%n",-1.5,ceil(-1.5)); //�ø�
		out.printf("%.1f: %.1f%n",-1.1,floor(-1.1)); //����


	}

}
