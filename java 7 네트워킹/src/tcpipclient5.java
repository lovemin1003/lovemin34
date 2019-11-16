import java.io.IOException;
import java.net.Socket;
import java.rmi.ConnectException;

public class tcpipclient5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������� �����͸� �۽��ϴ� �۾��� �����ϴ� �۾��� ������ ������ Sender�� Receiver�� ó���ϵ��� �Ͽ� �ۼ����� ���ÿ� �̷������� ��.
		//tcpipserver5�� tcpipclient5�� ȭ���� �Է��� �����Ͱ� ������ ȭ�鿡 ��µǹǷ� 1:1 ä���� ������.
		try
		{
			String serverip = "127.0.0.1";
			
			System.out.println("������ ������. ���� ip"+serverip);
			// ������ �����Ͽ� ������ ��û�Ѵ�.
			Socket socket = new Socket(serverip,7777);
			
			System.out.println("������ �����.");
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
