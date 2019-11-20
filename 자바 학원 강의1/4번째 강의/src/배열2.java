


public class ¹è¿­2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = {'a','s','d','f','g',' ','h','h','f','q','e',' ','r',' ','h','!','@'};
		pca(c);
		rs(c);
		pca(c);

	}

	 static void rs(char[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i<a.length; i++)
			if(a[i] == ' ')
				a[i] = ',';
	}

	 static void pca(char[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i<a.length; i++)
		{
			System.out.print(a[i]);
			
		}
	}

}
