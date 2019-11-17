import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileex6
{

	static int found = 0;
	public static void main(String[] args)
	{
		if(args.length !=2)
		{
			System.out.println("usage: java fileex6 directory keyword");
			System.exit(0);
		}
		String currdir = System.getProperty("user.dir");
        File dir =new File(currdir);
        //String keyword = ",java,txt,bak,";
		String keyword = args[1];
		
		System.out.println(currdir);
		//System.out.println(dir.isDirectory());
		
		if(!dir.exists() || !dir.isDirectory())
		{
			System.out.println("유효하지 않은 디렉토리");
			System.exit(0);
    	}
		try
		{
			findInFiles(dir, keyword);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("총"+ found+"개의 라인에서 "+keyword+"을 발견함.");
		
		
	}

	private static void findInFiles(File dir, String keyword) throws IOException
	{
		File[] files = dir.listFiles();
		
		for(int i=0; i<files.length; i++)
		{
			if(files[i].isDirectory())
			{
				findInFiles(files[i], keyword);
			}
			else
			{
				String filename = files[i].getName();
				String extension = filename.substring(filename.lastIndexOf(".")+1);
				extension = ","+extension+",";
				
				if(",java,txt,bak,".indexOf(extension) == -1)
				{
					continue;
				}
				filename = dir.getAbsolutePath() + File.separator + filename;
				
				FileReader fr = new FileReader(files[i]);
				BufferedReader br = new BufferedReader(fr);
				
				String data= "";
				int linenum = 0;
				
				while((data=br.readLine())!=null)
				{
					linenum++;
					
					if(data.indexOf(keyword)!=-1)
					{
						found++;
						System.out.println("["+filename+"("+linenum+")"+"]"+data);
					}
				}
				br.close();
			}
		}
		
		
	}
}
