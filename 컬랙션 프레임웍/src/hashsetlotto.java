<<<<<<< HEAD
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class hashsetlotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		ArrayList arr = new ArrayList(6);
		
		
		//for(int i=0; i<6; i++) 이걸 활용하면 숫자 6개가 안 나오는 경우가 있는 듯.(중복값은 안 나오므로)
		for(int i=0; set.size()<6; i++)
		{
			int lotto = (int)(Math.random()*45+1);
			
			set.add(lotto);
		}
		
		for(int i=0; arr.size()<6; i++)
		{
			int lotto1 = (int)(Math.random()*10+1);
			
			arr.add(lotto1);//Arraylist를 활용하면 중복값이 나옴.(로또 프로그램 제작으로는 적합하지 않음)
			
		}
		
		System.out.println(set);
		Collections.sort(arr);
		System.out.println(arr);
		
		
		
		
		
	    List list = new ArrayList(set);
	    Collections.sort(list);
	    System.out.println(list); 
	        
	    //6개 숫자 입력해서 숫자 맞추기 프로그램 만들면 꿀잼일 듯.
		
		
	}

}
=======
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class hashsetlotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		ArrayList arr = new ArrayList(6);
		
		
		//for(int i=0; i<6; i++) 이걸 활용하면 숫자 6개가 안 나오는 경우가 있는 듯.(중복값은 안 나오므로)
		for(int i=0; set.size()<6; i++)
		{
			int lotto = (int)(Math.random()*45+1);
			
			set.add(lotto);
		}
		
		for(int i=0; arr.size()<6; i++)
		{
			int lotto1 = (int)(Math.random()*10+1);
			
			arr.add(lotto1);//Arraylist를 활용하면 중복값이 나옴.(로또 프로그램 제작으로는 적합하지 않음)
			
		}
		
		System.out.println(set);
		Collections.sort(arr);
		System.out.println(arr);
		
		
		
		
		
	    List list = new ArrayList(set);
	    Collections.sort(list);
	    System.out.println(list); 
	        
	    //6개 숫자 입력해서 숫자 맞추기 프로그램 만들면 꿀잼일 듯.
		
		
	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
=======
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class hashsetlotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		ArrayList arr = new ArrayList(6);
		
		
		//for(int i=0; i<6; i++) 이걸 활용하면 숫자 6개가 안 나오는 경우가 있는 듯.(중복값은 안 나오므로)
		for(int i=0; set.size()<6; i++)
		{
			int lotto = (int)(Math.random()*45+1);
			
			set.add(lotto);
		}
		
		for(int i=0; arr.size()<6; i++)
		{
			int lotto1 = (int)(Math.random()*10+1);
			
			arr.add(lotto1);//Arraylist를 활용하면 중복값이 나옴.(로또 프로그램 제작으로는 적합하지 않음)
			
		}
		
		System.out.println(set);
		Collections.sort(arr);
		System.out.println(arr);
		
		
		
		
		
	    List list = new ArrayList(set);
	    Collections.sort(list);
	    System.out.println(list); 
	        
	    //6개 숫자 입력해서 숫자 맞추기 프로그램 만들면 꿀잼일 듯.
		
		
	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
