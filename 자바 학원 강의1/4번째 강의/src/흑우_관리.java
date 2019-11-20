import java.util.*;



public class 흑우_관리 {
	
	static final int max=100; //최대 흑우 수
	static String[] namelist = new String[max];
	static char[] genderlist = new char[max];
	static String[] emaillist = new String[max];
	static int[] birthyearlist = new int[max];
	
	static int index = -1;
	static int count = 0;
	
	static Scanner scan = new Scanner(System.in);
	
	//고객 정보 입력 함수
	public static void icd()
	{
		System.out.print("이름: ");
		String name = scan.next();
		System.out.print("남자? 여자?(m,f)");
	char gender =scan.next().charAt(0);
	System.out.print("이메일: ");
	String email = scan.next();
	System.out.print("출생년도: ");
	int birthyear = scan.nextInt();
	
	namelist[count] = name;
	genderlist[count] = gender;
	emaillist [count] = email;
	birthyearlist[count] = birthyear;
	
	count++;
	index++;
	
		}
	
	public static void pci(int index)
	{
		System.out.println(namelist[index]);
		System.out.println(genderlist[index]);
		System.out.println(emaillist[index]);
		System.out.println(birthyearlist[index]);
	}
	public static void ucd(int index)//update
	{
		System.out.print("이름: ");
		namelist[index] = scan.next();
		System.out.print("남자? 여자?(m,f)");
		genderlist[index] = scan.next().charAt(0);
		System.out.print("이메일: ");
		emaillist[index] = scan.next();
		System.out.print("출생년도: ");
		birthyearlist[index] = scan.nextInt();
	}
	public static void dcd(int index)//delete
	{
		for(int i =index; i<count-1; i++)
		{
			namelist[i] = namelist[i+1];
			genderlist[i] =genderlist[i+1];
			emaillist[i] = emaillist[i+1];
			birthyearlist[i] = birthyearlist[i+1];
			
		}
		count--;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.printf("흑우 %d마리, 인덱스: %d\n", count, index);
			System.out.println("메뉴를 입력하시오.(정보 입력:i, 이전 정보 출력:p, 다음 정보 출력:n, 현재 정보 출력:c,정보 수정 :u, 정보 삭제: d, 종료 :q)");
			String menu = scan.next();
			menu = menu.toLowerCase();
			switch(menu.charAt(0))
			{
			case 'i':
				System.out.println("흑우 정보 입력 시작.");
				icd();
				break;
			case 'p':
				System.out.println("이전 정보 출력.");
				if(index<=0)
				{
					System.out.println("그런거 없음.");
				}
				else
				{
					index--;
					pci(index);
					
				}
				break;
			case 'n':
				System.out.println("다음 정보 출력.");
				if(index>=count-1)
				{
					System.out.println("그런거 없음.");
				}
				else
				{
					index++;
					pci(index);
				}
				break;
			case 'c':
				System.out.println("현재 데이터 출력.");
				if(index<0)
				{
					System.out.println("그런거 없음.");
				}
				else
				{
					pci(index);
				}
				break;
				
			case 'u':
				System.out.println("정보 수정.");
				if((index>=0)&&(index<count))
				{
					System.out.println(index+"번째 데이터 수정");
					ucd(index);
				}
				else
				{
					System.out.println("수정 자료가 선택 안 됨.");
				}
				break;
			case 'd':
				System.out.println("정보 제거.");
				if((index>=0)&&(index<count))
				{
					System.out.println(index+"번째 데이터 삭제");
					dcd(index);
				}
				else
				{
					System.out.println("삭제 자료가 선택 안 됨.");
				}
				break;
			case 'q':
				System.out.println("종료함.");
				System.exit(0);
				break;
			default:
				System.out.println("잘못 입력함.");
				break;
			}
		}
		
		

	}

}
