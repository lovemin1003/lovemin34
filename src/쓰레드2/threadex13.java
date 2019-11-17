package 쓰레드2;

import javax.swing.JOptionPane;

public class threadex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		threadex13_1 t1 = new threadex13_1();
		
		t1.start();

		String input = JOptionPane.showInputDialog("君の名は？");
		System.out.println("私の名前は" + input+"");
		t1.interrupt();//interrupt()를 호출할 시 interrupted상태가 true가 됨.
		System.out.println("isInterrupted():"+t1.isInterrupted());//true

		
	}

}

class threadex13_1 extends Thread
{
	public void run()
	{
		int i=10;
		
		while(i!=0 && !isInterrupted())
		{
			System.out.println(i--);
			
			for(long x=0; x<5000000000L; x++);//시간 지연(수치를 높게 잡을 수록 지연이 오래 감.)
		}
		System.out.println("카운트 종료");

	}
}