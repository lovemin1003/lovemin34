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
			//�����͸� �����ϱ� ���� ��Ŷ�� �����Ѵ�.
			inpacket = new DatagramPacket(inmsg,inmsg.length);
			
			//��Ŷ�� ���� �����͸� ����(receive)�Ѵ�.
			socket.receive(inpacket);

			// ������ ��Ŷ���κ��� client�� IP�ּҿ� Port�� ��´�.
			InetAddress address = inpacket.getAddress();
			int port = inpacket.getPort();
			
			//������ ���� �ð��� �ú��� ���·� ��ȯ�Ѵ�.
			  SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			  String time = sdf.format(new Date());
			  outmsg = time.getBytes(); //time�� byte�迭�� ��ȯ�Ѵ�.
			  
			  //��Ŷ�� �����ؼ� client���� ����(send)�Ѵ�.
			  outpacket = new DatagramPacket(outmsg,outmsg.length,address,port);
			  socket.send(outpacket);
			  
			  
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			new udpclient().start();//udp������ �����Ų��.
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
