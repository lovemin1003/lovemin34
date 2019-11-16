import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.rmi.ConnectException;

public class tcpipclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String serverip = "127.0.0.1";
			
			System.out.println("서버에 연결중. 서버 ip"+serverip);
			// 소켓을 생성하여 연결을 요청한다.
			Socket socket = new Socket(serverip,7777);
			
			//소켓의 입력 스트림을 얻는다.
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			//소켓으로 부터 받은 데이터를 출력한다.
			System.out.println("서버로부터 받은 메시지:"+dis.readUTF());
			System.out.println("연결 종료함.");
			
			//스트림과 소켓을 닫는다.
			dis.close();
			socket.close();
			System.out.println("연결 종료됨.");

		}
		catch(ConnectException ce)
		{
			ce.printStackTrace();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
