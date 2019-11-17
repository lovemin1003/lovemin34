

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class students1
{
	String name;
	boolean ismale; //성별
	int grade; //학년
    int ban; //반
    int score;
    
    students1(String name,boolean ismale, int grade,int ban,int score)
    {
    	this.name = name;
    	this.ismale = ismale;
    	this.grade = grade;
    	this.ban = ban;
    	this.score = score;

    }
    
    String getName() {return name;}
    boolean ismale() {return ismale;}
    int getGrade() {return grade;}
    int getBan() {return ban;}
    int getScore() {return score;}
    
    public String toString()
    {
    	return String.format("[%s,%s,%d학년 %d반 ,%3d점]", name, ismale ? "남":"여", grade, ban, score);
    }
    
    //groupingBy()에서 사용
    enum Level {A,B,C}//성적 별 등급

}


public class streamex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students[] stuArr =
			{
				
						new students("소나타",false, 3,4, 40),
						new students("에르고디엘",false, 1,5, 60),
						new students("코큐토스",true, 2,6, 50),
						new students("메일스트롬",true, 3,2, 75),
						new students("자라키엘",false, 2,6, 45),
						new students("버스커크",true, 1,2, 70),
						new students("피나",false, 3,1, 55),
						new students("글로리 메일스트롬",true, 2,2, 75),
						new students("세레나",false, 3,6, 85),
						new students("레본",true, 2,2, 75)
			};
		
		System.out.printf("1.단순분할(성별로 분할)%n");
		
		Map<Boolean, List<students>> stubysex = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(students::ismale));
		
		List<students> malestudent = stubysex.get(true);//남자
		List<students> femalestudent = stubysex.get(false);//여자
		
		for(students s : malestudent) System.out.println(s);
		for(students s : femalestudent) System.out.println(s);
		
		System.out.printf("%n2.단순분할+ 통계(성별 학생 수)%n");
		Map<Boolean,Long> stunumbysex = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(students::ismale,Collectors.counting()));
		
		System.out.println("남학생 수:"+stunumbysex.get(true));
		System.out.println("여학생 수:"+stunumbysex.get(false));

		System.out.printf("%n3.단순분할+ 통계(성별 1등)%n");
		Map<Boolean,Optional<students>> topscorebysex = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(students::ismale,Collectors.maxBy
						(Comparator.comparingInt(students::getScore))));

		System.out.println("남학생 1등:"+topscorebysex.get(true));
		System.out.println("여학생 1등:"+topscorebysex.get(false));

		Map<Boolean, students> topscorebysex2 = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(students::ismale,Collectors.
                            collectingAndThen(Collectors.maxBy( Comparator.comparingInt
                            		(students::getScore)),Optional::get)));

		System.out.println("남학생 1등:"+topscorebysex2.get(true));
		System.out.println("여학생 1등:"+topscorebysex2.get(false));

		System.out.printf("%n4.단순분할(성별 불합격자, 60점 미만)%n");
		
		Map<Boolean, Map<Boolean,List<students>>> failstubysex = Stream.of(stuArr).collect
   (Collectors.partitioningBy(students::ismale,Collectors.partitioningBy( s-> s.getScore()<60)));
		
		List<students> failmale = failstubysex.get(true).get(true);
		List<students> failfemale = failstubysex.get(false).get(true);
		
		for(students s : failmale) System.out.println(s);
		for(students s : failfemale) System.out.println(s);


	}

}
