import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filecopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//이 파일의 내용을
		String path ="C:\\Users\\COM\\eclipse-workspace\\java 6 입출력 I O\\src\\file.TXT";
        File file =new File(path);
        //이 파일에 저장시킴.
        String path1 ="C:\\Users\\COM\\eclipse-workspace\\java 6 입출력 I O\\src\\file2.TXT";
        File file1 =new File(path1);
try {
	
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file1);
		
		int data=0;
		while((data=fis.read())!=-1)
		{
			fos.write(data);
		}
		
		fis.close();
		fos.close();

     }
catch(IOException e)
{
	e.printStackTrace();
}


	}

}
