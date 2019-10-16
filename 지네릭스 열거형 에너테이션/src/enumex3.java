enum Transportation
{
	
	bus(100)
	{
		int fare(int distance)
		{
			return distance*BASIC_FARE;
		}
	},
	train(120)
	{
		int fare(int distance)
		{
			return distance*BASIC_FARE;
		}
	},
	ship(200)
	{
		int fare(int distance)
		{
			return distance*BASIC_FARE;
		}
	},
	plane(180)
	{
		int fare(int distance)
		{
			return distance*BASIC_FARE;
		}
	};
	protected final int BASIC_FARE;//protected로 해야 각 상수에서 접근 가능
	
	Transportation(int basicfare)
	{
		BASIC_FARE = basicfare;
	}
	
	abstract int fare(int distance);//거리에 따른 요금 계산
	

	
	
}
public class enumex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bus fare="+Transportation.bus.fare(100));
		System.out.println("train fare="+Transportation.train.fare(100));
		System.out.println("ship fare="+Transportation.ship.fare(100));
		System.out.println("plane fare="+Transportation.plane.fare(100));

	}

}
