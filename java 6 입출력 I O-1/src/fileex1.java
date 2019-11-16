import java.io.File;
import java.io.IOException;

public class fileex1 {

	public static void main(String[] args) throws IOException {
		// File인스턴스를 생성하여 메소드를 이용해서 파일의 경로와 구분자 등의 정보를 출력하는 예제
		
		File f = new File("C:\\Users\\COM\\eclipse-workspace\\java 6 입출력 I O\\src\\fileex1.java");
		String filename = f.getName();
		int pos = filename.lastIndexOf(".");
		
		System.out.println("경로를 제외한 파일 이름:"+f.getName());
		System.out.println("확장자를 제외한 파일 이름:"+filename.substring(0,pos));
		System.out.println("확장자:"+filename.substring(pos+1));

		System.out.println("경로를 포함한 파일 이름:"+f.getPath());
		System.out.println("파일의 절대경로:"+f.getAbsolutePath());
		System.out.println("파일의 정규경로:"+f.getCanonicalPath());
		System.out.println("파일이 속한 디렉토리:"+f.getParent());
		
		System.out.println("File.pathSeparator:"+File.pathSeparator);
		System.out.println("File.pathSeparatorChar:"+File.pathSeparatorChar);
		System.out.println("File.separator:"+File.separator);
		System.out.println("File.separatorChar:"+File.separatorChar);
		
		System.out.println("user.dir:"+System.getProperty("user.dir"));
		System.out.println("sum.boot.class.path:"+System.getProperty("sum.boot.class.path"));








	}

}
