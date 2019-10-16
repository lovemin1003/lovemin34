import java.util.ArrayList;

//fruitbox1에 있는 클래스랑 공유함.
////class fruit
////{
////	public String toString()
//	{
//		return "과일";
//	}
//}
//
//class orange extends fruit
//{
//	public String toString()
//	{
//		return "오렌지";
//	}
//}
//
//class melon extends fruit
//{
//	public String toString()
//	{
//		return "메론";
//	}
//}
//
//class choco
//{
//	public String toString()
//	{
//		return "초코";
//	}
//}
//
//
//
//class box<T>
//{
//	ArrayList<T> list = new ArrayList<T>();
//
//	void add(T item) 
//	{
//		list.add(item);
//	}
//	T get(int i)
//	{
//		return list.get(i);
//	}
//	int size()
//	{
//		return list.size();
//	}
//	public String toString()
//	{
//		return list.toString();
//	}
//	
//}
class juice
{
	String name;
	juice(String name)
	{
		this.name=name+"쥬스";
		
	}
	public String toString()
	{
		return name;
	}
	
}

class juicer
{
	static juice makejuice(fruitbox<? extends fruit> box)
	{
		String tmp ="";
		
		for(fruit f : box.getList())
		{
			tmp += f+" ";
		}
		return new juice(tmp);
	}
}
public class fruitbox3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fruitbox<fruit> fruitbox = new fruitbox<fruit>();
		fruitbox<orange> orangebox = new fruitbox<orange>();
		
		
		fruitbox.add(new orange());
		fruitbox.add(new melon());
		orangebox.add(new orange());
		orangebox.add(new orange());
		
		System.out.println(juicer.makejuice(fruitbox));
		System.out.println(juicer.makejuice(orangebox));

	}

}

//class fruitbox<T extends fruit> extends box<T>//fruit 클래스에게 상속받은 것만 타입으로 지정가능.
//{
//	
//}

//class box<T>
//{
//	ArrayList<T> list = new ArrayList<T>();
//
//	void add(T item) 
//	{
//		list.add(item);
//	}
//	T get(int i)
//	{
//		return list.get(i);
//	}
//	int size()
//	{
//		return list.size();
//	}
//	public String toString()
//	{
//		return list.toString();
//	}
//	ArrayList<T> getList()
//	{
//		return list;
//	}
//	
//}
