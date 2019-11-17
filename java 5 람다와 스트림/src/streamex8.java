

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
	boolean ismale; //����
	int grade; //�г�
    int ban; //��
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
    	return String.format("[%s,%s,%d�г� %d�� ,%3d��]", name, ismale ? "��":"��", grade, ban, score);
    }
    
    //groupingBy()���� ���
    enum Level {A,B,C}//���� �� ���

}


public class streamex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students[] stuArr =
			{
				
						new students("�ҳ�Ÿ",false, 3,4, 40),
						new students("�������",false, 1,5, 60),
						new students("��ť�佺",true, 2,6, 100),
						new students("���Ͻ�Ʈ��",true, 3,2, 75),
						new students("�ڶ�Ű��",false, 2,6, 45),
						new students("����Ŀũ",true, 1,2, 70),
						new students("�ǳ�",false, 3,1, 55),
						new students("�۷θ� ���Ͻ�Ʈ��",true, 2,2, 75),
						new students("������",false, 3,6, 85),
						new students("����",true, 2,2, 80)
			};
		
		System.out.printf("1.�ܼ��׷�ȭ(�ݺ� �׷�ȭ)%n");
		
		Map<Integer, List<students>> stubyban = Stream.of(stuArr)
				.collect(Collectors.groupingBy(students::getBan));
		
		for(List<students> ban: stubyban.values())
			{
			for(students s : ban)
				System.out.println(s);
			}
		
		
		System.out.printf("%n2.�ܼ��׷�ȭ(������ �׷�ȭ)%n");
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
		
		
		System.out.printf("%n3.�ܼ��׷�ȭ + ���(������ �л���)%n");
		Map<Boolean,Optional<students>> topscorebysex = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(students::ismale,Collectors.maxBy
						(Comparator.comparingInt(students::getScore))));

		//System.out.println("���л� 1��:"+topscorebysex.get(true));
		//System.out.println("���л� 1��:"+topscorebysex.get(false));

		Map<students.Level, Long> stucntbylevel = Stream.of(stuArr)
				.collect(Collectors.groupingBy(s->{if(s.getScore()>=80) return students.Level.A;
				else if(s.getScore()>=60) return students.Level.B;
				else return students.Level.C;
				},Collectors.counting()));
		
		for(students.Level key :stucntbylevel.keySet())
		{
			System.out.printf("[%s] - %d��,",key, stucntbylevel.get(key));
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
		

		

		System.out.printf("%n4.���߱׷�ȭ(�г�, �ݺ�)%n");
		
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
		
         System.out.printf("%n5.���߱׷�ȭ+���(�г�, �ݺ� 1��)%n");
		
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
		
        System.out.printf("%n6.���߱׷�ȭ+���(�г�, �ݺ� ���� �׷�)%n");


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