
public class assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = (int)(Math.random()*4)+1;
		try
		{
			System.out.println("�Ѿ�� ��: "+doIt(i));
		}catch(AssertionError ae)
		{
			System.out.println("�����͸� Ȯ���ϼ��� "+ae.getMessage());
		}

	}

	private static int doIt(int a) {
		// TODO Auto-generated method stub
		
		switch(a)
		{
		case 1:
			System.out.println("1�� �Էµ�.");
			break;
		case 2:
			System.out.println("2�� �Էµ�.");
			break;
		case 3:
			System.out.println("3�� �Էµ�.");
			break;
			default:
				assert false: a;
			throw new AssertionError(a);
			
		}
		return a;
	}

}
