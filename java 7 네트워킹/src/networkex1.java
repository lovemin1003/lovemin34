import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class networkex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InetAddress�� �ֿ� �޼ҵ带 Ȱ���ϴ� ����. �ϳ��� �����θ� ���� ip �ּҰ� ���ε� ���� �ְ� �� �ݴ� ��쵵 ����. ������ ��� getAllByName()�� ���� ��� ip �ּҸ� ���� �� �ִ�.
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
