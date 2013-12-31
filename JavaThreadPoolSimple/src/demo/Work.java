package demo;

import static java.lang.System.out;

/**
 * @author WWC076
 *
 */
public class Work implements Runnable {
	final private long MILLIS = 5000;
	private String id;
	
	/**
	 * Constructor
	 * @param id
	 */
	public Work(String id){
		this.id = id;
	}
	
	/**
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run(){
		out.println(Thread.currentThread().getName() + " Begin Work " + id);
		
		try {
			Thread.sleep(MILLIS);
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
		
		out.println(Thread.currentThread().getName() + " Ends Work " + id);
	}

}
