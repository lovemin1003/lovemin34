package 쓰레드;

import javax.swing.JOptionPane;

public class threadex7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Threadex71 th1 = new Threadex71();
		th1.start();
		
		String input =JOptionPane.showInputDialog("입력:");
		System.out.println("입력하신 값:"+input+"입니다.");
		
		
		
	}

}

class Threadex71 extends Thread
{
	public void run()
	{
		
		for(int i=100; i>0; i--)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);//1초간 시간을 지연시킴.
			}catch(Exception e)
			{
				
				
			}
		}
	}
}