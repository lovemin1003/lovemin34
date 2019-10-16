import java.util.ArrayList;

class nc
{
	int nf;
	int getnf()
	{
		return nf;
	}
	
	@Deprecated //이것이 붙은 대상은 다른 걸로 대체되었으니 더 이상 쓰지 않을 것을 권한다는 의미(강제성은 없음)
	int of;
	
	
	@Deprecated
	int getof()
	{
		return of;
	}
	
}
public class annotationex2and3 {
	@SuppressWarnings("deprecation")//deprecation관련 경고를 억제
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		nc nc = new nc();
		

		 nc.of=10; //@Deprecated가 붙은 걸 사용

		System.out.println( nc.getof());//@Deprecated가 붙은 걸 사용(작동은 하는 듯)
	
		@SuppressWarnings("unchecked") // 지네릭스 관련 경고를 억제
		ArrayList<nc> list = new ArrayList(); // 타입을 지정하지 않음.
		list.add(nc);
	
	}

}
