import java.util.TreeSet;

public class treesets2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet ts = new TreeSet();
		int[] score = {10,20,30,40,50,60,70,80,90,100};
		
		for(int i=0; i<score.length; i++)
		{
			ts.add(score[i]);
		}
		
		//50미만
		System.out.println(ts.headSet(50));
		//50이상
		System.out.println(ts.tailSet(50));
		
		
		

	}

}
