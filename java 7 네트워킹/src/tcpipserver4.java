import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class tcpipserver4 implements Runnable{
	
    ServerSocket ServerSocket;
    Thread[] threadarr;

    public tcpipserver4(int num) 
	{

		try
		{
			//���������� �����Ͽ� 7777�� ��Ʈ�� ����(bind)��Ų��.
			ServerSocket = new ServerSocket(7777);
            System.out.println(getTime()+"���� �غ��.");
            threadarr = new Thread[num];
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void start()
	{
		for(int i=0; i<threadarr.length; i++)
		{
			threadarr[i] = new Thread(this);
			threadarr[i].start();
		}
			
	}

	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try
			{
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
			catch(SocketTimeoutException e)
			{
				System.out.println("���� �ð��� ���� ��û�� ��� ������ ������.");
				System.exit(0);
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5���� �����带 �����ϴ� ������ �����.
		tcpipserver4 server = new tcpipserver4(5);
		
		
		
		
		
		
		

	 

	

	}

}
