
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class 小文字有無確認コード {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String list =  "abcdefghijklmnopqrstuvwxyz";//ここには　小文字を　入れましたが　他の文字も　入れますし　
		//その文字も　入力内容に　あるかどうかを　確認できます。
		
		ArrayList list1=new ArrayList(100);//小文字集合
		
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("何か入力してください。");
        
        
        String list2=sc.next();
        
        ArrayList list3 =new ArrayList(100);//入力文字集合　
        
        ArrayList list4 =new ArrayList(100);//入力文字集合（コピー）
        
        for (int i=0; i<list.length(); i++)//小文字集合作り。
        {
        	
				list1.add(list.substring(i,i+1));
				
			
        }
        
        for (int i=0; i<list2.length(); i++)//入力文字集合作り。
        {
        	
				list3.add(list2.substring(i,i+1));
				list4.add(list2.substring(i,i+1));
			
        }
        
        System.out.println(list1);//小文字集合アウトプット
        System.out.println(list3);//入力文字集合アウトプット
       
        int a1=0;//小文字種類数
        
        for (int i1=0; i1< list2.length(); i1++)
        	
    	{	
        for (int i=0; i<list.length(); i++)
        {
            
            	// 小文字が見つかったら　すぐ　ループから　出て　小文字があると　知らせる。
            	  if(list3.contains(list1.get(i)))
            	  {
            	  a1++;
            	  break; 
            		
        	      }
            	
            	  
            	
            	     
            }
       
        	
        }
        
        if(a1== 0)
        {
         System.out.println("小文字なし。");
        }
        else
        {
        	System.out.println("小文字あり。");
        }
        
        int a=0;//小文字種類数
      //小文字種類数を　知らせる　ために入力した　コード（入力文字集合（コピー）使用）
        	for (int i2=0; i2<list.length(); i2++)
        	{
        if(list4.contains(list1.get(i2)))
        		
        {
  		
  	  a++;
  	  
    	}
        	}
        	
       
        if(a== 0)
        {
         System.out.println("小文字なし。");
        }
        else
        {
        	System.out.println(a+"種類の　小文字が　あります。");
        }
        
        
    	
    	//小文字の数を　探る
      
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
         System.out.println("小文字なし。");
        }
        
        else
        {
        	System.out.println(b1+"個の　小文字が　あります。");
        }
        
		
	}

}
