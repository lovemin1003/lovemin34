import java.io.File;
import java.util.ArrayList;

public class fileex3 {
	
	static int totalFiles = 0;
	static int totalDirs = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지정 디렉토리(폴더)에 포함된 파일과 디렉토리의 목록을 보여주는 예제

		System.out.println(args.length);//0
		if(args.length != 0)
		{
			System.out.println("USAGE: java fileex3 DIRECTORY");
			System.exit(0);
		}

		String path ="C:\\Users\\COM\\eclipse-workspace\\java 6 입출력 I O";
        File f =new File(path);
		
		if(!f.exists() || !f.isDirectory())
		{
			System.out.println("유효하지 않은 디렉토리");
			System.exit(0);
		}
		
		printFileList(f);
		
		System.out.println(totalFiles+"개의 파일");
		System.out.println(totalDirs+"개의 디렉토리");

		
		
		
	}
	
	public static void printFileList(File f)
	{
		System.out.println("디렉토리:"+f.getAbsolutePath());
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
		
		System.out.println(fileNum+"개의 파일, "+dirNum+"개의 디렉토리");
		
		for(int i=0; i< subdir.size(); i++)
		{
			int index = Integer.parseInt((String)subdir.get(i));
			printFileList(files[index]);
		}
	}

}
