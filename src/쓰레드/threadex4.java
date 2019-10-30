package 쓰레드;

public class threadex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long starttime = System.currentTimeMillis();
		
		for(int i=0; i<1000; i++)
		{
			System.out.printf("%s",new String("츠무"));
		}
		System.out.println();
		System.out.print("소요시간1:"+(System.currentTimeMillis()-starttime)+"밀리 세컨드입니다.");
		System.out.println();
		
		for(int i=0; i<1000; i++)
		{
			System.out.printf("%s",new String("토노"));
		}
		System.out.println();
		System.out.print("소요시간2:"+(System.currentTimeMillis()-starttime)+"밀리 세컨드입니다.");


	}

}
