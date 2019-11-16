package threadwaitex3;
import java.util.ArrayList;



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
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				
			}
			
		}
		
	}
	
}

class Table
{
	String[] dishnames = {"bread", "donut","bread"};
	final int maxfood = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	//synchronized 추가
	public synchronized void add(String dish)
	{
		while(dishes.size()>=maxfood)//0.5초마다 음식이 추가되었는지 확인한다.
		{
			String name = Thread.currentThread().getName();
			System.out.println(name+" is waiting");
			
			try
			{
				wait();
				Thread.sleep(500);
			}
			
			catch(InterruptedException e)
			{
				
			}
			

		}
		
		dishes.add(dish);
		notify();
		System.out.println("dishes:"+ dishes.toString());
	}


	public void remove(String dishname)
	{
		synchronized(this)
		{
			String name = Thread.currentThread().getName();

			while(dishes.size()==0)
			{
				System.out.println(name+" is waiting");
				
				try
				{
					wait();
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
				       notify();
				       return;
			         }	
		
		        }
				try
				{
					System.out.println(name+ " is waiting");
					wait();
					Thread.sleep(500);
				}
				
				catch(InterruptedException e)
				{
					
				}
				
				
			}
		}
		
		
	}
	
	public int dishnum() {return dishnames.length;}
}

public class threadwaitex3 {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		Table table = new Table();
		
		new Thread(new Cook(table),"cook1").start();
		new Thread(new Guest(table,"donut"),"cust1").start();
		new Thread(new Guest(table,"bread"),"cust2").start();
		
		Thread.sleep(5000);
		System.exit(0);

		

	}

}
