import java.io.IOException;
import java.net.Socket;
import java.rmi.ConnectException;

public class tcpipclient5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//소켓으로 데이터를 송신하는 작업과 수신하는 작업을 별도의 쓰레드 Sender와 Receiver가 처리하도록 하여 송수신이 동시에 이뤄지도록 함.
		//tcpipserver5랑 tcpipclient5의 화면을 입력한 데이터가 상대방의 화면에 출력되므로 1:1 채팅이 가능함.
		try
		{
			String serverip = "127.0.0.1";
			
			System.out.println("서버에 연결중. 서버 ip"+serverip);
			// 소켓을 생성하여 연결을 요청한다.
			Socket socket = new Socket(serverip,7777);
			
			System.out.println("서버에 연결됨.");
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();

			

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
