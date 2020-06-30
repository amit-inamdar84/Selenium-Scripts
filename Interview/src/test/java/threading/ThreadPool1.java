package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {
	public static void main(String[] args) {
		//This will create 5 threads in a thread pool.
		ExecutorService executors = Executors.newFixedThreadPool(5);
		
		for(int i=0;i<10;i++){
			//Calls constructor of ThreadPool class and initializes s to 0 through 9.
			//As i is int concatenate with a string will make it string.
			ThreadPool obj = new ThreadPool(" "+i);
			//Calls run method of ThreadPool class. When a thread ends a task, a new object with count 5 is created in above statement and again run method
			//is called. Similarly when next thread ends a task again an object is created and run method is called.
			executors.execute(obj);
		}
		
		executors.shutdown();
		
		while(!executors.isTerminated()){
		}
		
		System.out.println("All tasks completed");
	}

}
