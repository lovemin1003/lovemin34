import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class udpserver {
	
	
	public void start() throws IOException
	{
		DatagramSocket socket = new DatagramSocket(7777);
		DatagramPacket inpacket, outpacket;
		
		byte[] inmsg = new byte[10];
		byte[] outmsg;
		
		while(true)
		{
			//데이터를 수신하기 위한 패킷을 생성한다.
			inpacket = new DatagramPacket(inmsg,inmsg.length);
			
			//패킷을 통해 데이터를 수신(receive)한다.
			socket.receive(inpacket);

			// 수신한 패킷으로부터 client의 IP주소와 Port를 얻는다.
			InetAddress address = inpacket.getAddress();
			int port = inpacket.getPort();
			
			//서버의 현재 시간을 시분초 형태로 반환한다.
			  SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			  String time = sdf.format(new Date());
			  outmsg = time.getBytes(); //time을 byte배열로 변환한다.
			  
			  //패킷을 생성해서 client에게 전송(send)한다.
			  outpacket = new DatagramPacket(outmsg,outmsg.length,address,port);
			  socket.send(outpacket);
			  
			  
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			new udpclient().start();//udp서버를 실행시킨다.
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
