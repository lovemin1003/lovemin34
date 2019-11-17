package streamex6;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.Optional;
import java.util.stream.Collectors.*;
import java.util.stream.Stream;
import java.util.stream.*;


public class streamex6 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

//streamex3에 있는 클래스
		Student[] stuArr =
			{
				
						new Student("1", 3, 70),
						new Student("2", 2, 90),
						new Student("3", 2, 10),
						new Student("4", 1, 40),
						new Student("5", 3, 80)
						
			};
		
		//학생 이름만 뽑아서 List<String>에 저장
		List<String> names = Stream.of(stuArr).map(Student::getName).collect(Collectors.toList());
	    System.out.println(names);
		
	    //스트림을 배열로 변환
	    Student[] stuArr2 = Stream.of(stuArr).toArray(Student[]::new);
	    
	    for(Student s : stuArr2)
	    	System.out.println(s);
	    
	    //스트림을 Map<String, Student>로 변환. 학생 이름이 key
	    Map<String, Student> stuMap = Stream.of(stuArr)
	    		.collect(Collectors.toMap(s->s.getName(), p->p));
	
	    for(String name : stuMap.keySet())
	    	System.out.println(name+"-"+stuMap.get(name));
	    
	    long count = Stream.of(stuArr).collect(Collectors.counting());
	    long totalScore = Stream.of(stuArr).collect(Collectors.summingInt(Student::getTotalScore));
	    
    	System.out.println("count="+count);
    	System.out.println("totalScore="+totalScore);
    	
    	totalScore = Stream.of(stuArr).collect(Collectors.reducing(0, Student::getTotalScore, Integer::sum));
    	System.out.println("totalScore="+totalScore);

    	Optional<Student> topStudent = Stream.of(stuArr).collect
    			(Collectors.maxBy(Comparator.comparingInt(Student::getTotalScore)));
    	System.out.println("topStudent="+topStudent.get());
    	
    	IntSummaryStatistics stat = Stream.of(stuArr).collect
    			(Collectors.summarizingInt(Student::getTotalScore));
    	System.out.println(stat);
    	
    	
    	String stuNames = Stream.of(stuArr)
                .map(Student::getName)
                .collect(Collectors.joining(",","{","}"));
    	System.out.println(stuNames);




	    
	    
	}

}
//streamex1에 있는 클래스
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
