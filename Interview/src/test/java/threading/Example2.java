package threading;
//Runnable interface does not have start method. It has only run method.
//So we create an object of thread class and invoke its constructor - Thread(Runnable target) which says that create a thread object with argument as an object
//of type runnable whose run method is invoked when this thread is started.
//We can create an object of Thread class here as Thread class internally implements Runnable interface

public class Example2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread started");	
	}
	
	public static void main(String[] args) {
		Example2 obj = new Example2();
		Thread thread = new Thread(obj);
		thread.start();
	}

}
