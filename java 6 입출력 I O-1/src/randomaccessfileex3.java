import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomaccessfileex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//randomaccessfileex2���� ������ score1.dat���Ͽ��� ü�� ��ġ���� �հ踦 ���� ����.
		//���ϸ� �� ������ �����Ͱ� ��ȣ�� 6���� �������� ��� 7���� int��(7*4=28byte)���� �Ǿ� �����Ƿ� 
		//??+=28;�� ���� ���� �������� ���� 28�� ������Ű�鼭 readInt()�� ȣ����.
		int ü����=0;
		int ������=0;
		
		try
		{
			RandomAccessFile raf = new RandomAccessFile("score1.dat","r");
			RandomAccessFile raf1 = new RandomAccessFile("score1.dat","r");

			int ü�� = 4;
			int �������ݷ� = 8;
			
			while(true)
			{
				raf.seek(ü��);
				ü���� += raf.readInt();
				ü��+=28;
				System.out.println("ü�� ��:"+ü����);
				
				raf1.seek(�������ݷ�);
				������ += raf.readInt();
				�������ݷ�+=28;
				System.out.println("�������ݷ� ��:"+������);
			}

		}
		
		catch(EOFException e)
		{
			System.out.println("���:");
			System.out.println("ü�� ��:"+ü����);
			System.out.println("�������ݷ� ��:"+������);


		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
	
	

}
