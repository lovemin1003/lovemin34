<<<<<<< HEAD
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class hastsetbingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set set = new HashSet(); 자체적 저장방식에 따라 순서가 정해짐.
	    Set set = new LinkedHashSet();
		int[][] board = new int[5][5];
		
		for(int i=0; set.size()<25; i++)
		{
			int num = (int)(Math.random()*25+1);
			set.add(num+"");
		}
		Iterator it = set.iterator();
		
		for(int q=0; q<board.length; q++)
		{
			for(int w=0; w<board[q].length; w++)
			{
				board[q][w]= Integer.parseInt((String)it.next());
				System.out.print((board[q][w] < 10 ? "  " : " ")+board[q][w]);
			}
			System.out.println();
		}

	}

}
=======
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class hastsetbingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set set = new HashSet(); 자체적 저장방식에 따라 순서가 정해짐.
	    Set set = new LinkedHashSet();
		int[][] board = new int[5][5];
		
		for(int i=0; set.size()<25; i++)
		{
			int num = (int)(Math.random()*25+1);
			set.add(num+"");
		}
		Iterator it = set.iterator();
		
		for(int q=0; q<board.length; q++)
		{
			for(int w=0; w<board[q].length; w++)
			{
				board[q][w]= Integer.parseInt((String)it.next());
				System.out.print((board[q][w] < 10 ? "  " : " ")+board[q][w]);
			}
			System.out.println();
		}

	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
