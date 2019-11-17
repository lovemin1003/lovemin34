<<<<<<< HEAD
<<<<<<< HEAD
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("소나타");
		st.push("피나");
		st.push("세레나");
		st.push("카논");
		st.push("캐로");
		
		q.offer("1");
		q.offer("2");
		q.offer("3");
		q.offer("4");
		q.offer("5");
		
		System.out.println("스택: 나중에 들어온게 먼저 빠짐.");
		while(!st.empty())
		{
			System.out.println(st.pop());
		}
		
		System.out.println("큐: 먼저 들어온게 먼저 빠짐.");
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}

	}

}
=======
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("소나타");
		st.push("피나");
		st.push("세레나");
		st.push("카논");
		st.push("캐로");
		
		q.offer("1");
		q.offer("2");
		q.offer("3");
		q.offer("4");
		q.offer("5");
		
		System.out.println("스택: 나중에 들어온게 먼저 빠짐.");
		while(!st.empty())
		{
			System.out.println(st.pop());
		}
		
		System.out.println("큐: 먼저 들어온게 먼저 빠짐.");
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}

	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
=======
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("소나타");
		st.push("피나");
		st.push("세레나");
		st.push("카논");
		st.push("캐로");
		
		q.offer("1");
		q.offer("2");
		q.offer("3");
		q.offer("4");
		q.offer("5");
		
		System.out.println("스택: 나중에 들어온게 먼저 빠짐.");
		while(!st.empty())
		{
			System.out.println(st.pop());
		}
		
		System.out.println("큐: 먼저 들어온게 먼저 빠짐.");
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}

	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
