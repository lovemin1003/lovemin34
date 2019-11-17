package 별도;
enum Direction
{
	east(1,">"), south(2,"V"), west(3,"<"), north(4,"^");
	
	private static final Direction[] DIR_ARR = Direction.values();
	private final int value;
	private final String symbol;
	
	Direction(int value, String symbol)
	{
		this.value =value;
		this.symbol = symbol;
	}
	
	public int getValue()
	{
		return value;
	}
	public String getSymbol()
	{
		return symbol;
	}
	
	public static Direction of(int dir)
	{
		if(dir < 1 || dir >4)
		{
			throw new IllegalArgumentException("Invalid value :"+ dir);
		}
		return DIR_ARR[dir-1];
	}
	//방향을 회전시키는 메서드. num의 값만큼 90도씩 시계방향을 회전함.
	public Direction rotate(int num)
	{
		num = num % 4;
		
		if(num < 0)
		{
			num +=4;//num이 음수일 경우 시계 반대 방향으로 회전.
		}
		return DIR_ARR[(value-1+num) % 4];
		
	}
	
	public String toString()
	{
		return name()+getSymbol();
	}
}
public class enumex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(Direction d: Direction.values())
		{
			System.out.printf("%s=%d%n", d.name(),d.getValue());
		}
		System.out.println();
		
		Direction de = Direction.east;
		Direction dw = Direction.west;
		Direction ds = Direction.south;
		Direction dn = Direction.north;
		
		Direction d1 = Direction.of(1);
		Direction d2 = Direction.of(2);
		Direction d3 = Direction.of(3);
		Direction d4 = Direction.of(4);
		
		System.out.printf("d1=%s,%d%n", de.name(),de.getValue());
		System.out.printf("d1=%s,%d%n", dw.name(),dw.getValue());
		System.out.printf("d1=%s,%d%n", ds.name(),ds.getValue());
		System.out.printf("d1=%s,%d%n", dn.name(),dn.getValue());
		System.out.println();
		
		System.out.printf("d1=%s,%d%n", d1.name(),d1.getValue());
		System.out.printf("d1=%s,%d%n", d2.name(),d2.getValue());
		System.out.printf("d1=%s,%d%n", d3.name(),d3.getValue());
		System.out.printf("d1=%s,%d%n", d4.name(),d4.getValue());
		System.out.println();
		
		System.out.println(Direction.east.rotate(1));
		System.out.println(Direction.east.rotate(2));
		System.out.println(Direction.east.rotate(3));
		System.out.println(Direction.east.rotate(4));
		System.out.println();
		System.out.println(Direction.east.rotate(-1));
		System.out.println(Direction.east.rotate(-2));
		System.out.println(Direction.east.rotate(-3));
		System.out.println(Direction.east.rotate(-4));
		
	}

}
