import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class tcpipserver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServerSocket ServerSocket = null;
		
		try
		{
			//���������� �����Ͽ� 7777�� ��Ʈ�� ����(bind)��Ų��.
			ServerSocket = new ServerSocket(7777);
            System.out.println(getTime()+"���� �غ��.");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		while(true)
		{
			try
			{
				//��������
				System.out.println(getTime()+"�����û�� ��ٸ�.");
				Socket socket = ServerSocket.accept();
				System.out.println(getTime()+socket.getInetAddress()+"�κ��� �����û�� ����.");
				
				System.out.println("getPort():"+socket.getPort());
				System.out.println("getLocalPort():"+socket.getLocalPort());
				
				//������ ��� ��Ʈ���� ��´�.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				//���� ����(remote socket)�� �����͸� ������.
				dos.writeUTF("[notice] test message1 from server");
				System.out.println(getTime()+"������ ������.");
				
				//��Ʈ���� ������ �ݾ���.
				dos.close();
				socket.close();

			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			
		}
		

	}

	 static String getTime() {
        SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
		 return f.format(new Date());
	}

}
