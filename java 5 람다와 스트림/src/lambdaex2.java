interface myfunction2
{
	void mymethod(); //public abstract void mymethod();
}
public class lambdaex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myfunction2 f = () ->{}; //myfunction2 f = (myfunction2)(()->{});

		Object obj = (myfunction2)(()->{});//Object타입으로 형변환이 됨.
		String str = ((Object)(myfunction2)(()->{})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
		  //System.out.println(()->{});//에러. 람다식은 Object타입으로 형변환 불가
		System.out.println((myfunction2)(()->{}));
		  //System.out.println((myfunction2)(()->{}).toString());//에러
		System.out.println(((Object)(myfunction2)(() -> {})).toString());
		

	}

}
