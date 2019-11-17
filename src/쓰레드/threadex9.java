package 쓰레드;

public class threadex9 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		//getThreadGroup() 쓰레드 자신이 속한 쓰레드 그룹을 반환한다.
		ThreadGroup g1 = new ThreadGroup("group1");
		ThreadGroup g2 = new ThreadGroup("group2");
		
		
		ThreadGroup sg1 = new ThreadGroup(g1,"subgroup1");
		
		g1.setMaxPriority(3);//g1의 최대우선순위를 3으로 변경.
		
		Runnable r = new Runnable()
		{
			public void run()
			{
				try
				{
					Thread.sleep(1000);
				} 
				
				catch(InterruptedException e)
				{
					
				}
			}
		};
		
		new Thread(g1, r, "th1").start();
		new Thread(sg1, r, "th2").start();
		new Thread(g2, r, "th3").start();
		
		System.out.println("list of ThreadGroup:"+main.getName()
		                    +",Active ThreadGroup:"+main.activeGroupCount()
		                    +",Active Thread:"+main.activeCount());
		main.list();

	}

}
