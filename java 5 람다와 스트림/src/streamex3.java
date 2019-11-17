import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamex3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student[] stuArr =
			{
				
						new Student("1", 3, 70),
						new Student("2", 2, 90),
						new Student("3", 2, 10),
						new Student("4", 1, 40),
						new Student("5", 3, 80)

						
			};
		
		Stream<Student> stuStream = Stream.of(stuArr);
		stuStream.sorted(Comparator.comparing(Student::getBan) //반별 정렬
				.thenComparing(Comparator.naturalOrder())) //기본 정렬
				.forEach(System.out::println);
		
		stuStream = Stream.of(stuArr); //스트림 재생성
		IntStream stuScoreStream = stuStream.mapToInt(Student::getTotalScore);
		
		IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
		System.out.println("count="+stat.getCount());
		System.out.println("sum="+stat.getSum());
		System.out.printf("average=%.2f%n",stat.getAverage());
		System.out.println("min="+stat.getMin());
		System.out.println("max="+stat.getMax());
		

	}

}

//streamex1에 있는 클래스
//class Student implements Comparable<Student>
//{
//    String name;
//    int ban;
//    int totalScore;
//    
//    Student(String name, int ban, int totalScore)
//    {
//    	this.name = name;
//    	this.ban = ban;
//    	this.totalScore = totalScore;
//    }
//    
//    public String toString()
//    {
//    	return String.format("[%s,%d,%d]", name, ban, totalScore).toString();
//    }
//    
//    String getName() { return name;}
//    int getBan() { return ban;}
//    int getTotalScore() { return totalScore;}
//
//    //총점 내림차순을 기본 정렬로 한다.
//	public int compareTo(Student o) {
//		return o.totalScore - this.totalScore;
//	}
//	
//}