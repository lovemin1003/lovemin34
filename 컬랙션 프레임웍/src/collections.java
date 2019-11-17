<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import static java.util.Collections.*;


public class collections 
{

	public static void main(String[] args)
	{
		List list = new ArrayList();
		System.out.println(list);
		System.out.println();
		
		addAll(list, 1,2,3,4,5,6,7);
		System.out.println("값 부여");
		System.out.println(list);
		System.out.println();
		
		int i = binarySearch(list, 1);
		System.out.println("1이 저장된 위치를 반환");
		System.out.println(i);
		System.out.println();
		
		System.out.println("리스트 내 최대값,최소값,최대값의 반대값(최소값) 출력");
		System.out.println(max(list));
		System.out.println(min(list));
		System.out.println(max(list, reverseOrder()));
		System.out.println();
		
		rotate(list,3);
		System.out.println("오른쪽으로 3칸 이동");
		System.out.println(list);
		System.out.println();
		
		swap(list, 0,4);
		System.out.println("1번째, 5번째 값 교환");
		System.out.println(list);
		System.out.println();
		
		replaceAll(list, 3,9);
		System.out.println("3인 값을 9로 변경");
		System.out.println(list);
		System.out.println();
		
		Enumeration e = enumeration(list);
		System.out.println("리스트 복사");
		ArrayList list2 = list(e);
		System.out.println(list2);
		System.out.println();
		
		shuffle(list);
		System.out.println("결과값 위치를 임의로 변경");
		System.out.println(list);
		System.out.println();
		
		sort(list);
		System.out.println("정렬");
		System.out.println(list);
		System.out.println();
		
		sort(list, reverseOrder());
		System.out.println("역순정렬");
		System.out.println(list);
		System.out.println();
		
		fill(list,3);
		System.out.println("3으로 채움");
		System.out.println(list);
		System.out.println();
		
		List newList = nCopies(list.size(),9);
		System.out.println("새로운 list를 만들어서 9로 채워준다.(결과는 변경 불가)");
		System.out.println(newList);
		System.out.println();
		
		System.out.println("공통값이 없으면 true");
		System.out.println(disjoint(list,newList));
		System.out.println();
		
		copy(list, newList);
		System.out.println("리스트 복사");
		System.out.println(newList);
		System.out.println(list);
		System.out.println();
		
		
		
	}

}
=======
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import static java.util.Collections.*;


public class collections 
{

	public static void main(String[] args)
	{
		List list = new ArrayList();
		System.out.println(list);
		System.out.println();
		
		addAll(list, 1,2,3,4,5,6,7);
		System.out.println("값 부여");
		System.out.println(list);
		System.out.println();
		
		int i = binarySearch(list, 1);
		System.out.println("1이 저장된 위치를 반환");
		System.out.println(i);
		System.out.println();
		
		System.out.println("리스트 내 최대값,최소값,최대값의 반대값(최소값) 출력");
		System.out.println(max(list));
		System.out.println(min(list));
		System.out.println(max(list, reverseOrder()));
		System.out.println();
		
		rotate(list,3);
		System.out.println("오른쪽으로 3칸 이동");
		System.out.println(list);
		System.out.println();
		
		swap(list, 0,4);
		System.out.println("1번째, 5번째 값 교환");
		System.out.println(list);
		System.out.println();
		
		replaceAll(list, 3,9);
		System.out.println("3인 값을 9로 변경");
		System.out.println(list);
		System.out.println();
		
		Enumeration e = enumeration(list);
		System.out.println("리스트 복사");
		ArrayList list2 = list(e);
		System.out.println(list2);
		System.out.println();
		
		shuffle(list);
		System.out.println("결과값 위치를 임의로 변경");
		System.out.println(list);
		System.out.println();
		
		sort(list);
		System.out.println("정렬");
		System.out.println(list);
		System.out.println();
		
		sort(list, reverseOrder());
		System.out.println("역순정렬");
		System.out.println(list);
		System.out.println();
		
		fill(list,3);
		System.out.println("3으로 채움");
		System.out.println(list);
		System.out.println();
		
		List newList = nCopies(list.size(),9);
		System.out.println("새로운 list를 만들어서 9로 채워준다.(결과는 변경 불가)");
		System.out.println(newList);
		System.out.println();
		
		System.out.println("공통값이 없으면 true");
		System.out.println(disjoint(list,newList));
		System.out.println();
		
		copy(list, newList);
		System.out.println("리스트 복사");
		System.out.println(newList);
		System.out.println(list);
		System.out.println();
		
		
		
	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
