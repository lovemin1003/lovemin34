import java.util.Comparator;
import java.util.stream.Stream;

public class streamex1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stream<Student> studentStream = Stream.of
				(
				
						new Student("1", 3, 70),
						new Student("2", 2, 90),
						new Student("3", 2, 10),
						new Student("4", 1, 40),
						new Student("5", 3, 80)

						
				);
		studentStream.sorted(Comparator.comparing(Student::getBan) //반별 정렬
				.thenComparing(Comparator.naturalOrder())) //기본 정렬
				.forEach(System.out::println);

	}

}

class Student implements Comparable<Student>
{
    String name;
    int ban;
    int totalScore;
    
    Student(String name, int ban, int totalScore)
    {
    	this.name = name;
    	this.ban = ban;
    	this.totalScore = totalScore;
    }
    
    public String toString()
    {
    	return String.format("[%s,%d,%d]", name, ban, totalScore).toString();
    }
    
    String getName() { return name;}
    int getBan() { return ban;}
    int getTotalScore() { return totalScore;}

    //총점 내림차순을 기본 정렬로 한다.
	public int compareTo(Student o) {
		return o.totalScore - this.totalScore;
	}
	
}
