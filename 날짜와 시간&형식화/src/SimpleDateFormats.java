import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;

public class SimpleDateFormats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date today= new Date();//현재 날짜, 시각을 나타냄.
		
		//Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat sim1 = new SimpleDateFormat("yyyy년MM월dd일");
		SimpleDateFormat sim2 = new SimpleDateFormat("E요일");
		SimpleDateFormat sim3 = new SimpleDateFormat("mm분");
		SimpleDateFormat sim4 = new SimpleDateFormat("W번째 주");
		SimpleDateFormat sim5 = new SimpleDateFormat("D번째 날");
		SimpleDateFormat sim6 = new SimpleDateFormat("d번째 날");
		SimpleDateFormat sim7 = new SimpleDateFormat("yyyy/MM/dd");
		
		
		
		
		System.out.println(sim1.format(today));
		System.out.println(sim2.format(today));
		System.out.println(sim3.format(today));
		System.out.println(sim4.format(today));
		System.out.println(sim5.format(today));
		System.out.println(sim6.format(today));
		
		
		try 
		{
			Date today1 = sim1.parse(sim1.format(today));
			System.out.println(sim7.format(today1));
		} 
		catch (ParseException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String 패턴 = "yyyy/MM/dd";
		SimpleDateFormat sim10 = new SimpleDateFormat(패턴);
		Scanner sc = new Scanner(System.in);
		
		Date dt = null;
		
		
		System.out.println("년월일을 적으시오.(예시:2000/10/24)");
		
		while(sc.hasNext())
		{
			
			try {
				
				dt=sim10.parse(sc.next());
				break;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("다시 적으시오.");
				System.out.println("년월일을 적으시오.(예시:2000/10/24)");
			}
		}
		
		
		System.out.println(sim10.format(dt));
		
		String a= sim10.format(dt);
		
		//Calendar cal = Calendar.getInstance();
		
		//cal.get(Calendar.DATE);
		
		SimpleDateFormat sim11 = new SimpleDateFormat("MM");
		
		sim11.format(dt);
		
		
		System.out.println(a);
		System.out.println(sim11.format(dt));
		
		switch(sim11.format(dt))
		{
		case "1":
			System.out.println("1월");
			break;
			default:
				System.out.println("?월");
		
		}
		
		
	}

}
