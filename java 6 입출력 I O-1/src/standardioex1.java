import java.io.IOException;

public class standardioex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int input = 0;
			System.out.print("�ƹ��ų� �Է��Ͻÿ�:");
			while((input=System.in.read())!=-1)//System.in.read(): ���ڸ� �Է¹���.
			{
				System.out.println("input:"+input+", (char)input:"+(char)input);
			}
		}
		catch(IOException e)
		{
			
		}

	}

}
