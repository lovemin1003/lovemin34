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
			
			System.out.println("������ ������. ���� ip"+serverip);
			// ������ �����Ͽ� ������ ��û�Ѵ�.
			Socket socket = new Socket(serverip,7777);
			
			//������ �Է� ��Ʈ���� ��´�.
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			//�������� ���� ���� �����͸� ����Ѵ�.
			System.out.println("�����κ��� ���� �޽���:"+dis.readUTF());
			System.out.println("���� ������.");
			
			//��Ʈ���� ������ �ݴ´�.
			dis.close();
			socket.close();
			System.out.println("���� �����.");

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
