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
		
		//�����Ͱ� ����� �������� byte�迭�� �����Ѵ�.
		byte[] msg = new byte[100];
		
		DatagramPacket outpacket = new DatagramPacket(msg,1,serverAddress, 7777);
		DatagramPacket inpacket = new DatagramPacket(msg,msg.length);
		
		datagramsocket.send(outpacket);  // DatagramPacket�� �����Ѵ�.
		datagramsocket.receive(inpacket);// DatagramPacket�� �����Ѵ�.
		
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
