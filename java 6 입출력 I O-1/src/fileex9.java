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
		File dir = new File("C:\\Users\\COM\\Desktop\\����");

		if(!dir.exists() || !dir.isDirectory())
		{
			System.out.println("��ȿ���� ���� ���丮");
			System.exit(0);
    	}
		
		File[] list = dir.listFiles();
		
		for(int i=0; i<list.length; i++)
		{
			String filename = list[i].getName();
			//���ϸ�
			String newfilename = "1234"+filename;//���� �߰� �� 
			newfilename = newfilename.substring(newfilename.length()-10);//���� �̸� ũ��(10)��ŭ �ٿ��ش�.
			list[i].renameTo(new File(dir,newfilename));
			System.out.println(filename+"->"+newfilename);

		}

	}

}
