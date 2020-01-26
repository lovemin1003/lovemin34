import java.util.StringTokenizer;

public class stringtokenizerex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "100,,,200,300";
		
		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data,",");
		
		for(int i=0; i < result.length; i++)
		{
			System.out.print(result[i]+"|");
		}
		System.out.println(" split 개수:"+result.length);
		
		System.out.println();
		
		int i=0;
		for(;st.hasMoreTokens(); i++)
		{
			System.out.print(st.nextToken()+"|");
		}
		System.out.println(" StringTokenizer 개수:"+i);
 
	}

}
