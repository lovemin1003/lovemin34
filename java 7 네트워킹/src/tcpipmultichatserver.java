import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class tcpipmultichatserver {
	HashMap clients;
	
	tcpipmultichatserver()
	{
		clients = new HashMap();
		Collections.synchronizedMap(clients);
	}
	
   public void start()
   {
	   ServerSocket ServerSocket = null;
	   Socket socket = null;
		
		 try
			{
				//���������� �����Ͽ� 7777�� ��Ʈ�� ����(bind)��Ų��.
				ServerSocket = new ServerSocket(7777);
	            System.out.println("���� ���۵�.");
	            while(true)
	            {
 					socket = ServerSocket.accept();
 					System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"�� �����Ͽ���.");
	            
				
				    ServerReceiver thread = new ServerReceiver(socket);
				    thread.start();
	            }
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		

		
	}
   
    void sendtoall(String msg)
    {
    	Iterator it = clients.keySet().iterator();
    	
    	while(it.hasNext())
    	{
    		try
    		{
    			DataOutputStream out=(DataOutputStream)clients.get(it.next());
    			out.writeUTF(msg);

    		}
    		catch(IOException e)
			{
				e.printStackTrace();
			}
    	}
    }

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		new tcpipmultichatserver().start();

		
	}



class ServerReceiver extends Thread
{
	Socket socket;
	DataInputStream in;
	DataOutputStream out;
	
	
	ServerReceiver(Socket socket)
	{
	
		this.socket=socket;
		try
		{
			in=new DataInputStream(socket.getInputStream());
			out=new DataOutputStream(socket.getOutputStream());
		}
		catch(IOException e)
		{
			
		}
		
	}
	
	public void run()
	{
		String name = "";
		while(out!=null)
		{
			try
			{
				name=in.readUTF();
				sendtoall(name+"�Բ��� ����.");
				clients.put(name, out);
				System.out.println("���� ���� ������ ��:"+clients.size()+"��");
				
				while(in!=null)
				{
					sendtoall(in.readUTF());
				}
			}
			catch(IOException e)
			{
				//ignore
			}
			finally
			{
				sendtoall(name+"�� ����.");
				clients.remove(name);
				System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"�� ������ �����Ͽ���.");
				System.out.println("���� ���� ������ ��:"+clients.size()+"��");
				out=null;
			}
		}
	}
}


}