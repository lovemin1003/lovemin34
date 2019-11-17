interface myfunction3
{
	void mymethod(); //public abstract void mymethod();
}

class outer
{

	int val = 10; //outer.this.val
	class inner
	{
		int val = 20; //this.val
		
		void method(int i) // void method(final int i) 
		{
			int val = 30;//final int val = 30;
			//i = 10; // 에러. 상수의 값을 변경할 수 없음.
			myfunction3 f = () ->
			{
				System.out.println("i:"+i);
				System.out.println("val:"+val);
				System.out.println("this.val:"+ this.val);
				System.out.println("this.val:"+ ++this.val);
				System.out.println("outer.this.val:"+ outer.this.val);
				System.out.println("outer.this.val:"+ ++outer.this.val);
			};
			
			f.mymethod();
		}
	}
}
public class lambdaex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outer outer = new outer();
		outer.inner inner = outer.new inner();
		inner.method(100);

	}

}
