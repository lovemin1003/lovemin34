import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class networkex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InetAddress의 주요 메소드를 활용하는 예제. 하나의 도메인명에 여러 ip 주소가 맵핑될 수도 있고 그 반대 경우도 가능. 전자의 경우 getAllByName()을 통해 모든 ip 주소를 얻을 수 있다.
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		try
		{
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName():"+ip.getHostName());
			System.out.println("getHostAddress():"+ip.getHostAddress());
			System.out.println("toString():"+ip.toString());
			
			byte[] ipAddr = ip.getAddress();
			System.out.println("getAddress():"+Arrays.toString(ipAddr));
			
			String result="";
			for(int i=0; i < ipAddr.length; i++)
			{
				result += (ipAddr[i]<0) ? ipAddr[i] + 256 :ipAddr[i];
				result += ".";
				
			}
			System.out.println("getAddress()+256:"+result);			
			
		}
		catch(UnknownHostException e)
		{
			e.printStackTrace();
		}
		System.out.println();

		try
		{
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName():"+ip.getHostName());
			System.out.println("getHostAddress():"+ip.getHostAddress());	
		}
		catch(UnknownHostException e)
		{
			e.printStackTrace();
		}
		System.out.println();

		try
		{
			ipArr =  InetAddress.getAllByName("www.naver.com");
			
			for(int i=0; i < ipArr.length; i++)
			{
				System.out.println("ipArr["+i+"] :"+ipArr[i]);
				
			}
		}
		catch(UnknownHostException e)
		{
			e.printStackTrace();
		}
	}

}
