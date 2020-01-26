class person
{
	int id;
	
	// value클래스에서 equals메소드를 오버라이딩하여 주소가 아닌 객체에 저장된 내용을 비교하도록 변경하면 된다.
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
			System.out.println("서로 같음");
			System.out.println(v1);
			System.out.println(v2);
		}
		else
		{
			System.out.println("서로 다름");
			System.out.println(v1);
			System.out.println(v2);
		}
		
		
		if(v1.equals(v2))
		{
			System.out.println("서로 같음");
			System.out.println(v1);
			System.out.println(v2);
		}
		else
		{
			System.out.println("서로 다름");
			System.out.println(v1);
			System.out.println(v2);
		}

	}

}
