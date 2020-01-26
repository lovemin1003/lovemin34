class point implements Cloneable // Cloneable �������̽��� ������ Ŭ���������� clone()�� ȣ���� �� �ִ�. �� �������̽��� �������� �ʰ� clone()�� ȣ���ϸ� ���ܰ� �߻���.
{
	int x,y;
	point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public String toString()
	{
		return "x:"+x+" y:"+y;
	}
	public Object clone()
	{
		Object obj = null;
		try
		{
			obj = super.clone(); //����ó���� �ʿ���.
		}
		catch(CloneNotSupportedException e)
		{
			
		}
		return obj;
	}
}
public class cloneex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point original = new point(3,5);
		point copy = (point)original.clone(); //�����ؼ� �� ��ü ����
		System.out.println(original);
		System.out.println(copy);

	}

}
