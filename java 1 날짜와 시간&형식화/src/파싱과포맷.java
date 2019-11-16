import java.time.ZonedDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.*;

public class 파싱과포맷 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ZonedDateTime zdt = ZonedDateTime.now();
		
		String[] patternArr=
		{
			"yyyy-MM-dd a HH:mm:ss E요일",
				"올해의 D번쨰 날",
			"이번달의 d번쨰 날",
			"올해의 w번쨰 주",
			"이번달의 W번쨰 주",
			"이번달의 W번쨰 E요일"
				
				
			
		};
		
		for (String p:patternArr)
		{
			
			DateTimeFormatter dtf=DateTimeFormatter.ofPattern(p);
			System.out.println(zdt.format(dtf));
		}
		
		System.out.println();
		
		LocalDate newyear= LocalDate.parse("2016-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
		
		LocalDate date = LocalDate.parse("2001-12-11");
		LocalTime time = LocalTime.parse("22:43:19");
		LocalDateTime datetime = LocalDateTime.parse("2001-12-11T22:43:19");
		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		LocalDateTime endofyear= LocalDateTime.parse("2015-12-31 23:55:55",pattern);
		
		System.out.println(newyear);
		System.out.println(date);
		System.out.println(time);
		System.out.println(datetime);
		System.out.println(endofyear);
		
		
		
		
	}

}
