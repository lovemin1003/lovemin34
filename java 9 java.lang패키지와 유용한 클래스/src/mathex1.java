import static java.lang.Math.*;
import static java.lang.System.*;

public class mathex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double val = 10.234;
		out.println(round(val)); //반올림
		
		val *=10;
		out.println(round(val)); //반올림

		out.println(round(val)/10); //반올림
		out.println(round(val)/10.0); //반올림
		out.println();
		
		out.printf("%.1f: %.1f%n",1.1,ceil(1.1)); //올림
		out.printf("%.1f: %.1f%n",1.5,ceil(1.5)); //버림
		out.printf("%.1f: %d%n",1.1,round(1.1)); //반올림
		out.printf("%.1f: %d%n",1.5,round(1.5)); //반올림
		out.printf("%.1f: %.1f%n",1.5,rint(1.5)); //반올림
		out.printf("%.1f: %d%n",-1.5,round(-1.5)); //반올림
		out.printf("%.1f: %.1f%n",-1.5,rint(-1.5)); //반올림
		out.printf("%.1f: %.1f%n",-1.5,ceil(-1.5)); //올림
		out.printf("%.1f: %.1f%n",-1.1,floor(-1.1)); //버림


	}

}
