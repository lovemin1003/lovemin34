import java.awt.Point;
import java.util.Vector;

class ����Ʈ
{
	private int x,y;
	public ����Ʈ(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return "("+x +","+y+")";
	}
}
public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(4,4));
		v.add(new Point(14,4));
		v.add(new Point(4,41));
		
		
		
		
		
		
		
		//��� ��� ���� ����ϱ�
		for(int i =0; i<v.size(); i++)
		{
			Point q = v.get(i);
			System.out.println(q);
		}

	}
	}


