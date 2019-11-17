import java.util.ArrayList;
import java.util.Iterator;

public class iterators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ori = new ArrayList(10);
		ArrayList ar1 = new ArrayList(10);
		ArrayList ar2 = new ArrayList(10);
		
		for (int i=0; i<10; i++)
		{
			ori.add(i);
		}
		
		Iterator it = ori.iterator();
		
		while(it.hasNext())
		{
			ar1.add(it.next());
		}
		//ori에서 ar1로 복사
		System.out.println(ori);
		System.out.println(ar1);
		
		while(it.hasNext())
		{
			ar2.add(it.next());
		}
		//ori에서 ar2로 복사(Iterator는 재사용이 안 되므로 1번 쓰고 그냥 add하면 저장이 안 됨.)
		System.out.println("Iterator는 재사용이 안 되므로 1번 쓰고 그냥 add하면 저장이 안 됨.");
		System.out.println(ori);
		System.out.println(ar2);
		
        it = ori.iterator();//고로 다시 얻어와야 함.
		
		while(it.hasNext())
		{
			ar2.add(it.next());
			it.remove();//제거는 안 해도 되는 듯.
		}
		System.out.println("고로 다시 얻어와야 함.");
		System.out.println(ori);
		System.out.println(ar2);

	}

}
