import java.util.ArrayList;
import java.util.Scanner;

public class arraylistex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
             ArrayList <��������> stu = new ArrayList<��������>(); 
             String selname;
             
             while(true)
             {
            	 System.out.println("1���� ���/2��:ã��/3�� ����/4��:��ü���/");
             
             int num = sc.nextInt();
             switch(num)
             {
             case 1:
            	 �������� s1 = new ��������();
            	 s1.set�̸�(sc.next());
            	 s1.set����(sc.nextInt());
            	 s1.set����(sc.nextInt());
            	 s1.set����(sc.nextInt());
            	 
             case 2:
            	 System.out.println("ã�� ���� �̸� �Է�:");
            	 selname = sc.next();
            	 for(int i=0; i<stu.size(); i++)
            	 {
            		 System.out.println(selname+"ã��");
            		 System.out.println(stu.get(i));
            		 
            	 }
            	 else
            	 {
            		 System.out.println("�� ã��");
            	 }
            	 break;
             case 3:
            	 System.out.println("������ �̸� �Է�:");
            	 selname = sc.next();
            	 for(int i=0; i<stu.size(); i++){
            	 {
            		 if(stu.get(i).get�̸�().equals(selname))
            		
            		 System.out.println(stu.get(i)+"������.");
            		 
            	 }
             } 
              break;
             case 4:
            	 System.out.println("��ü �����.");
            	
            	 for(int i=0; i<stu.size(); i++)
            	 {
            		 
            		
            		 System.out.println(stu.get(i));
            		 
            	 }
            	 break;
            	 
             } 
             
             //���Ĵ� ���� ������ ���� �ۼ��� ��.
	}
	}
}
