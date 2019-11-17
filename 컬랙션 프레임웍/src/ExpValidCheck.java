<<<<<<< HEAD
<<<<<<< HEAD

import java.util.*;


public class ExpValidCheck {

	public static void main(String[] args) {
		
		
		
		if(args.length != 1)
		{
			System.out.println("Usage:java ExpValidCheck\"EX\"");
			System.out.println("Example:java ExpValidCheck\"((2+3)*1)+3\"");
			
			//System.exit(0);
		}
		
		Stack st = new Stack();
		
		String expression; //= args[0];
		
		//이렇게 글자를 직접 적어줘야 작동되는 듯.
		expression="Example:java ExpValidCheck\"((2+3)*1)+3\"";
		
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

import java.util.*;


public class ExpValidCheck {

	public static void main(String[] args) {
		
		
		
		if(args.length != 1)
		{
			System.out.println("Usage:java ExpValidCheck\"EX\"");
			System.out.println("Example:java ExpValidCheck\"((2+3)*1)+3\"");
			
			//System.exit(0);
		}
		
		Stack st = new Stack();
		
		String expression; //= args[0];
		
		//이렇게 글자를 직접 적어줘야 작동되는 듯.
		expression="Example:java ExpValidCheck\"((2+3)*1)+3\"";
		
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
=======

import java.util.*;


public class ExpValidCheck {

	public static void main(String[] args) {
		
		
		
		if(args.length != 1)
		{
			System.out.println("Usage:java ExpValidCheck\"EX\"");
			System.out.println("Example:java ExpValidCheck\"((2+3)*1)+3\"");
			
			//System.exit(0);
		}
		
		Stack st = new Stack();
		
		String expression; //= args[0];
		
		//이렇게 글자를 직접 적어줘야 작동되는 듯.
		expression="Example:java ExpValidCheck\"((2+3)*1)+3\"";
		
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
