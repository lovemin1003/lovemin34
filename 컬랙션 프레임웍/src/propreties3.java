import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propreties3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Properties 담원 = new Properties();
		
		
		담원.setProperty("너구리", "탑");
		담원.setProperty("펀치", "정글");
		담원.setProperty("쇼메이커", "미드");
		담원.setProperty("뉴클리어", "원딜");
		담원.setProperty("beryl", "support");
		
		try
		{
		
			담원.store(new FileOutputStream("담원.txt"), "담원 게이밍,damwon gaming");//한글은 깨져보임.
			
			담원.storeToXML(new FileOutputStream("담원.xml"), "담원 게이밍");
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}//main의 끝

}
