import java.io.*;

public class �ѱ��ؽ�Ʈ����_�б�_��� {
	public static void main(String[] args)
	{
		
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("c:\\tmp\\�ѱ�.txt");
			in = new InputStreamReader(fin,"MS949");
			int c;
			
			System.out.println("���ڵ� ���� ������"+in.getEncoding());
			while((c = in.read()) != -1)
			{
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}
		catch(IOException e)
		{
			System.out.print("����� ����");
		}
		
	}
	}

