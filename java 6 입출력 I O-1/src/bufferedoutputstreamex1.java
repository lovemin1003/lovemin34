import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferedoutputstreamex1 {
	public static void main(String[] args) 
	{

		String path ="C:\\Users\\COM\\eclipse-workspace\\java 6 입출력 I O\\src\\file3.TXT";
        File file =new File(path);
        
        try 
        {
        	
    		FileOutputStream fos = new FileOutputStream(file);
    		//BufferedOutputStream의 버퍼 크기를 로 한다.
    		BufferedOutputStream bos = new BufferedOutputStream(fos,7);
    		//파일에 1부터 9까지 출력한다.
    		for (int i='1'; i<='9'; i++)
    		{
    			bos.write(i);
    		}
    		
    		fos.close();
        }
        catch(IOException e)
        {
        	e.printStackTrace();
        }
	
        
	}
}
