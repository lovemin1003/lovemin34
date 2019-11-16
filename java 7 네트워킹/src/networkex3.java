import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class networkex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//URLConnection을 생성하여 get메소드를 통해 관련정보를 얻어서 출력하는 예제.
		URL url = null;
		String address = "https://blog.naver.com/albert0716/221031881944\r\n";
		
		try
		{
			url = new URL(address);
			URLConnection conn = url.openConnection();
			
			System.out.println("conn.toString():"+conn);
			System.out.println("conn.getAllowUserInteraction():"+conn.getAllowUserInteraction());
			System.out.println("conn.getConnectTimeout():"+conn.getConnectTimeout());
			System.out.println("conn.getContent():"+conn.getContent());
			System.out.println("conn.getContentEncoding():"+conn.getContentEncoding());
			System.out.println("conn.getContentLength():"+conn.getContentLength());
			System.out.println("conn.getContentType():"+conn.getContentType());
			System.out.println("conn.getDate():"+conn.getDate());
			System.out.println("conn.getDefaultAllowUserInteraction():"+conn.getDefaultAllowUserInteraction());
			System.out.println("conn.getDoInput():"+conn.getDoInput());
			System.out.println("conn.getDoOutput():"+conn.getDoOutput());
			System.out.println("conn.getExpiration():"+conn.getExpiration());
			System.out.println("conn.getHeaderFields():"+conn.getHeaderFields());
			System.out.println("conn.getIfModifiedSince():"+conn.getIfModifiedSince());
			System.out.println("conn.getLastModified():"+conn.getLastModified());
			System.out.println("conn.getReadTimeout():"+conn.getReadTimeout());
			System.out.println("conn.getURL():"+conn.getURL());
			System.out.println("conn.getUseCaches():"+conn.getUseCaches());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
