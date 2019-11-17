<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Iterator;

public class iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Ai");
		al.add("@이그니스터");
		al.add("사이버스");
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
		}

	}

}
=======
import java.util.ArrayList;
import java.util.Iterator;

public class iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Ai");
		al.add("@이그니스터");
		al.add("사이버스");
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
		}

	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
