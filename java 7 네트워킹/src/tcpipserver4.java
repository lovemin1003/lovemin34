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
			//서버소켓을 생성하여 7777번 포트와 결합(bind)시킨다.
			ServerSocket = new ServerSocket(7777);
            System.out.println(getTime()+"서버 준비됨.");
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
				System.out.println(getTime()+"연결요청을 기다림.");
				
				
				Socket socket = ServerSocket.accept();
				System.out.println(getTime()+socket.getInetAddress()+"로부터 연결요청이 들어옴.");
				
				System.out.println("getPort():"+socket.getPort());
				System.out.println("getLocalPort():"+socket.getLocalPort());
				
				//소켓의 출력 스트림을 얻는다.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				//원격 소켓(remote socket)에 데이터를 보낸다.
				dos.writeUTF("[notice] test message1 from server");
				System.out.println(getTime()+"데이터 전송함.");
				
				//스트림과 소켓을 닫아줌.
				dos.close();
				socket.close();

			}
			catch(SocketTimeoutException e)
			{
				System.out.println("지정 시간내 접속 요청이 없어서 서버를 종료함.");
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
		
		//5개의 쓰레드를 생성하는 서버를 만든다.
		tcpipserver4 server = new tcpipserver4(5);
		
		
		
		
		
		
		

	 

	

	}

}
