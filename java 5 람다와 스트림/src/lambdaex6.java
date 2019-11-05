import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.*;
import java.util.*;


public class lambdaex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntSupplier s = () -> (int)(Math.random()*100)+1;
		IntConsumer c = i -> System.out.print(i+",");
		IntPredicate p = i -> i%2==0;
		IntUnaryOperator op = i -> i/10 *10;//i의 일의 자리를 없앤다.
		
		int [] arr = new int[10];
		
		makeRandomList(s,arr);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		printEvenNum(p,c,arr);//짝수인 것을 c형식으로 list에 삽입시켜서 출력함.
		System.out.println();
		
		int [] newarr = doSomething(op,arr);
		System.out.println(Arrays.toString(newarr));
		

		

	}
	
	static void makeRandomList(IntSupplier s, int[] arr) 
	{
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = s.getAsInt(); //get()이 아닌 getAsInt()임.
		} 
		
	}
	
	static void printEvenNum(IntPredicate p, IntConsumer c, int[] arr) {
		
		System.out.print("[");
		for(int i : arr)
		{
			if(p.test(i))
			{
				c.accept(i);
			}
			
		}
		System.out.println("]");
	}

     static int [] doSomething(IntUnaryOperator op, int[] arr) {
		// TODO Auto-generated method stub
 		int [] newarr = new int[arr.length];    	 
    	 for(int i=0; i<newarr.length; i++)
    	 {
    		 newarr[i] = op.applyAsInt(arr[i]); // apply()가 아님.
    	 }
		return newarr;
	}

	

	

}
