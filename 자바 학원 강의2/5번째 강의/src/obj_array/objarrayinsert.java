package obj_array;

import java.util.Scanner;

public class objarrayinsert {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    ���[] p = new  ���[3];
    for(int i = 0; i<3; i++)
    {
    System.out.println("���� �Է�");
    System.out.println("�̸�:");
    String name = sc.next();
    
    System.out.println("����:");
    String gender = sc.next();
    
    System.out.println("����:");
    int age = sc.nextInt();
    
     p[i] = new ���(name, age, gender);
    System.out.println("���� �Է� ����");
    }
    for(int q = 0; q<p.length; q++)
    {
    	p[q].info();
    	
    }
    
    
    
    sc.close();
    
    
    
	}

}
