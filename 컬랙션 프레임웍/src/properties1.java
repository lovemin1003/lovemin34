<<<<<<< HEAD
<<<<<<< HEAD
import java.util.Enumeration;
import java.util.Properties;

public class properties1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties 담원 = new Properties();
		
		//담원에 키와 값을 저장함.
		담원.setProperty("너구리", "탑");
		담원.setProperty("펀치", "정글");
		담원.setProperty("쇼메이커", "미드");
		담원.setProperty("뉴클리어", "원딜");
		
		//담원에 저장된 요소들을 Enumeration을 이용해서 출력한다.
		Enumeration e = 담원.propertyNames();
		
		while(e.hasMoreElements())
		{
			String element = (String)e.nextElement();
			System.out.println(element+"="+담원.getProperty(element));
		}
		
		
		담원.setProperty("쇼메이커", "서폿");//쇼메이커의 포지션(값)을 서폿으로 바꿈.
		System.out.println("쇼메이커->"+담원.getProperty("쇼메이커"));
		System.out.println("너구리->"+담원.getProperty("너구리","정글"));//값 변경은 안 되는 듯.
		System.out.println("베릴->"+담원.getProperty("베릴","서폿"));//베릴이라는 키가 없었기에 디폴트 포지션(값)으로 지정한 서폿으로 출력됨.
	
		System.out.println(담원);//담원에 저장된 요소를 저장.
		담원.list(System.out);//담원에 저장된 요소를 화면에 출력함.
	}

}
=======
import java.util.Enumeration;
import java.util.Properties;

public class properties1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties 담원 = new Properties();
		
		//담원에 키와 값을 저장함.
		담원.setProperty("너구리", "탑");
		담원.setProperty("펀치", "정글");
		담원.setProperty("쇼메이커", "미드");
		담원.setProperty("뉴클리어", "원딜");
		
		//담원에 저장된 요소들을 Enumeration을 이용해서 출력한다.
		Enumeration e = 담원.propertyNames();
		
		while(e.hasMoreElements())
		{
			String element = (String)e.nextElement();
			System.out.println(element+"="+담원.getProperty(element));
		}
		
		
		담원.setProperty("쇼메이커", "서폿");//쇼메이커의 포지션(값)을 서폿으로 바꿈.
		System.out.println("쇼메이커->"+담원.getProperty("쇼메이커"));
		System.out.println("너구리->"+담원.getProperty("너구리","정글"));//값 변경은 안 되는 듯.
		System.out.println("베릴->"+담원.getProperty("베릴","서폿"));//베릴이라는 키가 없었기에 디폴트 포지션(값)으로 지정한 서폿으로 출력됨.
	
		System.out.println(담원);//담원에 저장된 요소를 저장.
		담원.list(System.out);//담원에 저장된 요소를 화면에 출력함.
	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
=======
import java.util.Enumeration;
import java.util.Properties;

public class properties1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties 담원 = new Properties();
		
		//담원에 키와 값을 저장함.
		담원.setProperty("너구리", "탑");
		담원.setProperty("펀치", "정글");
		담원.setProperty("쇼메이커", "미드");
		담원.setProperty("뉴클리어", "원딜");
		
		//담원에 저장된 요소들을 Enumeration을 이용해서 출력한다.
		Enumeration e = 담원.propertyNames();
		
		while(e.hasMoreElements())
		{
			String element = (String)e.nextElement();
			System.out.println(element+"="+담원.getProperty(element));
		}
		
		
		담원.setProperty("쇼메이커", "서폿");//쇼메이커의 포지션(값)을 서폿으로 바꿈.
		System.out.println("쇼메이커->"+담원.getProperty("쇼메이커"));
		System.out.println("너구리->"+담원.getProperty("너구리","정글"));//값 변경은 안 되는 듯.
		System.out.println("베릴->"+담원.getProperty("베릴","서폿"));//베릴이라는 키가 없었기에 디폴트 포지션(값)으로 지정한 서폿으로 출력됨.
	
		System.out.println(담원);//담원에 저장된 요소를 저장.
		담원.list(System.out);//담원에 저장된 요소를 화면에 출력함.
	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
