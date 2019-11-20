package obj_array;

public class 사람 {
	
	String name;
	int age;
	String gender;
	
	사람(String name, int age, String gender)
	{
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	void info()
	{
		System.out.printf("이름:%s, 나이:%d세, 성별:%s\n", this.name, this.age, this.gender);
	}

}
