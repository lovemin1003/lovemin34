class cat
{
	int age;
	String name;
	cat(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public String toString()
	{
		return name+","+age;
	}
	
}
public class ����Ŭ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 cat[] cc = new cat[3];
 cc[0] = new cat(3,"����");
 cat c2 = new cat(4 , "����");
 cat c3 = new cat(2, "�����");
 cc[1] = c2;
		 cc[2] = c3;	 
		 System.out.println(cc[0]);
		 System.out.println(cc[1]);
		 System.out.println(cc[2]);
		
	}

}
