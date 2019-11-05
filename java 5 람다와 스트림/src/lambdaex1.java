interface myfunction
{
	void run(); //public abstract void run
}

public class lambdaex1 {

	static void execute(myfunction f)
	{
		f.run();
	}
	
	static myfunction getmyfunction()
	{
		myfunction f = () -> System.out.println("f3.run()");
		return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//람다식으로 myfunction의 run()을 구현
		myfunction f1 = ()  -> System.out.println("f1.run()");
		
		myfunction f2 = new myfunction()//익명 클래스로 run()을 구현	
				{
			public void run()//public을 반드시 붙여야 함.
			{
				System.out.println("f2.run");
			}
				};
				
		myfunction f3 = getmyfunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute( () -> System.out.println("run()"));

	}

}
