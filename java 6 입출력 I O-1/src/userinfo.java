//serialex1�� ���� userinfo Ŭ���� �ҽ�
public class userinfo implements java.io.Serializable 
{

	String name;
	String school;
	int age;
	
	public userinfo()
	{
		this("�ƿ��� ��ī","�ϳ׿�ī ���п� ",17);
	}

	public userinfo(String name, String school, int age) 
	{
		// TODO Auto-generated constructor stub
		this.name=name;
		this.school=school;
		this.age=age;
	}
	
	public String toString()
	{
		return "("+name+" "+school+" "+age+"��"+")";
	}
	
	
}
