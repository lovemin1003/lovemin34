import java.io.File;

public class exceptionex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		File f = createFile(args[0]); //'로이갓'로 지정함.
		System.out.println(f.getName()+"파일이 성공적으로 생성됨.");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage()+"다시 입력해주세요.");
		}

	}

	 static File createFile(String filename) throws Exception {
		// TODO Auto-generated method stub
		  
			if(filename==null || filename.equals(""))
			{
				throw new Exception("파일이름이 유효하지 않음.");
			}
			File f = new File(filename); //File클래스의 객체를 만든다.
			// File객체의 createNewFile 메소드를 이용해서 실제 파일을 생성한다.
			f.createNewFile();
			return f; // 생성된 객체의 참조를 반환한다.
		  
		
	}

	

}
