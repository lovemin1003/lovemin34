<<<<<<< HEAD
import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class comparators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] 스포츠 = {"baseball","Tennis","Soccor","Rugby","golf"};
		
		Arrays.sort(스포츠);//comparable구현에 의한 정렬
		System.out.println(Arrays.toString(스포츠));
		System.out.println();
		
		Arrays.sort(스포츠,String.CASE_INSENSITIVE_ORDER);//대소문자 구별 없음.
		System.out.println(Arrays.toString(스포츠));
		System.out.println();
		
		Arrays.sort(스포츠,new Reverses());//역순정렬
		System.out.println(Arrays.toString(스포츠));
		System.out.println();
	}

}
class Reverses implements Comparator {

	
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		if(arg0 instanceof Comparable && arg1 instanceof Comparable)
		{
			Comparable c1 = (Comparable)arg0;
			Comparable c2 = (Comparable)arg1;
			return c1.compareTo(c2) * -1;//-1을 곱햐여 기본 정렬방식의 반대로 변경됨.
		}
		return -1;
	}

}
=======
import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class comparators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] 스포츠 = {"baseball","Tennis","Soccor","Rugby","golf"};
		
		Arrays.sort(스포츠);//comparable구현에 의한 정렬
		System.out.println(Arrays.toString(스포츠));
		System.out.println();
		
		Arrays.sort(스포츠,String.CASE_INSENSITIVE_ORDER);//대소문자 구별 없음.
		System.out.println(Arrays.toString(스포츠));
		System.out.println();
		
		Arrays.sort(스포츠,new Reverses());//역순정렬
		System.out.println(Arrays.toString(스포츠));
		System.out.println();
	}

}
class Reverses implements Comparator {

	
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		if(arg0 instanceof Comparable && arg1 instanceof Comparable)
		{
			Comparable c1 = (Comparable)arg0;
			Comparable c2 = (Comparable)arg1;
			return c1.compareTo(c2) * -1;//-1을 곱햐여 기본 정렬방식의 반대로 변경됨.
		}
		return -1;
	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
