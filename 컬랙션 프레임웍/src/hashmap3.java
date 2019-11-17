<<<<<<< HEAD

//이건 이해가 많이 필요한 듯.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap3 {

	static HashMap map = new HashMap();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		band("보컬","미나토 유키나","로젤리아");
		band("드럼","야마부키 사아야","포핀파티");
		band("드럼","우다가와 아코","로젤리아");
		band("기타","우시고메 리미","포핀파티");
		band("보컬","마루야마 아야","파스텔 파레트");
		band("기타","아오바 모카","애프터글로우");
		band("베이스","우에하라 히마리","애프터글로우");
		band("베이스","헬로 해피 월드");
		band("기타","파스텔 파레트");
		
		printlist();

	}

	

	//그룹명에 밴드명을 추가하는 메소드
	 static void band(String s1, String s2, String s3) 
	{
		// TODO Auto-generated method stub
		addGroup(s1);
		HashMap group = (HashMap)map.get(s1);
		group.put(s3, s2);
		
		
		
	}
	
	//그룹을 추가하는 메소드
	 static void addGroup(String s1) 
	{
		// TODO Auto-generated method stub
		if(!map.containsKey(s1))
		{
			map.put(s1, new HashMap());
		}
		
	}
	 
	 static void band(String s2, String s3) 
		{
		 band("??",s2,s3);
		}
	
	


	//밴드명 전체를 출력하는 메소드
    static void printlist() 
    {
		// TODO Auto-generated method stub
    	Set set = map.entrySet();
    	Iterator it = set.iterator();
    	
    	while(it.hasNext())
    	{
    		Map.Entry e = (Map.Entry)it.next();
    		
    		Set subSet = ((HashMap)e.getValue()).entrySet();
    		Iterator subit = subSet.iterator();
    		
    		System.out.println(e.getKey()+" "+subSet.size());
    		
    		while(subit.hasNext())
    		{
    			Map.Entry e2 = (Map.Entry)subit.next();
    			String bandname = (String)e2.getKey();
    			String name = (String)e2.getValue();
    			System.out.println(name+" "+bandname);
    		}
    	}
    	
		
	}

}
=======

//이건 이해가 많이 필요한 듯.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap3 {

	static HashMap map = new HashMap();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		band("보컬","미나토 유키나","로젤리아");
		band("드럼","야마부키 사아야","포핀파티");
		band("드럼","우다가와 아코","로젤리아");
		band("기타","우시고메 리미","포핀파티");
		band("보컬","마루야마 아야","파스텔 파레트");
		band("기타","아오바 모카","애프터글로우");
		band("베이스","우에하라 히마리","애프터글로우");
		band("베이스","헬로 해피 월드");
		band("기타","파스텔 파레트");
		
		printlist();

	}

	

	//그룹명에 밴드명을 추가하는 메소드
	 static void band(String s1, String s2, String s3) 
	{
		// TODO Auto-generated method stub
		addGroup(s1);
		HashMap group = (HashMap)map.get(s1);
		group.put(s3, s2);
		
		
		
	}
	
	//그룹을 추가하는 메소드
	 static void addGroup(String s1) 
	{
		// TODO Auto-generated method stub
		if(!map.containsKey(s1))
		{
			map.put(s1, new HashMap());
		}
		
	}
	 
	 static void band(String s2, String s3) 
		{
		 band("??",s2,s3);
		}
	
	


	//밴드명 전체를 출력하는 메소드
    static void printlist() 
    {
		// TODO Auto-generated method stub
    	Set set = map.entrySet();
    	Iterator it = set.iterator();
    	
    	while(it.hasNext())
    	{
    		Map.Entry e = (Map.Entry)it.next();
    		
    		Set subSet = ((HashMap)e.getValue()).entrySet();
    		Iterator subit = subSet.iterator();
    		
    		System.out.println(e.getKey()+" "+subSet.size());
    		
    		while(subit.hasNext())
    		{
    			Map.Entry e2 = (Map.Entry)subit.next();
    			String bandname = (String)e2.getKey();
    			String name = (String)e2.getValue();
    			System.out.println(name+" "+bandname);
    		}
    	}
    	
		
	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
