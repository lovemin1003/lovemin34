import java.io.File;
import java.io.IOException;

public class fileex1 {

	public static void main(String[] args) throws IOException {
		// File�ν��Ͻ��� �����Ͽ� �޼ҵ带 �̿��ؼ� ������ ��ο� ������ ���� ������ ����ϴ� ����
		
		File f = new File("C:\\Users\\COM\\eclipse-workspace\\java 6 ����� I O\\src\\fileex1.java");
		String filename = f.getName();
		int pos = filename.lastIndexOf(".");
		
		System.out.println("��θ� ������ ���� �̸�:"+f.getName());
		System.out.println("Ȯ���ڸ� ������ ���� �̸�:"+filename.substring(0,pos));
		System.out.println("Ȯ����:"+filename.substring(pos+1));

		System.out.println("��θ� ������ ���� �̸�:"+f.getPath());
		System.out.println("������ ������:"+f.getAbsolutePath());
		System.out.println("������ ���԰��:"+f.getCanonicalPath());
		System.out.println("������ ���� ���丮:"+f.getParent());
		
		System.out.println("File.pathSeparator:"+File.pathSeparator);
		System.out.println("File.pathSeparatorChar:"+File.pathSeparatorChar);
		System.out.println("File.separator:"+File.separator);
		System.out.println("File.separatorChar:"+File.separatorChar);
		
		System.out.println("user.dir:"+System.getProperty("user.dir"));
		System.out.println("sum.boot.class.path:"+System.getProperty("sum.boot.class.path"));








	}

}
