
class SS
{
	int id;
	public SS(int x) {this.id = x; }
	public void set(int x){this.id = x; }
	public int get() {return this.id; }
}

public class a_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SS q = new SS(2);
		SS w = new SS(6);
		SS e = new SS(4);
		q.set(3);
		w.set(1);
		e.set(8);
		System.out.print(q.id);
		System.out.print(w.id);
		System.out.print(e.id);

	}

}
