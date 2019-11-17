<<<<<<< HEAD
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

public class ArrayLists2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int limit=10;
		
		String source ="0123456789qwertyuiopasdfghjklzxcvbnm!@#$%^&*()";
		
		int length= source.length();
		
		List list = new ArrayList(length/limit);
		
		
		System.out.println(source.length());
		System.out.println(length/limit);
		
		for(int i=0; i<length; i+=limit)
		{
			if(i+limit<length)
			{
				list.add(source.substring(i,i+limit));
				
			}
			else
			{
				list.add(source.substring(i));
			}
		}
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println(list);

	}

}
=======
import java.util.ArrayList;
import java.util.List;

public class ArrayLists2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int limit=10;
		
		String source ="0123456789qwertyuiopasdfghjklzxcvbnm!@#$%^&*()";
		
		int length= source.length();
		
		List list = new ArrayList(length/limit);
		
		
		System.out.println(source.length());
		System.out.println(length/limit);
		
		for(int i=0; i<length; i+=limit)
		{
			if(i+limit<length)
			{
				list.add(source.substring(i,i+limit));
				
			}
			else
			{
				list.add(source.substring(i));
			}
		}
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println(list);

	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
=======
import java.util.ArrayList;
import java.util.List;

public class ArrayLists2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int limit=10;
		
		String source ="0123456789qwertyuiopasdfghjklzxcvbnm!@#$%^&*()";
		
		int length= source.length();
		
		List list = new ArrayList(length/limit);
		
		
		System.out.println(source.length());
		System.out.println(length/limit);
		
		for(int i=0; i<length; i+=limit)
		{
			if(i+limit<length)
			{
				list.add(source.substring(i,i+limit));
				
			}
			else
			{
				list.add(source.substring(i));
			}
		}
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println(list);

	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
