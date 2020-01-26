

class circle implements Cloneable
{
	points p;
	double r;
	
	circle(points p, double r)
	{
		this.p=p;
		this.r=r;
	}
	
	public circle shallowcopy()
	{
		Object obj = null;
		
		try
		{
			obj = super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			
		}
		return (circle)obj;
		
	}
	
	public circle deepcopy()
	{
		Object obj = null;
		
		try
		{
			obj = super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			
		}
		circle c = (circle)obj;
		c.p = new points(this.p.x, this.p.y);
		return c;
		
	}
	
	public String toString()
	{
		return "(p:"+p+" r:"+r+")";
	}
	
	
}

class points
{
	int x,y;
	
	points(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public String toString()
	{
		return "("+x+", "+y+")";
	}
}

public class shallowdeepcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c1 = new circle(new points(1,1),2.0);
		circle c2 = c1.shallowcopy();
		circle c3 = c1.deepcopy();
		
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		System.out.println("c3:"+c3);
		
		c1.p.x = 9;
		c1.p.y = 9;
		
		System.out.println("c1 º¯°æÈÄ");
		
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		System.out.println("c3:"+c3);

	}

}
