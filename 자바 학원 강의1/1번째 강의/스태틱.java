import java.io.*;
public class 스태틱 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        
        InputStreamReader rd = new InputStreamReader(System.in);
        try {
        	while(true) {
        		int a = rd.read();
        		if(a == -1) //ctrl,z를 누르면 빠져나옴(시간 좀 지나고 해야하는 듯...)
        			{break;}
        		System.out.println((char)a);
        	}
        }
        catch(IOException e) {
         System.out.println("입력 오류 발생");
        }
        int result = add(100,345);
        System.out.println(result);
        
        int res = addd(10,34);
        System.out.println(res);
        
	}
    static int add(int a, int b)
    {
    	return a+b;
    }
    static int addd(int c,int d)
    {
    	return c*d;
    }
}
