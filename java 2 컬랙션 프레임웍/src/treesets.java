import java.util.TreeSet;

public class treesets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet ts = new TreeSet();
		
		ts.add("affree");
		ts.add("blank");
		ts.add("clid");
		ts.add("deft");
		ts.add("effort");
		ts.add("faker");
		ts.add("ganked");
		ts.add("gorila");
		ts.add("ggoong");
		
		String from = "b";
		String to = "g";

		//b부터 g까지(g로 시작하는 글자 제외)
		System.out.println(ts.subSet(from, to));
		//b부터 g까지(g로 시작하는 글자 포함)
		ts.add("gzzzz");
		ts.add("gZzzz");
		System.out.println(ts.subSet(from, to+"zzzz"));//대문자는 소문자를 우선시함.
		
		
	}

}
