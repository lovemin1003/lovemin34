import java.util.ArrayList;
import java.util.ListIterator;

public class listiterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add("Ai");
		al.add("@이그니스터");
		al.add("사이버스");
		
		ListIterator li = al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
		
		// 역행
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}

	}

}
