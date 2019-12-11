import java.io.File;

public class exceptionex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//commend line에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
		
		File f = createFile(args[0]); //'로이조'로 지정함.
		System.out.println(f.getName()+"파일이 성공적으로 생성됨.");

	}

	 static File createFile(String filename) {
		// TODO Auto-generated method stub
		  try 
		  {
			if(filename==null || filename.equals(""))
			{
				throw new Exception("파일이름이 유효하지 않음.");
			}
		  }
		  catch(Exception e)//filename이 부적절할 경우 파일 이름으로 '제목없음.txt'로 한다.
		  {
			  filename="제목없음.txt";
		  }
		  finally
		  {
			  File f = new File(filename);//File클래스의 객체를 만든다.
			  createNewFile(f); // 생성된 객체를 이용해서 파일을 생성한다.
			  return f;
		  }
		
	}

	 static void createNewFile(File f) {
		// TODO Auto-generated method stub
		 try
		 {
			 f.createNewFile();//파일을 생성한다.
		 }
		 catch(Exception e)
		 {
			  
		 }
		
	}

}
