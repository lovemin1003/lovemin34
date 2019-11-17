import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class udpclient {
	
	public void start() throws IOException, UnknownHostException
	{
		DatagramSocket datagramsocket = new DatagramSocket();
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
		
		//데이터가 저장될 공간으로 byte배열을 생성한다.
		byte[] msg = new byte[100];
		
		DatagramPacket outpacket = new DatagramPacket(msg,1,serverAddress, 7777);
		DatagramPacket inpacket = new DatagramPacket(msg,msg.length);
		
		datagramsocket.send(outpacket);  // DatagramPacket을 전송한다.
		datagramsocket.receive(inpacket);// DatagramPacket을 수신한다.
		
		System.out.println(" current server time:"+new String(inpacket.getData()));

		datagramsocket.close();
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			new udpclient().start();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
