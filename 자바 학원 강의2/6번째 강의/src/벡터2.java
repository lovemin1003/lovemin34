import java.awt.Point;
import java.util.Vector;

class 포인트
{
	private int x,y;
	public 포인트(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return "("+x +","+y+")";
	}
}
public class 벡터2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(4,4));
		v.add(new Point(14,4));
		v.add(new Point(4,41));
		
		
		
		
		
		
		
		//모든 요소 정수 출력하기
		for(int i =0; i<v.size(); i++)
		{
			Point q = v.get(i);
			System.out.println(q);
		}

	}
	}


