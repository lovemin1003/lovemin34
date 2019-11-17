import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class lambdaex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i=1; i<=10; i++)
		{
			list.add(i);
		}
		//list의 모든 요소를 출력
		list.forEach(i->System.out.print(i+","));
		System.out.println();
		
		list.removeIf(x-> x%2==0 || x%3==0);
		System.out.println(list);
		System.out.println();
		
		list.replaceAll(x-> x*10);
		System.out.println(list);
		System.out.println();
		
		Map<String, String> map = new HashMap<>();
		map.put("1","1");
		map.put("2","2");
		map.put("3","3");
		map.put("4","4");
		map.put("5","5");
		
		//map의 모든 요소를 {k,v}의 형식으로 출력한다.
		map.forEach((k,v) -> System.out.print("{"+k+","+v+"} "));

	}

}
