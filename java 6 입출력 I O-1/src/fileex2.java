import java.io.File;

public class fileex2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���丮(����)�� ���Ե� ���ϰ� ���丮�� ����� �����ִ� ����
		
		System.out.println(args.length);//0

		if(args.length != 0)
		{
			System.out.println("USAGE: java fileex2 DIRECTORY");
			System.exit(0);
		}

		String path ="C:\\Users\\COM\\eclipse-workspace\\java 6 ����� I O";
        File f =new File(path);
		
		if(!f.exists() || !f.isDirectory())
		{
			System.out.println("��ȿ���� ���� ���丮");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		
		for(int i=0; i<files.length; i++)
		{
			String filename1 = files[i].getName();
			System.out.println(files[i].isDirectory() ? "["+filename1+"]" : filename1);
		}
	}

}
