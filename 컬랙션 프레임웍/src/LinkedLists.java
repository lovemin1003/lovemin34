import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList();
		//순차적 추가
		System.out.println("Array"+add1(al));
		System.out.println("Linked"+add1(ll));
		//중간에 추가(순차적 추가가 먼저 이루어져야 되는 듯.)ㄴ
		System.out.println("Array"+add2(al));
		System.out.println("Linked"+add2(ll));
		
		
		//중간에서 삭제
		System.out.println("Array"+remove2(al));
		System.out.println("Linked"+remove2(ll));
		//순차적 삭제(중간에서 삭제를 먼저 해야하는 듯.)
		System.out.println("Array"+remove1(al));
		System.out.println("Linked"+remove1(ll));
		
		//접근시간 테스트
		add(al);
		add(ll);
		System.out.println("Array"+access(al));//접근시간(읽는 시간)이 빠름.
		System.out.println("Linked"+access(ll));//접근시간(읽는 시간)이 느림.
		


	}

	private static void add(List list) {
		// TODO Auto-generated method stub
		for(int i=0; i<1000000; i++)
		{
			list.add(i);
		}
		
		
	}

	private static long access(List list) 
	{
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++)
		{
			list.get(i);
		}
		long end = System.currentTimeMillis();
		return end - start;	
	}


	private static long remove2(List list)
	{
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++)
		{
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;	
	}

	private static long remove1(List list) 
	{
		long start = System.currentTimeMillis();
		for(int i=list.size()-1; i>=0; i--)
		{
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;	
	}

	private static long add2(List list) 
	{
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++)
		{
			list.add(500,"X");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	private static long add1(List list) 
	{
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++)
		{
			list.add(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

}
