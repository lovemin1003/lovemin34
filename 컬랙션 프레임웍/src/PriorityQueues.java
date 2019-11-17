<<<<<<< HEAD
import java.util.Queue;
import java.util.*;
public class PriorityQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue pq = new PriorityQueue();
		
		pq.offer(4);
		pq.offer(8);
		pq.offer(7);
		pq.offer(1);
		pq.offer(9);
		
		System.out.println(pq);
		
		Object obj = null;
		
		while((obj = pq.poll())!=null)
		{
			System.out.println(obj);
		}
		
		Queue pq1 = new PriorityQueue();// 글자, 숫자랑 같이 넣을 수 없음.
		
		//pq1.offer(3);
		//pq1.offer(8);
		//pq1.offer(7);
		//pq1.offer(1);
		//pq1.offer(9);
	
		pq1.offer("소나타");
		pq1.offer("인젝터");
		pq1.offer("에르고디엘");
		pq1.offer("메일스트롬");
		pq1.offer("굉검룡");
		
		
		System.out.println(pq1);
		
		
		
		
		
		
		while((obj = pq1.poll())!=null)
		{
			System.out.println(obj);
		}
		

	}

}
=======
import java.util.Queue;
import java.util.*;
public class PriorityQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue pq = new PriorityQueue();
		
		pq.offer(4);
		pq.offer(8);
		pq.offer(7);
		pq.offer(1);
		pq.offer(9);
		
		System.out.println(pq);
		
		Object obj = null;
		
		while((obj = pq.poll())!=null)
		{
			System.out.println(obj);
		}
		
		Queue pq1 = new PriorityQueue();// 글자, 숫자랑 같이 넣을 수 없음.
		
		//pq1.offer(3);
		//pq1.offer(8);
		//pq1.offer(7);
		//pq1.offer(1);
		//pq1.offer(9);
	
		pq1.offer("소나타");
		pq1.offer("인젝터");
		pq1.offer("에르고디엘");
		pq1.offer("메일스트롬");
		pq1.offer("굉검룡");
		
		
		System.out.println(pq1);
		
		
		
		
		
		
		while((obj = pq1.poll())!=null)
		{
			System.out.println(obj);
		}
		

	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
