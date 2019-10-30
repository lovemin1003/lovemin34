package 쓰레드;

import javax.swing.JOptionPane;

public class threadex6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String input =JOptionPane.showInputDialog("입력:");
		System.out.println("입력하신 값:"+input+"입니다.");
		
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
