import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class treemap1 {

	public static void main(String[] args)
	{
		String [] data = {"A","G","B","B","B","H","D","A","S"};
		
		TreeMap map = new TreeMap();
		
		for(int i=0; i<data.length; i++)
		{
			if(map.containsKey(data[i]))
			{
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i], new Integer(value.intValue()+1));
			}
			else
			{
				map.put(data[i], new Integer(1));
			}
		}
		
		Iterator it = map.entrySet().iterator();
		System.out.println("기본정렬");
		while(it.hasNext())
		{
			Map.Entry entry =(Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey()+":"+printBar('#',value)+" "+value);
		}
		
		//map을 ArrayList로 바꿔서...
		Set set = map.entrySet();
		List list = new ArrayList(set);
		//static void sort(List list, Comparator c)
		Collections.sort(list, new valuecompare());//...정렬
		
		it = list.iterator();
		System.out.println("값의 크기가 큰 순서대로 정렬");
		while(it.hasNext())
		{
			Map.Entry entry =(Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey()+":"+printBar('#',value)+" "+value);
		}
	}
	
   

	

	public static String printBar(char ch, int value) 
	{
		// TODO Auto-generated method stub
		char[] bar = new char[value];
		
		for(int i=0; i<bar.length; i++)
		{
			bar[i] = ch;
		}
		return new String(bar); //String(char[] chArr)
	}
	
	static public class valuecompare implements Comparator
	{

		
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry)
			{
				Map.Entry e1 =(Map.Entry)o1;
				Map.Entry e2 =(Map.Entry)o2;
				
				int value1 = ((Integer)e1.getValue()).intValue();
				int value2 = ((Integer)e2.getValue()).intValue();
				
				return value2 - value1;
			}
			return -1;
		}
	}
}
