import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fileex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//현재 디렉토리에 속한 파일과 디렉토리의 이름과 크기 등 상세 정보를 보여주는 예제.
		String currdir = System.getProperty("user.dir");
        File dir1 =new File(currdir);
        //String path ="C:\\Users\\COM\\eclipse-workspace\\java 6 입출력 I O\\src\\file.TXT";
        //File dir1 =new File(path);
        
        File[] files = dir1.listFiles();
        
        for(int i=0; i < files.length; i++)
        {
        	File f = files[i];
        	String name = f.getName();
        	SimpleDateFormat df = new SimpleDateFormat("yyyy=MM-dd HH:mma");
        	String attribute ="";
        	String size ="";
        	
        	if(files[i].isDirectory())
        	{
        		attribute = "dir";
        	}
        	else
        	{
        		size = f.length() + "";
        		attribute = f.canRead() ? "R":" ";
        		attribute += f.canWrite() ? "W":" ";
        		attribute += f.isHidden() ? "H":" ";
        		
        	}
        	System.out.printf("%s %5s %5s %s\n",df.format(new Date(f.lastModified())), attribute, size, name);
        }

	}

}
