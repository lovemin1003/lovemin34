
public class wrapperex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		
		//기본형을 참조형으로 형변환(형변환 생략 가능)
		Integer intg =(Integer)i;
		Object obj = (Object)i;
		
		Long lng = 100L;
		
		int i2 = intg +10; //참조형과 기본형간의 연산 가능
		long l = intg +lng;//참조형간 덧셈도 가능
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2;//참조형을 기본형으로 형변환도 가능(형변환 생략 가능)
		
		Integer intg3 = intg2 +i3;
		
		System.out.println(i);
		System.out.println(intg);
		System.out.println(obj);
		System.out.println(lng);
		System.out.println(i2);
		System.out.println(l);
		System.out.println(intg2);
		System.out.println(i3);
		System.out.println(intg3);
	}

}
