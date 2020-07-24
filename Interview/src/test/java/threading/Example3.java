package threading;
//Thread scheduler is a part of JVM that decides which thread will run
//There is no order in which thread will execute first and which one will execute next.Scheduler selects the thread to run randomly.
//We cannot start a thread twice. If tried we receive IllegalThreadStateException
//Each thread starts in a separate call stack. If we call run method directly without start method, then method will not start separate call stack and will go
//in the current call stack.

public class Example3 extends Thread{
	public void run() {
		System.out.println("Thread started");
	}
	
	public static void main(String[] args) {
		Example3 obj = new Example3();
		obj.start();
		//obj.start(); java.lang.IllegalThreadStateException
	}

}
