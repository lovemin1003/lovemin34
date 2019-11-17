<<<<<<< HEAD
import java.util.HashMap;
import java.util.Scanner;

public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap map = new HashMap();
		
		map.put("rimi","aoba");
		map.put("rimi","aiba");
		map.put("aina","aiba");
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("이름과 성씨를 입력하시오.");
			System.out.println("이름:");
			String name1= sc.next();
			System.out.println("성씨:");
			String name2= sc.next();
			
			if(!map.containsKey(name1))
			{
				System.out.println("그런 사람 없음.");
			}
			if(!map.get(name1).equals(name2))
			{
				System.out.println("그런 인간 없음.");
			}
			System.out.println("그런 인간 있음.");
			break;
		}

	}

}
=======
import java.util.HashMap;
import java.util.Scanner;

public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap map = new HashMap();
		
		map.put("rimi","aoba");
		map.put("rimi","aiba");
		map.put("aina","aiba");
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("이름과 성씨를 입력하시오.");
			System.out.println("이름:");
			String name1= sc.next();
			System.out.println("성씨:");
			String name2= sc.next();
			
			if(!map.containsKey(name1))
			{
				System.out.println("그런 사람 없음.");
			}
			if(!map.get(name1).equals(name2))
			{
				System.out.println("그런 인간 없음.");
			}
			System.out.println("그런 인간 있음.");
			break;
		}

	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
