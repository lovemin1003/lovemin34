<<<<<<< HEAD
<<<<<<< HEAD
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//commandline에서 inputfile을 지정해주지 않으면 프로그램을 종료한다.
		if(args.length !=1)
		{
			System.out.println("inputfilename");
			System.exit(0);
		}

		Properties pro = new Properties();
		
		String inputFile =args[0];
		
		try
		{
			pro.load(new FileInputStream(inputFile));
		}
		catch(IOException e)
		{
			System.out.println("지정한 파일을 찾을 수 없음.");
			System.exit(0);
		}
		
		String name = pro.getProperty("name");
		String[] data = pro.getProperty("data").split(",");
		int max=0;
		int min=0;
		int sum=0;
		
		for(int i =0; i<data.length; i++)
		{
			int intvalue = Integer.parseInt(data[i]);
			
			if(i==0)
			{
				max=min = intvalue;
			}
			
			if(max<intvalue)
			{
				max=intvalue;
			}
			
			else if(min>intvalue)
			{
				min=intvalue;
			}
			
			sum += intvalue;
			
		}
		
		System.out.println("이름:"+name);
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		System.out.println("합:"+sum);
		
	}

}
=======
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//commandline에서 inputfile을 지정해주지 않으면 프로그램을 종료한다.
		if(args.length !=1)
		{
			System.out.println("inputfilename");
			System.exit(0);
		}

		Properties pro = new Properties();
		
		String inputFile =args[0];
		
		try
		{
			pro.load(new FileInputStream(inputFile));
		}
		catch(IOException e)
		{
			System.out.println("지정한 파일을 찾을 수 없음.");
			System.exit(0);
		}
		
		String name = pro.getProperty("name");
		String[] data = pro.getProperty("data").split(",");
		int max=0;
		int min=0;
		int sum=0;
		
		for(int i =0; i<data.length; i++)
		{
			int intvalue = Integer.parseInt(data[i]);
			
			if(i==0)
			{
				max=min = intvalue;
			}
			
			if(max<intvalue)
			{
				max=intvalue;
			}
			
			else if(min>intvalue)
			{
				min=intvalue;
			}
			
			sum += intvalue;
			
		}
		
		System.out.println("이름:"+name);
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		System.out.println("합:"+sum);
		
	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
=======
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//commandline에서 inputfile을 지정해주지 않으면 프로그램을 종료한다.
		if(args.length !=1)
		{
			System.out.println("inputfilename");
			System.exit(0);
		}

		Properties pro = new Properties();
		
		String inputFile =args[0];
		
		try
		{
			pro.load(new FileInputStream(inputFile));
		}
		catch(IOException e)
		{
			System.out.println("지정한 파일을 찾을 수 없음.");
			System.exit(0);
		}
		
		String name = pro.getProperty("name");
		String[] data = pro.getProperty("data").split(",");
		int max=0;
		int min=0;
		int sum=0;
		
		for(int i =0; i<data.length; i++)
		{
			int intvalue = Integer.parseInt(data[i]);
			
			if(i==0)
			{
				max=min = intvalue;
			}
			
			if(max<intvalue)
			{
				max=intvalue;
			}
			
			else if(min>intvalue)
			{
				min=intvalue;
			}
			
			sum += intvalue;
			
		}
		
		System.out.println("이름:"+name);
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		System.out.println("합:"+sum);
		
	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
