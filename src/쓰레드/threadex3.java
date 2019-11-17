
		package 쓰레드;

		public class threadex3 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				Threadex31 t1 = new Threadex31();
				t1.run();

			}

		}

		class Threadex31 extends Thread
		{
			
			public void run()
			{
				throwException();
			}
			
			public void throwException()
			{
				try
				{
					throw new Exception();
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}

		}

