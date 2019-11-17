import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmap4 
{
	public static void main(String[] args)
	{
		String [] data = {"A","G","B","H","D","A","S","Z","B","T","E","Y"};
		
		HashMap map = new HashMap();
		
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

}
