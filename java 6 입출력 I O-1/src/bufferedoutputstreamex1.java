import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferedoutputstreamex1 {
	public static void main(String[] args) 
	{

		String path ="C:\\Users\\COM\\eclipse-workspace\\java 6 ����� I O\\src\\file3.TXT";
        File file =new File(path);
        
        try 
        {
        	
    		FileOutputStream fos = new FileOutputStream(file);
    		//BufferedOutputStream�� ���� ũ�⸦ �� �Ѵ�.
    		BufferedOutputStream bos = new BufferedOutputStream(fos,7);
    		//���Ͽ� 1���� 9���� ����Ѵ�.
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
