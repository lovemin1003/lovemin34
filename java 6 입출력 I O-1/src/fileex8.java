import java.io.File;

public class fileex8 {
	
	static int deletefiles = 0;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		if(args.length !=1)
		{
			System.out.println("usage: java fileex8 Extension");
			System.exit(0);
		}

		//String currdir = System.getProperty("user.dir");
        //File dir =new File(currdir);	
		File dir = new File("C:\\Users\\COM\\eclipse-workspace\\java 6 입출력 I O\\src");

	    String ext = "."+args[0];
	    
	    delete(dir,ext);
	    System.out.println(deletefiles+"개의 파일이 삭제됨.");

	}

	private static void delete(File dir, String ext) {
		// TODO Auto-generated method stub
		File[] files = dir.listFiles();
		
		for(int i=0; i < files.length; i++)
		{
			if(files[i].isDirectory())
			{
				delete(files[i],ext);
			}
			else
			{
				String filename = files[i].getAbsolutePath();
				if(filename.endsWith(ext))
				{
					System.out.print(filename);
					if(files[i].delete())
					{
						System.out.println("삭제 성공");
					}
					else
					{
						System.out.println("삭제 실패");
					}
				}
			}
		}
		
	}
}
