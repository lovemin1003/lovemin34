package obj_array;

import java.util.Scanner;

public class objarrayinsert {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    사람[] p = new  사람[3];
    for(int i = 0; i<3; i++)
    {
    System.out.println("정보 입력");
    System.out.println("이름:");
    String name = sc.next();
    
    System.out.println("성별:");
    String gender = sc.next();
    
    System.out.println("나이:");
    int age = sc.nextInt();
    
     p[i] = new 사람(name, age, gender);
    System.out.println("정보 입력 성공");
    }
    for(int q = 0; q<p.length; q++)
    {
    	p[q].info();
    	
    }
    
    
    
    sc.close();
    
    
    
	}

}
