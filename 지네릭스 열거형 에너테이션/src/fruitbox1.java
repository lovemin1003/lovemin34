import java.util.ArrayList;

class fruit
{
	public String toString()
	{
		return "과일";
	}
}

class orange extends fruit
{
	public String toString()
	{
		return "오렌지";
	}
}

class melon extends fruit
{
	public String toString()
	{
		return "메론";
	}
}

class choco
{
	public String toString()
	{
		return "초코";
	}
}



class box<T>
{
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) 
	{
		list.add(item);
	}
	T get(int i)
	{
		return list.get(i);
	}
	int size()
	{
		return list.size();
	}
	public String toString()
	{
		return list.toString();
	}
	ArrayList<T> getList()
	{
		return list;
	}
	
}

public class fruitbox1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		box<fruit> fruitbox = new box<fruit>();
		box<orange> orangebox = new box<orange>();
		box<melon> melonbox = new box<melon>();
		box<choco> chocobox = new box<choco>();
		
		fruitbox.add(new fruit());
		fruitbox.add(new orange());
		fruitbox.add(new melon());
		
		orangebox.add(new orange());
		//orangebox.add(new melon());//box<orange>에는 orange만 담을 수 있음.
		
		chocobox.add(new choco());
		//chocobox.add(new melon());
		
		System.out.println(fruitbox);
		System.out.println(fruitbox.size());
		
		System.out.println(chocobox);
		System.out.println(chocobox.get(0));
		System.out.println(chocobox.size());
		

	}
	
	

}


