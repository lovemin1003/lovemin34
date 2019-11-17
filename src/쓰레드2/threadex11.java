package 쓰레드2;

import java.util.Iterator;
import java.util.Map;
import java.util.*;

public class threadex11 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		threadex11_1 t1 = new threadex11_1("thread1");
		threadex11_2 t2 = new threadex11_2("thread2");
		t1.start();
		t2.start();

	}

}

class threadex11_1 extends Thread
{
	threadex11_1(String name)
	{
		super(name);
	}
	
	public void run() 

	{
		// TODO Auto-generated method stub

		
			try
			{
				Thread.sleep(5000);//5초동안 기다림.
			}
			catch(InterruptedException e)//autosave의 값이 true면 autosave()를 호출한다.
			{
			
			}
			
			
	}
	

}

class threadex11_2 extends Thread
{
	threadex11_2(String name)
	{
		super(name);
	}

	public void run() 

	{
		// TODO Auto-generated method stub

		Map map = getAllStackTraces();
		Iterator it = map.keySet().iterator();
		
		int x=0;
		while(it.hasNext())
		{
			Object obj =it.next();
			Thread t = (Thread)obj;
			StackTraceElement[] ste =(StackTraceElement[])(map.get(obj));
			
			System.out.println(++x +" name :" +t.getName()
			+ ", group:"+t.getThreadGroup().getName()
			+ ", daemon:"+ t.isDaemon());
			
			for(int i=0; i < ste.length; i++)
			{
				System.out.println(ste[i]);
			}
			
			System.out.println();
		}
	}
}