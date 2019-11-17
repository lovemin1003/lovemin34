package threadwaitex4;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;



class Guest implements Runnable
{

	private Table table; 
	private String food;
	
	Guest(Table table, String food)
	{
		this.table = table;
		this.food=food;
	}
	
	public void run() {
		while(true)
		{
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				
			}
			
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name+" ate a "+food);
			
			
		}
		
	}

	
}

class Cook implements Runnable
{

	private Table table;
	
	Cook(Table table){this.table = table;}
	
	public void run() 
	{
		while(true)
		{
			// 임의의 요리를 하나 골라서 table에 추가한다.
			int idx = (int)(Math.random()*table.dishnum());
			table.add(table.dishnames[idx]);
			
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				
			}
			
		}
		
	}
	
}

class Table
{
	String[] dishnames = {"donut", "donut","bread"};//donut 확률을 높임.
	final int maxfood = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	private ReentrantLock lock = new ReentrantLock();
	private Condition forcook = lock.newCondition();
	private Condition forcust = lock.newCondition();

	
	public void add(String dish)
	{
		lock.lock();
		try {
		while(dishes.size()>=maxfood)//0.5초마다 음식이 추가되었는지 확인한다.
		{
			String name = Thread.currentThread().getName();
			System.out.println(name+" is waiting");
			
			try
			{
				forcook.await(); //cook쓰레드를 기다리게 함.
				Thread.sleep(500);
			}
			
			catch(InterruptedException e)
			{
				
			}
			

		}
		
		dishes.add(dish);
	     forcust.signal();  //notify(); 대기중인 cust를 꺠우기 위함.
		System.out.println("dishes:"+ dishes.toString());
		
	}
		finally 
		{
		lock.unlock();
		}
	}
	
	
	public void remove(String dishname)
	{
		lock.lock();
		synchronized(this)
		{
			String name = Thread.currentThread().getName();

			try {
			while(dishes.size()==0)
			{
				System.out.println(name+" is waiting");
				
				try
				{
					forcust.await(); ///cust쓰레드를 기다리게 한다.
					Thread.sleep(500);
				}
				
				catch(InterruptedException e)
				{
					
				}
				

			}
		
			while(true)
			{
			
				for(int i=0; i<dishes.size(); i++)
		        {
			
				
					if(dishname.equals(dishes.get(i)))
			         {
				       dishes.remove(i);
					     forcook.signal();  //notify(); 대기중인 cook를 꺠우기 위함.
				       return;
			         }	
		
		        }
				try
				{
					System.out.println(name+ " is waiting");
					forcust.await(); ///cust쓰레드를 기다리게 한다.
					Thread.sleep(500);
				}
				
				catch(InterruptedException e)
				{
					
				}
				
				
			}
		}
			finally 
			{
			lock.unlock();
			}
		}
		
		
	}
	

	
		
	
	public int dishnum() {return dishnames.length;}
}

public class threadwaitex4 {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		Table table = new Table();
		
		new Thread(new Cook(table),"cook1").start();
		new Thread(new Guest(table,"donut"),"cust1").start();
		new Thread(new Guest(table,"bread"),"cust2").start();
		
		Thread.sleep(3000);
		System.exit(0);

		

	}

}
