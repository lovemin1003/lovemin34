package 쓰레드2;

public class threadex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new runnableex21();
		new Thread(r).start();//ThreadGroup에 의해 참조되므로 gc대상이 아니다.
		new Thread(r).start();//ThreadGroup에 의해 참조되므로 gc대상이 아니다.

	}

}

class Account
{
	private int balance = 1000;
	
	public int getBalance()
	{
		return balance;
	}
	
	public void withdraw(int money)
	{
		if(balance >= money)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
			balance -= money;
		}
	} //withdraw
}

class runnableex21 implements Runnable
{

	Account acc = new Account();
	
	public void run() {
		// TODO Auto-generated method stub
		while(acc.getBalance() > 0)
		{
			//100, 200, 300 중 한 값을 임의로 선택해서 출금(withdraw)
			int money = (int)(Math.random()*3+1)*100;
			acc.withdraw(money);
			System.out.println("money:"+acc.getBalance());
			
		}
		
	}
	
}