import java.util.Scanner;

public class scannerex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] arr = null;
		
		while(true)
		{
			String prompt = ">>";
			System.out.print(prompt);
			
			//ȭ�����κ��� ���� ������ �Է¹޴´�.
			String input = sc.nextLine();
			
			input = input.trim(); //�Է¹��� ������ �ʿ���� �յ� ������ �����Ѵ�.
			arr = input.split(" +"); //�Է¹��� ������ ������ �����ڷ� �ڸ���.
			
			String command = arr[0].trim();
			
			if("".equals(command)) 
			{
				continue;
			}
			
			//��ɾ �ҹ��ڷ� �ٲ۴�.
			command = command.toLowerCase();
			
			//q �Ǵ� Q�� �Է��ϸ� ���� ����.
			if(command.equals("q"))
			{
				System.out.println("����");
				System.exit(0);
			}
			else 
			{
				for(int i=0; i<arr.length; i++)
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}
