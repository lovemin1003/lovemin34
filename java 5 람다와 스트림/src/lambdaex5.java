import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class lambdaex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> s = () -> (int)(Math.random()*1000)+1;
		Consumer<Integer> c = i -> System.out.print(i+",");
		Predicate<Integer> p = i -> i%2==0;
		Function<Integer, Integer> f = i -> i/10 *10;//i의 일의 자리를 없앤다.
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s,list);
		System.out.println(list);
		System.out.println();
		
		printEvenNum(p,c,list);//짝수인 것을 c형식으로 list에 삽입시켜서 출력함.
		System.out.println();
		
		List<Integer> newlist = doSomething(f,list);
		System.out.println(newlist);
		

		

	}

     static <T>  List<T> doSomething(Function<T, T> f, List<T> list) {
		// TODO Auto-generated method stub
    	 List<T> newlist = new ArrayList<T>(list.size());
    	 
    	 for(T i : list)
    	 {
    		 newlist.add(f.apply(i));
    	 }
		return newlist;
	}

	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		// TODO Auto-generated method stub
		System.out.print("[");
		for(T i : list)
		{
			if(p.test(i))
			{
				c.accept(i);
			}
			
		}
		System.out.println("]");
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++)
		{
			list.add(s.get());
		}
		
	}

}
