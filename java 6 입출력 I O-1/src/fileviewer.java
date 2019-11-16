import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileviewer {

	public static void main(String[] args) throws IOException {

        //읽어올 파일 위치를 확인함.(파일 위치는 그때그때 다름)
		String path ="C:\\Users\\COM\\eclipse-workspace\\java 6 입출력 I O\\src\\file.TXT";
        
        //읽어올 파일을 객체화시킴.
        File file =new File(path);
		
        //읽어올 때 필요한 stream을 준비한다.->읽기,불러오는건 InputStream->파일을 불러올꺼니깐 FileInpuStream
		FileInputStream fis = new FileInputStream(file);
		
		//한글자씩 읽고 출력.
		int data=0;
		while((data=fis.read())!=-1)
		{
			char c = (char)data;
			System.out.print(c);
		}
		fis.close();//사용한 자원을 닫는다.
	}

}
