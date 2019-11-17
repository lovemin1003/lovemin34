import java.util.Iterator;
import java.util.Vector;

public class myvecors2test {
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		
		
		//삭제전
		System.out.println(v);
		
		Iterator it = v.iterator();
		it.next();
		it.remove();
		it.next();
		it.next();
		it.remove();
		
		//삭제후
		System.out.println(v);
	}
}
