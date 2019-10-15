import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Period_Duration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date1 = LocalDate.of(2000, 11, 11);
		LocalDate date2 = LocalDate.of(2015, 12, 21);
		
		Period pe = Period.between(date1, date2);
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(pe);
		
		System.out.println(pe.get(ChronoUnit.YEARS));
		System.out.println(pe.get(ChronoUnit.MONTHS));
		System.out.println(pe.get(ChronoUnit.DAYS));
		
		//Period
		
		LocalTime time1 =LocalTime.of(11, 20,19,1);
		LocalTime time2 =LocalTime.of(21, 30,32,2);
		
		 Duration du = Duration.between(time1,time2); 
		 
     	System.out.println(time1);
		System.out.println(time2);
		System.out.println(du);
		
		LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
		
		
		System.out.println(tmpTime.getHour());
		System.out.println(tmpTime.getMinute());
		System.out.println(tmpTime.getSecond());
		System.out.println(tmpTime.getNano());
	}

}
