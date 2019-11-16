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
				//서버소켓을 생성하여 7777번 포트와 결합(bind)시킨다.
				ServerSocket = new ServerSocket(7777);
	            System.out.println("서버 시작됨.");
	            while(true)
	            {
 					socket = ServerSocket.accept();
 					System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"에 접속하였음.");
	            
				
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
				sendtoall(name+"님께서 들어옴.");
				clients.put(name, out);
				System.out.println("현재 서버 접속자 수:"+clients.size()+"명");
				
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
				sendtoall(name+"이 나감.");
				clients.remove(name);
				System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"에 접속을 종료하였음.");
				System.out.println("현재 서버 접속자 수:"+clients.size()+"명");
				out=null;
			}
		}
	}
}


}