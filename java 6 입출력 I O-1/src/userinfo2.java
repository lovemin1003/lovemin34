import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//직렬화하지 않은 조상에게 상속받은 인스턴스변수에 대한 직렬화를 구현한 것.

class Superuserinfo {

	String name;
	String school;
	
	Superuserinfo()
	{
		this("하자와 츠구미","하네오카 여학원");
	}

	 Superuserinfo(String name, String school) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.school=school;
	}
}


public class userinfo2 extends Superuserinfo implements java.io.Serializable 
{

	int age;
	
	public userinfo2()
	{
		this("우다가와 토모에","하네오카 여학원 ",17);
	}

	public userinfo2(String name, String school, int age) 
	{
		// TODO Auto-generated constructor stub
		super(name, school);
		this.age=age;
	}
	
	public String toString()
	{
		return "("+name+" "+school+" "+age+"세"+")";
	}
	
	private void writeObject(ObjectOutputStream out)
	throws IOException
	{
		out.writeUTF(name);
		out.writeUTF(school);
		out.defaultWriteObject();

	}
	

	private void readObject(ObjectInputStream in)
	throws IOException ,ClassNotFoundException
	{
		name=in.readUTF();
		school=in.readUTF();
		in.defaultReadObject();

	}
	
	
}

