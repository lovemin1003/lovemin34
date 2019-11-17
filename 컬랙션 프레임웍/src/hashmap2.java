import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		
		map.put("리미",new Integer(80));
		map.put("리미",new Integer(81));
		map.put("리사",new Integer(50));
		map.put("아야",new Integer(40));
		map.put("치유",new Integer(70));
		map.put("사요",95);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름:"+e.getKey()+" 점수:"+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("명단:"+set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total=0;
		
		while(it.hasNext())
		{
			Integer i = (Integer)it.next();
			total +=i.intValue();
		}
		System.out.println("합계:"+total);
		System.out.println("평균:"+(float)total/set.size());
		System.out.println("최고점수:"+Collections.max(values));
		System.out.println("최저점수:"+Collections.min(values));
	}

}
