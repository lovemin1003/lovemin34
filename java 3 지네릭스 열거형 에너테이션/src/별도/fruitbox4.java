package 별도;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class fruit
{
	String name;
	int weight;
	fruit(String name, int weight)
	{
		this.name=name;
		this.weight=weight;
	}
	
	public String toString()
	{
		return name+"("+weight+")";
	}
}

class grape extends fruit
{
	grape(String name, int weight)
	{
		super(name,weight);
	}
}

class peach extends fruit
{
	peach(String name, int weight)
	{
		super(name,weight);
	}
}

class fruitcomp implements Comparator<fruit>
{

	
	public int compare(fruit arg0, fruit arg1) {
		// TODO Auto-generated method stub
		return arg0.weight-arg1.weight;
	}
	
}

class peachcomp implements Comparator<peach>
{

	
	
	public int compare(peach o1, peach o2) {
		// TODO Auto-generated method stub
		return o2.weight-o1.weight;
	}
	
}

class grapecomp implements Comparator<grape>
{

	
	
	public int compare(grape o1, grape o2) {
		// TODO Auto-generated method stub
		return o2.weight-o1.weight;
	}
	
}


public class fruitbox4 {
	public static void main(String[] args)
	{
		
		fruitbox<grape> grapebox = new fruitbox<grape>();
		fruitbox<peach> peachbox = new fruitbox<peach>();
		
		
		
		grapebox.add(new grape("violetgrape",150));
		grapebox.add(new grape("greengrape",180));
		
		peachbox.add(new peach("복숭아",180));
		peachbox.add(new peach("桃",120));
		
		Collections.sort(grapebox.getList(), new grapecomp());
		Collections.sort(peachbox.getList(), new peachcomp());
		System.out.println(grapebox);
		System.out.println(peachbox);
		System.out.println();
		Collections.sort(grapebox.getList(), new fruitcomp());
		Collections.sort(peachbox.getList(), new fruitcomp());
		System.out.println(grapebox);
		System.out.println(peachbox);
		System.out.println();
		
		
		
		
		
	}
	
}
class fruitbox<T extends fruit> extends box<T>//fruit 클래스에게 상속받은 것만 타입으로 지정가능.
{
	
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

