class Variable{
	int a=5;
	
public void printNum(int c)
 {
	int b = 1;
	System.out.println("�������:"+a);
	System.out.println("�������:"+b);
	System.out.println("�������:"+c);
 }
}

class Person
{
	public String name;
	public int age;
	
	public Person( String s, int q)
	
	{
		name = s;
		age = q;
	}
	
	public String getname()
	{
		return name;
		
	}
	public int getage()
	{
		return age;
		
	}
}
class pas
{
	public String name;
	public int age;
	
	public pas(String n, int a)
	{
		name = n;
		age = a;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
}
public class Ŭ�����Ͱ�ü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variable b = new Variable();
		b.printNum(3);
		
		Person p;
	    p = new Person("ī��",14);
		System.out.println(p.getname()+","+p.getage());
		p = new Person("ĳ��",14);
		System.out.println(p.getname()+","+p.getage());
		
		pas d = new pas("������", 15);
		System.out.println(d.getname()+","+d.getage());
	}

}
