import java.io.File;

public class fileex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length !=1)
		{
			System.out.println("usage: java fileex9 directory");
			System.exit(0);
		}

		//String currdir = System.getProperty("user.dir");
        //File dir =new File(currdir);	
		File dir = new File("C:\\Users\\COM\\Desktop\\샘플");

		if(!dir.exists() || !dir.isDirectory())
		{
			System.out.println("유효하지 않은 디렉토리");
			System.exit(0);
    	}
		
		File[] list = dir.listFiles();
		
		for(int i=0; i<list.length; i++)
		{
			String filename = list[i].getName();
			//파일명
			String newfilename = "1234"+filename;//글자 추가 후 
			newfilename = newfilename.substring(newfilename.length()-10);//글자 이름 크기(10)만큼 줄여준다.
			list[i].renameTo(new File(dir,newfilename));
			System.out.println(filename+"->"+newfilename);

		}

	}

}
