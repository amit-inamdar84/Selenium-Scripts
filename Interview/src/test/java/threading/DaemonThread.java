package threading;
//Daemon thread is a service provider thread that provides service to user thread.
//Life is dependent on user threads. When user threads dies, JVM terminates this thread automatically.
//Ex: Garbage collector, Finalizer.
//The main purpose of a finalizer is to release resources used by objects before they're removed from the memory.
//It provides services to user threads for background supporting tasks.
//It is a low priority thread.

public class DaemonThread extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("This is a daemon thread "+Thread.currentThread().getName());
		} else {
			System.out.println("This is not a daemon thread");
		}

	}

	public static void main(String[] args) {
		DaemonThread obj = new DaemonThread();
		DaemonThread obj1 = new DaemonThread();
		DaemonThread obj2 = new DaemonThread();
		
		obj.setDaemon(true);
		obj.start();
		obj1.start();
		obj2.start();
	}

}
