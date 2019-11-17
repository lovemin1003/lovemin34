import java.util.Date;

public class printstreamex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 65;
		float f = 999.888f;
		
		Date d = new Date();
		
		System.out.printf("문제 %c의 아스키코드는 %d%n",i,i);
		System.out.printf("%d는 8진수로는 %o, 16진수로는 %x%n",i,i,i);
		System.out.printf("%3d%3d%3d%n",100,80,20);
		System.out.printf("12345678901234567890%n");
		System.out.printf("%s%-5s%10s%n","100","180","120");//%-5s:왼쪽 정렬
		System.out.printf("%-8.1f%8.1f%3e%n",f,f,f);
		System.out.printf("%tY년 %tm월 %td일%n",d,d,d);
		System.out.printf("%tH시 %tM분 %tS초%n",d,d,d);
		System.out.printf("%1$tH시 %1$tM분 %1$tS초%n",d); //1$첫 매개변수
		
		


		


	}

}
