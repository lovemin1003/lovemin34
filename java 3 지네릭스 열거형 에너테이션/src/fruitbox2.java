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


class fruitbox<T extends fruit> extends box<T>//fruit 클래스에게 상속받은 것만 타입으로 지정가능.
{
	
}




public class fruitbox2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		fruitbox<fruit> fruitbox = new fruitbox<fruit>();
		fruitbox<orange> orangebox = new fruitbox<orange>();
		fruitbox<melon> melonbox = new fruitbox<melon>();
		//fruitbox<choco> chocobox = new fruitbox<choco>();//타입 불일치.
		box<choco> chocobox = new box<choco>();
		
		fruitbox.add(new fruit());
		fruitbox.add(new orange());
		fruitbox.add(new melon());
		
		orangebox.add(new orange());
		//orangebox.add(new melon());//box<orange>에는 orange만 담을 수 있음.
		melonbox.add(new melon());
		
		chocobox.add(new choco());
		
		
		System.out.println(fruitbox);
		System.out.println(fruitbox.size());
		System.out.println(orangebox);
		System.out.println(melonbox);
		System.out.println(chocobox);
		

	}
	
	

}


