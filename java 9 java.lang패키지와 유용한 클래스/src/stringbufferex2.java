
public class stringbufferex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("12");
		StringBuffer sb2 = sb.append(34);
		sb.append('5').append(67);
		
		StringBuffer sb3 = sb.append(89);
		sb3.append(0.0);
		
		System.out.println("sb="+sb);
		System.out.println("sb2="+sb2);
		System.out.println("sb3="+sb3);
		
		System.out.println("sb="+sb.deleteCharAt(10));
		System.out.println("sb="+sb.delete(1,3));
		System.out.println("sb="+sb.insert(1,"aa"));
		System.out.println("sb="+sb.replace(5,sb.length(),"end"));
		
		System.out.println("capacity="+sb.capacity());
		System.out.println("length="+sb.length());
		
		
		
		
				

	}

}
