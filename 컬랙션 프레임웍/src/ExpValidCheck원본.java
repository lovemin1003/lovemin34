<<<<<<< HEAD
import java.util.EmptyStackException;
import java.util.Stack;


public class ExpValidCheck원본 {

	public static void main(String[] args) {
		
		
		//코드는 제대로 적었는데 작동을 안 함...
		if(args.length != 1)
		{
			System.out.println("Usage:java ExpValidCheck\"EX\"");
			System.out.println("Example:java ExpValidCheck\"((2+3)*1)+3\"");
			
			System.exit(0);
		}
		
		Stack st = new Stack();
		
		String expression= args[0];
		
		
		
		System.out.println("expression:"+expression);
		
		
		try
		{
		for(int i=0; i < expression.length(); i++)
	    	{
			
			char ch = expression.charAt(i);
			
			if(ch=='(')
			   {
				st.push(ch+"");
			   }
			else if(ch==')')
			   {
				st.pop();
			   }
		    }
			
		    if(st.isEmpty())
		       {
		    	System.out.println("괄호가 일치함.");
		       }
		    else
		       {
		    	System.out.println("괄호가 불일치함.");
		       }
		}
		
		catch (EmptyStackException e)
		{
			System.out.println("괄호가 불일치.");
		}
		
		
	}
	
	
	
	

}
=======
import java.util.EmptyStackException;
import java.util.Stack;


public class ExpValidCheck원본 {

	public static void main(String[] args) {
		
		
		//코드는 제대로 적었는데 작동을 안 함...
		if(args.length != 1)
		{
			System.out.println("Usage:java ExpValidCheck\"EX\"");
			System.out.println("Example:java ExpValidCheck\"((2+3)*1)+3\"");
			
			System.exit(0);
		}
		
		Stack st = new Stack();
		
		String expression= args[0];
		
		
		
		System.out.println("expression:"+expression);
		
		
		try
		{
		for(int i=0; i < expression.length(); i++)
	    	{
			
			char ch = expression.charAt(i);
			
			if(ch=='(')
			   {
				st.push(ch+"");
			   }
			else if(ch==')')
			   {
				st.pop();
			   }
		    }
			
		    if(st.isEmpty())
		       {
		    	System.out.println("괄호가 일치함.");
		       }
		    else
		       {
		    	System.out.println("괄호가 불일치함.");
		       }
		}
		
		catch (EmptyStackException e)
		{
			System.out.println("괄호가 불일치.");
		}
		
		
	}
	
	
	
	

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
