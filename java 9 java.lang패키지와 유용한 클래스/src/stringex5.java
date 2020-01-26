import java.util.StringJoiner;

public class stringex5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String str = "°¡";
		
		byte[] bArr = str.getBytes("UTF-8");
		byte[] bArr2 = str.getBytes("CP949");
		
		System.out.println("UTF-8:"+ joinByteArr(bArr));
		System.out.println("CP949:"+ joinByteArr(bArr2));
		
		System.out.println("UTF-8:"+new String(bArr,"UTF-8"));
		System.out.println("CP949:"+new String(bArr2,"CP949"));
		
	}

	private static String joinByteArr(byte[] bArr) {
		// TODO Auto-generated method stub
		StringJoiner sj = new StringJoiner(":","[","]");
		for(byte b: bArr)
		{
			sj.add(String.format("%02x",b));
		}
		return sj.toString();
	}

}
