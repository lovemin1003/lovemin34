import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class tcpipserver5 {
	
   

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ServerSocket ServerSocket = null;
		 Socket socket = null;
		
		 try
			{
				//���������� �����Ͽ� 7777�� ��Ʈ�� ����(bind)��Ų��.
				ServerSocket = new ServerSocket(7777);
	            System.out.println("���� �غ��.");
				socket = ServerSocket.accept();
				
				Sender sender = new Sender(socket);
				Receiver receiver = new Receiver(socket);
				
				sender.start();
				receiver.start();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		

		
	}

}

class Sender extends Thread
{
	Socket socket;
	DataOutputStream out;
	String name;
	
	Sender(Socket socket)
	{
	
		this.socket=socket;
		try
		{
			out=new DataOutputStream(socket.getOutputStream());
			name="["+socket.getInetAddress()+":"+socket.getPort()+"]";
		}
		catch(IOException e)
		{
			
		}
		
	}
	
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		while(out!=null)
		{
			try
			{
				out.writeUTF(name+sc.nextLine());
			}
			catch(IOException e)
			{
				
			}
		}
	}
}

class Receiver extends Thread
{
	Socket socket;
	DataInputStream in;
	
	
	Receiver(Socket socket)
	{
	
		this.socket=socket;
		try
		{
			in=new DataInputStream(socket.getInputStream());
		}
		catch(IOException e)
		{
			
		}
		
	}
	
	public void run()
	{
		while(in!=null)
		{
			try
			{
				System.out.println(in.readUTF());
			}
			catch(IOException e)
			{
				
			}
		}
	}
}