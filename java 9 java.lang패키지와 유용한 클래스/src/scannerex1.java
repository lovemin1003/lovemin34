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
			
			//화면으로부터 라인 단위로 입력받는다.
			String input = sc.nextLine();
			
			input = input.trim(); //입력받은 값에서 필요없는 앞뒤 공백을 제거한다.
			arr = input.split(" +"); //입력받은 내용을 공백을 구분자로 자른다.
			
			String command = arr[0].trim();
			
			if("".equals(command)) 
			{
				continue;
			}
			
			//명령어를 소문자로 바꾼다.
			command = command.toLowerCase();
			
			//q 또는 Q를 입력하면 실행 종료.
			if(command.equals("q"))
			{
				System.out.println("종료");
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
