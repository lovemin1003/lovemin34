import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//����ȭ���� ���� ���󿡰� ��ӹ��� �ν��Ͻ������� ���� ����ȭ�� ������ ��.

class Superuserinfo {

	String name;
	String school;
	
	Superuserinfo()
	{
		this("���ڿ� ������","�ϳ׿�ī ���п�");
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
		this("��ٰ��� ���","�ϳ׿�ī ���п� ",17);
	}

	public userinfo2(String name, String school, int age) 
	{
		// TODO Auto-generated constructor stub
		super(name, school);
		this.age=age;
	}
	
	public String toString()
	{
		return "("+name+" "+school+" "+age+"��"+")";
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

