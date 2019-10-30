package 쓰레드2;

import javax.swing.JOptionPane;

public class threadex14_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		threadex141 t1 = new threadex141();
		
		t1.start();

		String input = JOptionPane.showInputDialog("your name？");
		System.out.println("私の名前は" + input+"");
		t1.interrupt();//interrupt()를 호출할 시 interrupted상태가 true가 됨.
		System.out.println("isInterrupted():"+t1.isInterrupted());//true

		
	}

}

class threadex141 extends Thread
{
	public void run()
	{
		int i=10;
		
		while(i!=0 && !isInterrupted())
		{
			System.out.println(i--);
			
			try {
				Thread.sleep(1000);//1초 지연
			} catch (InterruptedException e) { }
		}
		System.out.println("카운트 종료");

	}
}