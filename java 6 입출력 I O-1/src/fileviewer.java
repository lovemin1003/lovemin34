import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileviewer {

	public static void main(String[] args) throws IOException {

        //�о�� ���� ��ġ�� Ȯ����.(���� ��ġ�� �׶��׶� �ٸ�)
		String path ="C:\\Users\\COM\\eclipse-workspace\\java 6 ����� I O\\src\\file.TXT";
        
        //�о�� ������ ��üȭ��Ŵ.
        File file =new File(path);
		
        //�о�� �� �ʿ��� stream�� �غ��Ѵ�.->�б�,�ҷ����°� InputStream->������ �ҷ��ò��ϱ� FileInpuStream
		FileInputStream fis = new FileInputStream(file);
		
		//�ѱ��ھ� �а� ���.
		int data=0;
		while((data=fis.read())!=-1)
		{
			char c = (char)data;
			System.out.print(c);
		}
		fis.close();//����� �ڿ��� �ݴ´�.
	}

}
