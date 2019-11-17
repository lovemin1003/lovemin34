//serialex1에 쓰일 userinfo 클래스 소스
public class userinfo implements java.io.Serializable 
{

	String name;
	String school;
	int age;
	
	public userinfo()
	{
		this("아오바 모카","하네오카 여학원 ",17);
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
		return "("+name+" "+school+" "+age+"세"+")";
	}
	
	
}
