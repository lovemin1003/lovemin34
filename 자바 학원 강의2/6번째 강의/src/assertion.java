
public class assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = (int)(Math.random()*4)+1;
		try
		{
			System.out.println("넘어온 값: "+doIt(i));
		}catch(AssertionError ae)
		{
			System.out.println("데이터를 확인하세요 "+ae.getMessage());
		}

	}

	private static int doIt(int a) {
		// TODO Auto-generated method stub
		
		switch(a)
		{
		case 1:
			System.out.println("1이 입력됨.");
			break;
		case 2:
			System.out.println("2이 입력됨.");
			break;
		case 3:
			System.out.println("3이 입력됨.");
			break;
			default:
				assert false: a;
			throw new AssertionError(a);
			
		}
		return a;
	}

}
