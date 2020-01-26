import java.util.StringTokenizer;

public class stringtokenizerex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "육십구만육천구백육십구";
		System.out.println(input);
		System.out.println(hantonum(input));

	}

	private static long hantonum(String input) {
		// TODO Auto-generated method stub
		long result = 0;
		long tmpresult = 0;
		long num = 0;
		
		final String NUMBER ="영일이삼사오육칠팔구";
		final String UNIT = "십백천만억조";
		final long[] UNIT_NUM = {10,100,1000,10000,(long)1e8,(long)1e12};
		
		StringTokenizer st = new StringTokenizer(input, UNIT, true);
		
		while(st.hasMoreTokens())
		{
			String token = st.nextToken();
			int check = NUMBER.indexOf(token); // 숫자인지, 단위(UNIT)인지 확인한다.
			
			if(check==-1)
			{
				if("만억조".indexOf(token)==-1)
				{
					tmpresult += (num !=0 ? num:1) * UNIT_NUM[UNIT.indexOf(token)];
				}
				else
				{
					tmpresult += num;
					result += (tmpresult != 0 ? tmpresult :1) * UNIT_NUM[UNIT.indexOf(token)];
					tmpresult = 0;
				}
				num = 0;
			}
			else
			{
				num = check;
			}
		
		
		}
		return result + tmpresult + num;
	}

}
