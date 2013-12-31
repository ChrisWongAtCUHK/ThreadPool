package demo;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author WWC076
 * <p>
 *  ThreadPoolDemo
 *  @link http://www.ewdna.com/2011/11/java-thread-pool.html
 * </p>
 */
public class ThreadPoolDemo {
	
	private static final int WORKSIZE = 5;
	private static Work[] works = new Work[WORKSIZE];
	
	/**
	 * Main program
	 * @param args
	 */
	public static void main(String[] args){
		works[0] = new Work("Chris Wong");
		works[1] = new Work("Andy");
		works[2] = new Work("Amby");
		works[3] = new Work("Ming");
		works[4] = new Work("Stanley");
		
		// Create two threads in thread pool
		Executor executor = Executors.newFixedThreadPool(WORKSIZE);
		
		// Implement Runnable interface as Work
		for(Work work: works){
			executor.execute(work);
		}
		
		executor.execute(new Runnable() {
		      // anonymous inner class            
		      @Override
		      public void run() {
		          System.out.println(Thread.currentThread().getName() + 
		              " Begins Work in anonymous inner class.");  
		      }
		  });
		}
}
