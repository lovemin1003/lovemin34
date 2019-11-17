import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filemerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//filesplit에서 분리시킨 파일을 다시 하나로 합쳐줌.(분리된 파일은 그대로 남는 듯.)
		if(args.length ==1)
		{
			System.out.println("usage: java filemerge filename ");
			System.exit(0);//프로그램 종료
		}
		
		 String mergefilename = "C:\\Users\\COM\\Desktop\\우리\\우리.png";

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
	    		 f.setReadOnly(); //작업 중에 파일의 내용이 변하지 않도록 한다.
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
