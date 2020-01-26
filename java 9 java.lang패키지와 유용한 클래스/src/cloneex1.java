class point implements Cloneable // Cloneable 인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다. 이 인터페이스를 구현하지 않고 clone()을 호출하면 예외가 발생함.
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
			obj = super.clone(); //예외처리가 필요함.
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
		point copy = (point)original.clone(); //복제해서 새 객체 생성
		System.out.println(original);
		System.out.println(copy);

	}

}
