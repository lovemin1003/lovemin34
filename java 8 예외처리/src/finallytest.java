

public class finallytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			startInstall(); //프로그램 설치에 필요한 준비를 한다.
			copyFiles(); //파일들을 복사한다.
			deleteTempFiles(); //프로그램  설치에 사용된 임시파일들을 삭제한다.
		}
		catch(Exception e)
		{
			e.printStackTrace();
			deleteTempFiles(); //프로그램  설치에 사용된 임시파일들을 삭제한다.
		}
		
		

	}

	private static void deleteTempFiles() {
		// TODO Auto-generated method stub
		//임시 파일들을 삭제하는 코드를 적는다.
	}

	private static void copyFiles() {
		// TODO Auto-generated method stub
		//파일들을 복사하는 코드를 적는다.
	}

	private static void startInstall() {
		// TODO Auto-generated method stub
		//프로그램 설치에 필요한 준비를 하는 코드를 적는다.
	}

}
