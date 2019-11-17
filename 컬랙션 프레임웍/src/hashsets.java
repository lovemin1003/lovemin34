<<<<<<< HEAD
<<<<<<< HEAD
import java.util.HashSet;
import java.util.Set;

public class hashsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] objArr = {"4",new Integer(5),new Integer(2),"2","3","4","2","1","4","3","5","5"};
		Set set = new HashSet();
		
		for (int i=0; i<objArr.length; i++)
		{
			set.add(objArr[i]);//정렬도 알아서 되는 듯, 같은 문자(객체)는 중복으로 나오지 않음, 같은 결과라도 다른 인스턴스인 경우에는 중복으로 적용되지 않음.
		}
		System.out.println(set);

	}

}
=======
import java.util.HashSet;
import java.util.Set;

public class hashsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] objArr = {"4",new Integer(5),new Integer(2),"2","3","4","2","1","4","3","5","5"};
		Set set = new HashSet();
		
		for (int i=0; i<objArr.length; i++)
		{
			set.add(objArr[i]);//정렬도 알아서 되는 듯, 같은 문자(객체)는 중복으로 나오지 않음, 같은 결과라도 다른 인스턴스인 경우에는 중복으로 적용되지 않음.
		}
		System.out.println(set);

	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
=======
import java.util.HashSet;
import java.util.Set;

public class hashsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] objArr = {"4",new Integer(5),new Integer(2),"2","3","4","2","1","4","3","5","5"};
		Set set = new HashSet();
		
		for (int i=0; i<objArr.length; i++)
		{
			set.add(objArr[i]);//정렬도 알아서 되는 듯, 같은 문자(객체)는 중복으로 나오지 않음, 같은 결과라도 다른 인스턴스인 경우에는 중복으로 적용되지 않음.
		}
		System.out.println(set);

	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
