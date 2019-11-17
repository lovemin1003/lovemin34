import java.util.TreeSet;

public class treesetlotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		
		for(int i=0; ts.size()<6; i++)
		{
			int num = (int)(Math.random()*10+1);
			ts.add(num);
		}
		
		System.out.println(ts);

	}

}
