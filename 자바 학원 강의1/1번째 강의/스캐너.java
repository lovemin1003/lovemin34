import java.util.Scanner;



public class 스캐너 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan = new Scanner(System.in);
 System.out.println("너의 이름은?");
 String name = scan.next();
 System.out.println("너의 집주소는?");
 String add = scan.next();
 System.out.println("너의 나이는?");
 int age = scan.nextInt();
 System.out.println("너의 체중은?");
 double weight = scan.nextDouble();
 System.out.printf("%s,%s,%d,%f\n",name, add, age, weight);
 
 Scanner s = new Scanner(System.in);
 System.out.println("너의 나이, 키, 몸무게를 빈칸으로 분리하여 순서대로 입력하라.");
 int age1 = s.nextInt();
 double len = s.nextDouble();
 double wei = s.nextDouble();
 System.out.println("너의 나이:"+age1+"세");
 System.out.println("너의 키:"+len+"cm");
 System.out.println("너의 체중:"+wei+"kg");
	}
 
}
