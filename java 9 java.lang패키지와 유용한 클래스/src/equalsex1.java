
public class equalsex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		value v1 = new value(10);
		value v2 = new value(10);

		if(v1.equals(v2))
		{
			System.out.println("���� ����");
			System.out.println(v1);
			System.out.println(v2);
		}
		else
		{
			System.out.println("���� �ٸ�");
			System.out.println(v1);
			System.out.println(v2);
		}
		v1=v2;
		if(v1.equals(v2))
		{
			System.out.println("���� ����");
			System.out.println(v1);
			System.out.println(v2);
		}
		else
		{
			System.out.println("���� �ٸ�");
			System.out.println(v1);
			System.out.println(v2);
		}

	}

}

class value
{
	int value;
	
	value(int value)
	{
		this.value=value;
	}
}