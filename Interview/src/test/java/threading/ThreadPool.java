package threading;
//Thread pool represents a group of threads that will finish a task and resume with next task.
//In case of a thread pool, a group of fixed sized threads are created. A thread from the pool is pulled out and assigned a job by service provider.
//After completion of the job, thread is contained in the pool again.
//Advantage - Better performance and saves time because no need to create threads again and again.

public class ThreadPool implements Runnable{
	String s;
	
	public ThreadPool(String s){
		this.s = s;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started and message is: "+s);
		publishMessage();
		System.out.println(Thread.currentThread().getName()+" ended");
	}
	
	public void publishMessage(){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
