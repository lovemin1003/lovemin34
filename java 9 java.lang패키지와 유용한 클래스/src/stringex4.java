import java.util.StringJoiner;

public class stringex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ani = "개,고양이,사자";
		String[] arr = ani.split(",");
		
		System.out.println(String.join("#", arr));
		
		StringJoiner sj = new StringJoiner("/","[","]");
		for(String s : arr)
			sj.add(s);
		System.out.println(sj.toString());

	}

}
