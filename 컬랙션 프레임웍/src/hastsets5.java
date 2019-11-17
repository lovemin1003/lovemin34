import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hastsets5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet 세트1 = new HashSet();
		ArrayList 세트1 = new ArrayList();
		//HashSet 세트2  = new HashSet();
		ArrayList 세트2 = new ArrayList();
		HashSet 합집합  = new HashSet();
		HashSet 교집합  = new HashSet();
		HashSet 차집합1  = new HashSet();
		HashSet 차집합2  = new HashSet();
		
		세트1.add("아트록스");
		세트1.add("사일러스");
		세트1.add("키아나");
		세트1.add("자야");
		세트1.add("라칸");
		System.out.println("1세트 픽:"+세트1);
		
		세트2.add("아트록스");
		세트2.add("사일러스");
		세트2.add("르블랑");
		세트2.add("이즈리얼");
		세트2.add("유미");
		System.out.println("2세트 픽:"+세트2);
		
		
		//교집합
		Iterator it = 세트2.iterator();
		
		while(it.hasNext())
		{ 
			Object 합=it.next();
			if(세트1.contains(합))
			{
				교집합.add(합);
			}
		}
		
		System.out.println("1,2세트 모두 나온 픽:"+교집합);
		
		//합집합
		Iterator it1 = 세트1.iterator();
		Iterator it2 = 세트2.iterator();
		while(it1.hasNext())
		{ 
			Object 첫번째픽 = it1.next();
			합집합.add(첫번째픽);
		}
		while(it2.hasNext())
		{ Object 두번째픽 = it2.next();
			합집합.add(두번째픽);
		}
		
		System.out.println("1,2세트 모두 나온 픽:"+합집합);
		
		//교집합
		Iterator it11 = 세트1.iterator();
		Iterator it12 = 세트2.iterator();
		while(it11.hasNext())
		{ 
			Object 첫번째 = it11.next();
			if(!세트2.contains(첫번째))
			{
				차집합1.add(첫번째);
			}
		}
		while(it12.hasNext())
		{ 
			Object 두번째 = it12.next();
			if(!세트1.contains(두번째))
			{
				차집합2.add(두번째);
			}
		}
		
		System.out.println("1세트에만 나온 픽:"+차집합1);
		System.out.println("2세트에만 나온 픽:"+차집합2);
		
	}

}
