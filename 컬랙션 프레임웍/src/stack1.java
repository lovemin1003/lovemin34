import java.util.Stack;

public class stack1 {
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		goURL("1.네이트");
		goURL("2.야후");
		goURL("3.네이버");
		goURL("4.다음");
		
		printStatus();
		
		goforward();
		//'앞으로' 버튼 누른 후(forward에 아무것도 없으므로 아무 변화가 일어나지 않음.)
		printStatus();
		
		goback();
		//뒤로가기 버튼 누른 후
		printStatus();
		
		goback();
		//'뒤로' 버튼 누른 후
		printStatus();
		
		goforward();
		//'앞으로' 버튼 누른 후
		printStatus();
		
		goURL("http://www.afreecatv.com/");
		//새 주소 이동 후
		printStatus();
		

	}

	private static void goforward() {
		// TODO Auto-generated method stub
		if(!forward.empty())
		{
			back.push(forward.pop());
		}
	}

	private static void goback() {
		// TODO Auto-generated method stub
		if(!back.empty())
		{
			forward.push(back.pop());
		}
	}

	private static void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("back:"+back);
		System.out.println("forward:"+forward);
		System.out.println("현재화면:"+back.peek());
		
	}

	private static void goURL(String url) {
		// TODO Auto-generated method stub
		back.push(url);
		if(!forward.empty())
		{
			forward.clear();
		}
		
	}

}
