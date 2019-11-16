import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomaccessfileex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//randomaccessfileex2에서 저장한 score1.dat파일에서 체력 수치만의 합계를 내는 예제.
		//포켓몬 한 마리의 데이터가 번호와 6가지 스탯으로 모두 7개의 int값(7*4=28byte)으로 되어 있으므로 
		//??+=28;와 같이 파일 포인터의 값을 28씩 증가시키면서 readInt()를 호출함.
		int 체력합=0;
		int 물공합=0;
		
		try
		{
			RandomAccessFile raf = new RandomAccessFile("score1.dat","r");
			RandomAccessFile raf1 = new RandomAccessFile("score1.dat","r");

			int 체력 = 4;
			int 물리공격력 = 8;
			
			while(true)
			{
				raf.seek(체력);
				체력합 += raf.readInt();
				체력+=28;
				System.out.println("체력 합:"+체력합);
				
				raf1.seek(물리공격력);
				물공합 += raf.readInt();
				물리공격력+=28;
				System.out.println("물리공격력 합:"+물공합);
			}

		}
		
		catch(EOFException e)
		{
			System.out.println("결과:");
			System.out.println("체력 합:"+체력합);
			System.out.println("물리공격력 합:"+물공합);


		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
	
	

}
