import java.util.Date;

public class printstreamex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 65;
		float f = 999.888f;
		
		Date d = new Date();
		
		System.out.printf("���� %c�� �ƽ�Ű�ڵ�� %d%n",i,i);
		System.out.printf("%d�� 8�����δ� %o, 16�����δ� %x%n",i,i,i);
		System.out.printf("%3d%3d%3d%n",100,80,20);
		System.out.printf("12345678901234567890%n");
		System.out.printf("%s%-5s%10s%n","100","180","120");//%-5s:���� ����
		System.out.printf("%-8.1f%8.1f%3e%n",f,f,f);
		System.out.printf("%tY�� %tm�� %td��%n",d,d,d);
		System.out.printf("%tH�� %tM�� %tS��%n",d,d,d);
		System.out.printf("%1$tH�� %1$tM�� %1$tS��%n",d); //1$ù �Ű�����
		
		


		


	}

}
