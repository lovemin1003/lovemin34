class person
{
	int id;
	
	// valueŬ�������� equals�޼ҵ带 �������̵��Ͽ� �ּҰ� �ƴ� ��ü�� ����� ������ ���ϵ��� �����ϸ� �ȴ�.
	public boolean equals(Object obj)
	{
		if(obj != null && obj instanceof person)
		{
			return id==((person)obj).id;
		}
		else 
		{
			return false;
		}
		
		
	}
	
	person(int id)
	{
		this.id=id;
	}
}
public class equalsex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person v1 = new person(800);
		person v2 = new person(800);

		if(v1==v2)
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
