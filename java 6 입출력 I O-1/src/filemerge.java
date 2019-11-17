import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filemerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//filesplit���� �и���Ų ������ �ٽ� �ϳ��� ������.(�и��� ������ �״�� ���� ��.)
		if(args.length ==1)
		{
			System.out.println("usage: java filemerge filename ");
			System.exit(0);//���α׷� ����
		}
		
		 String mergefilename = "C:\\Users\\COM\\Desktop\\�츮\\�츮.png";

		 try
		 {
			 File tempfile = File.createTempFile("~mergetemp", ".tmp");
			 tempfile.deleteOnExit();
			 
			 FileOutputStream fos = new FileOutputStream(tempfile);
	    	 BufferedOutputStream bos = new BufferedOutputStream(fos);
	    	 
	    	 BufferedInputStream bis = null;
	    	 
	    	 int number=1;
	    	 
	    	 File f = new File(mergefilename+"."+number);
	    	 
	    	 while(f.exists())
	    	 {
	    		 f.setReadOnly(); //�۾� �߿� ������ ������ ������ �ʵ��� �Ѵ�.
	    		 bis = new BufferedInputStream(new FileInputStream(f));
	    		 
	    		 int data=0;
	    		 while((data = bis.read())!= -1)
	    		 {
	    			 bos.write(data);
	    		 }
	    		 bis.close();
	    		 
	    		 System.out.println(mergefilename+"."+number);

	    		 f = new File(mergefilename+"."+ ++number);
	    	 }
	    	 
	    	 bos.close();
	    	 
	    	 File oldfile = new File(mergefilename);
	    	 
	    	 if(oldfile.exists()) oldfile.delete();
	    	 
	    	 tempfile.renameTo(oldfile);
		 }
		 catch(IOException e)
	        {
			 
	        }

	}

}
