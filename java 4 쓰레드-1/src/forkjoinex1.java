import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class forkjoinex1 {

	static final ForkJoinPool pool = new ForkJoinPool();

	public static void main(String[] args) 
	{
		
		long from = 1L;
		long to = 100000000L;
		sumtask task= new sumtask(from, to);
		
		long start = System.currentTimeMillis();
		long result = pool.invoke(task);
		System.out.println("Elapsed time (4core):"+(System.currentTimeMillis()-start));
		System.out.printf("sum of %d--%d=%d%n", from, to, result);
		System.out.println();
		
		result = 0L;
		start = System.currentTimeMillis(); //시작시간 초기화
		for(long i=from; i<-to; i++)
		{
			result +=i;
		}
		System.out.println("Elapsed time (1core):"+(System.currentTimeMillis()-start));
		System.out.printf("sum of %d-%d=%d%n", from, to, result);
		
		
		
		
	}

}

class sumtask extends RecursiveTask<Long>
{
	long from, to;
	sumtask(long from, long to)
	{
		this.from = from;
		this.to = to;
	}
	
	public Long compute()
	{
		long size = to - from +1; //from <= i<=to
		
		if(size <= 5)//더할 숫자가 5개 이하면 숫자의 합을 반환
		{
			return sum();
		}
		long half = (from+to)/2;
		
		//범위를 반으로 나눠서 두 개의 작업을 생성
		sumtask leftsum = new sumtask(from, half);
		sumtask rightsum = new sumtask(half+1,to);
		
		leftsum.fork();
		
		return rightsum.compute() + leftsum.join();

	}
	
	long sum() //from-to의 모든 숫자를 더한 결과를 반환
	{
		long tmp = 0L;
		for(long i = from; i<=to; i++)
		{
			tmp +=i;
		}
		return tmp;
	}
}
