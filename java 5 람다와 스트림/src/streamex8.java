

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class students
{
	String name;
	boolean ismale; //성별
	int grade; //학년
    int ban; //반
    int score;
    
    students(String name,boolean ismale, int grade,int ban,int score)
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


public class streamex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students[] stuArr =
			{
				
						new students("소나타",false, 3,4, 40),
						new students("에르고디엘",false, 1,5, 60),
						new students("코큐토스",true, 2,6, 100),
						new students("메일스트롬",true, 3,2, 75),
						new students("자라키엘",false, 2,6, 45),
						new students("버스커크",true, 1,2, 70),
						new students("피나",false, 3,1, 55),
						new students("글로리 메일스트롬",true, 2,2, 75),
						new students("세레나",false, 3,6, 85),
						new students("레본",true, 2,2, 80)
			};
		
		System.out.printf("1.단순그룹화(반별 그룹화)%n");
		
		Map<Integer, List<students>> stubyban = Stream.of(stuArr)
				.collect(Collectors.groupingBy(students::getBan));
		
		for(List<students> ban: stubyban.values())
			{
			for(students s : ban)
				System.out.println(s);
			}
		
		
		System.out.printf("%n2.단순그룹화(성적별 그룹화)%n");
		Map<students.Level,List<students>> stubylevel = Stream.of(stuArr)
				.collect(Collectors.groupingBy(s->{if(s.getScore()>=80) return students.Level.A;
				else if(s.getScore()>=60) return students.Level.B;
				else return students.Level.C;
				}));
		
		TreeSet<students.Level> keyset = new TreeSet<>(stubylevel.keySet());
		
		for(students.Level key:keyset)
		{
			System.out.println("["+key+"]");
			
			for(students s:stubylevel.get(key))
			{
				System.out.println(s);
			}
			System.out.println();

		}
		
		
		System.out.printf("%n3.단순그룹화 + 통계(성적별 학생수)%n");
		Map<Boolean,Optional<students>> topscorebysex = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(students::ismale,Collectors.maxBy
						(Comparator.comparingInt(students::getScore))));

		//System.out.println("남학생 1등:"+topscorebysex.get(true));
		//System.out.println("여학생 1등:"+topscorebysex.get(false));

		Map<students.Level, Long> stucntbylevel = Stream.of(stuArr)
				.collect(Collectors.groupingBy(s->{if(s.getScore()>=80) return students.Level.A;
				else if(s.getScore()>=60) return students.Level.B;
				else return students.Level.C;
				},Collectors.counting()));
		
		for(students.Level key :stucntbylevel.keySet())
		{
			System.out.printf("[%s] - %d명,",key, stucntbylevel.get(key));
		}
		System.out.println();
		
//		for(List<students>level : stubylevel.values())
//		{		System.out.println();
//               
//		    for(students s : level)
//		    {
//			System.out.println(s);
//			}
//			
//		}
		

		

		System.out.printf("%n4.다중그룹화(학년, 반별)%n");
		
		Map<Integer, Map<Integer,List<students>>> stubygradeban = Stream.of(stuArr).collect
   (Collectors.groupingBy(students::getGrade,Collectors.groupingBy( students::getBan)));
		
		for(Map<Integer,List<students>> grade: stubygradeban.values())
		{
			for(List<students>ban:grade.values())
			{
				System.out.println();
				for(students s : ban)
				{
					System.out.println(s);
				}
				
			}
		}
		
         System.out.printf("%n5.다중그룹화+통계(학년, 반별 1등)%n");
		
		Map<Integer, Map<Integer,students>> topstubygradeban = Stream.of(stuArr).collect
   (Collectors.groupingBy(students::getGrade,Collectors.groupingBy( students::getBan,
		   Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt
				   (students::getScore)),Optional::get))));
		
		for(Map<Integer,students> ban: topstubygradeban.values())
		{
			for(students s : ban.values())
			{
				System.out.println(s);
			}
		}
		
        System.out.printf("%n6.다중그룹화+통계(학년, 반별 성적 그룹)%n");


		Map<String, Set<students.Level>> scoregroup = Stream.of(stuArr)
				.collect(Collectors.groupingBy(s->s.getGrade()+"-"+s.getBan(),
						Collectors.mapping(s->  {if(s.getScore()>=80) return students.Level.A;
						else if(s.getScore()>=60) return students.Level.B;
						else return students.Level.C;
						},Collectors.toSet()
								)));
		
		Set<String> keyset2 = scoregroup.keySet();
		
		for(String key : keyset2)
		{
			System.out.println("["+key+"]"+scoregroup.get(key));
		}
}
}