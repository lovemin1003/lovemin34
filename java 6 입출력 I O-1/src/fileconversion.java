import java.io.*;

public class fileconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ������ �����ִ� ����
		try
		{
		String path ="C:\\Users\\COM\\eclipse-workspace\\java 6 ����� I O\\src\\file10.TXT";
        File file =new File(path);
		FileReader fr = new FileReader(file);
		FileWriter fw = new FileWriter(file);
		
		int data=0;
		while((data=fr.read())!=-1)
		  {
			if(data!='\t' && data!='\n' && data!=' ' && data!='\r')
			{
				fw.write(data);
			}
		  }
		fr.close();
		fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}


	}

}
