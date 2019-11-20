import java.util.Scanner;
enum Week {
	  월, 화, 수, 목, 금, 토, 일
	  }//메인 메서드 밖에 적어야 함.


public class 포와이프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Week q : Week.values())
		{
			System.out.println(q+"요일 ");
		}
		
		for(int a=0; a<=30; a++)
		{
			
			if(a%2==0)
			{
				System.out.println(a+"는 짝수.");
			}
			else
			{
				System.out.println(a+"는 홀수.");
			}
		}
         int b = 0;
         while(b<=14)
         {
        	 b++;
        	 if(b%2==0)
 			{
 				System.out.println(b+"는 짝수.");
 			}
 			else
 			{
 				System.out.println(b+"는 홀수.");
 			}
         }
	
	int c =0;
	do
	{
		c++;
		System.out.println(c);
	}while(c<10);
  Scanner in = new Scanner(System.in);
  System.out.println("숫자 입력");
  int d = in.nextInt();
  while(d!=0)
  {
	  d--;
	  System.out.println(d);
  }
  for(int e= 2; e<10; e++)
  {
	  for(int f= 1; f<10; f++)
	  {
		  System.out.println(e+"x"+f+"="+e*f);
	  }
  }
  
  for(int g= 1; g<100; g++)
  {
	  if(g%3==1)
		  {continue;}
	  else if(g==75)
	  {
		  break;
	  }
	  else 
	  {
	  System.out.println(g);
	  }
  }

  String name[]= {"카논","캐로","피나","소나타","세레나" };
  for(String h : name)
  {
	  System.out.println("컬러풀 파스토랄레 "+h);
  }
  int number[]= {1,2,3,4,5};
  for(int i : number)
  {
	  System.out.println(" "+i);
  }
  
  
}
}