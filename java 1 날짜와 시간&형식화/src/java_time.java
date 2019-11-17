import java.time.*;
public class java_time {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today=LocalDate.now();//오늘 날짜
		System.out.print(today+" ");

		LocalTime now=LocalTime.now();//지금 시각
		System.out.print(now+"\n");
		
		LocalDateTime ldt=LocalDateTime.of(today, now);//오늘 날짜, 지금 시각 융합.
		System.out.println(ldt);
		
		LocalDate date = ldt.toLocalDate();//융합 해제1(date)
		System.out.println(date);
		

		LocalTime now2=ldt.toLocalTime();//융합 해제2(time)
		System.out.print(now2+"\n");
		
		LocalDateTime ldt2=today.atTime(now);//오늘 날짜, 지금 시각 융합 2.
		System.out.println(ldt2);
		
		LocalDate 신라창성=LocalDate.of(2019,10,12);//날짜 조정
		System.out.println(신라창성);
		
		LocalTime 뱅ex =LocalTime.of(12, 00);
		System.out.println(뱅ex);
		
		Instant 이마 = Instant.now();//오늘 날짜, 시각
		System.out.println(이마);
		
		ZoneId zone= ZoneId.of("Asia/Tokyo");//도쿄(일본)의 현재 시각
		ZonedDateTime zdt = ZonedDateTime.now();
		
		
	}

}
