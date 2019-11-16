abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T>
{
	static int id =1;
	int ordinal;
	String name ="";
	
	public int ordinal()
	{
		return ordinal;
	}
	
	MyEnum(String name)
	{
		this.name = name;
		ordinal = id++; //객체 생성시 id의 값을 증가시킴.
	}
	
	public int compareTo(T t)
	{
		return ordinal - t.ordinal(); // 오류. 타입 T에 ordinal()이 있는지 알 수 없음.
	}
}
abstract class MyTransportation extends MyEnum
{
//윗 순서대로 id의 값이 정해지는 듯.
	static final MyTransportation train = new MyTransportation("train",120) //1
	{
		int fare(int distance)
		{
			return distance*BASIC_FARE;
		}
	};
	
	static final MyTransportation bus = new MyTransportation("bus",100)//2
	{
		int fare(int distance)
		{
			return distance*BASIC_FARE;
		}
	};
	
	static final MyTransportation ship = new MyTransportation("ship",200)//3
	
	{
		int fare(int distance)
		{
			return distance*BASIC_FARE;
		}
	};
	static final MyTransportation plane = new MyTransportation("plane",180)//4
	{
		int fare(int distance)
		{
			return distance*BASIC_FARE;
		}
	};
	protected final int BASIC_FARE;//protected로 해야 각 상수에서 접근 가능
	
	abstract int fare(int distance);//거리에 따른 요금 계산(추상메소드)
	
	private MyTransportation(String name, int basicFare) {
		super(name);
		BASIC_FARE = basicFare;
	}
	
	public String name()
	{
		return name;
	}
	public String toString()
	{
		return name;
	}
	

	
	
}
public class enumex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTransportation t1 = MyTransportation.train;
		MyTransportation t2 = MyTransportation.train;
		MyTransportation t3 = MyTransportation.bus;
		MyTransportation t4 = MyTransportation.ship;
		MyTransportation t5 = MyTransportation.plane;
        MyTransportation t6 = MyTransportation.bus;
		MyTransportation t7 = MyTransportation.train;

        
        System.out.printf("t1=%s, %d%n", t1.name(),t1.ordinal());
        System.out.printf("t2=%s, %d%n", t2.name(),t2.ordinal());
        System.out.printf("t3=%s, %d%n", t3.name(),t3.ordinal());
        System.out.printf("t4=%s, %d%n", t4.name(),t4.ordinal());
        System.out.printf("t5=%s, %d%n", t5.name(),t5.ordinal());
        System.out.printf("t6=%s, %d%n", t6.name(),t6.ordinal());
        System.out.printf("t7=%s, %d%n", t7.name(),t7.ordinal());

        

	}

}
