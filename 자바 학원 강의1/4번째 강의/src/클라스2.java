class Persons
{
	public String name;
	public int age;
	public int Age;
	public Persons(String s)
	{
		name = s;
	}
	public void setage(int n)
	{
		age = n;
		n++;
	}
	public void setname(String p)
	{
		name = p;
	}
	public void setAge(mi i)
	{
		Age = i.val;
		i.val++;
	}
	
}

class mi
{
	int val;
	mi(int i)
	{
		val = i;
	}
}

class ce
{
	public static void cp(Persons p)
	{
		p = new Persons("새 사람1");
		
	}
	public static void cp1(Persons p)
	{
		p.setname("새 사람2");
		
	}
}
public class 클라스2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persons z = new Persons("god");
		int a = 42;
		mi b = new mi(24);
		z.setage(a);
z.setAge(b);
		System.out.println(a);
		System.out.println(b.val);
		
		Persons p = new Persons("첫 사람");
		cp(p);
		System.out.println(p.getname());
		
		cp1(p);
		System.out.println(p.getname());
	}
	//4회차 강의자료보고 수정하자. ㅅㅂ

}
