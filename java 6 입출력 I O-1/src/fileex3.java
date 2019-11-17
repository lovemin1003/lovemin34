import java.io.File;
import java.util.ArrayList;

public class fileex3 {
	
	static int totalFiles = 0;
	static int totalDirs = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���丮(����)�� ���Ե� ���ϰ� ���丮�� ����� �����ִ� ����

		System.out.println(args.length);//0
		if(args.length != 0)
		{
			System.out.println("USAGE: java fileex3 DIRECTORY");
			System.exit(0);
		}

		String path ="C:\\Users\\COM\\eclipse-workspace\\java 6 ����� I O";
        File f =new File(path);
		
		if(!f.exists() || !f.isDirectory())
		{
			System.out.println("��ȿ���� ���� ���丮");
			System.exit(0);
		}
		
		printFileList(f);
		
		System.out.println(totalFiles+"���� ����");
		System.out.println(totalDirs+"���� ���丮");

		
		
		
	}
	
	public static void printFileList(File f)
	{
		System.out.println("���丮:"+f.getAbsolutePath());
		File[] files = f.listFiles();
		ArrayList subdir = new ArrayList();
		
		for(int i=0; i<files.length; i++)
		{
			String filename1 = files[i].getName();
			if(files[i].isDirectory())
			{
				filename1 ="["+filename1+"]";
				subdir.add(i+"");
			}
			System.out.println(filename1);
			
		}
		
		int dirNum = subdir.size();
		int fileNum = files.length - dirNum;
		
		totalFiles += fileNum;
		totalDirs += dirNum;
		
		System.out.println(fileNum+"���� ����, "+dirNum+"���� ���丮");
		
		for(int i=0; i< subdir.size(); i++)
		{
			int index = Integer.parseInt((String)subdir.get(i));
			printFileList(files[index]);
		}
	}

}
