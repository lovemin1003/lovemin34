import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class 알파벳소문자적출 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String list =  "abcdefghijklmnopqrstuvwxyz";
		
		ArrayList list1=new ArrayList(100);//소문자 집합
		
        Scanner sc = new Scanner(System.in);
        
        
        
        
        
        String list2=sc.next();
        
        ArrayList list3 =new ArrayList(100);//입력 글자 집합
        
        ArrayList list4 =new ArrayList(100);//입력 글자 집합(복제판)
        
        for (int i=0; i<list.length(); i++)//소문자 집합 만들기
        {
        	
				list1.add(list.substring(i,i+1));
				
			
        }
        
        for (int i=0; i<list2.length(); i++)//입력글자 집합 만들기
        {
        	
				list3.add(list2.substring(i,i+1));
				list4.add(list2.substring(i,i+1));
			
        }
        
        System.out.println(list1);//소문자 집합 출력
        System.out.println(list3);//입력글자 집합 출력
       
        int a1=0;//소문자 가지 수
        
        for (int i1=0; i1< list2.length(); i1++)
        	
    	{	
        for (int i=0; i<list.length(); i++)
        {
            
            	// 소문자 있으면 바로 루프 탈출해서 소문자 있다고 알려줌.
            	  if(list3.contains(list1.get(i)))
            	  {
            	  a1++;
            	  break; 
            		
        	      }
            	
            	  
            	
            	     
            }
       
        	
        }
        
        if(a1== 0)
        {
         System.out.println("소문자는 없습니다.");
        }
        else
        {
        	System.out.println("소문자가 있습니다.");
        }
        
        int a=0;//소문자 가지 수
      //소문자 종류 수를 알려주기 위해 입력한 코드(입력글자 집합 코드 (복사판) 사용)
        	for (int i2=0; i2<list.length(); i2++)
        	{
        if(list4.contains(list1.get(i2)))
        		
        {
  		
  	  a++;
  	  
    	}
        	}
        	
       
        if(a== 0)
        {
         System.out.println("소문자는 없습니다.");
        }
        else
        {
        	System.out.println(a+"가지의 소문자가 있습니다.");
        }
        
        
    	
    	//소문자 개수 구하기
      
        for(int i4=0; i4<list2.length(); i4++)
    	{
        for(int i3=0; i3<list1.size(); i3++)
        	{
        	
        		if(list4.contains(list1.get(i3)))
        		{
        			
        			//System.out.println(list1.size());
        			//System.out.println(i3);
        		   // System.out.println(list4);
        		list4.remove(list1.get(i3));
        		
        		}
        		
        	}
    	}
        
        	
        
    	System.out.println(list4);
   
        
        
        
        int b1= list3.size()-list4.size();
        
        if(b1== 0)
        {
         System.out.println("소문자는 없습니다.");
        }
        
        else
        {
        	System.out.println(b1+"개의 소문자가 있습니다.");
        }
        
		
	}

}
