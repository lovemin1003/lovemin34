import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class networkex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		URL url = null;
		InputStream in = null;
		FileOutputStream out = null;
		String address = "http://localhost:8080/disqus%EB%8D%A7%EA%B8%80_%EA%B8%B0%EB%8A%A5/a.jsp";
		int ch=0;
		
		try
		{
			url = new URL(address);
			in = url.openStream();
			out = new FileOutputStream("lovemin34.TXT");
			
			while((ch=in.read())!=-1)
			{
				System.out.println(ch);
				out.write(ch);
			}
			in.close();
			out.close();
			System.out.println(ch);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
