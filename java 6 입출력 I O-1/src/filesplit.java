import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filesplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인법(?) 파일 분리술.
		
		if(args.length <2)
		{
			System.out.println("usage: java filesplit filename size_kb");
			//System.exit(0);//프로그램 종료
		}

		//final int volume = Integer.parseInt(args[1])*1000;
		  final int volume = 100000;
		  
		try
		{
			 String filename = "C:\\Users\\COM\\Desktop\\우리\\우리.png";
		   	 FileInputStream fis = new FileInputStream(filename);
	    	 BufferedInputStream bis = new BufferedInputStream(fis);

	    	 FileOutputStream fos = null;
	    	 BufferedOutputStream bos = null;
	    	 
	    	 int data=0;
	    	 int i = 0;
	    	 int number=0;
	    	 while((data = bis.read()) != -1)
	    	 {
	    		 if(i%volume==0)
	    		 {
	    			 if(i!=0)
	    			 {
	    				 bos.close();
	    			 }
	    			 
	    			 fos=new FileOutputStream(filename+"."+ ++number);
	    			 bos=new BufferedOutputStream(fos);
	    			 System.out.println(filename+"."+ number);
	    		 }
	    		 bos.write(data);
	    		 
	    		 i++;
	    	 }
	    	 bis.close();
             bos.close();
		}
		catch(IOException e)
        {
        	e.printStackTrace();
        }

	}

}
