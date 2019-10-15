import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(1));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(3));
		list1.add(new Integer(1));
		
		ArrayList list2 = new ArrayList(list1.subList(0, 3));
		print(list1,list2);
		System.out.println(list1.containsAll(list2));

		Collections.sort(list1);
		Collections.sort(list2);
		print(list1,list2);
		
		System.out.println(list1.containsAll(list2));
		
		list2.add("b");
		list2.add("c");
		print(list1,list2);
		
		list1.add(1,"d");
		list2.add(2,"f");
		print(list1,list2);
		
		list1.set(0,"a");
		list2.set(1,"e");
		print(list1,list2);
		
		//리스트1,2와 겹치는 것만 남기고 나머지는 삭제시킴.
		System.out.println(list1.retainAll(list2));
		print(list1,list2);
		
	
	    //리스트2에서 리스트1에 포함된 객체를 삭제시킴.
	for(int i=list2.size()-1; i>=0; i--)
	{
		if(list1.contains(list2.get(i)))
		{
			list2.remove(i);
		}
	}
	
	  print(list1,list2);
	}
	private static void print(ArrayList list1, ArrayList list2) {
		// TODO Auto-generated method stub
		System.out.println(list1);
		System.out.println(list2+"\n");
	}

}
