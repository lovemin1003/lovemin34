import java.io.File;

public class fileex2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지정 디렉토리(폴더)에 포함된 파일과 디렉토리의 목록을 보여주는 예제
		
		System.out.println(args.length);//0

		if(args.length != 0)
		{
			System.out.println("USAGE: java fileex2 DIRECTORY");
			System.exit(0);
		}

		String path ="C:\\Users\\COM\\eclipse-workspace\\java 6 입출력 I O";
        File f =new File(path);
		
		if(!f.exists() || !f.isDirectory())
		{
			System.out.println("유효하지 않은 디렉토리");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		
		for(int i=0; i<files.length; i++)
		{
			String filename1 = files[i].getName();
			System.out.println(files[i].isDirectory() ? "["+filename1+"]" : filename1);
		}
	}

}
