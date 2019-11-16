import java.io.File;
import java.io.FilenameFilter;

public class fileex7 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		//FilenameFilter를 구현하여 String[] list (FilenameFilter filter)와 함께 사용해서 특정 조건에 맞는 파일의 목록을 얻는 방법을 보여주는 예제.
		if(args.length !=1)
		{
			System.out.println("usage: java fileex7 pattern");
			System.exit(0);
		}
		
		//String currdir = System.getProperty("user.dir");
        //File dir =new File(currdir);
		File dir = new File("C:\\Users\\COM\\eclipse-workspace\\java 6 입출력 I O\\src");

        final String pattern =args[0];
        
    	System.out.println("dir:"+dir);
    	System.out.println("pattern:"+pattern);
        
        //String[] list (FilenameFilter filter)
        String[] files = dir.list(new FilenameFilter() 
        {
        	public boolean accept(File dir, String name)
        	{
        		System.out.println("name:"+name);
        		return name.indexOf(pattern) != -1;
        	}
        	
        });
        
		System.out.println();
    	System.out.println("pattern:"+pattern+" pattern에 입력된 문자를 포함한 파일을 검색해줌.");


        
        for(int i=0; i < files.length; i++)
        {
        	System.out.println(files[i]);
        }
	}

}
