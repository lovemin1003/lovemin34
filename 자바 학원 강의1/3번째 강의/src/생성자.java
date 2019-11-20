class dc
{
	int x;
	public void setX(int x) {this.x = x;}
	public int getX() {return x;}
	
	public dc(int x)
	{
		this.x = x;
	}
}
public class »ý¼ºÀÚ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dc q = new dc(7);
		int n = q.getX();
		System.out.println(n);
		
		dc w = new dc(0);
		w.setX(2);
		
	}

}
