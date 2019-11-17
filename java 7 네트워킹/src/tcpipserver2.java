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
			//서버소켓을 생성하여 7777번 포트와 결합(bind)시킨다.
			ServerSocket = new ServerSocket(7777);
            System.out.println(getTime()+"서버 준비됨.");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		while(true)
		{
			try
			{
				//서버소켓
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
