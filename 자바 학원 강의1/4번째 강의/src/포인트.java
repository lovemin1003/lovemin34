class point
{
	int x,y;
	void set(int x, int y)
	{
		this.x = x;
		this.y = y;
		
	}
	void sp()
	{
		System.out.println(" "+x+","+y);
	}
}

class cp extends point
{
	String color;
	void setcolor(String color)
	{
		this.color=color;
	}
	void scp()
	{
		System.out.print(color);
		sp();
	}
}

public class Æ÷ÀÎÆ® {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cp cc = new cp();
cc.set(3, 42);
cc.setcolor("blue");
cc.scp();
	}

}
