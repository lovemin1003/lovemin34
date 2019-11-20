import java.util.Vector;

public class 벡터 {

	public static void main(String[] args) {
		// 정수 값만 다루는 제네릭 벡터 생성
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(4);
		v.add(3);
		v.add(-3);
		
		//벡터 중간에 삽입하기
		v.add(2,90);//3와 -3 사이에 정수 90 삽입
		
		System.out.println("벡터 내의 요소 객체 수:"+v.size());
		System.out.println("벡터의 현재 용량:"+v.capacity());
		
		//모든 요소 정수 출력하기
		for(int i =0; i<v.size(); i++)
		{
			int q = v.get(i);
			System.out.println(q);
		}

	}

}
