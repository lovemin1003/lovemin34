

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class students1
{
	String name;
	boolean ismale; //����
	int grade; //�г�
    int ban; //��
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
    	return String.format("[%s,%s,%d�г� %d�� ,%3d��]", name, ismale ? "��":"��", grade, ban, score);
    }
    
    //groupingBy()���� ���
    enum Level {A,B,C}//���� �� ���

}


public class streamex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students[] stuArr =
			{
				
						new students("�ҳ�Ÿ",false, 3,4, 40),
						new students("�������",false, 1,5, 60),
						new students("��ť�佺",true, 2,6, 50),
						new students("���Ͻ�Ʈ��",true, 3,2, 75),
						new students("�ڶ�Ű��",false, 2,6, 45),
						new students("����Ŀũ",true, 1,2, 70),
						new students("�ǳ�",false, 3,1, 55),
						new students("�۷θ� ���Ͻ�Ʈ��",true, 2,2, 75),
						new students("������",false, 3,6, 85),
						new students("����",true, 2,2, 75)
			};
		
		System.out.printf("1.�ܼ�����(������ ����)%n");
		
		Map<Boolean, List<students>> stubysex = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(students::ismale));
		
		List<students> malestudent = stubysex.get(true);//����
		List<students> femalestudent = stubysex.get(false);//����
		
		for(students s : malestudent) System.out.println(s);
		for(students s : femalestudent) System.out.println(s);
		
		System.out.printf("%n2.�ܼ�����+ ���(���� �л� ��)%n");
		Map<Boolean,Long> stunumbysex = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(students::ismale,Collectors.counting()));
		
		System.out.println("���л� ��:"+stunumbysex.get(true));
		System.out.println("���л� ��:"+stunumbysex.get(false));

		System.out.printf("%n3.�ܼ�����+ ���(���� 1��)%n");
		Map<Boolean,Optional<students>> topscorebysex = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(students::ismale,Collectors.maxBy
						(Comparator.comparingInt(students::getScore))));

		System.out.println("���л� 1��:"+topscorebysex.get(true));
		System.out.println("���л� 1��:"+topscorebysex.get(false));

		Map<Boolean, students> topscorebysex2 = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(students::ismale,Collectors.
                            collectingAndThen(Collectors.maxBy( Comparator.comparingInt
                            		(students::getScore)),Optional::get)));

		System.out.println("���л� 1��:"+topscorebysex2.get(true));
		System.out.println("���л� 1��:"+topscorebysex2.get(false));

		System.out.printf("%n4.�ܼ�����(���� ���հ���, 60�� �̸�)%n");
		
		Map<Boolean, Map<Boolean,List<students>>> failstubysex = Stream.of(stuArr).collect
   (Collectors.partitioningBy(students::ismale,Collectors.partitioningBy( s-> s.getScore()<60)));
		
		List<students> failmale = failstubysex.get(true).get(true);
		List<students> failfemale = failstubysex.get(false).get(true);
		
		for(students s : failmale) System.out.println(s);
		for(students s : failfemale) System.out.println(s);


	}

}
