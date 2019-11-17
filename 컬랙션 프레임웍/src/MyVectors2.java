<<<<<<< HEAD

import java.util.*;
//import javafx.application.Application;

public class MyVectors2 extends MyVectors implements Iterator{
// implements: 인터페이스를 구현하는 것
	
	int cursor =0;
	int lastret =-1;
	
	public MyVectors2(int capacity)
	{
		super(capacity);
	}
	
	public MyVectors2()
	{
		this(10);
	}
	
	public String toString()
	{
		String tmp ="";
		Iterator it = iterator();
		for(int i=0; it.hasNext(); i++)
		{
			if(i != 0)
			{
				tmp+=", ";
			}
			
			tmp +=it.next();
		}
		return "["+tmp+"]";
		
		
	}
	
	public Iterator iterators()
	{
		cursor =0;
		lastret=-1;
		return this;
		
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return cursor != size;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object next = get(cursor);
		lastret = cursor++;
		return next;
	}
	
	public void remove()//더 이상 삭제할 것이 없으면 IllegalStateException을 발생시킴.
	{
		if(lastret==-1)
		{
			throw new IllegalStateException();
		}
		else
		{
			remove(lastret);
			cursor--; //삭제 후 cursor의 위치를 감소시킴.
			lastret = -1; // lastret 값을 초기화시킴.
		}
	}

	

}
=======

import java.util.*;
//import javafx.application.Application;

public class MyVectors2 extends MyVectors implements Iterator{
// implements: 인터페이스를 구현하는 것
	
	int cursor =0;
	int lastret =-1;
	
	public MyVectors2(int capacity)
	{
		super(capacity);
	}
	
	public MyVectors2()
	{
		this(10);
	}
	
	public String toString()
	{
		String tmp ="";
		Iterator it = iterator();
		for(int i=0; it.hasNext(); i++)
		{
			if(i != 0)
			{
				tmp+=", ";
			}
			
			tmp +=it.next();
		}
		return "["+tmp+"]";
		
		
	}
	
	public Iterator iterators()
	{
		cursor =0;
		lastret=-1;
		return this;
		
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return cursor != size;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object next = get(cursor);
		lastret = cursor++;
		return next;
	}
	
	public void remove()//더 이상 삭제할 것이 없으면 IllegalStateException을 발생시킴.
	{
		if(lastret==-1)
		{
			throw new IllegalStateException();
		}
		else
		{
			remove(lastret);
			cursor--; //삭제 후 cursor의 위치를 감소시킴.
			lastret = -1; // lastret 값을 초기화시킴.
		}
	}

	

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
