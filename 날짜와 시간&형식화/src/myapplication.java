import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;



public class myapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calendar cal = new GregorianCalendar();
		Calendar cal =Calendar.getInstance();
		
		System.out.println("오늘은 "+cal.get(Calendar.YEAR)+"년");
		System.out.println("오늘은 "+(cal.get(Calendar.MONTH)+1)+"월");
		System.out.println("오늘은 "+cal.get(Calendar.DATE)+"일");
		
		Calendar cal1 =Calendar.getInstance();
		cal1.set(2019,8,16);
		System.out.println("오늘은 "+String(cal1));
		Calendar cal2 =Calendar.getInstance();
		System.out.println("오늘은 "+today(cal2));
		
		String[] day = {" ","일","월","화","수","목","금","토"};
		System.out.println("오늘은 "+day[cal2.get(Calendar.DAY_OF_WEEK)]+"요일");
		Calendar cal3 =Calendar.getInstance();
		cal3.set(Calendar.DATE,10);
		System.out.println(cal3.get(Calendar.DATE));
		
		Calendar cal4 = Calendar.getInstance();
		
		cal4.set(2018,10,30);
		
		System.out.println(sigma(cal4));
		cal4.add(Calendar.DATE,1);//날짜 더할 때.
		System.out.println(sigma(cal4));
		cal4.add(Calendar.MONTH,-6);//6개월 전.
		System.out.println(sigma(cal4));
		cal4.roll(Calendar.DATE,30);//일 중심으로 돌고 돔...(29일 30일->1일 2일)
		System.out.println(sigma(cal4));
		cal4.add(Calendar.DATE,29);//29일 이후.
		System.out.println(sigma(cal4));
		cal4.roll(Calendar.MONTH,20);//월 중심으로 돌고 돔...(11월 12월->1월 2월)
		System.out.println(sigma(cal4));
		
		
	}
	
	private static String sigma(Calendar cal4) {
		// TODO Auto-generated method stub
		return cal4.get(Calendar.YEAR)+"년"+(cal4.get(Calendar.MONTH)+1)+"월"+cal4.get
				(Calendar.DATE)+"일";
	}

	private static String today(Calendar cal2) {
		// TODO Auto-generated method stub
		return cal2.get(Calendar.YEAR)+"년"+(cal2.get(Calendar.MONTH)+1)+"월"+cal2.get(Calendar.DATE)+"일";
	}



	private static String String(Calendar cal1) {
		// TODO Auto-generated method stub
		return cal1.get(Calendar.YEAR)+"년"+(cal1.get(Calendar.MONTH)+1)+"월"+cal1.get(Calendar.DATE)+"일";
	}

	

}
