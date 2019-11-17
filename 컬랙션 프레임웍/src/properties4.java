import java.util.Properties;

public class properties4 {

	//시스템 속성을 가져오는 방법을 보여주는 예제
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Properties syspro = System.getProperties();
		System.out.println("자바버전:"+syspro.getProperty("자바버전"));
		System.out.println("사용자 언어:"+syspro.getProperty("사용자 언어"));
		syspro.list(System.out);

	}

}
