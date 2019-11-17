import java.io.File;
import java.io.FilenameFilter;

public class fileex7 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		//FilenameFilter�� �����Ͽ� String[] list (FilenameFilter filter)�� �Բ� ����ؼ� Ư�� ���ǿ� �´� ������ ����� ��� ����� �����ִ� ����.
		if(args.length !=1)
		{
			System.out.println("usage: java fileex7 pattern");
			System.exit(0);
		}
		
		//String currdir = System.getProperty("user.dir");
        //File dir =new File(currdir);
		File dir = new File("C:\\Users\\COM\\eclipse-workspace\\java 6 ����� I O\\src");

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
    	System.out.println("pattern:"+pattern+" pattern�� �Էµ� ���ڸ� ������ ������ �˻�����.");


        
        for(int i=0; i < files.length; i++)
        {
        	System.out.println(files[i]);
        }
	}

}
