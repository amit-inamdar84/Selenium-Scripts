package threading;
//Thread methods - run(), start(), sleep(long milliseconds), join(), join(long milliseconds), getPriority(), setPriority(), getName(), setName(), currentThread(),
//getID(), getState(), isAlive(), yield(), isDaemon(), setDaemon(), interrupt(), isInterrupted(), interrupted()
//start() method will internally call run() method. The run method is present in runnable interface and not in thread class. Thread class implements
//Runnable interface.
//the run() method statements execute on a different thread.

public class Example1 extends Thread{
	public void run() {
		System.out.println("Thread started");
	}
	
	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.start();
	}

}
