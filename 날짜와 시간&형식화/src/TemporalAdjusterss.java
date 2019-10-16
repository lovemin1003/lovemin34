import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

class DayAfterTomorrow implements TemporalAdjuster {

	@Override
	public Temporal adjustInto(Temporal temporal) {
		// TODO Auto-generated method stub
		return temporal.plus(2,ChronoUnit.DAYS);//2일을 더한다.
	}

}


public class TemporalAdjusterss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		LocalDate 다음일요일 = today.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println(다음일요일);
		
		//LocalDate today = LocalDate.now();
		LocalDate date = today.with(new DayAfterTomorrow());
		
		p(today);
		p(date);
		p(today.with(firstDayOfNextMonth())); //다음달 첫째 낳
		p(today.with(lastDayOfMonth())); //이번달 마지막 날
		p(today.with(previous(TUESDAY))); //지난주 화요일
		p(today.with(previousOrSame(TUESDAY))); //지난주 화요일(오늘 포함)
		p(today.with(dayOfWeekInMonth(4,SUNDAY))); //이번달 4번째 일요일
		

		
	}

	 

	static void p(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj);
	}

}
