import java.util.Vector;

public class vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector(5);//용량(capacity)
		
		v.add(1);
		v.add(2);
		v.add(3);
		print(v);
		
		v.trimToSize();//빈 공간을 제거함.
		print(v);
		
		v.ensureCapacity(10);//용량 설정
		print(v);
		
		v.setSize(5);//사이즈 설정
		print(v);
		
		v.clear();//사이즈 제거
		print(v);

	}

	private static void print(Vector v) {
		// TODO Auto-generated method stub
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());//용량(capacity)
		System.out.println();
	}

}
