import java.util.ArrayList;
import java.util.Scanner;

public class arraylistex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
             ArrayList <성적관리> stu = new ArrayList<성적관리>(); 
             String selname;
             
             while(true)
             {
            	 System.out.println("1번은 등록/2번:찾기/3번 삭제/4번:전체출력/");
             
             int num = sc.nextInt();
             switch(num)
             {
             case 1:
            	 성적관리 s1 = new 성적관리();
            	 s1.set이름(sc.next());
            	 s1.set국어(sc.nextInt());
            	 s1.set영어(sc.nextInt());
            	 s1.set수학(sc.nextInt());
            	 
             case 2:
            	 System.out.println("찾고 싶은 이름 입력:");
            	 selname = sc.next();
            	 for(int i=0; i<stu.size(); i++)
            	 {
            		 System.out.println(selname+"찾음");
            		 System.out.println(stu.get(i));
            		 
            	 }
            	 else
            	 {
            		 System.out.println("못 찾음");
            	 }
            	 break;
             case 3:
            	 System.out.println("삭제할 이름 입력:");
            	 selname = sc.next();
            	 for(int i=0; i<stu.size(); i++){
            	 {
            		 if(stu.get(i).get이름().equals(selname))
            		
            		 System.out.println(stu.get(i)+"삭제함.");
            		 
            	 }
             } 
              break;
             case 4:
            	 System.out.println("전체 출력함.");
            	
            	 for(int i=0; i<stu.size(); i++)
            	 {
            		 
            		
            		 System.out.println(stu.get(i));
            		 
            	 }
            	 break;
            	 
             } 
             
             //이후는 사진 찍은거 보고 작성할 것.
	}
	}
}
