
public class randomex4 {

	final static int RECORD_NUM = 10;
	final static String TABLE_NAME ="TEST_TABLE";
	final static String[] CODE1 = {"010","011","012","013"};
	final static String[] CODE2 = {"����","����"};
	final static String[] CODE3 = {"10��","20��","30��"};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<RECORD_NUM; i++)
		{
			System.out.println("("+getrandarr(CODE1)+","
		                        +getrandarr(CODE2)+","
		                        +getrandarr(CODE3)+","
		                        +getrand(100,200)+")");//100-200 ������ ���� ��´�.
		}

	}


	


	private static String getrandarr(String[] code12) {
		// TODO Auto-generated method stub
		return code12[getrand(code12.length-1)]; //�迭�� ����� �� �� �ϳ��� ��ȯ�Ѵ�.
	}


	private static int getrand(int i) {
		// TODO Auto-generated method stub
		return getrand(0,i);
	}
	
	private static int getrand(int i, int j) {
		// TODO Auto-generated method stub
		return (int)(Math.random()*(Math.abs(i-j)+1))+Math.min(i, j);
	}

}
